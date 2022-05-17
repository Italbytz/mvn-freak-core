/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

/**
 * This interface must be implemented by all operators which work on more than
 * one search space and are therefore placed in a "common"-folder. Those
 * operators must check in their constructors whether they are compatible with 
 * the chosen search space or not. They must throw an
 * UnsupportedEnvironmentException in the latter case. 
 * 
 * @author Heiko, Michael
 */
public interface CompatibleWithDifferentSearchSpaces {
}