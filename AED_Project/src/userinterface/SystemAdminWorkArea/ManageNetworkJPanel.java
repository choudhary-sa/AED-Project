/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Utils.MyStringVerifier;
import java.awt.CardLayout;
import java.awt.Component;
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
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
         MyStringVerifier myStringVerifier= new MyStringVerifier();
        nameJTextField.setInputVerifier(myStringVerifier);
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
        networkJTable.setRowSorter(new TableRowSorter(model));
        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network;
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
        networkJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        removeNetworkjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setText("Name");

        submitJButton.setBackground(new java.awt.Color(0, 0, 0));
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Button-Submit-icon.png"))); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

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
        removeNetworkjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/cart-remove-icon.png"))); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitJButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeNetworkjButton)))
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitJButton)
                    .addComponent(removeNetworkjButton))
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addGap(215, 215, 215))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        
        if(nameJTextField.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter network name to be setup.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
        }
        else{
            String name = nameJTextField.getText().trim();
        boolean alreadyPresent=false;
        for(Network p:system.getNetworkList()){
            if(p.getName().equals(name)){
                alreadyPresent=true;
                JOptionPane.showMessageDialog(null, "Network already setup in system.", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        if(!alreadyPresent){
            Network network = system.createAndAddNetwork();
            network.setName(name);
            nameJTextField.setText("");
            populateNetworkTable();            
            JOptionPane.showMessageDialog(null, "Network Added.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
        }
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this.getParent().getParent());
        userProcessContainer.remove(this.getParent());
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        JScrollPane jsp=(JScrollPane)component;
        JViewport jv=(JViewport)jsp.getComponent(0);
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) jv.getComponent(0);
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void removeNetworkjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNetworkjButtonActionPerformed
        // TODO add your handling code here:
                 int selectedRow=networkJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
                int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove this Network?","Warning", JOptionPane.YES_NO_OPTION);
                if(flag==0){
                        system.removeNetwork((Network)networkJTable.getValueAt(selectedRow, 0));
                        populateNetworkTable();
                        JOptionPane.showMessageDialog(null, "Network Removed.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        
                }
        }
    }//GEN-LAST:event_removeNetworkjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton removeNetworkjButton;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}