/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

/**
 * Is thrown when sombody tries to connect/disconnect ports that shouldn't be
 * connected/disconnected (e.g.&nbsp;connect two inports). 
 * 
 * @author Matthias
 */
public class PortConnectException extends GraphException {
	/**
	 * Constructs a <code>PortConnectException</code> without a detail message.
	 */
	public PortConnectException() {
		super();
	}

	/**
	 * Constructs a <code>PortConnectException</code> with a detail message.
	 * @param message the detail message.
	 */
	public PortConnectException(String message) {
		super(message);
	}

}
