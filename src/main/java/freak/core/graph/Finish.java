/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

import freak.core.population.*;

/**
 * Represents the finish operator in the operator graph where the final individuals 
 * are merged into the new population.
 * 
 * @author Matthias, Dirk 
 */
public class Finish extends AbstractOperator {

	private IndividualList resultPopulation;

	/**
	 * Creates a new <code>Finish</code> operator.
	 * 
	 * @param graph a link back to the operator graph.
	 */
	public Finish(OperatorGraph graph) {
		super(graph);
		super.addInPort(0);
		super.addOutPort(0);
	}

	/**
	 * Returns the received population.
	 * 
	 * @return the received population.
	 */
	public IndividualList getResultPopulation() {
		return resultPopulation;
	}
	public IndividualList[] process(IndividualList[] input) {
		resultPopulation = input[0];
		return input;
	}

	/**
	 * Performs a syntax check and throws exceptions
	 * if the operator is not in a correct state or
	 * if it is not linked correctly.
	 * 
	 * Note that this check is different from that one
	 * in AbstractOperator because we must not check the outport
	 * of the finish node. 
	 */
	public void checkSyntax() throws GraphSyntaxException {
		for (int i = 0; i < getNumberOfInPorts(); i++) {
			getInPort(i).checkSyntax();
		}
	}

	public String getName() {
		return "Finish";
	}

	public String getDescription() {
		return "Collects the final individuals that form the new population.";
	}

}
