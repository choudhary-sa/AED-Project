/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Drug.DrugCatalog;
import Business.PharmacyInventory.InventoryList;
import Business.Role.CvsStoreAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class CVSPharmacyStoreOrganization extends Organization{
    private String location;
    private String storeAddress;
    private double storeContact;
    private InventoryList inventoryListOfPharmacy;
    private DrugCatalog drugCatalogofPharmacy;

    public CVSPharmacyStoreOrganization(String name) {
         super(name);
         this.drugCatalogofPharmacy=new DrugCatalog();
         this.inventoryListOfPharmacy=new InventoryList();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public double getStoreContact() {
        return storeContact;
    }

    public void setStoreContact(double storeContact) {
        this.storeContact = storeContact;
    }

    public InventoryList getInventoryListOfPharmacy() {
        return inventoryListOfPharmacy;
    }

    public DrugCatalog getDrugCatalogofPharmacy() {
        return drugCatalogofPharmacy;
    }
    
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CvsStoreAdminRole());
        return roles;
    }
}
