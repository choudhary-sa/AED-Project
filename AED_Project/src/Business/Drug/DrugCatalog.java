/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class DrugCatalog {
    
    private ArrayList<Drug> drugList;
    
    public DrugCatalog()
    {
        
        this.drugList=new ArrayList<>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }
    
    public Drug addDrug(){
        Drug d= new Drug();
        drugList.add(d);
        return d;
    } 
 
    public void deleteDrug(Drug d){
        drugList.remove(d);     
    }
    
     public Drug searchDrug(String drugName) {
        for (Drug d : drugList) {
            if (d.getDrugName().equals(drugName)) {
                return d;
            }
        }
        return null;
    }
}
