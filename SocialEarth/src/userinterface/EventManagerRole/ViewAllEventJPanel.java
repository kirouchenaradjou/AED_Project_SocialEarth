/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EventManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventManagemnetOrg;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Event.Event;
import java.awt.Component;
import userinterface.TransportManagerRole.TransportRoleWorkAreaJPanel;

/**
 *
 * @author Divya Priya Emmanuel
 */
public class ViewAllEventJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EventManagemnetOrg organization;
    private EcoSystem system;
    private Event event;

    /**
     * Creates new form ViewAllEventJPanel
     */

    ViewAllEventJPanel(JPanel userProcessContainer, UserAccount account, EventManagemnetOrg organization, EcoSystem system, Event event) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.system = system;
        this.event = event;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) ViewEventManagerTbl.getModel();

        model.setRowCount(0);

        for (Event event : system.getEventDirectory().getEventList()) {
            Object[] row = new Object[7];
            row[0] = event;
            row[1] = event.getEventDate();
            row[2] = event.getVenue();

            model.addRow(row);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ViewEventManagerTbl = new javax.swing.JTable();
        UpdateEventBtn = new javax.swing.JButton();
        DeleteEventBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewEventManagerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Date", "Venue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ViewEventManagerTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 550, 180));

        UpdateEventBtn.setText("Update");
        UpdateEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEventBtnActionPerformed(evt);
            }
        });
        add(UpdateEventBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        DeleteEventBtn.setText("Delete");
        DeleteEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEventBtnActionPerformed(evt);
            }
        });
        add(DeleteEventBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ragha\\Desktop\\2.png")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 220, 230));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Event Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 340, -1));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back3Blue.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEventBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ViewEventManagerTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view details", "Waring", JOptionPane.WARNING_MESSAGE);
        } else {
            Event event = (Event) ViewEventManagerTbl.getValueAt(selectedRow, 0);
            UpdateEventJpanel panel = new UpdateEventJpanel(userProcessContainer, userAccount, organization, system, event);
            userProcessContainer.add("UpdateEventJpanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_UpdateEventBtnActionPerformed

    private void DeleteEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEventBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ViewEventManagerTbl.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the selected EVENT:", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Event event = (Event) ViewEventManagerTbl.getValueAt(selectedRow, 0);
                system.getEventDirectory().deleteEvent(event);
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from table", "Waring", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DeleteEventBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TransportRoleWorkAreaJPanel dwjp = (TransportRoleWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteEventBtn;
    private javax.swing.JButton UpdateEventBtn;
    private javax.swing.JTable ViewEventManagerTbl;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
