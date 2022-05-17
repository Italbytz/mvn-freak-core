/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * A listener for <code>IndividualListEvents</code>.
 * 
 * @see IndividualListEvent
 * @author Dirk
 */
public interface IndividualListEventListener extends EventListener {
	void individualList(IndividualListEvent evt);
}
