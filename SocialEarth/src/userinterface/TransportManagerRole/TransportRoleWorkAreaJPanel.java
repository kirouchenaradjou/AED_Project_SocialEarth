/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TransportManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.GoogleAPIs.AddressConverter;
import Business.GoogleAPIs.Location;
import Business.Organization.Organization;
import Business.Organization.TransportOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RoleWorkRequest;
import Business.WorkQueue.WorkRequest;
import Helper.DistanceCalculation;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ragahvi
 */
public class TransportRoleWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private TransportOrganization transportOrganization;
    private Enterprise enterprise;
    String latLong_user = "";
    String latLong_event = "";
    String[] locationArray_user = new String[10];
    String[] locationArray_event = new String[10];

    /**
     * Creates new form TransportRoleWorkAreaJPanel
     */
    public TransportRoleWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.transportOrganization = (TransportOrganization) organization;

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : transportOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[8];
            row[0] = request;
            row[1] = request.getMessage();
            row[2] = request.getEventVenue();
            row[3] = request.getSender() == null ? null : request.getSender().getEmployee().getName();
            row[4] = request.getUserAccount() == null ? null : request.getUserAccount().getEmployee().getName();
            row[5] = request.getUserAccount() == null ? null : request.getUserAccount().getEmployee().getAddress();
            row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();

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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Event Name", "Event Venue", "Sender - Event Organizer", "User Name", "User Address", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(6).setResizable(false);
        }

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ragha\\Desktop\\6.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(assignJButton)
                        .addGap(144, 144, 144)
                        .addComponent(processJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshJButton)
                                .addGap(32, 32, 32))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(refreshJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(processJButton))
                .addGap(128, 128, 128))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Checking");
        populateTable();
        JOptionPane.showMessageDialog(null, "Assigned to you", "Information", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        RoleWorkRequest request = (RoleWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Processing");

        AddressConverter addressConverter_user = new AddressConverter();
        latLong_user = addressConverter_user.getLocation(request.getUserAccount().getEmployee().getAddress());
        if (latLong_user.isEmpty()) {
            return;
        }
        locationArray_user = latLong_user.split(",");
        String latitude_user = locationArray_user[0];
        String longitutue_user = locationArray_user[1];
        
        AddressConverter addressConverter_event = new AddressConverter();
        latLong_event = addressConverter_event.getLocation(request.getEventVenue());
        if (latLong_event.isEmpty()) {
            return;
        }
        locationArray_event = latLong_event.split(",");
        String latitude_event = locationArray_event[0];
        String longitutue_event = locationArray_event[1];
        
        DistanceCalculation distCalc = new DistanceCalculation();
        Double miles = distCalc.distance(Double.parseDouble(latitude_user), 
                Double.parseDouble(longitutue_user), 
                Double.parseDouble(latitude_event), 
                Double.parseDouble(longitutue_event), 'M');

        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request, enterprise, userAccount, business, miles);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
