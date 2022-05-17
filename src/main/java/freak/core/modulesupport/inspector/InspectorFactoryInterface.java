package freak.core.modulesupport.inspector;

import freak.core.modulesupport.AbstractBasicModule;

public interface InspectorFactoryInterface {
    InspectorInterface getStandardInspectorFor(AbstractBasicModule abstractBasicModule);
}
