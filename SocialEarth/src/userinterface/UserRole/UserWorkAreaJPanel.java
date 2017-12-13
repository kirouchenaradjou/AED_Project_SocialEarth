/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRole;

import Business.ChatAPI.GoogleTalkChatLogin;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventManagemnetOrg;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Divya Priya Emmanuel
 */
public class UserWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EventManagemnetOrg organization;
    private EcoSystem system;
    /**
     * Creates new form 
     */
    public UserWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EventManagemnetOrg organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
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
        OptionRegTxt = new javax.swing.JButton();
        EditProTxt = new javax.swing.JButton();
        OptionDashboardTxt = new javax.swing.JButton();
        chatBtn = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Work Area Panel");

        OptionRegTxt.setText("Register for an event !!");
        OptionRegTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionRegTxtActionPerformed(evt);
            }
        });

        EditProTxt.setText("Edit my profile");
        EditProTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProTxtActionPerformed(evt);
            }
        });

        OptionDashboardTxt.setText("Dash Board");
        OptionDashboardTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionDashboardTxtActionPerformed(evt);
            }
        });

        chatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chaticon.png"))); // NOI18N
        chatBtn.setText("Have questions? Chat with admin");
        chatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(chatBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(OptionRegTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditProTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OptionDashboardTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(OptionRegTxt)
                .addGap(37, 37, 37)
                .addComponent(EditProTxt)
                .addGap(45, 45, 45)
                .addComponent(OptionDashboardTxt)
                .addGap(40, 40, 40)
                .addComponent(chatBtn)
                .addContainerGap(336, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OptionRegTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionRegTxtActionPerformed
        // TODO add your handling code here:
        RegisterForEvent registerForEvent = new RegisterForEvent(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("registerForEvent", registerForEvent);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_OptionRegTxtActionPerformed

    private void EditProTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProTxtActionPerformed
        // TODO add your handling code here:
        UserEditProfileJPanel userEditProfileJPanel = new UserEditProfileJPanel(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("userEditProfileJPanel", userEditProfileJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_EditProTxtActionPerformed

    private void OptionDashboardTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionDashboardTxtActionPerformed
        // TODO add your handling code here:
        DashboardForUser dashboardForUser = new DashboardForUser(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("dashboardForUser", dashboardForUser);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_OptionDashboardTxtActionPerformed

    private void chatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatBtnActionPerformed
        // TODO add your handling code here:
        GoogleTalkChatLogin googleTalkChatLogin = new GoogleTalkChatLogin();
    }//GEN-LAST:event_chatBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditProTxt;
    private javax.swing.JButton OptionDashboardTxt;
    private javax.swing.JButton OptionRegTxt;
    private javax.swing.JButton chatBtn;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
