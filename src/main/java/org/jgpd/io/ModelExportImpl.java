/*
 *
 *
 * Copyright (C) 2003 David Benson
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

package org.jgpd.io;

import org.jgpd.UI.tableModels.JGpdTableModel;
import org.jgraph.GPGraphpad;
import org.jgraph.pad.GPDocument;
import org.jgraph.pad.GPGraph;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.net.URL;

public class ModelExportImpl implements ModelExportInterface {

	public Object createActivity()
	{
		return null;
	}

	public Object createDecision()
	{
		return null;
	}

	public Object createProcess()
	{
		return null;
	}

	public Object createFork()
	{
		return null;
	}

	public Object createJoin()
	{
		return null;
	}

	public Object createStart()
	{
		return null;
	}

	public Object createEnd()
	{
		return null;
	}

	public void promptProcessProps(GPGraph graph)
	{
		
	}
	
	public void saveFile( 	GPGraphpad graphpad,
							GPDocument doc,
							URL filename,
							GPGraph gpGraph)
	{
		
	}
	
	public String exportModelXML(GPGraph graph)
	{
	   return null;
	}

	public JPanel createBottomPanel(GPGraph g,
									GPDocument d,
									GPGraphpad gp)
	{
		return null;
	}
	
	public JPanel createSidePanel(GPGraph g,
								GPDocument d,
								GPGraphpad gp)
	{
	return null;
	}

	public DefaultMutableTreeNode createTreeNode(Object cell, JTree tree)
	{
		return null;
	}

	public JGpdTableModel createTableModel( Object cell )
	{
		return null;
	}
	
	public void registerComponentListeners(JPanel sidePanel,
									       JPanel bottomPanel)
	{}
}