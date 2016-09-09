/*
 * To change this template, choose Tools | Templates
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

/**
 *
 * @author Saurabh
 */
public class AdminRole extends Role{

    @Override
    public JScrollPane createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new JScrollPane(new AdminWorkAreaJPanel(userProcessContainer,account, enterprise,business));
    }

    
    
}
