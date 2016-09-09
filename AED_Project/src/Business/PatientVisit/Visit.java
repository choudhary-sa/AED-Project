/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PatientVisit;

import Business.Prescription.Prescription;
import java.util.Date;

/**
 *
 * @author Saurabh
 */
public class Visit {
    private Date visitDate;
    private String doctorFeedback;
    private String patientComments;
    private VisitType visitType;
    private Prescription prescription;
    private boolean prescriptionRequired;
    
    public enum VisitType{
        Chemo("Chemotherapy"),
        Regular("Regular Visit"),
        ;
        
        private String value;
        private VisitType(String value) {
            this.value = value;
            
        }
        public String getValue() {
            return value;
        }
    }
    
    public Visit(VisitType type){
        this.prescription=new Prescription();
        this.visitType=type;
        this.visitDate=new Date();
    }

    public String getDoctorFeedback() {
        return doctorFeedback;
    }

    public void setDoctorFeedback(String doctorFeedback) {
        this.doctorFeedback = doctorFeedback;
    }

    public String getPatientComments() {
        return patientComments;
    }

    public void setPatientComments(String patientComments) {
        this.patientComments = patientComments;
    }

    public VisitType getVisitType() {
        return visitType;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setVisitType(VisitType visitType) {
        this.visitType = visitType;
    }

    public boolean isPrescriptionRequired() {
        return prescriptionRequired;
    }

    public void setPrescriptionRequired(boolean prescriptionRequired) {
        this.prescriptionRequired = prescriptionRequired;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Date getVisitDate() {
        return visitDate;
    }
    

    @Override
    public String toString() {
        return visitType + " on " +visitDate;
    }
    
    
}
