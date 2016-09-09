/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

/**
 *
 * @author Saurabh
 */
public class Medication {
    private String drugName;
    private DosageList dosageList;
    private int forDays;
    
    public Medication(){
        this.dosageList=new DosageList();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public DosageList getDosageList() {
        return dosageList;
    }

    public int getForDays() {
        return forDays;
    }

    public void setForDays(int forDays) {
        this.forDays = forDays;
    }

    @Override
    public String toString() {
        return  drugName;
    }
    
    
    
}
