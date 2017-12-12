/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FinanaceManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Event.Event;
import Business.Organization.FinanceOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Raghavi Kirouchenaradjou
 */
public class FinanceManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FinanceManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private FinanceOrganization organization;
    private EcoSystem system;
    private Event event;
    private boolean flag = false;

    public FinanceManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FinanceOrganization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.system = system;
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
        WorkRequestBtn = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Finance Manager Work Area Panel");

        WorkRequestBtn.setText("Work Request");
        WorkRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkRequestBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(WorkRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addGap(164, 164, 164)
                .addComponent(WorkRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void WorkRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkRequestBtnActionPerformed
        ManageWorkRequestPanel_Finance manageWorkRequestJPanel = new ManageWorkRequestPanel_Finance(userProcessContainer, userAccount, organization, system);
        userProcessContainer.add("ManageWorkRequestPanel_Finance", manageWorkRequestJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_WorkRequestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton WorkRequestBtn;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
