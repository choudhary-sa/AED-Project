/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import userInterface.CVSAdminRole.CvsAdminWorkAreaJPanel;

/**
 *
 * @author Saurabh
 */
public class CVSAdminRole extends Role{
    
    @Override
    public JScrollPane createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new JScrollPane(new CvsAdminWorkAreaJPanel(userProcessContainer, enterprise,business));
    }
}
