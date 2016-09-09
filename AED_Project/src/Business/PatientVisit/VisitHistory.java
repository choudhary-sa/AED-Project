/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PatientVisit;

import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class VisitHistory {
    private ArrayList<Visit> visitHistory;
    
    public VisitHistory(){
        this.visitHistory=new ArrayList<>();
    }

    public ArrayList<Visit> getVisitHistory() {
        return visitHistory;
    }
    
    public Visit addVisit(Visit.VisitType type){
        Visit visit=new Visit(type);
        visitHistory.add(visit);
        return visit;
        
    }
}
