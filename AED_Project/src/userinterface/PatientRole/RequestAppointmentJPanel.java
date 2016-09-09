/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Organization.PatientOrganization;
import Business.Organization.ReceptionistOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Saurabh
 */
public class RequestAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestAppointmentJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private ReceptionistOrganization receptionistOrganization;
    private Date todayDate = new Date();
    private Patient patient;
    PatientOrganization patientOrganization;
    public RequestAppointmentJPanel(JPanel userProcessContainer,UserAccount userAccount,ReceptionistOrganization receptionistOrganization,PatientOrganization patientOrganization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.patientOrganization=patientOrganization;
        this.receptionistOrganization=receptionistOrganization;
        for(Patient p:patientOrganization.getPatientDirectory().getPatientList()){
            if(p.toString().equals(userAccount.getEmployee().toString())){
                this.patient=p;
                break;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Select Date from Calendar:");

        jLabel2.setText("Time:");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "09:00 AM", "09:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "01:00 PM", "01:30 PM", "02:00 PM", "02:30 PM", "03:00 PM", "03:30 PM", "04:00 PM", "04:30 PM", "05:00 PM", "05:30 PM", "06:00 PM", "06:30 PM", "07:00 PM" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionBackground(new java.awt.Color(50, 255, 149));
        jScrollPane2.setViewportView(jList1);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/request-appointment_1.png"))); // NOI18N
        jButton1.setText("Request Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Request an Appointment");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/arrow-back-icon.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCalendar1.setBackground(new java.awt.Color(0, 0, 0));
        jCalendar1.setForeground(new java.awt.Color(255, 255, 255));
        jCalendar1.setDecorationBackgroundColor(new java.awt.Color(255, 255, 255));
        jCalendar1.setDecorationBackgroundVisible(false);
        jCalendar1.setTodayButtonText("");
        jCalendar1.setTodayButtonVisible(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //int selectedRow=patientJTable.getSelectedRow();
        //if (selectedRow < 0){
        //    JOptionPane.showMessageDialog(null, "Please select patient for which appointment is needed.", "Info", JOptionPane.INFORMATION_MESSAGE);
        //    return;
        //}else{
         //   UserAccount patientAccount=(UserAccount)patientJTable.getValueAt(selectedRow, 0);
            //Patient patient=(Patient)patientJTable.getValueAt(selectedRow, 1);

            DateFormat formatter = new SimpleDateFormat("YYYY ,MM ,dd");
            String date=formatter.format(jCalendar1.getDate());
            Date inputDate=jCalendar1.getDate();
            boolean isdate=inputDate.before(todayDate);
            if(isdate){
                JOptionPane.showMessageDialog(null, "Please select  future date.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            try{
                jList1.getSelectedValue().toString();}
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Select Time for appointment", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String listedTime=jList1.getSelectedValue().toString();
          
                AppointmentRequest request=new AppointmentRequest(userAccount,patient.getAssociatedDoctor());
                request.setDateOfAppointment(date);
                request.setRequestDate(new Date());
                request.setMessage(patient.toString()+" requests a new appointment for visit.");
                request.setStatus("New Appointment Request");
                request.setTimeofAppointment(listedTime);
                request.setSender(userAccount);
                request.setReceiver(null);
                request.setAppointmentRequestID("ID-"+userAccount.getUsername());
                receptionistOrganization.getWorkQueue().getWorkRequestList().add(request);
                JOptionPane.showMessageDialog(null, "Appointment request sent.", "Info", JOptionPane.INFORMATION_MESSAGE);
                
                
        backbutton();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backbutton(){
        userProcessContainer.remove(this.getParent().getParent());
        userProcessContainer.remove(this.getParent());

        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        backbutton();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}