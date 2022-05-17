/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

import freak.core.population.*;

/**
 * Is thrown when new individuals are created or received.
 *  
 * @author Dirk
 */
public class IndividualListEvent extends Event {

	private IndividualList individualList;

	public IndividualListEvent(IndividualListEventSource source, IndividualList individualList) {
		this.source = source;
		this.individualList = individualList;
	}

	public IndividualList getIndividualList() {
		return individualList;
	}

	public IndividualListEventSource getSource() {
		return source;
	}

	private IndividualListEventSource source;
}
