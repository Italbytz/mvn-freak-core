/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.stoppingcriterion;

import freak.core.modulesupport.*;
import freak.core.modulesupport.Module;

/**
 * This interface represents a stopping criterion of an evolutionary algorithm.  
 * The method createEvents() inherited from Module can be used
 * to perform necessary initializations. In particular the criterion can be
 * registered at some event sources. 
 * 
 * @author Heiko
 */
public interface StoppingCriterion extends Module {

}
