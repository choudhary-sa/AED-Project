/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;


import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class DonorDirectory {
    
    private ArrayList<Donor> donorList;

    public DonorDirectory() {
        donorList = new ArrayList<>();
    }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }
    
    public Donor createDonor(String name){
        Donor d = new Donor();
        d.setFirstName(name);
        donorList.add(d);
        return d;
    }
    
}
