/*
 * @(#)LayoutDialog.java        1.0 01/20/03
 *
 * Copyright (C) 2003 Sven Luzar
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
package org.jgraph.layout;

import org.jgraph.pad.resources.Translator;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

/**
 * This dialog is shown when the layout function is requested.<br>
 *<br>
 * It offers a list with available layouts to choose from.<br>
 *<br>
 *<br>
 * @author <a href="mailto:Sven.Luzar@web.de">Sven Luzar</a>
 * @since 1.2.2
 * @version 1.0 init
 */
public class LayoutDialog extends JDialog {

        /** true if canceled
         */
        private boolean canceled;

        /**
         * Creates new form LayoutDialog
         */
        public LayoutDialog(Dialog parent) {
                super(parent, true);
                init();
        }

        /**
         * Creates new form LayoutDialog
         */
        public LayoutDialog(Frame parent) {
                super(parent, true);
                init();
        }

        /** initializes the dialog
         */
        protected void init() {
                // netbeans
                initComponents();

                // fill the list
                fillList();

                // select the first one
                try {
                        lstLayoutControllers.setSelectedIndex(0);
                } catch (Exception e) {
                }
        }

        /** Fills the List with the LayoutControllers
         *  from the LayoutRegistry.
         *  
         *  @see LayoutRegistry
         */
        protected void fillList() {
                try {
                        DefaultListModel model = new DefaultListModel();
                        Iterator all = LayoutRegistry.registeredLayoutControllers();

                        while (all.hasNext()) {
                                LayoutController controller = (LayoutController) all.next();
                                model.addElement(controller);
                        }
                        
                        
                        lstLayoutControllers.setModel(model);
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        /** Will call if the user cancels the dialog
         *
         */
        protected void cancel() {
                canceled = true;
                setVisible(false);
                dispose();
        }

        /** Will call if the user finishs the dialog
         *
         */
        protected void finish() {
                canceled = false;
                setVisible(false);
                dispose();
        }

        /**
         * Returns true if the dialog has been canceled.
         */
        public boolean isCanceled() {
                return canceled;
        }

        /** Will call if the user clicks on the configuration button.
         *  if the layout controller is configurable the method
         *  calls the configure method at the controller.
         * 
         *  @see LayoutController#configure
         *
         */
        protected void configure() {
                try {
                        LayoutController controller =
                                (LayoutController) lstLayoutControllers.getSelectedValue();
                        if (!controller.isConfigurable()) {
                                String message = Translator.getString("Error.ThisLayoutCannotBeConfigured"); /*#Finished: "This Layout cannot be configured."*/
                                JOptionPane.showMessageDialog(
                                        this,
                                        message,
                                        null,
                                        JOptionPane.INFORMATION_MESSAGE);
                                return;
                        }
                        controller.configure();
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        /** Returns true 
         *      if the user 
         *  wants to apply the Algorithm for 
         *  all nodes.
         */
        public boolean isApplyLayoutToAll() {
                return cmdAllNodes.isSelected();
        }

        /** Returns the selected 
         *  LayoutController of null if
         *  no LayoutController was selected
         *
         */
        public LayoutController getSelectedLayoutController() {
                try {
                        return (LayoutController) lstLayoutControllers.getSelectedValue();
                } catch (Exception e) {
                        return null;
                }
        }

        /** initializes the GUI
         *
         */
        protected void initComponents() { //GEN-BEGIN:initComponents
                cmdGrpApplyTo = new ButtonGroup();
                pnlMain = new JPanel();
                pnlApplyTo = new JPanel();
                lblApplyTo = new JLabel();
                cmdAllNodes = new JRadioButton();
                cmdSelectedNodes = new JRadioButton();
                pnlButtons = new JPanel();
                cmdConfigure = new JButton();
                cmdCancel = new JButton();
                cmdFinished = new JButton();
                pnlLayoutControllers = new JPanel();
                scrollLayoutControllers = new JScrollPane();
                lstLayoutControllers = new JList();

                setTitle(Translator.getString("Layout"));       //#Changed
                setName("Layout");      //#Frozen
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowClosing(java.awt.event.WindowEvent evt) {
                                closeDialog(evt);
                        }
                });

                pnlMain.setLayout(new BorderLayout());

                lblApplyTo.setText(Translator.getString("Apply to"));   //#Changed
                lblApplyTo.setName("ApplyTo");  //#Frozen
                pnlApplyTo.add(lblApplyTo);

                cmdAllNodes.setFont(new Font("Dialog", 0, 12));
                cmdAllNodes.setText(Translator.getString("AllNodes"));  //#Changed
                cmdAllNodes.setName("AllNodes");        //#Frozen
                cmdGrpApplyTo.add(cmdAllNodes);
                pnlApplyTo.add(cmdAllNodes);

                cmdSelectedNodes.setFont(new Font("Dialog", 0, 12));
                cmdSelectedNodes.setSelected(true);
                cmdSelectedNodes.setText(Translator.getString("SelectedNodes"));        //#Changed
                cmdSelectedNodes.setName("SelectedNodes");      //#Frozen
                cmdGrpApplyTo.add(cmdSelectedNodes);
                pnlApplyTo.add(cmdSelectedNodes);

                pnlMain.add(pnlApplyTo, BorderLayout.NORTH);

                cmdConfigure.setText(Translator.getString("Configure"));        //#Changed
                cmdConfigure.setName("Configure");      //#Frozen
                cmdConfigure.setFocusPainted(false);
                cmdConfigure.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                configureButtonActionPerformed(evt);
                        }
                });

                pnlButtons.add(cmdConfigure);

                cmdFinished.setText(Translator.getString("OK"));        //#Changed
                cmdFinished.setName("OK");      //#Frozen
                cmdFinished.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                finishedButtonActionPerformed(evt);
                        }
                });

                pnlButtons.add(cmdFinished);
                getRootPane().setDefaultButton(cmdFinished);

                cmdCancel.setText(Translator.getString("Cancel"));      //#Changed
                cmdCancel.setName("Cancel");    //#Frozen
                cmdCancel.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cancelButtonActionPerformed(evt);
                        }
                });
                pnlButtons.add(cmdCancel);

                pnlMain.add(pnlButtons, BorderLayout.SOUTH);

                getContentPane().add(pnlMain, BorderLayout.SOUTH);

                pnlLayoutControllers.setLayout(new BorderLayout());

                scrollLayoutControllers.setViewportView(lstLayoutControllers);

                pnlLayoutControllers.add(scrollLayoutControllers, BorderLayout.CENTER);

                getContentPane().add(pnlLayoutControllers, BorderLayout.CENTER);

                pack();
                Dimension screenSize =
                        Toolkit.getDefaultToolkit().getScreenSize();
                //setSize(new java.awt.Dimension(302, 312));
                pack();
                setLocation(
                        (screenSize.width - this.getWidth()) / 2,
                        (screenSize.height - this.getHeight()) / 2);
        } //GEN-END:initComponents

        /** calls the configure method
         *  @see #configure
         */
        protected void configureButtonActionPerformed(
                java.awt.event.ActionEvent evt) {
                //GEN-FIRST:event_configureButtonActionPerformed
                configure();
        } //GEN-LAST:event_configureButtonActionPerformed
        /** calls the finish method
         *  @see #finish
         */
        protected void finishedButtonActionPerformed(
                java.awt.event.ActionEvent evt) {
                //GEN-FIRST:event_finishedButtonActionPerformed
                finish();
        } //GEN-LAST:event_finishedButtonActionPerformed
        /** calls the cancel method
         *  @see #cancel
         */
        protected void cancelButtonActionPerformed(
                java.awt.event.ActionEvent evt) {
                //GEN-FIRST:event_cancelButtonActionPerformed
                cancel();
        } //GEN-LAST:event_cancelButtonActionPerformed
        /** calls the cancel method
         *  @see #cancel
         */
        protected void closeDialog(
                java.awt.event.WindowEvent evt) { //GEN-FIRST:event_closeDialog
                cancel();
        } //GEN-LAST:event_closeDialog
        // Variables declaration - do not modify//GEN-BEGIN:variables
        /** GUI object */
        private JPanel pnlApplyTo;
        /** GUI object */
        private JButton cmdConfigure;
        /** GUI object */
        private JPanel pnlLayoutControllers;
        /** GUI object */
        private JScrollPane scrollLayoutControllers;
        /** GUI object */
        private JRadioButton cmdSelectedNodes;
        /** GUI object */
        private ButtonGroup cmdGrpApplyTo;
        /** GUI object */
        private JRadioButton cmdAllNodes;
        /** GUI object */
        private JList lstLayoutControllers;
        /** GUI object */
        private JPanel pnlButtons;
        /** GUI object */
        private JButton cmdCancel;
        /** GUI object */
        private JPanel pnlMain;
        /** GUI object */
        private JLabel lblApplyTo;
        /** GUI object */
        private JButton cmdFinished;
        // End of variables declaration//GEN-END:variables

        /**
         * TEST
         */
        public static void main(String args[]) {
                new LayoutDialog(new JFrame()).setVisible(true);
                System.exit(0);
        }
}
