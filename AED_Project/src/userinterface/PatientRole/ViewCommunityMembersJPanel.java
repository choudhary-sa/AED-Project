/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Community.Community;
import Business.Community.CommunityProfile;
import Business.UserAccount.UserAccount;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserPreferences;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Saurabh
 */
public class ViewCommunityMembersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCommunityMembersJPanel
     */
    private JPanel userProcessContainer;    
    private UserAccount userAccount;
    private Community community;
    public static final int MIN_ZOOM = 0;
    public static final int MAX_ZOOM = 21;
    private static int zoomValue = 4;
    public ViewCommunityMembersJPanel(JPanel userProcessContainer,UserAccount userAccount,Community community) {
        initComponents();
        this.community=community;
        jButton3.setEnabled(false);
        this.userAccount=userAccount;
        mapjButton.setEnabled(false);
        this.userProcessContainer=userProcessContainer;
        populateMembersTable();
        storyjTextArea1.setEditable(false);
    }

    public void populateMembersTable(){
        DefaultTableModel model= (DefaultTableModel)membersJTable.getModel();
        model.setRowCount(0);
        
        if(!community.getListOfCommunityMembers().isEmpty()){
            for(CommunityProfile cp:community.getListOfCommunityMembers()){
                Object[] row=new Object[3];
                row[0] = cp;
                if(cp.isShareMyLocation()){
                    row[1]=cp.getAddress();
                }else{
                    row[1]="Private/Not Shared";
                }
                row[2]=cp.getMessage();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        membersJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        storyjTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mapjButton = new javax.swing.JButton();
        profilePicJLable = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Members");

        membersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Member", "Address", "Story"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(membersJTable);

        jLabel2.setText("Story");

        storyjTextArea1.setColumns(20);
        storyjTextArea1.setRows(5);
        jScrollPane2.setViewportView(storyjTextArea1);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Other-Search-Metro-icon.png"))); // NOI18N
        jButton1.setText("View");
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

        mapjButton.setBackground(new java.awt.Color(0, 0, 0));
        mapjButton.setForeground(new java.awt.Color(255, 255, 255));
        mapjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Maps-icon.png"))); // NOI18N
        mapjButton.setText("See on Map");
        mapjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapjButtonActionPerformed(evt);
            }
        });

        profilePicJLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profilePicJLable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profilePicJLable.setPreferredSize(new java.awt.Dimension(34, 34));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/view-profile-pic.png"))); // NOI18N
        jButton3.setText("View Profile Pic");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mapjButton)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profilePicJLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(mapjButton))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(profilePicJLable, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow=membersJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row.");
            return;
        }
        else{
            CommunityProfile cp=(CommunityProfile)membersJTable.getValueAt(selectedRow,0);
            storyjTextArea1.setText(cp.getMessage());
            if(cp.isShareMyLocation()){
                mapjButton.setEnabled(true);
            }else{
                mapjButton.setEnabled(false);
            }
            if(cp.getProfilePicture()!=null||cp.getProfilePicture()!=""){
                jButton3.setEnabled(true);
            }else{
                jButton3.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mapjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow=membersJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row.");
            return;
        }
        else{
            CommunityProfile cp=(CommunityProfile)membersJTable.getValueAt(selectedRow,0);
            
           createMap(cp.getAddress());
           
        }
        
    }//GEN-LAST:event_mapjButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         int selectedRow=membersJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row.");
            return;
        }
        else{
            CommunityProfile cp=(CommunityProfile)membersJTable.getValueAt(selectedRow,0);
            if(cp.getProfilePictureFile()!=null){
                   // String fileName=cp.getProfilePicture();
                    ImageIcon ico = new ImageIcon(cp.getProfilePictureFile().toString());
                    
                    
                    profilePicJLable.setIcon(ico);
                    
                }
           
           
        }
        
            
                

            
        

    }//GEN-LAST:event_jButton3ActionPerformed

    public void createMap(String initialAddres){
        BrowserPreferences.setChromiumVariable("GOOGLE_API_KEY", "AIzaSyA2SUpmwh6VCxZzpDmGPjsX7-jClPf7-WI");
        final  Browser browser = new Browser();
        
       BrowserView browserView = new BrowserView(browser);
       JButton zoomInButton = new JButton("Zoom In");
       zoomInButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               if (zoomValue < MAX_ZOOM) {
                   browser.executeJavaScript("map.setZoom(" + ++zoomValue + ")");
               }
           }
       });
       final JTextField search=new JTextField(40);
       
       search.setEnabled(true);
       search.setVisible(true);
  
       search.setText(initialAddres);
       JButton searchInButton = new JButton("Search In");
       searchInButton.addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent e) {
               
               String address=search.getText().trim();
               
                  browser.executeJavaScript(" var geocoder;\n"  +
"  var address ="+"\""+address+"\""+";\n"+
                          "geocoder = new google.maps.Geocoder();\n" +
"    var latlng = new google.maps.LatLng(-34.397, 150.644);\n" +
"    var myOptions = {\n" +
"      zoom: 8,\n" +
"      center: latlng,\n" +
"    mapTypeControl: true,\n" +
"    mapTypeControlOptions: {style: google.maps.MapTypeControlStyle.DROPDOWN_MENU},\n" +
"    navigationControl: true,\n" +
"      mapTypeId: google.maps.MapTypeId.ROADMAP\n" +
"    };\n" +

"    if (geocoder) {\n" +
"      geocoder.geocode( { 'address': address}, function(results, status) {\n" +
"        if (status == google.maps.GeocoderStatus.OK) {\n" +
"          if (status != google.maps.GeocoderStatus.ZERO_RESULTS) {\n" +
"          map.setCenter(results[0].geometry.location);\n" +
"\n" +
"            var infowindow = new google.maps.InfoWindow(\n" +
"                { content: '<b>'+address+'</b>',\n" +
"                  size: new google.maps.Size(150,50)\n" +
"                });\n" +
"\n" +
"            var marker = new google.maps.Marker({\n" +
"                position: results[0].geometry.location,\n" +
"                map: map, \n" +
"                title:address\n" +
"            }); \n" +
"            google.maps.event.addListener(marker, 'click', function() {\n" +
"                infowindow.open(map,marker);\n" +
"            });\n" +
"\n" +
"          } else {\n" +
"            alert(\"No results found\");\n" +
"          }\n" +
"        } else {\n" +
"          alert(\"Geocode was not successful for the following reason: \" + status);\n" +
"        }\n" +
"      });\n" +
"    }");
                   
               
           }
       });
      
       
       
       JButton zoomOutButton = new JButton("Zoom Out");
       zoomOutButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               if (zoomValue > MIN_ZOOM) {
                   browser.executeJavaScript("map.setZoom(" + --zoomValue + ")");
               }
           }
       });

       

       JPanel toolBar = new JPanel();
       toolBar.add(zoomInButton);
       toolBar.add(zoomOutButton);
       toolBar.add(searchInButton);
       toolBar.add(search);
       
       JFrame frame = new JFrame("D:map.html");
       frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
       frame.add(toolBar, BorderLayout.SOUTH);
       frame.add(browserView, BorderLayout.CENTER);
       frame.setSize(900, 500);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
        

       browser.loadURL("D:map.html");
    }
     
    public void backAction(){
        
        userProcessContainer.remove(this.getParent().getParent());
        userProcessContainer.remove(this.getParent());
        userProcessContainer.remove(this);
        
        

        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mapjButton;
    private javax.swing.JTable membersJTable;
    private javax.swing.JLabel profilePicJLable;
    private javax.swing.JTextArea storyjTextArea1;
    // End of variables declaration//GEN-END:variables
}