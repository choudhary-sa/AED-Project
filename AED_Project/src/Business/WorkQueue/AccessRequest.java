/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.PatientOrganization;

/**
 *
 * @author Saurabh
 */
public class AccessRequest extends WorkRequest {
    private String accessStatus;
    
    private PatientOrganization patientOrganization;
    public String getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    public PatientOrganization getPatientOrganization() {
        return patientOrganization;
    }

    public void setPatientOrganization(PatientOrganization patientOrganization) {
        this.patientOrganization = patientOrganization;
    }
    
    

    @Override
    public String toString() {
        return "AccessRequest-"+accessStatus;
    }
    
    
}
