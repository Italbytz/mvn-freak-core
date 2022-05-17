/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * @see RunEvent
 * @author Stefan
 */
public interface RunEventListener extends EventListener {

	/**
	 * The run is currently being started, the RandomElement is ready, the first
	 * generation is not created yet.
	 */
	public void runStarted(RunEvent evt);

	/**
	 * The run was stopped by Schedule.triggerStopCriterion. The currently
	 * visible population is the last population of this run.
	 */
	public void runCompleted(RunEvent evt);

	/**
	 * The run was stopped by Schedule.skipToNextRun. The currently visible
	 * population is the last population of this run.
	 */
	public void runAborted(RunEvent evt);

	/**
	 * The run is completed, the population is no longer stored. All modules
	 * should clean up unnecessary cached data.
	 */
	public void runFinalize(RunEvent evt);
}
