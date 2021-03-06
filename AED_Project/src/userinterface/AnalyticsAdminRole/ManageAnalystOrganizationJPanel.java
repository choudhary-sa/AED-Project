/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AnalyticsAdminRole;

import Business.Organization.AnalystStaff;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh
 */
public class ManageAnalystOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageAnalystOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        for (Type type : Organization.Type.values()){
            if (type.getValue().equals(Type.Analyst.getValue()))
                organizationJComboBox.addItem(type);
        }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
       model.setRowCount(0);
         //organizationJTable.setRowSorter(new TableRowSorter(model));
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            if(organization instanceof AnalystStaff){
            row[0] = organization.getOrganizationID();
            row[1] = organization;
            }
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
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        removeNetworkjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

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
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addJButton.setBackground(new java.awt.Color(0, 0, 0));
        addJButton.setForeground(new java.awt.Color(255, 255, 255));
        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Button-Submit-icon.png"))); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setBackground(new java.awt.Color(0, 0, 0));
        organizationJComboBox.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Organization Type ");

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/arrow-back-icon.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        removeNetworkjButton.setBackground(new java.awt.Color(0, 0, 0));
        removeNetworkjButton.setForeground(new java.awt.Color(255, 255, 255));
        removeNetworkjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/remove-drug.png"))); // NOI18N
        removeNetworkjButton.setText("Remove");
        removeNetworkjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNetworkjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(backJButton))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(organizationJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeNetworkjButton)))
                .addGap(351, 351, 351))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(removeNetworkjButton))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(addJButton))
                .addGap(173, 173, 173))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        boolean alreadyPresent=false;
        Type type = (Type) organizationJComboBox.getSelectedItem();
        
        if(directory.getOrganizationList().size()==0){
            directory.createOrganization(type, null);
            populateTable();
            JOptionPane.showMessageDialog(null, "Organization added in system.", "Info", JOptionPane.INFORMATION_MESSAGE);
            alreadyPresent=true;
            
        } else{
            for(Organization org:directory.getOrganizationList()){
                 if(type.getValue().equals(org.getOrganizationType().getValue())){
                 JOptionPane.showMessageDialog(null, "Organization already setup in system.", "Info", JOptionPane.INFORMATION_MESSAGE);
                 alreadyPresent=true;
                 break;
                }
            }
        }
        if(!alreadyPresent){
                    directory.createOrganization(type, type.getValue());
                    JOptionPane.showMessageDialog(null, "Organization added in system.", "Info", JOptionPane.INFORMATION_MESSAGE);
                    populateTable();
        }       
                
    }//GEN-LAST:event_addJButtonActionPerformed

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
            int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove this Enterprise?","Warning", JOptionPane.YES_NO_OPTION);
            if(flag==0){
                Organization org=(Organization)organizationJTable.getValueAt(selectedRow, 1);
                directory.getOrganizationList().remove(org);
                populateTable();
                JOptionPane.showMessageDialog(null, "Organization Removed.", "Info", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }//GEN-LAST:event_removeNetworkjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JButton removeNetworkjButton;
    // End of variables declaration//GEN-END:variables
}
