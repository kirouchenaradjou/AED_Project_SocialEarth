/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.EventManagemnetOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.Zone.Zone;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ragha
 */
public class UserWorkAreaPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EventManagemnetOrg organization;
    private EcoSystem system;
    private boolean flag = false;

    /**
     * Creates new form EventManager
     */
    public UserWorkAreaPanel(JPanel userProcessContainer, UserAccount account, EventManagemnetOrg organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
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

        jLabel1 = new javax.swing.JLabel();
        eventNameField = new javax.swing.JTextField();
        registerForEventBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Event Name : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));
        add(eventNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 140, 30));

        registerForEventBtn.setText("Register for event");
        registerForEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerForEventBtnActionPerformed(evt);
            }
        });
        add(registerForEventBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Work Area Panel");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void registerForEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerForEventBtnActionPerformed
        String eventName = eventNameField.getText();
        if (eventName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Event name cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        LabTestWorkRequest newRequest = new LabTestWorkRequest();
        newRequest.setSender(userAccount);
        newRequest.setMessage(eventName);

        Organization org = null;
        for (Network eachNetwork : system.getNetworkDirectory().getNetworkList()) {
            for (Zone eachZone : eachNetwork.getZoneDirectory().getZoneDirectory()) {
                for (Enterprise eachEnterprise : eachZone.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization eachOrg : eachEnterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (eachOrg instanceof EventManagemnetOrg) {
                            org = eachOrg;
                            break;
                        }
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(newRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(newRequest);
        }
    }//GEN-LAST:event_registerForEventBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eventNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton registerForEventBtn;
    // End of variables declaration//GEN-END:variables
}