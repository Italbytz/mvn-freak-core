/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.searchspace;

/**
 * This interface can be implemented by search spaces in order to make a 
 * dimension available. A dimension is a expedient information for the 
 * parametrisation of some modules
 *
 * @author Michael
 */
public interface HasDimension {

	/**
	 * This method returns the internal dimension of a search space.
	 *  
	 * @return the dimension of a search space.
	 */
	public int getDimension();
}
