/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Saurabh
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private String comment;
    private AppointmentRequest associatedToAppointmentRequest;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public AppointmentRequest getAssociatedToAppointmentRequest() {
        return associatedToAppointmentRequest;
    }

    public void setAssociatedToAppointmentRequest(AppointmentRequest associatedToAppointmentRequest) {
        this.associatedToAppointmentRequest = associatedToAppointmentRequest;
    }

    @Override
    public String toString() {
        return "LabTest-"+ associatedToAppointmentRequest.getAppointmentRequestID();
    }
    
    
    
    
}
