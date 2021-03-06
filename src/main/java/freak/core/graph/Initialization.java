/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;


/**
 * A operator to create new individuals. Initialization is used to create the 
 * starting population and may be used in the operator graph as well to provide 
 * some new individuals.
 * 
 * @author Dirk, Stefan, Michael
 */
abstract public class Initialization extends AbstractVariation {
	
	private boolean hideName = false;
	
	/**
	 * Creates a new <code>Initialization</code> operator.
	 * 
	 * @param graph a link back to the operator graph.
	 */
	public Initialization(OperatorGraph graph) {
		super(graph);
		addOutPort();
	}
	
	/**
	 * Property Name getter method.
	 */
	public String getPropertyName() throws UnsupportedOperationException{
		if (hideName) throw new UnsupportedOperationException();
		return (name);
	}

	/**
	 * Called by GUI to create an Exception when getting the Modulename
	 */
	public void hideNameProperty() {
		hideName = true;
	}
}
