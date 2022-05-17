/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * @see ScheduleEvent
 * 
 * @author Stefan
 */
public interface ScheduleEventListener extends EventListener {
	/**
	 * The Schedule was started for the first time.
	 */
	void scheduleStarted(ScheduleEvent evt);
	/**
	 * The Schedule was started, after the user edited it. Note, that this is
	 * always true on the first start.
	 */
	void scheduleEdited(ScheduleEvent evt);
}
