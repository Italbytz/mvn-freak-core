/*
 * @(#)BasicGraphDropTargetListener	1.0 29/2/02
 * 
 * Copyright (c) 2001-2004, Gaudenz Alder 
 * All rights reserved. 
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation 
 *   and/or other materials provided with the distribution.
 * - Neither the name of JGraph nor the names of its contributors may be used
 *   to endorse or promote products derived from this software without specific
 *   prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 */

package org.jgraph.plaf.basic;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.dnd.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicGraphDropTargetListener
	implements DropTargetListener, UIResource, ActionListener {

	/**
	 * construct a DropTargetAutoScroller
	 */
	public BasicGraphDropTargetListener() {
	}

	/**
	 * called to save the state of a component in case it needs to
	 * be restored because a drop is not performed.
	 */
	protected void saveComponentState(JComponent c) {
	}

	/**
	 * called to restore the state of a component in case a drop
	 * is not performed.
	 */
	protected void restoreComponentState(JComponent c) {
	}

	/**
	 * called to restore the state of a component in case a drop
	 * is performed.
	 */
	protected void restoreComponentStateForDrop(JComponent c) {
	}

	/**
	 * called to set the insertion location to match the current
	 * mouse pointer coordinates.
	 */
	protected void updateInsertionLocation(JComponent c, Point p) {
	}

	/**
	 * Update the geometry of the autoscroll region.  The geometry is
	 * maintained as a pair of rectangles.  The region can cause
	 * a scroll if the pointer sits inside it for the duration of the
	 * timer.  The region that causes the timer countdown is the area
	 * between the two rectangles.
	 * <p>
	 * This is implemented to use the visible area of the component
	 * as the outer rectangle and the insets are based upon the
	 * Scrollable information (if any).  If the Scrollable is
	 * scrollable along an axis, the step increment is used as
	 * the autoscroll inset.  If the component is not scrollable,
	 * the insets will be zero (i.e. autoscroll will not happen).
	 */
	void updateAutoscrollRegion(JComponent c) {
		// compute the outer
		Rectangle visible = c.getVisibleRect();
		outer.setBounds(visible.x, visible.y, visible.width, visible.height);

		// compute the insets
		// TBD - the thing with the scrollable
		Insets i = new Insets(0, 0, 0, 0);
		if (c instanceof Scrollable) {
			Scrollable s = (Scrollable) c;
			i.left =
				s.getScrollableUnitIncrement(
					visible,
					SwingConstants.HORIZONTAL,
					1);
			i.top =
				s.getScrollableUnitIncrement(
					visible,
					SwingConstants.VERTICAL,
					1);
			i.right =
				s.getScrollableUnitIncrement(
					visible,
					SwingConstants.HORIZONTAL,
					-1);
			i.bottom =
				s.getScrollableUnitIncrement(
					visible,
					SwingConstants.VERTICAL,
					-1);
		}

		// set the inner from the insets
		inner.setBounds(
			visible.x + i.left,
			visible.y + i.top,
			visible.width - (i.left + i.right),
			visible.height - (i.top + i.bottom));
	}

	/**
	 * Perform an autoscroll operation.  This is implemented to scroll by the
	 * unit increment of the Scrollable using scrollRectToVisible.  If the
	 * cursor is in a corner of the autoscroll region, more than one axis will
	 * scroll.
	 */
	void autoscroll(JComponent c, Point pos) {
		if (c instanceof org.jgraph.JGraph)
			BasicGraphUI.autoscroll((org.jgraph.JGraph) c, pos);
	}

	/**
	 * Initializes the internal properties if they haven't been already
	 * inited. This is done lazily to avoid loading of desktop properties.
	 */
	private void initPropertiesIfNecessary() {
		if (timer == null) {
			Toolkit t = Toolkit.getDefaultToolkit();
			Integer initial = new Integer(100);
			Integer interval = new Integer(100);

			try {
				initial =
					(Integer) t.getDesktopProperty(
						"DnD.Autoscroll.initialDelay");
			} catch (Exception e) {
				// ignore
			}
			try {
				interval =
					(Integer) t.getDesktopProperty("DnD.Autoscroll.interval");
			} catch (Exception e) {
				// ignore
			}
			timer = new Timer(interval.intValue(), this);

			timer.setCoalesce(true);
			timer.setInitialDelay(initial.intValue());

			try {
				hysteresis =
					((Integer) t
						.getDesktopProperty("DnD.Autoscroll.cursorHysteresis"))
						.intValue();
			} catch (Exception e) {
				// ignore
			}
		}
	}

	static JComponent getComponent(DropTargetEvent e) {
		DropTargetContext context = e.getDropTargetContext();
		return (JComponent) context.getComponent();
	}

	// --- ActionListener methods --------------------------------------

	/**
	 * The timer fired, perform autoscroll if the pointer is within the
	 * autoscroll region.
	 * <P>
	 * @param e the <code>ActionEvent</code>
	 */
	public synchronized void actionPerformed(ActionEvent e) {
		updateAutoscrollRegion(component);
		if (outer.contains(lastPosition) && !inner.contains(lastPosition)) {
			autoscroll(component, lastPosition);
		}
	}

	// --- DropTargetListener methods -----------------------------------

	public void dragEnter(DropTargetDragEvent e) {
		component = getComponent(e);
			// DO NOT REMOVE OR MODIFY THIS LINE!
			TransferHandler // JAVA13: org.jgraph.plaf.basic.TransferHandler
				th = (
			// DO NOT REMOVE OR MODIFY THIS LINE!
			(JComponent) // JAVA13: (org.jgraph.plaf.basic.TransferHandler.JDNDAdapter)
	component).getTransferHandler();
		canImport = th.canImport(component, e.getCurrentDataFlavors());
		if (canImport) {
			saveComponentState(component);
			lastPosition = e.getLocation();
			updateAutoscrollRegion(component);
			initPropertiesIfNecessary();
		}
	}

	public void dragOver(DropTargetDragEvent e) {
		if (canImport) {
			Point p = e.getLocation();
			updateInsertionLocation(component, p);

			// check autoscroll
			synchronized (this) {
				if (Math.abs(p.x - lastPosition.x) > hysteresis
					|| Math.abs(p.y - lastPosition.y) > hysteresis) {
					// no autoscroll
					if (timer.isRunning())
						timer.stop();
				} else {
					if (!timer.isRunning())
						timer.start();
				}
				lastPosition = p;
			}
		}
	}

	public void dragExit(DropTargetEvent e) {
		if (canImport) {
			restoreComponentState(component);
		}
		cleanup();
	}

	public void drop(DropTargetDropEvent e) {
		if (canImport) {
			restoreComponentStateForDrop(component);
		}
		cleanup();
	}

	public void dropActionChanged(DropTargetDragEvent e) {
	}

	/**
	 * Cleans up internal state after the drop has finished (either succeeded
	 * or failed).
	 */
	private void cleanup() {
		if (timer != null) {
			timer.stop();
		}
		component = null;
		lastPosition = null;
	}

	// --- fields --------------------------------------------------

	private Timer timer;
	private Point lastPosition;
	private Rectangle outer = new Rectangle();
	private Rectangle inner = new Rectangle();
	private int hysteresis = 10;
	private boolean canImport;

	/**
	 * The current component. The value is cached from the drop events and used
	 * by the timer. When a drag exits or a drop occurs, this value is cleared.
	 */
	private JComponent component;

}

