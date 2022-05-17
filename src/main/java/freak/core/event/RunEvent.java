/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

import freak.core.control.*;

/**
 * A RunEvent is sent by the Schedule, every time a run is started or finished.
 * 
 * @author Stefan
 */
public class RunEvent extends Event {
	private RunEventSource source;
	private RunIndex runIndex;

	public RunEvent(RunEventSource source, RunIndex runIndex) {
		this.source = source;
		this.runIndex = runIndex;
	}

	public RunEventSource getSource() {
		return source;
	}

	/**
	 * Returns the number of the associated run.
	 */
	public RunIndex getRunIndex() {
		return runIndex;
	}
}
