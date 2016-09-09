/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Saurabh
 */
public class Prescription {
    private Date prescriptionDate;
    private ArrayList<Medication> medicationList;
    
    public Prescription(){
        this.medicationList=new ArrayList<>();
        this.prescriptionDate=new Date();
    }

    public ArrayList<Medication> getMedicationList() {
        return medicationList;
    }
    
    public Medication addMedication(String drugName){
        Medication medication=new Medication();
        medication.setDrugName(drugName);
        medicationList.add(medication);
        return medication;
    }
    
    

    @Override
    public String toString() {
        return "Prescription" + prescriptionDate;
    }
    
    
    
}
