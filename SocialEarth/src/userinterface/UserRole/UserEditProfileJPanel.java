/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventManagemnetOrg;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Divya Priya Emmanuel
 */
public class UserEditProfileJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EventManagemnetOrg organization;
    private EcoSystem system;
    /**
     * Creates new form UserOptionJPanel
     */
   
    public UserEditProfileJPanel(JPanel userProcessContainer, UserAccount userAccount, EventManagemnetOrg organization, Enterprise enterprise, EcoSystem system) {
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

        jLabel5 = new javax.swing.JLabel();
        UpdateCityTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        UpdateUserNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UpdatePasswordTxt = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        UpdateZoneComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UserUpdateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        UpdateNameTxt1 = new javax.swing.JTextField();
        UpdateEmailTxt = new javax.swing.JTextField();
        UpdateConfirmTxt = new javax.swing.JTextField();
        UpdateAdd1Txt = new javax.swing.JTextField();
        UpdateAdd2Txt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Name : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 20));
        add(UpdateCityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Username : ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 30));
        add(UpdateUserNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Password : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, 20));

        UpdatePasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePasswordTxtActionPerformed(evt);
            }
        });
        add(UpdatePasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Email : ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Confirm Email : ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Zone : ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 50, 20));

        UpdateZoneComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(UpdateZoneComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 200, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Address 1:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 80, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Address 2:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 80, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("City : ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 50, 30));

        UserUpdateBtn.setText("Update");
        add(UserUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Please edit your details below");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 280, -1));
        add(UpdateNameTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 200, 30));
        add(UpdateEmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 200, 30));

        UpdateConfirmTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateConfirmTxtActionPerformed(evt);
            }
        });
        add(UpdateConfirmTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 200, 30));
        add(UpdateAdd1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 200, 30));
        add(UpdateAdd2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatePasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatePasswordTxtActionPerformed

    private void UpdateConfirmTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateConfirmTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateConfirmTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UpdateAdd1Txt;
    private javax.swing.JTextField UpdateAdd2Txt;
    private javax.swing.JTextField UpdateCityTxt;
    private javax.swing.JTextField UpdateConfirmTxt;
    private javax.swing.JTextField UpdateEmailTxt;
    private javax.swing.JTextField UpdateNameTxt1;
    private javax.swing.JPasswordField UpdatePasswordTxt;
    private javax.swing.JTextField UpdateUserNameTxt;
    private javax.swing.JComboBox<String> UpdateZoneComboBox;
    private javax.swing.JButton UserUpdateBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}