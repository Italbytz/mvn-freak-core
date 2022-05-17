/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.control;

import java.io.*;

import freak.core.control.Actions.*;

/**
 * @author Heiko, Stefan
 */
public class BatchProcessor implements StateListener {
	private RunControl runControl;

	private File loadFile;
	private File saveFile;
	private File[] tempFiles;
	private int nextTempFile;

	private long lastSave;
	private long saveInterval;

	public BatchProcessor(File loadFile, File saveFile, File[] tempFiles, long saveInterval) {
		this.loadFile = loadFile;
		this.saveFile = saveFile;
		this.tempFiles = tempFiles;
		this.saveInterval = saveInterval;
	}

	public void run() throws FileNotFoundException, IOException, ClassNotFoundException {
		runControl = new RunControl(this);

		FreakFile file = FreakFile.read(new FileInputStream(loadFile));
		runControl.fromFile(file);
		lastSave = System.currentTimeMillis();

		runControl.request(new StartAction());
	}

	public void asynchroneousFeedback(ScheduleInterface schedule, Replay replay) {
		if (tempFiles == null) return;

		try {
			long now = System.currentTimeMillis();
			if (now - lastSave > saveInterval) {
				FreakFile currentState = new FreakFile(replay, schedule);
				File tempFile = tempFiles[nextTempFile];
				currentState.write(new FileOutputStream(tempFile));
				
				nextTempFile = (nextTempFile + 1) % tempFiles.length;
				lastSave = now;
			}
		} catch (IOException exc) {
			throw new RuntimeException(exc);
		}
	}

	public void synchroneousFeedback(ScheduleInterface activeSchedule, Replay replay) {
	}

	public void simulationCompleted(Action lastProcessed) {

		try {	
			if (saveFile != null) {
				FreakFile save = runControl.toFile();
				save.write(new FileOutputStream(saveFile));
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		} finally {
			// Cleanly terminate run control
			runControl.request(new TerminateAction());
		}
	}

	public void simulationException(Exception exc) {
		saveFile = null; // results may be invalid
		exc.printStackTrace();
	}
	
	public void terminated(Action lastProcessedBeforeTermination) {

		// Forcibly stop event queue
		System.exit(0);
	}
}