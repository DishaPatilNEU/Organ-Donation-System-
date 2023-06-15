/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.DoctorRole;

import userInterface.HospitalAdminWorkArea.*;
import Business.Employee.Employee;
import Business.Patient.PatientVisit;
import DatabaseUtility.DatabaseHandleHospitalRoles;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class DoctorManageReceiverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorManageReceiverJPanel
     */
    private static Employee emp;
    Boolean selected;
    int adminId;
    DatabaseHandleHospitalRoles dbCon=new DatabaseHandleHospitalRoles();
    public DoctorManageReceiverJPanel(Employee e) {
        initComponents();
        this.emp=e;
        selected=false;
        adminId=emp.getId();
        populateTable(dbCon.fetchDoctorDonorRevicerList(adminId,"Reciver"));
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
        jTableReceiverDetails = new javax.swing.JTable();
        jButtonViewReceiverInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextReceviersName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonReceiverReportToAdmin = new javax.swing.JButton();
        jCheckBoxIntestineD = new javax.swing.JCheckBox();
        jCheckBoxHeartD = new javax.swing.JCheckBox();
        jCheckBoxPancreasD = new javax.swing.JCheckBox();
        jCheckBoxLiverD = new javax.swing.JCheckBox();
        jCheckBoxKidneyD = new javax.swing.JCheckBox();
        jCheckBoxLungD = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTableReceiverDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PATIENT_RECIEVER ID", "RECEIVER NAME", "RECEIVER AGE", "DATE", "ORGAN NAME"
            }
        ));
        jScrollPane1.setViewportView(jTableReceiverDetails);

        jButtonViewReceiverInfo.setBackground(new java.awt.Color(150, 21, 53));
        jButtonViewReceiverInfo.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonViewReceiverInfo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewReceiverInfo.setText("VIEW RECEIVER");
        jButtonViewReceiverInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonViewReceiverInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewReceiverInfoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setText("RECEIVER NAME :");

        jTextReceviersName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setText("SELECT ORGAN :");

        jButtonReceiverReportToAdmin.setBackground(new java.awt.Color(150, 21, 53));
        jButtonReceiverReportToAdmin.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonReceiverReportToAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReceiverReportToAdmin.setText("SEND  TO ADMIN");
        jButtonReceiverReportToAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonReceiverReportToAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceiverReportToAdminActionPerformed(evt);
            }
        });

        jCheckBoxIntestineD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxIntestineD.setText("INTESTINES");

        jCheckBoxHeartD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxHeartD.setText("HEART");

        jCheckBoxPancreasD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxPancreasD.setText("PANCREAS");

        jCheckBoxLiverD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxLiverD.setText("LIVER");

        jCheckBoxKidneyD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxKidneyD.setText("KIDNEY");

        jCheckBoxLungD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxLungD.setText("LUNG");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANAGE RECEIVER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(638, 638, 638)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(545, 545, 545)
                                .addComponent(jButtonViewReceiverInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(422, 422, 422)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(446, 446, 446)
                                .addComponent(jLabel3)
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxLiverD)
                                    .addComponent(jCheckBoxIntestineD)
                                    .addComponent(jCheckBoxKidneyD))))
                        .addGap(0, 208, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxHeartD)
                            .addComponent(jCheckBoxLungD)
                            .addComponent(jCheckBoxPancreasD)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jTextReceviersName, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(412, 412, 412))
            .addGroup(layout.createSequentialGroup()
                .addGap(541, 541, 541)
                .addComponent(jButtonReceiverReportToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButtonViewReceiverInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextReceviersName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxKidneyD, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxIntestineD))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxLungD)
                        .addGap(28, 28, 28)
                        .addComponent(jCheckBoxHeartD)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPancreasD)
                    .addComponent(jCheckBoxLiverD))
                .addGap(28, 28, 28)
                .addComponent(jButtonReceiverReportToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViewReceiverInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewReceiverInfoActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTableReceiverDetails.getSelectedRow();
            if (selectedIndex != -1){
            selected=true;
            int id=Integer.parseInt(jTableReceiverDetails.getValueAt(selectedIndex, 0).toString());
            jTextReceviersName.setText(jTableReceiverDetails.getValueAt(selectedIndex, 1).toString());
            jTextReceviersName.setEditable(false);
        }
            else{
                JOptionPane.showMessageDialog(this, "Please select the row");
            }
    }//GEN-LAST:event_jButtonViewReceiverInfoActionPerformed

    private void jButtonReceiverReportToAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceiverReportToAdminActionPerformed
        // TODO add your handling code here:
        if (selected){
          int selectedIndex=jTableReceiverDetails.getSelectedRow();
            if(selectedIndex != -1){
                int id=Integer.parseInt(jTableReceiverDetails.getValueAt(selectedIndex, 0).toString());
                jTextReceviersName.setText(jTableReceiverDetails.getValueAt(selectedIndex, 1).toString());
                String organTable=jTableReceiverDetails.getValueAt(selectedIndex, 4).toString();
                if(organTable.equalsIgnoreCase("Select Organ")){
                jTextReceviersName.setEditable(false);
                int [] organList = new int [6];
                Dictionary organdict = new Hashtable();
                if(jCheckBoxKidneyD.isSelected())
                    organdict.put("Kidney","Kidney");
                if(jCheckBoxIntestineD.isSelected())
                    organdict.put("Intestine","Intestine");
                if(jCheckBoxLiverD.isSelected())
                    organdict.put("Liver","Liver");
                if(jCheckBoxLungD.isSelected())
                    organdict.put("Lungs","Lungs");
                if(jCheckBoxHeartD.isSelected())
                   organdict.put("Heart","Heart");
                if(jCheckBoxPancreasD.isSelected())
                    organdict.put("Pancreas","Pancreas");
                int count =organdict.size();
                if (count ==0 ){
                    JOptionPane.showMessageDialog(this, "Please select atleast one organ");
                    return;
                }
                for (Enumeration i = organdict.elements(); i.hasMoreElements();)
                {
                    System.out.println("Value in Dictionary : " + i.nextElement());
                }
                if (count==1){ 
                    String organ="";
                    for (Enumeration i = organdict.elements(); i.hasMoreElements();)
                    {
                        organ=i.nextElement().toString();
                    }
                   Boolean status = dbCon.updateReciverDonorList(id, organ);
                   if(status){
                       JOptionPane.showMessageDialog(this, "Sent to admin");
                       clearFields();
                       populateTable(dbCon.fetchDoctorDonorRevicerList(adminId,"Reciver"));
                       return;
                   }
                }
                else{
                    Boolean status=false;
                    String organ="";
                    for (Enumeration i = organdict.elements(); i.hasMoreElements();){
                        organ=i.nextElement().toString();
                        status=dbCon.updateReciverDonorList(id, organ);
                        break;
                                
                    }
                    organdict.remove(organ);
                    for (Enumeration i = organdict.elements(); i.hasMoreElements();){
                        organ=i.nextElement().toString();
                        status=dbCon.populateReciverDonorList(id, organ,"Reciver");        
                    }
                    if (status){
                        JOptionPane.showMessageDialog(this, "Sent to admin");
                        clearFields();
                        populateTable(dbCon.fetchDoctorDonorRevicerList(adminId,"Reciver"));
                       return;
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Error in adding to list");
                    }
                }
                }
                if(!organTable.equalsIgnoreCase("Select Organ")){
                    JOptionPane.showMessageDialog(this, "Organ is already selcted.");
            }
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select the row");
            }  
        }
        clearFields();
        selected=false;
        
    }//GEN-LAST:event_jButtonReceiverReportToAdminActionPerformed
void clearFields(){
    jTextReceviersName.setText("");
    jCheckBoxKidneyD.setSelected(false);
    jCheckBoxIntestineD.setSelected(false);
    jCheckBoxLiverD.setSelected(false);
    jCheckBoxLungD.setSelected(false);
    jCheckBoxHeartD.setSelected(false);
    jCheckBoxPancreasD.setSelected(false);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReceiverReportToAdmin;
    private javax.swing.JButton jButtonViewReceiverInfo;
    private javax.swing.JCheckBox jCheckBoxHeartD;
    private javax.swing.JCheckBox jCheckBoxIntestineD;
    private javax.swing.JCheckBox jCheckBoxKidneyD;
    private javax.swing.JCheckBox jCheckBoxLiverD;
    private javax.swing.JCheckBox jCheckBoxLungD;
    private javax.swing.JCheckBox jCheckBoxPancreasD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReceiverDetails;
    private javax.swing.JTextField jTextReceviersName;
    // End of variables declaration//GEN-END:variables
private void populateTable(ArrayList <PatientVisit> patientList) {
        DefaultTableModel model=(DefaultTableModel) jTableReceiverDetails.getModel();
        model.setRowCount(0);
        for (PatientVisit pv:patientList){
            Object[] row =new Object[7];
            row[0]=pv.getId();
            row[1]=pv.getName();
            row[2]=pv.getAge();
            row[3]=pv.getDate();
            if (pv.getOrgan() == null){
                row[4]="Select Organ";
            }
            else{
                row[4]=pv.getOrgan();
            }
            model.addRow(row);
        }
    }
}