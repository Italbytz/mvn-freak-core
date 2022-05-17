/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

/**
 * Thrown when a syntactical error in the <code>OperatorGraph</code>
 * was detected.  
 * 
 * @author Matthias
 */

public class GraphSyntaxException extends GraphException {

	/**
	 * Constructs an <code>GraphSyntaxException</code> with no detail message. 
	 */
	public GraphSyntaxException() {
		super();
	}

	/**
	 * Constructs an <code>GraphSyntaxException</code> with the specified detail message.
	 * 
	 * @param message the detail message.
	 */
	public GraphSyntaxException(String message) {
		super(message);
	}
}
