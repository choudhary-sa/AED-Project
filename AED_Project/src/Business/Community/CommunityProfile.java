/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Community;

import Business.UserAccount.UserAccount;
import java.io.File;

/**
 *
 * @author Saurabh
 */
public class CommunityProfile {
    private UserAccount userAccount;
    private boolean isConnected=false;
    private String message;
    private String address;
    private boolean shareMyLocation=false;
    private String profilePicture;
    private File profilePictureFile;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public File getProfilePictureFile() {
        return profilePictureFile;
    }

    public void setProfilePictureFile(File profilePictureFile) {
        this.profilePictureFile = profilePictureFile;
    }
    
    

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public boolean isIsConnected() {
        return isConnected;
    }

    public void setIsConnected(boolean isConnected) {
        this.isConnected = isConnected;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isShareMyLocation() {
        return shareMyLocation;
    }

    public void setShareMyLocation(boolean shareMyLocation) {
        this.shareMyLocation = shareMyLocation;
    }

    @Override
    public String toString() {
        return userAccount.toString();
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
    
    
    
}
