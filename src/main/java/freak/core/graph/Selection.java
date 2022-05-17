/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

/**
 * Selects individuals from the ingoing individual list and outputs the 
 * selected individuals as well as the ingoing individuals.
 * 
 * @author Dirk 
 */
abstract public class Selection extends AbstractOperator {

	/**
	 * Create a new <code>Selection</code> operator.
	 * 
	 * @param graph a link back to the operator graph.
	 */
	public Selection(OperatorGraph graph) {
		super(graph);
	}
}
