/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AnalyticsAdminRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccessRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh
 */
public class InitialRequests extends javax.swing.JPanel {

    /**
     * Creates new form InitialRequests
     */
    private Enterprise enterprise;
   
    private UserAccount userAccount;
    public InitialRequests(UserAccount userAccount,Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.userAccount=userAccount;
       populateInitialRequestTable();
    }
    public void populateInitialRequestTable(){
        DefaultTableModel model = (DefaultTableModel) initialrequestTable.getModel();
       // organizationJTable.setRowSorter(new TableRowSorter(model));
        model.setRowCount(0);
        if(!userAccount.getWorkQueue().getWorkRequestList().isEmpty()){
            for(WorkRequest wr:userAccount.getWorkQueue().getWorkRequestList()){
                AccessRequest ar=(AccessRequest)wr;
                if(ar.getAccessStatus().equals("Requested")){
                   enterprise.getOrganizationDirectory().getOrganizationList().remove((Organization)ar.getPatientOrganization());
                   Object[] row = new Object[4];
                            row[0] = ar.getRequestDate();
                            row[1] = ar;
                            row[2] = ar.getAccessStatus();
                            row[3] = ar.getMessage();
                            model.addRow(row); 
                            
                }
                    
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

        jScrollPane2 = new javax.swing.JScrollPane();
        initialrequestTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        initialrequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request Date", "Request", "Access Status", "For Enterprise in Network"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(initialrequestTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable initialrequestTable;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
