/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EventManagerRole;

/**
 *
 * @author Divya Priya Emmanuel
 */
public class EventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EventJPanel
     */
    public EventJPanel() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        ManagerEventIDTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ManagerEventNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ManagerEventVenueTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ManagerEventDateTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ManagerEventTimeTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        MaxAlloSpinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        NoTransportRadioBtn = new javax.swing.JRadioButton();
        YesTransportRadioBtn = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        ManagerEventStartTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ManagerEventEndTxt = new javax.swing.JTextField();
        ManagerCreateEventBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select your options");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 280, -1));
        add(ManagerEventIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 130, 160, -1));

        jLabel1.setText("Event ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 130, 90, 20));

        jLabel2.setText("Event name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 90, 20));
        add(ManagerEventNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 160, -1));

        jLabel4.setText("Venue");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, 20));
        add(ManagerEventVenueTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 160, -1));

        jLabel5.setText("Event date");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 90, 20));
        add(ManagerEventDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 160, -1));

        jLabel6.setText("Event time");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 90, 20));
        add(ManagerEventTimeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 160, -1));

        jLabel7.setText("Availibility of Transport");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 120, 20));
        add(MaxAlloSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 160, -1));

        jLabel8.setText("Maximum Allocation");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 100, 20));

        buttonGroup1.add(NoTransportRadioBtn);
        NoTransportRadioBtn.setText("No");
        add(NoTransportRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        buttonGroup1.add(YesTransportRadioBtn);
        YesTransportRadioBtn.setText("Yes");
        add(YesTransportRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        jLabel9.setText("Registration start date");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 120, 20));
        add(ManagerEventStartTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 160, -1));

        jLabel10.setText("Registration end date");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 110, 20));
        add(ManagerEventEndTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 160, -1));

        ManagerCreateEventBtn.setText("Create Event");
        add(ManagerCreateEventBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManagerCreateEventBtn;
    private javax.swing.JTextField ManagerEventDateTxt;
    private javax.swing.JTextField ManagerEventEndTxt;
    private javax.swing.JTextField ManagerEventIDTxt;
    private javax.swing.JTextField ManagerEventNameTxt;
    private javax.swing.JTextField ManagerEventStartTxt;
    private javax.swing.JTextField ManagerEventTimeTxt;
    private javax.swing.JTextField ManagerEventVenueTxt;
    private javax.swing.JSpinner MaxAlloSpinner;
    private javax.swing.JRadioButton NoTransportRadioBtn;
    private javax.swing.JRadioButton YesTransportRadioBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
