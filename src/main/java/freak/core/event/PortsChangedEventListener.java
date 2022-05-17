/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

import freak.core.graph.*;

/**
 * 
 * @author Matthias
 */
public interface PortsChangedEventListener extends EventListener {
	void portAdded(Operator source, Port port);
	void portRemoved(Operator source, Port port);
	void portsExchanged(Operator source, Port port1, Port port2);
}
