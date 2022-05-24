/*
 * This file is part of RFrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <robin.nunkesser@udo.edu>.
 * 
 * This file is a modification of the original file distributed with
 * FrEAK (http://sourceforge.net/projects/freak427/).
 * Last modification: 06/28/2007
 */

package freak.core.observer;

import freak.core.control.ScheduleInterface;
import freak.core.modulesupport.AbstractModule;
import freak.core.view.View;
import freak.core.view.ViewInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * An abstract superclass for all observers.
 * @author  Dirk, Stefan
 */

public abstract class AbstractObserver extends AbstractModule implements Observer {

	private int measure = UNKNOWN;

	/**
	 * A list of all views.
	 */
	private ArrayList viewList = new ArrayList();

	public AbstractObserver(ScheduleInterface schedule) {
		super(schedule);
	}
	
	public void addView(ViewInterface view) throws ObserverViewMismatchException {
		boolean matches = false;

		Class[] types = view.getInputDataTypes();
		for (int i = 0; i < types.length; i++) {
			matches |= types[i].isAssignableFrom(this.getOutputDataType());
		}

		if (matches) {
			viewList.add(view);
			view.setObserver(this);
		} else {
			throw new ObserverViewMismatchException("View does not match the observer.");
		}
	}

	public void removeView(ViewInterface view) {
		viewList.remove(view);
		view.setObserver(null);
	}

	public List getViews() {
		return viewList;
	}

	public void updateViews(Object o) {
		Iterator iter = getViews().iterator();
		while (iter.hasNext()) {
			((View)iter.next()).update(o);
		}
	}

	/**
	 * @return  the measure
	 */
	public int getMeasure() {
		return measure;
	}

	/**
	 * @param measure  the measure to set
	 */
	public void setMeasure(int measure) {
		this.measure = measure;
	}
}
