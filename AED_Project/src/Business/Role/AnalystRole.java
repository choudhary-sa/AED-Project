/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AnalystStaff;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import userinterface.AnalystRole.AnalystWorkAreaJPanel;

/**
 *
 * @author Saurabh
 */
public class AnalystRole extends Role{
    @Override
    public JScrollPane createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new JScrollPane(new AnalystWorkAreaJPanel(userProcessContainer, account, (AnalystStaff)organization,enterprise ,business));
    }
}
