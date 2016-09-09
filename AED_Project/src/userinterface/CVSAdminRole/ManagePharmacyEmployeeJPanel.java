/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CVSAdminRole;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.Utils.MyStringVerifier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Saurabh
 */
public class ManagePharmacyEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePharmacyEmployeeJPanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    public ManagePharmacyEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        MyStringVerifier myStringVerifier= new MyStringVerifier();
        nameJTextField.setInputVerifier(myStringVerifier);
        lastNameJTextField.setInputVerifier(myStringVerifier);
        addJButton.setEnabled(false);
        nameJTextField.setEnabled(false);
        lastNameJTextField.setEnabled(false);
        if(!organizationDir.getOrganizationList().isEmpty()){
            addJButton.setEnabled(true);
            nameJTextField.setEnabled(true);
            lastNameJTextField.setEnabled(true);
            populateOrganizationComboBox();
            populateOrganizationEmpComboBox();
        }
    }
    public void populateOrganizationComboBox(){
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            if(!organization.getOrganizationType().getValue().equals(Organization.Type.Patient.getValue())){
                organizationJComboBox.addItem(organization);
            }
            
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            if(!organization.getOrganizationType().getValue().equals(Organization.Type.Patient.getValue()))
            {organizationEmpJComboBox.addItem(organization);
            }
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        organizationJTable.setRowSorter(new TableRowSorter(model));
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        removeNetworkjButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        addJButton.setBackground(new java.awt.Color(0, 0, 0));
        addJButton.setForeground(new java.awt.Color(255, 255, 255));
        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Button-Submit-icon.png"))); // NOI18N
        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setBackground(new java.awt.Color(0, 0, 0));
        organizationJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization");

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/arrow-back-icon.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name");

        organizationEmpJComboBox.setBackground(new java.awt.Color(0, 0, 0));
        organizationEmpJComboBox.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Organization");

        jLabel4.setText("Last Name");

        removeNetworkjButton.setBackground(new java.awt.Color(0, 0, 0));
        removeNetworkjButton.setForeground(new java.awt.Color(255, 255, 255));
        removeNetworkjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/remove-drug.png"))); // NOI18N
        removeNetworkjButton.setText("Remove");
        removeNetworkjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNetworkjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backJButton)
                    .addComponent(addJButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(66, 66, 66)
                        .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(32, 32, 32)
                                    .addComponent(organizationEmpJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(66, 66, 66)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeNetworkjButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(removeNetworkjButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(addJButton)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();

        if(organization.equals(null)){
            JOptionPane.showMessageDialog(null, "Organization has not been setup.Please set up organizations first.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            String name = nameJTextField.getText().trim();
            String lastName= lastNameJTextField.getText().trim();
            if(name.length()==0|| lastName.length()==0){
                JOptionPane.showMessageDialog(null, "Enter Valid name.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else{

                boolean alreadyPresent=false;
                for(Employee employee:organization.getEmployeeDirectory().getEmployeeList()){
                    if(employee.toString().equals(name+" "+lastName)){
                        alreadyPresent=true;
                        JOptionPane.showMessageDialog(null, "Employee already setup in system.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
                if(!alreadyPresent){
                    organization.getEmployeeDirectory().createEmployee(name,lastName);
                    populateTable(organization);
                }

            }
        }

    }//GEN-LAST:event_addJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this.getParent().getParent());
        userProcessContainer.remove(this.getParent());
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void removeNetworkjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNetworkjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow=organizationJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove this Employee?","Warning", JOptionPane.YES_NO_OPTION);
            if(flag==0){
                UserAccount userAccountListed=null;
                Organization organization=(Organization)organizationJComboBox.getSelectedItem();
                Employee employee=(Employee)organizationJTable.getValueAt(selectedRow, 1);
                for(UserAccount ua:organization.getUserAccountDirectory().getUserAccountList()){
                    if(ua.getEmployee().equals(employee)){
                        userAccountListed=ua;
                        break;
                    }
                }

                organization.getUserAccountDirectory().getUserAccountList().remove(userAccountListed);
                organization.getEmployeeDirectory().getEmployeeList().remove(employee);
                populateTable(organization);
                JOptionPane.showMessageDialog(null, "Employee and associated user account Removed.", "Info", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }//GEN-LAST:event_removeNetworkjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JButton removeNetworkjButton;
    // End of variables declaration//GEN-END:variables
}
