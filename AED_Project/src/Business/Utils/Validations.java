/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utils;

import Business.Patient.Patient;
import Business.VitalSigns.VitalSignOfPatient;
import javax.swing.JOptionPane;

/**
 *
 * @author Saurabh
 */
public class Validations {
      
       public static String createStatus(VitalSignOfPatient vs,Patient p){
        String status="";
        float bp;
        float hr;
        float w;
        float rr;
        int age;
        boolean rrstatusflag;
        boolean hrstatusflag;
        boolean wstatusflag;
        boolean bpstatusflag;
        
            bp = vs.getPatientSBP();
            hr = vs.getPatientHR();
            w = vs.getPatientW();
            rr = vs.getPatientRR();
            
            
            age = p.getAge();            
            bpstatusflag = bpstatus(bp,age);
            rrstatusflag = rrstatus(rr,age);
            hrstatusflag = hrstatus(hr,age);
            wstatusflag = wstatus(w,age);
            if((bpstatusflag && rrstatusflag && hrstatusflag && wstatusflag)== true){
                status = "Normal";
            }
            else{
                status = "Abnormal";
            }    
        return status;
    }
    
    public static boolean rrstatus(Float rr, int age){
        boolean normal = false;
        if(age > 0 && age < 13 && rr >= 20 && rr <= 30){
            //rrstatus.setText("Normal");
            normal = true;
        }
        if(age > 12 && rr > 11 && rr < 21){
            //rrstatus.setText("Normal");
            normal = true;
        }
        return normal;
    }
    
    public static boolean hrstatus(Float hr, int age){
        boolean normal = false;
        if(age >= 1 && age <= 3 && hr > 79 && hr < 131){
            //hrstatus.setText("Normal");
            normal = true;
        }
        
        if(age >= 4 && age <= 5 && hr > 79 && hr < 121){
            //hrstatus.setText("Normal");
            normal = true;
        }
        if(age >= 6 && age <= 12 && hr > 69 && hr < 111){
            //hrstatus.setText("Normal");
            normal = true;
        }
        if(age >= 13 && hr > 54 && hr < 106){
            //hrstatus.setText("Normal");
            normal = true;
        }
        
        return normal;
    }
    
    public static boolean wstatus(Float w, int age){
        boolean normal = false;
        if(age > 0 && age < 4 && w > 21 && w < 32){
            //wstatus.setText("Normal");
            normal = true;
        }
        
        if(age > 3 && age < 6 && w > 30 && w < 41){
            //wstatus.setText("Normal");
            normal = true;
        }
        
        if(age > 5 && age < 13 && w > 10 && w < 93){
            //wstatus.setText("Normal");
            normal = true;
        }
        
        if(age > 12 && w > 110){
            //wstatus.setText("Normal");
            normal = true;
        }
        return normal;
    }
    
    public static boolean bpstatus(Float bp, int age){
        boolean normal = false;
        if(age > 0 && age < 6 && bp > 79 && bp < 111){
            //bpstatus.setText("Normal");
            normal = true;
            
        }
        
        if(age > 5 && age < 13 && bp > 79 && bp < 121){
            //bpstatus.setText("Normal");
            normal = true;
            
        }
        
        if(age > 12 && bp >109 && bp < 121){
            //bpstatus.setText("Normal");
            normal = true;
        }
        return normal;
    }
    public static boolean validateRates(String hr,String rr,String w, String bp){
    boolean isValid=true;
            try{
            Float.parseFloat(hr);
            Float.parseFloat(rr);
            Float.parseFloat(w);
            Float.parseFloat(bp);
           }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Data Entered");
            isValid =false;
            
        }
    return isValid;
    }

    public static String rrRangeSet(int age){
        String range="";
        if(age > 0 && age < 13 ){
            //rrstatus.setText("Normal");
            range = "20 - 30";
        }
        if(age > 12){
            //rrstatus.setText("Normal");
            range = "12-20";
        }
        return range;
}
    public static String hrRangeSet(int age){
        String range="";
        if(age >= 1 && age <= 3){
            //hrstatus.setText("Normal");
            range = "80 - 130";
        }
        
        if(age >= 4 && age <= 5 ){
            //hrstatus.setText("Normal");
            range = "80 - 120";
        }
        if(age >= 6 && age <= 12 ){
            //hrstatus.setText("Normal");
            range = "70 - 110";
        }
        if(age >= 13 ){
            //hrstatus.setText("Normal");
            range = "55 - 105";
        }
        
        
        return range;
}
    public static String weightRangeSet(int age){
        String range="";
        if(age > 0 && age < 4 ){
            //wstatus.setText("Normal");
           range="22 - 31";
        }
        
        if(age > 3 && age < 6){
            //wstatus.setText("Normal");
            range="31 - 40";
        }
        
        if(age > 5 && age < 13){
            //wstatus.setText("Normal");
           range="11-92";
        }
        
        if(age > 12){
            //wstatus.setText("Normal");
            range="Greater than 110";
        }
        
        return range;
}
    public static String bpRangeSet(int age){
        String range="";
         boolean normal = false;
        if(age > 0 && age < 6 ){
            //bpstatus.setText("Normal");
            range = "80 - 110";
        }
        
        if(age > 5 && age < 13){
            //bpstatus.setText("Normal");
            range = "80 - 120";
        }
        
        if(age > 12){
            //bpstatus.setText("Normal");
            range = "110 - 120";
        }
        
        return range;
}
}
