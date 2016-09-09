/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Employee.Employee;
import Business.PatientVisit.VisitHistory;
import Business.UserAccount.UserAccount;
import Business.VitalSigns.VitalSignHistoryOfPatient;
import java.util.Date;

/**
 *
 * @author Saurabh
 */
public class Patient extends Employee{
    private int age;
    private String allergies;
    private VitalSignHistoryOfPatient vsh;
    private Date dateOfBirth;
    private String StringDOB;
    private String gender;
    private String typeOfCancer;
    private VisitHistory visitHistory;
    private UserAccount associatedDoctor;

    public UserAccount getAssociatedDoctor() {
        return associatedDoctor;
    }

    public void setAssociatedDoctor(UserAccount associatedDoctor) {
        this.associatedDoctor = associatedDoctor;
    }
    
    public Patient(){
        super();
        this.vsh=new VitalSignHistoryOfPatient();
        this.visitHistory=new VisitHistory();
    }

    public VitalSignHistoryOfPatient getVsh() {
        return vsh;
    }

    public String getStringDOB() {
        return StringDOB;
    }

    public void setStringDOB(String StringDOB) {
        this.StringDOB = StringDOB;
    }
    
    

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public VisitHistory getVisitHistory() {
        return visitHistory;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTypeOfCancer() {
        return typeOfCancer;
    }

    public void setTypeOfCancer(String typeOfCancer) {
        this.typeOfCancer = typeOfCancer;
    }
    
    

    @Override
    public String toString() {
        return super.getFirstName()+" "+super.getLastName();
    }
    
   
    
    
}
