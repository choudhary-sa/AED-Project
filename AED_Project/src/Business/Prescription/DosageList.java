/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class DosageList {
    private ArrayList<Dosage> dosageList;
    
    public DosageList(){
        this.dosageList=new ArrayList<>();
    }

    public ArrayList<Dosage> getDosageList() {
        return dosageList;
    }
    
    public Dosage addDosagetoList(Dosage.DosageType type){
        Dosage dosage=new Dosage();
        dosage.setDosageType(type);
        dosageList.add(dosage);
        return dosage;
    }
}
