/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.modulesupport;

import org.jdom.*;

/**
 * @author Matthias
 */
public interface ClassPersistenceHandler {

	public Element toXML(Object o) throws Exception;

	public Object fromXML(Element e) throws Exception;

	public Class handles();

}
