/*
 *
 * Copyright (C) 2003-2004 David Benson
 *
 * JGpd is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * JGpd is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JGpd; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

package org.jgpd.jgraph;

import org.jgraph.JGraph;
import org.jgraph.graph.*;

import java.awt.*;

public class StartView extends VertexView
{
	public static int defaultWidth = 50;
	public static int defaultHeight = 50;

	public static StartRenderer renderer = new StartRenderer();

	public StartView(Object cell, JGraph graph, CellMapper cm) {
		super(cell, graph, cm);
	}


	public CellViewRenderer getRenderer() {
		return renderer;
	}


	public static class StartRenderer extends VertexRenderer {

		public void paint(Graphics g) {
			int b = borderWidth;
			Graphics2D g2 = (Graphics2D) g;
			Dimension d = getSize();
			boolean tmp = selected;
			// Get square from rectangle
			if ( d.width > d.height )
			{
				// Wide and short
				d.width = d.height;
				d.height = d.height;
			}
			else
			{
				// Thin and tall
				d.width = d.width;
				d.height = d.width;
			}

			if (super.isOpaque()) {
				g.setColor(super.getBackground());
				g.fillOval(b - 1, b - 1, d.width - b, d.height - b);
			}
			try {
				setBorder(null);
				setOpaque(false);
				selected = false;
				super.paint(g);
			} finally {
				selected = tmp;
			}
			if (bordercolor != null) {
				g.setColor(bordercolor);
				g2.setStroke(new BasicStroke(b));
				g.drawOval(b - 1, b - 1, d.width - b, d.height - b);
			}
			if (selected) {
				g2.setStroke(GraphConstants.SELECTION_STROKE);
				g.setColor(graph.getHighlightColor());
				g.drawOval(b - 1, b - 1, d.width - b, d.height - b);
			}
		}
	}
}