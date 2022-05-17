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
public interface ScheduleEventSource extends EventSource {
	void addScheduleEventListener(ScheduleEventListener l);
	void removeScheduleEventListener(ScheduleEventListener l);
}
