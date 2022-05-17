/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

/**
 * @author Kai
 */
public class UnassignedParameterException extends GraphSyntaxException {

	/**
	 * Standard constructor.
	 */
	public UnassignedParameterException() {
	}

	/**
	 * Constructor which takes a String message as
	 * argument.
	 * 
	 * @param msg the message.
	 */
	public UnassignedParameterException(String msg) {
		super(msg);
	}

}
