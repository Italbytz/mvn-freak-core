/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

/**
 * This exception is thrown if the sizes of the individual lists differ.
 *
 *  @author Heiko
 */
public class DifferentNumberOfIndividualsException extends GraphException {

	/**
	 * Constructs a <code>DifferentNumberOfIndividualsException</code> with a
	 * detail message.
	 * @param message the detail message.
	 */
	public DifferentNumberOfIndividualsException(String message) {
		super(message);
	}
}
