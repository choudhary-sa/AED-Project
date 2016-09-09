/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

   
    
    public Patient createPatient(String firstname,String lastname){
        Patient patient = new Patient();
        patient.setFirstName(firstname);
        patient.setLastName(lastname);
        patientList.add(patient);
        return patient;
    }
}
