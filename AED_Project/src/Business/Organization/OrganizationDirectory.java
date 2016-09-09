/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type,String name){
        Organization organization = null;
        
        if(type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organization.setOrganizationType(type);
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Receptionist.getValue())){
            organization = new ReceptionistOrganization();
            organization.setOrganizationType(type);
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setOrganizationType(type);
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organization.setOrganizationType(type);
            organizationList.add(organization);
            
        }
        else if(type.getValue().equals(Type.CVSStore.getValue())){
            organization = new CVSPharmacyStoreOrganization(name);
            organization.setOrganizationType(type);
            organizationList.add(organization);
            
        }
        else if(type.getValue().equals(Type.Analyst.getValue())){
            organization = new AnalystStaff();
            organization.setOrganizationType(type);
            organizationList.add(organization);
            
        }
        
        return organization;
    }
}