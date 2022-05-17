/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * EventListener is the superinterface of all event recieving classes in freak.
 * Each event type defines a listener with one or more methods, of which one is
 * called by EventSources on all registered EventListeners when the event has
 * occured.
 * 
 * @author Stefan
 */
public interface EventListener {
}
