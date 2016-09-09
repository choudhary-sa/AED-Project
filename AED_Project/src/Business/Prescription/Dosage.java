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
public class Dosage {
    private float quantity;
    private String comment;
    private DosageType dosageType;
    
    public enum DosageType{
        Morning("Mornig Dose(8am to 9am)"),
        Afternoon("Afternoon Dose(1pm to 2pm)"),
        Evening("Evening Dose(6pm to 7pm)"),
        Night("Night Dose(10pm to 11pm)"),
        Other("As per need")
        ;
        
        private String value;
        private DosageType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public DosageType getDosageType() {
        return dosageType;
    }

    public void setDosageType(DosageType dosageType) {
        this.dosageType = dosageType;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.dosageType.toString();
    }
    
    
    
}
