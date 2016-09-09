/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import java.util.Date;

/**
 *
 * @author Saurabh
 */
public class VitalSignOfPatient {
    
    private float patientRR;    //Respiratory Rate.
    private float patientHR;    //Heart Rate.
    private float patientSBP;   //Systolic Blood Pressure.
    private float patientW;     //Weight in Pounds.
    private Date patientTS;    //TimeStamp when vitals were captured.

    public VitalSignOfPatient(){
        this.patientTS=new Date();
    }
    
    @Override
    public String toString() {
        return this.patientTS.toString();
    }
    
    

    public float getPatientHR() {
        return patientHR;
    }

    public void setPatientHR(float patientHR) {
        this.patientHR = patientHR;
    }

    public float getPatientRR() {
        return patientRR;
    }

    public void setPatientRR(float patientRR) {
        this.patientRR = patientRR;
    }

    public float getPatientSBP() {
        return patientSBP;
    }

    public void setPatientSBP(float patientSBP) {
        this.patientSBP = patientSBP;
    }

    public Date getPatientTS() {
        return patientTS;
    }

    public void setPatientTS(Date patientTS) {
        this.patientTS = patientTS;
    }

    public float getPatientW() {
        return patientW;
    }

    public void setPatientW(float patientW) {
        this.patientW = patientW;
    }

    
}
