/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

/**
 * Is thrown when an <code>Operator</code> tries to send more or less
 * <code>IndividualList</code> than he has <code>OutPort</code>s.
 *
 * @author Matthias
 */
public class OutputLengthMismatchException extends GraphException {
	/**
	 * Constructs a <code>OutputLengthMismatchException</code> without a detail message.
	 */
	public OutputLengthMismatchException() {
		super();
	}

	/**
	 * Constructs a <code>utputLengthMismatchException</code> with a detail message.
	 * @param message the detail message.
	 */
	public OutputLengthMismatchException(String message) {
		super(message);
	}

}
