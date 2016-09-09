/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Community.Community;
import Business.Patient.PatientDirectory;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class PatientOrganization extends Organization{
    private PatientDirectory patientDirectory;
    private Community community;
    public PatientOrganization() {
         super(Organization.Type.Patient.getValue());
         this.patientDirectory=new PatientDirectory();
         this.community=new Community();
         
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public Community getCommunity() {
        return community;
    }
    
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }
}
