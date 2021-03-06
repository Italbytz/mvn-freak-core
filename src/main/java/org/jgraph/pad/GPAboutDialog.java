/*
 * @(#)GPAboutDialog.java	2.0 1.2 11/11/02
 *
 * Copyright (C) 2001 Gaudenz Alder
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */

package org.jgraph.pad;

import org.jgraph.pad.resources.Translator;
import org.jgraph.pad.resources.Version;
import org.jgraph.utils.HTMLPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GPAboutDialog extends JDialog {

	public GPAboutDialog(Frame owner, String title, ImageIcon logo) {
		super(owner, title, true);
		setSize(new Dimension(450, 320));

		JTabbedPane mainTabs = new JTabbedPane();
		JPanel aboutPanel = new JPanel();
		JPanel creditsPanel = new JPanel();
		mainTabs.addTab(Translator.getString("About"), aboutPanel);
		mainTabs.addTab(Translator.getString("Credits"), creditsPanel);
		getContentPane().add(mainTabs);
		setLocationRelativeTo(owner);
		setResizable(false);

		// Construct About Panel
		JLabel lab1 = new JLabel(logo);
		JLabel lab2 = new JLabel("Java Graphical Process Designer"/*#Frozen*/);
		lab2.setFont(lab1.getFont().deriveFont(Font.PLAIN, 24));
		JLabel lab3 = new JLabel("Version " + Version.getVersion() + " - uses "+org.jgraph.JGraph.VERSION);
		lab3.setFont(lab3.getFont().deriveFont(Font.PLAIN, 12));
		JLabel lab4 =
			new JLabel("Copyright (C) 2003 ."/*#Frozen*/);
		lab4.setFont(lab4.getFont().deriveFont(Font.PLAIN, 12));
		JLabel lab5 =
			new JLabel("Java:"+System.getProperty("java.version")+" OS: "+System.getProperty("os.name"));
		lab5.setFont(lab5.getFont().deriveFont(Font.PLAIN, 12));
		lab1.setBounds(10, 9, 20, 24);
		lab2.setBounds(40, 5, 360, 30);
		lab3.setBounds(40, 33, 360, 25);
		lab4.setBounds(40, 200, 360, 25);
		HTMLPane text = new HTMLPane();
		text.setOpaque(false);
		text.setText(
			Translator.getString("AboutText"));
		text.setBounds(40, 65, 400, 140);
		text.setFont(lab4.getFont());
		text.setEditable(false);
		aboutPanel.setLayout(null);
		aboutPanel.add(lab1);
		aboutPanel.add(lab2);
		aboutPanel.add(lab3);
		aboutPanel.add(text);
		aboutPanel.add(lab4);

		// Construct Credits Panel
		JTextArea credits = new JTextArea();
		creditsPanel.setLayout(new BorderLayout());
		creditsPanel.add(new JScrollPane(credits), BorderLayout.CENTER);
		credits.setOpaque(false);
		credits.setText(
				"The JGpd designer is based on JGraphpad\n\n"
		    + "Designed by David Benson\n"
		    + "Written by David Benson\n"
			+ "The website and CVS repository are kindly hosted by\n"
			+ "sourceforge.net.\n");
		credits.setCaretPosition(0);
		credits.setEditable(false);
	}

	// Close on escape
	protected JRootPane createRootPane() {
		KeyStroke stroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
		JRootPane rootPane = new JRootPane();
		rootPane.registerKeyboardAction(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				setVisible(false);
			}
		}, stroke, JComponent.WHEN_IN_FOCUSED_WINDOW);
		return rootPane;
	}

}
