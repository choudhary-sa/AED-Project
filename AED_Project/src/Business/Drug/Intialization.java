/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import Business.PharmacySupplier.Supplier;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class Intialization {
    public static void fillDrugList(ArrayList<Drug> drugListOfSupplier,String supplierid){
        
        for(int i=0;i<10;i++){
            Drug d=new Drug();
            d.setDrugName("Drug"+i+"-"+supplierid);
            d.setDrugQuantityInStore(50);
            d.setExpirationDate("12/31/2015");
            d.setManufacturingDate("08/01/2015");
            d.setPowerOfDrugInMg(120);
            d.setSerialNumber("SN-"+i);
            d.setSuggestedListPrice("15.75");
            d.setStorageConditions("Cool and Dark Places");
            d.setType("Tablet");
            d.setfDADrugCategory("A");
            d.setDrugAllergies("None");
            drugListOfSupplier.add(d);
        }
    }
    
     public static void fillSupplierList(ArrayList<Supplier> supplierList){
        for(int i=0;i<10;i++){
            Supplier a=new Supplier();
            supplierList.add(a);
            a.setSupplierName("Supplier"+i);
            a.setSupplierID(a.getSupplierName()+i+i);
        }
    }
}
