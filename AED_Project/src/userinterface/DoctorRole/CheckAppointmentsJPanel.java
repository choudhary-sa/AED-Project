/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Saurabh
 */
public class CheckAppointmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form checkAppointmentsJPanel
     */
    UserAccount userAccount;
    private Enterprise enterprise;
    private DoctorOrganization doctorOrganization;
    
    private PatientOrganization patientOrganization;
    public CheckAppointmentsJPanel(PatientOrganization patientOrganization, DoctorOrganization doctorOrganization,UserAccount account,Enterprise enterprise) {
        initComponents();
        this.enterprise=enterprise;
        this.doctorOrganization=doctorOrganization;
        this.userAccount=account;
        this.patientOrganization=patientOrganization;
        populatedoctorWorkQueueJTable();
    }
    
    public void populatedoctorWorkQueueJTable(){
        
         DefaultTableModel model = (DefaultTableModel) doctorWorkQueueJTable.getModel();
        doctorWorkQueueJTable.setRowSorter(new TableRowSorter(model));
        model.setRowCount(0);
        for (WorkRequest request :userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof AppointmentRequest){
                AppointmentRequest req=(AppointmentRequest)request;
            Object[] row = new Object[8];
            row[0] = req;
            row[1] = req.getDateOfAppointment();
            row[2] = req.getDoctor();
            row[3] = req.getPatient();
            row[4] = req.getPatient().getEmployee();
            row[5] = req.getTimeofAppointment();
            row[6] = request.getStatus();
            row[7] = request.getResolveDate();
            model.addRow(row);
            }
            
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
        doctorWorkQueueJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Upcoming Appointments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        setForeground(new java.awt.Color(255, 255, 255));

        doctorWorkQueueJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "Appt Date(YYYY MM DD)", "Doctor Account", "Patient Account", "Patient Name", "Appointment Time", "Status", "Completion Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctorWorkQueueJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(doctorWorkQueueJTable);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/process.png"))); // NOI18N
        jButton1.setText("Process Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow=doctorWorkQueueJTable.getSelectedRow();
        Patient passPatient=null;
        
        JTabbedPane jtab=(JTabbedPane) jButton1.getParent().getParent();
        //JOptionPane.showMessageDialog(null,jtab);
        
        
         if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please select an Appointment.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
             
        AppointmentRequest appointmentRequest=(AppointmentRequest)doctorWorkQueueJTable.getValueAt(selectedRow, 0);
        if(appointmentRequest.getStatus().equals("Appointment Completed")){
            JOptionPane.showMessageDialog(null, "This appointment has already been completed.");
            return;
        }
        appointmentRequest.setStatus("In progress");
        for(Patient patient:patientOrganization.getPatientDirectory().getPatientList()){
            if(patient.equals((Patient)appointmentRequest.getPatient().getEmployee())){
                passPatient=patient;
                break;
            }
        }
        ProcessVisit pv=new ProcessVisit(userAccount,appointmentRequest,passPatient,enterprise);
        jtab.add("Visits",pv);
        jtab.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable doctorWorkQueueJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
