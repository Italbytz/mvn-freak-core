/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * A Schedule event is sent by the Schedule, when the Schedule is started for
 * the first time and after it is edited and restarted. There is no event, when
 * a Schedule is completed, because the run number of a Schedule may always be
 * increased, so the Schedule never really ends. Starting of individual runs or
 * generations are reported by the Schedule via different events.
 * 
 * @author Stefan
 */
public class ScheduleEvent extends Event {
	private ScheduleEventSource source;

	public ScheduleEvent(ScheduleEventSource source) {
		this.source = source;
	}

	public ScheduleEventSource getSource() {
		return source;
	}
}
