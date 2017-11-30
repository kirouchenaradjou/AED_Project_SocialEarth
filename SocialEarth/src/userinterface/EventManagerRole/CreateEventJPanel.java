/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EventManagerRole;

import java.awt.CardLayout;
import userinterface.UserRole.RegisterForEvent;

/**
 *
 * @author Divya Priya Emmanuel
 */
public class CreateEventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateEventJPanel
     */
    public CreateEventJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ManageEventsBtn = new javax.swing.JButton();
        WorkRequestBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select your activity");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 280, -1));

        ManageEventsBtn.setText("Manage Events");
        ManageEventsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEventsBtnActionPerformed(evt);
            }
        });
        add(ManageEventsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        WorkRequestBtn.setText("Work Request");
        WorkRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkRequestBtnActionPerformed(evt);
            }
        });
        add(WorkRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ManageEventsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEventsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageEventsBtnActionPerformed

    private void WorkRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkRequestBtnActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_WorkRequestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageEventsBtn;
    private javax.swing.JButton WorkRequestBtn;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}