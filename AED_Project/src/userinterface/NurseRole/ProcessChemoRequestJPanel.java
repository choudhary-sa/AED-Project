/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Utils.AgeCalculator;
import static Business.Utils.Validations.bpstatus;
import static Business.Utils.Validations.hrstatus;
import static Business.Utils.Validations.rrstatus;
import static Business.Utils.Validations.wstatus;
import Business.VitalSigns.VitalSignHistoryOfPatient;
import Business.VitalSigns.VitalSignOfPatient;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import static java.lang.Thread.sleep;
import java.util.Date;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

/**
 *
 * @author Saurabh
 */
public class ProcessChemoRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessChemoRequestJPanel
     */
    private JPanel userProcessContainer;
    private LabTestWorkRequest request;
    private Enterprise enterprise;
    private PatientOrganization patientOrganization;
    
       private static int BP_NORMAL_HIGH;
       private static int BP_NORMAL_LOW;
       
       private static int HR_NORMAL_HIGH;
       private static int HR_NORMAL_LOW;
       
       private static int RR_NORMAL_HIGH;
       private static int RR_NORMAL_LOW;
       
       
       private static int W_NORMAL_HIGH;
       private static int W_NORMAL_LOW;
    
    public ProcessChemoRequestJPanel(JPanel userProcessContainer,LabTestWorkRequest requst,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        
        this.request=requst;
    }
    public int rrHighNormal(int age){
        if(age > 0 && age < 13){
            //rrstatus.setText("Normal");
            RR_NORMAL_HIGH=30;
        }
        if(age > 12){
            //rrstatus.setText("Normal");
            RR_NORMAL_HIGH=20;
        }
        return RR_NORMAL_HIGH;
    }
    
    public int rrLowNormal(int age){
        if(age > 0 && age < 13){
            //rrstatus.setText("Normal");
            RR_NORMAL_LOW=20;
        }
        if(age > 12){
            //rrstatus.setText("Normal");
            RR_NORMAL_LOW=12;
        }
        return RR_NORMAL_LOW;
    }
    
    public int hrHighNormal(int age){
        if(age >=1  && age <=3){
            //rrstatus.setText("Normal");
            HR_NORMAL_HIGH=130;
            
        }
        if(age >= 4 && age <= 5 ){
            //hrstatus.setText("Normal");
             HR_NORMAL_HIGH=120;
            
        }
        if(age >= 6 && age <= 12){
            //hrstatus.setText("Normal");
             HR_NORMAL_HIGH=110;
            
        }
        if(age >= 13){
            //hrstatus.setText("Normal");
             HR_NORMAL_HIGH=105;
            
        }
        
        return HR_NORMAL_HIGH;
    }
   
    public int hrLowNormal(int age){
        if(age >=1  && age <=3){
            //rrstatus.setText("Normal");
            
            HR_NORMAL_LOW=80;
        }
        if(age >= 4 && age <= 5 ){
            //hrstatus.setText("Normal");
             
            HR_NORMAL_LOW=80;
        }
        if(age >= 6 && age <= 12){
            //hrstatus.setText("Normal");
             
            HR_NORMAL_LOW=70;
        }
        if(age >= 13){
            //hrstatus.setText("Normal");
             
            HR_NORMAL_LOW=55;
        }
        
        return HR_NORMAL_LOW;
    }
    
    public int wHighNormal(int age){
         if(age > 0 && age < 4){
            //wstatus.setText("Normal");
            
            W_NORMAL_HIGH=31;
            
        }
        
        if(age > 3 && age < 6){
            //wstatus.setText("Normal");
             W_NORMAL_HIGH=40;
            
        }
        
        if(age > 5 && age < 13){
            //wstatus.setText("Normal");
            W_NORMAL_HIGH=92;
            
        }
        
        if(age > 12){
            //wstatus.setText("Normal");
             W_NORMAL_HIGH=166;
            
        }
        
        
        
        return W_NORMAL_HIGH;
    }
    
    public int wLowNormal(int age){
         if(age > 0 && age < 4){
            //wstatus.setText("Normal");
            
            
            W_NORMAL_LOW=22;
        }
        
        if(age > 3 && age < 6){
            //wstatus.setText("Normal");
             
            W_NORMAL_LOW=31;
        }
        
        if(age > 5 && age < 13){
            //wstatus.setText("Normal");
            
            W_NORMAL_LOW=11;
        }
        
        if(age > 12){
            //wstatus.setText("Normal");
             
            W_NORMAL_LOW=110;
        }
        
        return W_NORMAL_LOW;
    }
    
    public int bpHighNormal(int age){
        if(age > 0 && age < 6){
            //bpstatus.setText("Normal");
            BP_NORMAL_HIGH=110;
            
            
        }
        
        if(age > 5 && age < 13){
            //bpstatus.setText("Normal");
            BP_NORMAL_HIGH=120;
            
            
        }
        
        if(age > 12){
            //bpstatus.setText("Normal");
            BP_NORMAL_HIGH=120;
            
        }
        return BP_NORMAL_HIGH;
    }
    public int bpLowNormal(int age){
        
       
        if(age > 0 && age < 6){
            //bpstatus.setText("Normal");
            
            BP_NORMAL_LOW=80;
            
        }
        
        if(age > 5 && age < 13){
            //bpstatus.setText("Normal");
            
            BP_NORMAL_LOW=80;
            
        }
        
        if(age > 12){
            //bpstatus.setText("Normal");
            
            BP_NORMAL_LOW=110;
        }
        
        return BP_NORMAL_LOW;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hrjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rrjTextField1 = new javax.swing.JTextField();
        sbpjTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        wjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/start.png"))); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/stop.png"))); // NOI18N
        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Respiratory Rate");

        hrjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hrjTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hrjTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        hrjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrjTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Heart Rate");

        rrjTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rrjTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rrjTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        sbpjTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sbpjTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sbpjTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sbpjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbpjTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Systolic Blood Pressure");

        wjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wjTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        wjTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        wjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wjTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Weight");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Chemo In progress:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rrjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hrjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sbpjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel5)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel5)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wjTextField)
                            .addComponent(sbpjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hrjTextField)
                            .addComponent(rrjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        for(Organization  org:enterprise.getOrganizationDirectory().getOrganizationList()){
           if(org instanceof  PatientOrganization){
               this.patientOrganization=(PatientOrganization) org;
               break;
           }
       }
        Patient passPatient=null;
        for(Patient patient:patientOrganization.getPatientDirectory().getPatientList()){
            if(patient.toString().equals(request.getAssociatedToAppointmentRequest().getPatient().getEmployee().toString())){
                passPatient=patient;
                break;
            }
        }
        VitalSignHistoryOfPatient vsh=passPatient.getVsh();
        float years=AgeCalculator.calculategetage(new Date(), passPatient.getDateOfBirth());
        int age=(int) (years/1);
        Thread clock=new Thread(){
        public void run(){
        for(;;){
            VitalSignOfPatient vs=vsh.addVitalSign();
            Random randomN = new Random();
            //for rr
            float i1 = randomN.nextInt(rrHighNormal(age)+4 - rrLowNormal(age)) + rrLowNormal(age)-3;
            vs.setPatientRR(i1);
            boolean rrstatusflag = rrstatus(i1,age);
            String rr=Float.toString(i1);
            rrjTextField1.setText(rr);
            if(rrstatusflag == true){
                
                rrjTextField1.setBackground(Color.green);
            }else{
                
                rrjTextField1.setBackground(Color.red);
            }
            
            //forhr
            Random hrN = new Random();
            
            float i2 = randomN.nextInt(hrHighNormal(age)+6 - hrLowNormal(age)) + hrLowNormal(age)-4;
            vs.setPatientHR(i2);
            boolean hrstatusflag = hrstatus(i2,age);
            String hr=Float.toString(i2);
            hrjTextField.setText(hr);
            if(hrstatusflag == true){
                hrjTextField.setBackground(Color.green);
            }else{
                hrjTextField.setBackground(Color.red);
            }
            
            //forsbp
            Random bpN = new Random();
            float i3 = randomN.nextInt(bpHighNormal(age)+8 - bpLowNormal(age)) + bpLowNormal(age)-5;
            vs.setPatientSBP(i3);
            boolean sbpstatusflag = bpstatus(i3,age);
            String bp=Float.toString(i3);
            sbpjTextField2.setText(bp);
            if(sbpstatusflag == true){
                sbpjTextField2.setBackground(Color.green);
            }else{
                sbpjTextField2.setBackground(Color.red);
            }
            
            //forw
            Random wN = new Random();
            float i4 = randomN.nextInt(wHighNormal(age)- wLowNormal(age)) + wLowNormal(age);
            vs.setPatientW(i4);
            boolean wstatusflag = wstatus(i4,age);
            String w=Float.toString(i4);
            wjTextField.setText(w);
            if(wstatusflag == true){
                wjTextField.setBackground(Color.green);
            }else{
                wjTextField.setBackground(Color.red);
            }
        
                    try{
                        sleep(1000);
                    }catch(InterruptedException e){
                        
                    }
                }
            }
        };
        clock.start();
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        request.setStatus("Processed");
        request.setTestResult("Chemo Medications Administered.");
        request.setResolveDate(new Date());
        backbutton();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void hrjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrjTextFieldActionPerformed

    private void sbpjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbpjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbpjTextField2ActionPerformed

    private void wjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wjTextFieldActionPerformed

public void backbutton(){
        
        userProcessContainer.remove(this.getParent().getParent());
        userProcessContainer.remove(this.getParent());
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        JScrollPane jsp=(JScrollPane)component;
        JViewport jv=(JViewport)jsp.getComponent(0);
        NurseWorkAreaJPanel nwjp = (NurseWorkAreaJPanel) jv.getComponent(0);
        nwjp.populateNurseWorkQueueJTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        userProcessContainer.remove(this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hrjTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField rrjTextField1;
    private javax.swing.JTextField sbpjTextField2;
    private javax.swing.JTextField wjTextField;
    // End of variables declaration//GEN-END:variables
}
