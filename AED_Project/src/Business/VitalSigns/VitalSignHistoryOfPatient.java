/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class VitalSignHistoryOfPatient {
    
    private ArrayList<VitalSignOfPatient> vitalSignList;
    
    public VitalSignHistoryOfPatient()
    {
        
        this.vitalSignList=new ArrayList<>();
    }

    public ArrayList<VitalSignOfPatient> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSignOfPatient> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }

    public VitalSignOfPatient addVitalSign(){
        VitalSignOfPatient v= new VitalSignOfPatient();
        vitalSignList.add(v);
        return v;
    } 
    
    public void deleteVitalSign(VitalSignOfPatient vitalSign){
        vitalSignList.remove(vitalSign);     
    }
    
}
