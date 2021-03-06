/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReceptionistRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.Utils.MyEmailVerifier;
import Business.Utils.MyPhoneNumberVerifier;
import Business.Utils.MyStringVerifier;

import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Saurabh
 */
public class RegisterPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterPatientJPanel
     */
    private JPanel userProcessContainer;
    private PatientOrganization patientOrganization;
    private Enterprise enterprise;
    private DoctorOrganization doctorOrganization;
    private String gender=null;
    public RegisterPatientJPanel(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        MyStringVerifier myStringVerifier= new MyStringVerifier();
        patientFirstNameJTextField.setInputVerifier(myStringVerifier);        
        lastNameJTextField.setInputVerifier(myStringVerifier);
        
        MyEmailVerifier myEmailVerifier=new MyEmailVerifier();
        emailAddressJTextField.setInputVerifier(myEmailVerifier);
        MyPhoneNumberVerifier myPhoneNumberVerifier=new MyPhoneNumberVerifier();
        contactJTextField.setInputVerifier(myPhoneNumberVerifier);
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof PatientOrganization){
                this.patientOrganization=(PatientOrganization)organization;
            }
            
        }
        
        DoctorOrganization docOrg=null;
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof  DoctorOrganization){
                this.doctorOrganization=(DoctorOrganization) org;
                break;
            }
        }
        populateDoctorTable();
    }
    
    public void populateDoctorTable(){
        
        
        
        DefaultTableModel dtm = (DefaultTableModel) doctorJTable.getModel();
        doctorJTable.setRowSorter(new TableRowSorter(dtm));
        dtm.setRowCount(0);
        for ( UserAccount ua : doctorOrganization.getUserAccountDirectory().getUserAccountList()) {
            
                    Object row[] = new Object[3];
                    row[0] = ua;
                    row[1] = ua.getEmployee();
                    row[2] = ua.getEmployee().getId();
                    dtm.addRow(row);
                
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        patientFirstNameJTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateOfBirth = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        emailAddressJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contactJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorJTable = new javax.swing.JTable();
        associateDoctorjTextField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        cancerTypejComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N

        jLabel1.setText("First Name");

        patientFirstNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientFirstNameJTextFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/save-icon.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/arrow-back-icon.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Last Name");

        jLabel3.setText("Date of Birth");

        dateOfBirth.setBackground(new java.awt.Color(0, 0, 0));
        dateOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        dateOfBirth.setMaxSelectableDate(new java.util.Date(1450504904000L));
        dateOfBirth.setMinSelectableDate(new java.util.Date(-2208967096000L));

        jLabel5.setText("Email Address");

        jLabel2.setText("Contact");

        jLabel6.setText("Search Associated Doctor to be linked to Patient Account:");

        doctorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor User Acc", "Doctor Name", "Doctor ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctorJTable);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Other-Search-alt-Metro-icon.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Gender");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("M");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("F");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Other");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Cancer Type");

        cancerTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adrenal Cancer", "Bile Duct Cancer", "Bladder Cancer", "Bone Cancer", "Breast Cancer", "Cervical Cancer", "Colon/Rectum Cancer", "Endometrial Cancer", "Esophagus Cancer", "Eye Cancer", "Gallbladder Cancer", "Kidney Cancer", "Laryngeal and Hypopharyngeal Cancer", "Liver Cancer", "Lung Cancer", "Nasal Cavity and Paranasal Sinus Cancer", "Nasopharyngeal Cancer", "Oral Cavity and Oropharyngeal Cancer", "Ovarian Cancer", "Pancreatic Cancer", "Penile Cancer", "Prostate Cancer", "Salivary Gland Cancer", "Skin Cancer", "Small Intestine Cancer", "Stomach Cancer", "Testicular Cancer", "Thymus Cancer", "Thyroid Cancer", "Uterine Sarcoma", "Vaginal Cancer", "Vulvar Cancer" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(associateDoctorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lastNameJTextField)
                                .addComponent(patientFirstNameJTextField)
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(emailAddressJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(contactJTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3))
                            .addComponent(cancerTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientFirstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailAddressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(contactJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cancerTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(associateDoctorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow=doctorJTable.getSelectedRow();
        if(gender==null){
            JOptionPane.showMessageDialog(null, "Please select appropriate Gender.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please select a doctor to be associated to the patient.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
         UserAccount associatedDoctor=(UserAccount)doctorJTable.getValueAt(selectedRow, 0);
         String firstName=patientFirstNameJTextField.getText().trim();
         String lastName=lastNameJTextField.getText().trim();
         String emailAddress=emailAddressJTextField.getText().trim();
         String contactNumber=contactJTextField.getText().trim();
         String cancerType=cancerTypejComboBox.getSelectedItem().toString();
         //||cancerType.length()==0
          if(firstName.length()==0|| lastName.length()==0 ||emailAddress.length()==0 || contactNumber.length()==0||dateOfBirth.getDate()==null){
                JOptionPane.showMessageDialog(null, "All fields are mandatory.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else{
                
                boolean alreadyPresent=false;
                for(Patient patient:patientOrganization.getPatientDirectory().getPatientList()){
                    if(patient.toString().equals(firstName+" "+lastName)){
                        alreadyPresent=true;
                        JOptionPane.showMessageDialog(null, "Patient already setup in system.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
                if(!alreadyPresent){
                Patient patient=patientOrganization.getPatientDirectory().createPatient(firstName,lastName);
                Date date=dateOfBirth.getDate();
                patient.setStringDOB(DateFormat.getDateInstance().format(date));
                patient.setDateOfBirth(date);
                patient.setContactNumber(contactNumber);
                patient.setEmailAddress(emailAddress);
                patient.setAssociatedDoctor(associatedDoctor);
                patient.setGender(gender);
                patient.setTypeOfCancer(cancerType);
                patientOrganization.getEmployeeDirectory().getEmployeeList().add((Employee)patient);
                JOptionPane.showMessageDialog(null, "Patient registered in system.Proceed to create user account for Patient", "Info", JOptionPane.INFORMATION_MESSAGE);
                patientFirstNameJTextField.setText("");
                lastNameJTextField.setText(" ");
                emailAddressJTextField.setText(" ");
                contactJTextField.setText("");
                associateDoctorjTextField.setText("");
                populateDoctorTable();
                }
                
            }
         }
          
    
         
//            donorList.createDonor(name);
//            JOptionPane.showMessageDialog(null, "Donor Added.", "Info", JOptionPane.INFORMATION_MESSAGE);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this.getParent().getParent());
        userProcessContainer.remove(this.getParent());
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        JScrollPane jsp=(JScrollPane)component;
        JViewport jv=(JViewport)jsp.getComponent(0);
        ReceptionistWorkAreaJPanel rwjp = (ReceptionistWorkAreaJPanel) jv.getComponent(0);
        rwjp.populatePatientJTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        userProcessContainer.remove(this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void patientFirstNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientFirstNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientFirstNameJTextFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String keyWord = associateDoctorjTextField.getText().trim();
        refreshDoctorTable(keyWord);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        this.gender="Male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        this.gender="Female";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        this.gender="Other";
    }//GEN-LAST:event_jRadioButton3ActionPerformed
    
    public void refreshDoctorTable(String keyWord){
        int rowCount = doctorJTable.getRowCount();
       
        DefaultTableModel dtm = (DefaultTableModel) doctorJTable.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
        String fullname;
        String userName;
        //dtm.setRowCount(0);
        for ( UserAccount ua : doctorOrganization.getUserAccountDirectory().getUserAccountList()) {
            fullname=ua.getEmployee().getFirstName()+" "+ua.getEmployee().getLastName();
            userName=ua.getUsername();
            if (fullname.contains(keyWord)) {
                    Object row[] = new Object[3];
                    row[0] = ua;
                    row[1] = ua.getEmployee();
                    row[2] = ua.getEmployee().getId();
                    dtm.addRow(row);
                }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField associateDoctorjTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cancerTypejComboBox;
    private javax.swing.JTextField contactJTextField;
    private com.toedter.calendar.JDateChooser dateOfBirth;
    private javax.swing.JTable doctorJTable;
    private javax.swing.JTextField emailAddressJTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JTextField patientFirstNameJTextField;
    // End of variables declaration//GEN-END:variables
}
