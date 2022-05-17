/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * RunEventAdapter can be subclassed as a convenience to implement
 * RunEventListner. All its methods are empty.
 *  
 * @author Stefan
 */
public abstract class RunEventAdapter implements RunEventListener {

	public void runStarted(RunEvent evt) {
	}

	public void runCompleted(RunEvent evt) {
	}

	public void runAborted(RunEvent evt) {
	}

	public void runFinalize(RunEvent evt) {
	}
}
