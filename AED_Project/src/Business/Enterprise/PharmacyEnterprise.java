/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.PharmacySupplier.SupplierCatalog;
import Business.Role.CVSAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class PharmacyEnterprise extends Enterprise{
    private SupplierCatalog supplierCatalog;
    public PharmacyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Pharmacy);
        this.supplierCatalog=new SupplierCatalog();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CVSAdminRole());
        return roles;
    }

    public SupplierCatalog getSupplierCatalog() {
        return supplierCatalog;
    }
    
    
    
    @Override
    public String toString()
    {
        return this.getName();
    }
    
}
