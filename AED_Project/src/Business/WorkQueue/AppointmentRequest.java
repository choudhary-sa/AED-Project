/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Saurabh
 */
public class AppointmentRequest extends WorkRequest{
    
    private String appointmentRequestID;
    private UserAccount patient;
    private UserAccount doctor;
    private String dateOfAppointment;
    private String timeofAppointment;
    
    public AppointmentRequest(UserAccount patient, UserAccount doctor){
        this.patient=patient;
        this.doctor=doctor;
    }

    public String getAppointmentRequestID() {
        return appointmentRequestID;
    }

    public void setAppointmentRequestID(String appointmentRequestID) {
        this.appointmentRequestID = appointmentRequestID;
    }

    public String getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(String dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String getTimeofAppointment() {
        return timeofAppointment;
    }

    public void setTimeofAppointment(String timeofAppointment) {
        this.timeofAppointment = timeofAppointment;
    }

    public UserAccount getPatient() {
        return patient;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "Apnt-" + appointmentRequestID;
    }
    
    
}
