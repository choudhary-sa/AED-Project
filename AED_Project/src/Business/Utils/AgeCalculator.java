/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utils;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Saurabh
 */
public class AgeCalculator {
    
    public static float calculategetage(Date currentDate,Date birthDate){
        float age=0;
        long currentMil=currentDate.getTime();
            long birthMil=birthDate.getTime();
            long diff=(currentMil-birthMil);
            long DIFF=TimeUnit.MILLISECONDS.toHours(diff);
            age = DIFF/8760;
            
        
        return age;
    }
    
    public static float getMonths(Date currentDate,Date birthDate){
        
            long currentMil=currentDate.getTime();
            long birthMil=birthDate.getTime();
            long diff=(currentMil-birthMil);
            long DIFF=TimeUnit.MILLISECONDS.toHours(diff);
            float totalmonths=(DIFF/730);
            float months=totalmonths%12;
            return months;
    }
}
