/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmacySupplier;

import Business.Drug.Intialization;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class SupplierCatalog {
    private ArrayList<Supplier> supplierList=new ArrayList<>();

    public SupplierCatalog(){
        this.supplierList=new ArrayList<>();
        Intialization.fillSupplierList(this.supplierList);
    }

    public ArrayList<Supplier> getSupplierList(){
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList){
        this.supplierList = supplierList;
    }
    
//    public void fillSupplierList(ArrayList<Supplier> supplierList){
//        for(int i=0;i<10;i++){
//            Supplier a=new Supplier();
//            supplierList.add(a);
//            a.setSupplierName("Supplier"+i);
//            a.setSupplierID(a.getSupplierName()+i+i);
//        }
//    }
}

