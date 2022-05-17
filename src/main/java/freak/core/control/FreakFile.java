/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.control;

import java.io.*;

/**
 * This class represents all data stored in a saved file. The read and write
 * methods encapsulate the file format.
 * 
 * @author Stefan
 */
public class FreakFile implements Serializable {
	Replay replay;
	ScheduleInterface activeSchedule;

	public FreakFile(Replay replay, ScheduleInterface activeSchedule) {
		this.replay = replay;
		this.activeSchedule = activeSchedule;
	}

	public void write(OutputStream s) throws IOException {
		new ObjectOutputStream(s).writeObject(this);
	}

	public static FreakFile read(InputStream s) throws IOException, ClassNotFoundException {
		return (FreakFile)new ObjectInputStream(s).readObject();
	}
}
