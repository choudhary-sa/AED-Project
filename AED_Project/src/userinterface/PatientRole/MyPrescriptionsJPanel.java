/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Prescription.Dosage;
import Business.Prescription.Medication;
import Business.Prescription.Prescription;
import javax.swing.DefaultListModel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Saurabh
 */
public class MyPrescriptionsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MyPrescriptionsJPanel
     */
    private Prescription prescription;
    public MyPrescriptionsJPanel(Prescription prescription) {
        initComponents();
        this.prescription=prescription;
        populateprescriptionjList();
    }

    public void  populateprescriptionjList(){
       
       DefaultListModel listModel=new DefaultListModel();
       presListjList1.setModel(listModel);
       int size=prescription.getMedicationList().size();
       
       for(int i=0;i<size;i++){
           listModel.add(i,prescription.getMedicationList().get(i));
           
           
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

        jScrollPane5 = new javax.swing.JScrollPane();
        presListjList1 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dosagejTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        daysJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        presListjList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        presListjList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                presListjList1ValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(presListjList1);

        jLabel4.setText("Prescribed Drugs:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/arrow-back-icon.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        dosagejTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dosage Time", "Quantity", "Comment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dosagejTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(dosagejTable1);

        jLabel1.setText("For Days:");

        daysJLabel.setText("days");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daysJLabel)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(daysJLabel))
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void presListjList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_presListjList1ValueChanged
        // TODO add your handling code here:
        Medication a=(Medication)presListjList1.getSelectedValue();
        daysJLabel.setText(Integer.toString(a.getForDays()));
        populatedosageTable(a);
    }//GEN-LAST:event_presListjList1ValueChanged
public void populatedosageTable(Medication m){
    DefaultTableModel model = (DefaultTableModel) dosagejTable1.getModel();
        dosagejTable1.setRowSorter(new TableRowSorter(model));
        model.setRowCount(0);
        for (Dosage dosageInList :m.getDosageList().getDosageList()){
            
            Object[] row = new Object[3];
            row[0] = dosageInList;
            row[1] = dosageInList.getQuantity();
            row[2] = dosageInList.getComment();
            model.addRow(row);
        }
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JTabbedPane jtab=(JTabbedPane) jButton2.getParent().getParent();
        jtab.remove(this);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel daysJLabel;
    private javax.swing.JTable dosagejTable1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList presListjList1;
    // End of variables declaration//GEN-END:variables
}
