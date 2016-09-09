/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Community;

import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class Community {
    private ArrayList<CommunityProfile> listOfCommunityMembers;
    
    public Community(){
        this.listOfCommunityMembers=new ArrayList<>();
    }

    public ArrayList<CommunityProfile> getListOfCommunityMembers() {
        return listOfCommunityMembers;
    }

    public void setListOfCommunityMembers(ArrayList<CommunityProfile> listOfCommunityMembers) {
        this.listOfCommunityMembers = listOfCommunityMembers;
    }
    
    public void joinCommunity(CommunityProfile cp){
        this.listOfCommunityMembers.add(cp);
    }
    
    public void leaveCommunity(CommunityProfile cp){
        this.listOfCommunityMembers.remove(cp);
    }
}
