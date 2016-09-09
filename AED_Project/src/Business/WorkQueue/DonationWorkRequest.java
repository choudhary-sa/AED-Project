/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Donor.Donor;

/**
 *
 * @author Saurabh
 */
public class DonationWorkRequest extends WorkRequest{
    private String bloodQuantity;
    private String barCode;
    private Donor donor;
    
    public DonationWorkRequest(){
        this.donor=donor;
        this.barCode=barCode;
        this.bloodQuantity=bloodQuantity;
        
    }
    
    public String getBloodQuantity() {
        return bloodQuantity;
    }

    public void setBloodQuantity(String bloodQuantity) {
        this.bloodQuantity = bloodQuantity;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    @Override
    public String toString() {
        return donor.toString();
    }
    
    
    
}
