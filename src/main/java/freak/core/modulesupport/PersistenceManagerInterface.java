package freak.core.modulesupport;

import org.jdom.Element;

public interface PersistenceManagerInterface {
    Element toXML(Object o);
    Object fromXML(Element e);
}
