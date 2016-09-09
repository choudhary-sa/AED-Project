/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.AnalystAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class AnalyticsEnterprise extends Enterprise{
    
  public AnalyticsEnterprise(String name) {
        super(name, EnterpriseType.Analytics);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AnalystAdminRole());
        return roles;
    }
    
    @Override
    public String toString()
    {
        return this.getName();
    }  
}
