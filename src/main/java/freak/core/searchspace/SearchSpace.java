/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.searchspace;

import freak.core.modulesupport.*;
import freak.core.modulesupport.Module;
import freak.core.population.*;

/**
 * An interface representing the current search space. In terms of evolutionary
 * algorithms, the search space is a set containing all genotypes that 
 * that can possibly be evaluated by the algorithm 
 * (encapsulated by individuals).<br>
 * <code>SearchSpace</code> provides general information about the current
 * search space and some general operations such as generating 
 * a random genotype.
 *  
 * @author Dirk
 */
public interface SearchSpace extends Module {

	/**
	 * Returns a genotype generated randomly with uniform probability 
	 * distribution among all genotypes of the seach space.
	 * 
	 * @return a randomly generated genotype.
	 */
	Genotype getRandomGenotype();

	/**
	 * Returns the overall number of genotypes within the search space.
	 * 
	 * @return the overall number of genotypes within the search space.
	 */
	double getSize();
}
