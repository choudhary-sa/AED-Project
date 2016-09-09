/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmacySupplier;

import Business.Drug.Drug;
import Business.Drug.Intialization;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class Supplier {
    private String supplierName;
    private String supplierID;
    private static int count=0;
    private ArrayList<Drug> drugListOfSupplier;

    @Override
    public String toString() {
        return supplierName;
    }
    

    public Supplier(){
        this.count=count++;
        this.supplierID=String.valueOf(count++);
        this.drugListOfSupplier=new ArrayList<>();
        Intialization.fillDrugList(drugListOfSupplier,this.supplierID);
        
    }

    public ArrayList<Drug> getDrugListOfSupplier() {
        return drugListOfSupplier;
    }

     public void deleteDrug(Drug d){
        drugListOfSupplier.remove(d);     
    }
    public void setDrugListOfSupplier(ArrayList<Drug> drugListOfSupplier) {
        this.drugListOfSupplier = drugListOfSupplier;
    }
    
    
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }
    
    public Drug addDrug(){
        Drug d= new Drug();
        drugListOfSupplier.add(d);
        return d;
    }
//    public void fillDrugList(ArrayList<Drug> drugListOfSupplier,String supplierid){
//        
//        for(int i=0;i<10;i++){
//            Drug d=new Drug();
//            d.setDrugName("Drug"+i+"-"+(this.supplierID=supplierid));
//            d.setDrugQuantityInStore(50);
//            d.setExpirationDate("12/31/2015");
//            d.setManufacturingDate("08/01/2015");
//            d.setPowerOfDrugInMg(120);
//            d.setSerialNumber("SN-"+i);
//            d.setSuggestedListPrice("15.75");
//            d.setStorageConditions("Cool and Dark Places");
//            d.setType("Tablet");
//            d.setfDADrugCategory("A");
//            d.setDrugAllergies("None");
//            drugListOfSupplier.add(d);
//        }
//    }
    
}

