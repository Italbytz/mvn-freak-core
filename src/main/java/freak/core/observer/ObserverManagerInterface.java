package freak.core.observer;

import java.util.List;

public interface ObserverManagerInterface {
    List getActiveObservers();

    int getIdentificationNumber();

    void addObserver(Observer obs);
    void removeObserver(Observer obs);
}
