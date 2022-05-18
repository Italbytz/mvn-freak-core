package freak.core.view;

import freak.core.observer.Observer;

public interface ViewInterface {

    /**
     * Returns the types of data the view is able to handle.
     * This is used to match observers and views; a view can be added to an
     * observer if the view can handle the data of the observer.
     *
     * @return an array of class objects representing the types of data the view works with.
     */
    public Class[] getInputDataTypes();

    /**
     * Sets the observer this view is associated with. May be <code>null</code>.
     * @param observer  the view's observer.
     * @uml.property  name="observer"
     */
    public void setObserver(Observer observer);

}
