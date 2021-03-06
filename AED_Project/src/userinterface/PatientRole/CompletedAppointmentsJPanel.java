/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Patient.Patient;
import Business.PatientVisit.Visit;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Saurabh
 */
public class CompletedAppointmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CompletedAppointmentsJPanel
     */
    private Patient patient;
    private UserAccount userAccount;
    public CompletedAppointmentsJPanel(Patient patient,UserAccount userAccount) {
        initComponents();
        this.patient=patient;
        this.userAccount=userAccount;
         populateupcomingAppointmentjTable1();
         
    }
    
    public void populateupcomingAppointmentjTable1(){
        
         DefaultTableModel model = (DefaultTableModel) completedAppointmentjTable1.getModel();
        completedAppointmentjTable1.setRowSorter(new TableRowSorter(model));
        model.setRowCount(0);
        for (Visit visit :patient.getVisitHistory().getVisitHistory()){
            
                    Object[] row = new Object[2];
                    row[0] = visit;
                    row[1] = patient.getAssociatedDoctor().getEmployee().toString();
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
        completedAppointmentjTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientCommentjTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        doctorFeedbackjTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        viewPrescriptionJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        completedAppointmentjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Visit", "Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        completedAppointmentjTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(completedAppointmentjTable1);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Other-Search-Metro-icon.png"))); // NOI18N
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Patient Comments:");

        patientCommentjTextArea1.setColumns(20);
        patientCommentjTextArea1.setRows(5);
        jScrollPane2.setViewportView(patientCommentjTextArea1);

        jLabel3.setText("DoctorComments:");

        doctorFeedbackjTextArea2.setColumns(20);
        doctorFeedbackjTextArea2.setRows(5);
        jScrollPane3.setViewportView(doctorFeedbackjTextArea2);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/clear_refresh_Other-Power-Restart-Metro-icon.png"))); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        viewPrescriptionJButton.setBackground(new java.awt.Color(0, 0, 0));
        viewPrescriptionJButton.setForeground(new java.awt.Color(255, 255, 255));
        viewPrescriptionJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/prescription.png"))); // NOI18N
        viewPrescriptionJButton.setText("View Associated Prescription");
        viewPrescriptionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrescriptionJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(viewPrescriptionJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(viewPrescriptionJButton))
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         int selectedRow=completedAppointmentjTable1.getSelectedRow();
         if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please select a row.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
         Visit visit=(Visit)completedAppointmentjTable1.getValueAt(selectedRow,0);
         patientCommentjTextArea1.setText(visit.getPatientComments());
         doctorFeedbackjTextArea2.setText(visit.getDoctorFeedback());
         
         
            
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateupcomingAppointmentjTable1();
        patientCommentjTextArea1.setText("");
        doctorFeedbackjTextArea2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void viewPrescriptionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPrescriptionJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow=completedAppointmentjTable1.getSelectedRow();
         if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please select a row.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
         Visit visit=(Visit)completedAppointmentjTable1.getValueAt(selectedRow,0);
         if(visit.getPrescription()==null){
             JOptionPane.showMessageDialog(null,"No prescription given by doctor for this visit");
             return;
         }else{
             JTabbedPane jtab=(JTabbedPane) viewPrescriptionJButton.getParent().getParent();
        MyPrescriptionsJPanel mpjp=new MyPrescriptionsJPanel(visit.getPrescription());
        jtab.add("Prescription",mpjp);
        
         }         
         
            
         }
        
    }//GEN-LAST:event_viewPrescriptionJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable completedAppointmentjTable1;
    private javax.swing.JTextArea doctorFeedbackjTextArea2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea patientCommentjTextArea1;
    private javax.swing.JButton viewPrescriptionJButton;
    // End of variables declaration//GEN-END:variables
}
