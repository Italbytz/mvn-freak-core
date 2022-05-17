/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.control;

/**
 * @author Stefan
 */
public interface StateListener {
	public void asynchroneousFeedback(ScheduleInterface schedule, Replay replay);
	public void synchroneousFeedback(ScheduleInterface activeSchedule, Replay replay);
	
	public void simulationCompleted(Actions.Action lastProcessed);
	public void simulationException(Exception exc);
	public void terminated(Actions.Action lastProcessedBeforeTermination);
}
