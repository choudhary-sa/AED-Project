/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Patient.Patient;
import Business.Utils.AgeCalculator;
import static Business.Utils.Validations.bpstatus;
import static Business.Utils.Validations.hrstatus;
import static Business.Utils.Validations.rrstatus;
import static Business.Utils.Validations.wstatus;
import Business.VitalSigns.VitalSignHistoryOfPatient;
import Business.VitalSigns.VitalSignOfPatient;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;

import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Saurabh
 */
public class MyVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MyVitalsJPanel
     */
    private Patient patient;
    
    private int age;
       private static int BP_NORMAL_HIGH;
       private static int BP_NORMAL_LOW;
       
       private static int HR_NORMAL_HIGH;
       private static int HR_NORMAL_LOW;
       
       private static int RR_NORMAL_HIGH;
       private static int RR_NORMAL_LOW;
       
       
       private static int W_NORMAL_HIGH;
       private static int W_NORMAL_LOW;
       
    public MyVitalsJPanel(Patient patient) {
        initComponents();
        this.patient=patient;
        populateTable();
        
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
    private void populateTable(){
        DefaultTableModel dtm= (DefaultTableModel)vitalsTable.getModel();
        int rowCount=vitalsTable.getRowCount();
        for(int i=rowCount -1;i>=0;i--){
            dtm.removeRow(i);
        }
        
        for(VitalSignOfPatient vs: patient.getVsh().getVitalSignList()){
        Object row[]=new Object[2];
        row[0]=vs;
        row[1]=createStatus(vs);
//        if(row[1]=="Normal"){
//           dtm.
//           
//        }
        dtm.addRow(row);
    }
    }
    
     public String createStatus(VitalSignOfPatient vs){
        String status="";
        float bp;
        float hr;
        float w;
        float rr;
        
        boolean rrstatusflag;
        boolean hrstatusflag;
        boolean wstatusflag;
        boolean bpstatusflag;
        
            bp = vs.getPatientSBP();
            hr = vs.getPatientHR();
            w = vs.getPatientW();
            rr = vs.getPatientRR();
            float years=AgeCalculator.calculategetage(new Date(), patient.getDateOfBirth());
            int age=(int) (years/1);
                        
            bpstatusflag = bpstatus(bp,age);
            rrstatusflag = rrstatus(rr,age);
            hrstatusflag = hrstatus(hr,age);
            wstatusflag = wstatus(w,age);
            if((bpstatusflag && rrstatusflag && hrstatusflag && wstatusflag)== true){
                status = "Normal";
            }
            else{
                status = "Abnormal";
            }    
        return status;
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
        vitalsTable = new javax.swing.JTable();
        bpstatus = new javax.swing.JTextField();
        wstatus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        resprate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        heartrate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bprate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rrstatus = new javax.swing.JTextField();
        hrstatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        HeartjButton = new javax.swing.JButton();
        respjButton = new javax.swing.JButton();
        bpjButton = new javax.swing.JButton();
        wjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        vitalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Time Stamp", "Vital Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalsTable);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Vital Sign Details");

        jLabel8.setText("Respiratory Rate");

        heartrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartrateActionPerformed(evt);
            }
        });

        jLabel9.setText("Heart Rate");

        bprate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprateActionPerformed(evt);
            }
        });

        jLabel10.setText("Systolic Blood Pressure");

        jLabel11.setText("Weight");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Remark");

        rrstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrstatusActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Other-Search-Metro-icon.png"))); // NOI18N
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        HeartjButton.setBackground(new java.awt.Color(0, 0, 0));
        HeartjButton.setForeground(new java.awt.Color(255, 255, 255));
        HeartjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/heart-rate.png"))); // NOI18N
        HeartjButton.setText("Heart Rate");
        HeartjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeartjButtonActionPerformed(evt);
            }
        });

        respjButton.setBackground(new java.awt.Color(0, 0, 0));
        respjButton.setForeground(new java.awt.Color(255, 255, 255));
        respjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/respiratory-rate.png"))); // NOI18N
        respjButton.setText("Respiratory Rate");
        respjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respjButtonActionPerformed(evt);
            }
        });

        bpjButton.setBackground(new java.awt.Color(0, 0, 0));
        bpjButton.setForeground(new java.awt.Color(255, 255, 255));
        bpjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Blood_Pressure.png"))); // NOI18N
        bpjButton.setText("Systolic Blood Pressure");
        bpjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpjButtonActionPerformed(evt);
            }
        });

        wjButton.setBackground(new java.awt.Color(0, 0, 0));
        wjButton.setForeground(new java.awt.Color(255, 255, 255));
        wjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/weight.png"))); // NOI18N
        wjButton.setText("Weight");
        wjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wjButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Graph");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(heartrate, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(resprate, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(weight)
                                .addComponent(bprate, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12)
                                .addComponent(bpstatus)
                                .addComponent(hrstatus)
                                .addComponent(wstatus)
                                .addComponent(rrstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButton1)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(HeartjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(respjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bpjButton)
                            .addGap(42, 42, 42)
                            .addComponent(wjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respjButton)
                    .addComponent(HeartjButton)
                    .addComponent(bpjButton)
                    .addComponent(wjButton))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resprate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(rrstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heartrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(hrstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bprate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(bpstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(wstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void heartrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heartrateActionPerformed

    private void bprateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bprateActionPerformed

    private void rrstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rrstatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int patientage;
        boolean rrstatusflag;
        boolean hrstatusflag;
        boolean wstatusflag;
        boolean bpstatusflag;
        float years=AgeCalculator.calculategetage(new Date(), patient.getDateOfBirth());
        int age=(int) (years/1);
        int selectedRow= vitalsTable.getSelectedRow();
        if(selectedRow>=0){
            VitalSignOfPatient vs = (VitalSignOfPatient)vitalsTable.getValueAt(selectedRow,0);
            bprate.setText(String.valueOf(vs.getPatientSBP()));
            heartrate.setText(String.valueOf(vs.getPatientHR()));
            weight.setText(String.valueOf(vs.getPatientW()));
            resprate.setText(String.valueOf(vs.getPatientRR()));
            rrstatusflag = rrstatus(vs.getPatientRR(),age);
            if(rrstatusflag == true){
                rrstatus.setText("Normal");
                rrstatus.setBackground(Color.green);
            }else{
                rrstatus.setText("Abnormal");
                rrstatus.setBackground(Color.red);
            }

            hrstatusflag = hrstatus(vs.getPatientHR(),age);
            if(hrstatusflag == true){
                hrstatus.setText("Normal");
                hrstatus.setBackground(Color.green);
            }else{
                hrstatus.setText("Abormal");
                hrstatus.setBackground(Color.red);
            }

            wstatusflag = wstatus(vs.getPatientW(),age);
            if(wstatusflag == true){
                wstatus.setText("Normal");
                wstatus.setBackground(Color.green);
            }else{
                wstatus.setText("Abnormal");
                wstatus.setBackground(Color.red);
            }

            bpstatusflag = bpstatus(vs.getPatientSBP(),age);
            if(bpstatusflag == true){
                bpstatus.setText("Normal");
                bpstatus.setBackground(Color.green);
            }else{
                bpstatus.setText("Abnormal");
                bpstatus.setBackground(Color.red);
            }

        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row from the table first","Alert",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HeartjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeartjButtonActionPerformed
        //        // TODO add your handling code here:

        VitalSignHistoryOfPatient vsh=patient.getVsh();
        ArrayList<VitalSignOfPatient> vs=vsh.getVitalSignList();
        DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
        int j=1;
        int i=0;
        float years=AgeCalculator.calculategetage(new Date(), patient.getDateOfBirth());
        int age=(int) (years/1);
        for(VitalSignOfPatient v:vsh.getVitalSignList()){
            i++;
            
            dataSet.setValue(new Float(v.getPatientHR()),"Values",Integer.toString(i));

        }
        //                    JFreeChart jchart=createChart(createDataset(vsh));
        JFreeChart chart = ChartFactory.createLineChart("Vital Values","Date","Values", dataSet,PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot plo=chart.getCategoryPlot();
        CategoryAxis domainAxis = plo.getDomainAxis();
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.STANDARD);
        ValueMarker high=new ValueMarker(hrHighNormal(age));
        high.setLabel("Normal High");
        high.setLabelTextAnchor(org.jfree.ui.TextAnchor.TOP_LEFT);
        high.setPaint(Color.GREEN);
        plo.addRangeMarker(high);
        
        ValueMarker low=new ValueMarker(hrLowNormal(age));
        low.setLabel("Normal low");
        low.setLabelTextAnchor(org.jfree.ui.TextAnchor.TOP_LEFT);
        low.setPaint(Color.GREEN);
        plo.addRangeMarker(low);
        plo.setBackgroundPaint(null);
        ChartFrame frame= new ChartFrame("Graph",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_HeartjButtonActionPerformed

    private void respjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respjButtonActionPerformed
        // TODO add your handling code here:
        VitalSignHistoryOfPatient vsh=patient.getVsh();
        ArrayList<VitalSignOfPatient> vs=vsh.getVitalSignList();
        DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
        int j=1;
        int i=0;
        float years=AgeCalculator.calculategetage(new Date(), patient.getDateOfBirth());
        int age=(int) (years/1);

        for(VitalSignOfPatient v:vsh.getVitalSignList()){
            i++;

            dataSet.setValue(new Float(v.getPatientRR()),"Values",v.getPatientTS());

        }
        JFreeChart chart = ChartFactory.createLineChart("Vital Values","Vitals","Values", dataSet,PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot plo=chart.getCategoryPlot();
        ValueMarker high=new ValueMarker(rrHighNormal(age));
        high.setLabel("Normal High");
        high.setLabelTextAnchor(org.jfree.ui.TextAnchor.TOP_LEFT);
        high.setPaint(Color.GREEN);
        plo.addRangeMarker(high);
        
        ValueMarker low=new ValueMarker(rrLowNormal(age));
        low.setLabel("Normal low");
        low.setLabelTextAnchor(org.jfree.ui.TextAnchor.TOP_LEFT);
        low.setPaint(Color.GREEN);
        plo.addRangeMarker(low);
        plo.setBackgroundPaint(null);
        ChartFrame frame= new ChartFrame("Graph",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_respjButtonActionPerformed

    private void bpjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpjButtonActionPerformed
        // TODO add your handling code here:
        VitalSignHistoryOfPatient vsh=patient.getVsh();
        ArrayList<VitalSignOfPatient> vs=vsh.getVitalSignList();
        DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
        int j=1;
        int i=0;
        float years=AgeCalculator.calculategetage(new Date(), patient.getDateOfBirth());
        int age=(int) (years/1);
        for(VitalSignOfPatient v:vsh.getVitalSignList()){
            i++;
            dataSet.setValue(new Float(v.getPatientSBP()),"Values",v.getPatientTS());
        }
        JFreeChart chart = ChartFactory.createLineChart("Vital Values","Vitals","Values", dataSet,PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot plo=chart.getCategoryPlot();
        ValueMarker high=new ValueMarker(bpHighNormal(age));
        high.setLabel("Normal High");
        high.setLabelTextAnchor(org.jfree.ui.TextAnchor.TOP_LEFT);
        high.setPaint(Color.GREEN);
        plo.addRangeMarker(high);
        
        ValueMarker low=new ValueMarker(bpLowNormal(age));
        low.setLabel("Normal low");
        low.setLabelTextAnchor(org.jfree.ui.TextAnchor.TOP_LEFT);
        low.setPaint(Color.GREEN);
        plo.addRangeMarker(low);
        plo.setBackgroundPaint(null);
        ChartFrame frame= new ChartFrame("Graph",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_bpjButtonActionPerformed

    private void wjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wjButtonActionPerformed
        // TODO add your handling code here:
        VitalSignHistoryOfPatient vsh=patient.getVsh();
        ArrayList<VitalSignOfPatient> vs=vsh.getVitalSignList();
        DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
        int j=1;
        int i=0;
        float years=AgeCalculator.calculategetage(new Date(), patient.getDateOfBirth());
        int age=(int) (years/1);
        for(VitalSignOfPatient v:vsh.getVitalSignList()){
            i++;
            dataSet.setValue(new Float(v.getPatientW()),"Values",v.getPatientTS());
        }
        JFreeChart chart = ChartFactory.createLineChart("Vital Values","Vitals","Values(In Pounds)", dataSet,PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot plo=chart.getCategoryPlot();
        ValueMarker high=new ValueMarker(wHighNormal(age));
        high.setLabel("Normal High");
        high.setLabelTextAnchor(org.jfree.ui.TextAnchor.TOP_LEFT);
        high.setPaint(Color.GREEN);
        plo.addRangeMarker(high);
        
        ValueMarker low=new ValueMarker(wLowNormal(age));
        low.setLabel("Normal low");
        low.setLabelTextAnchor(org.jfree.ui.TextAnchor.TOP_LEFT);
        low.setPaint(Color.GREEN);
        plo.addRangeMarker(low);
        plo.setBackgroundPaint(null);
        ChartFrame frame= new ChartFrame("Graph",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_wjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HeartjButton;
    private javax.swing.JButton bpjButton;
    private javax.swing.JTextField bprate;
    private javax.swing.JTextField bpstatus;
    private javax.swing.JTextField heartrate;
    private javax.swing.JTextField hrstatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton respjButton;
    private javax.swing.JTextField resprate;
    private javax.swing.JTextField rrstatus;
    private javax.swing.JTable vitalsTable;
    private javax.swing.JTextField weight;
    private javax.swing.JButton wjButton;
    private javax.swing.JTextField wstatus;
    // End of variables declaration//GEN-END:variables
}
