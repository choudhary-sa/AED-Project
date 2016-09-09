/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

/**
 *
 * @author Saurabh
 */
public class Drug {
    
    private static int uniqueCount;
    private String drugName;
    private String expirationDate;
    private String manufacturingDate;
    private String suggestedListPrice;
    private int powerOfDrugInMg;
    private int drugQuantityInStore;//
    private String serialNumber;//Bn1333
    private String storageConditions;//cool n dark place
    private String type;//tablet,capsule,syrup etc
    private String fDADrugCategory;//cat a,b,c
    private String drugAllergies;

    public String getDrugAllergies() {
        return drugAllergies;
    }

    public void setDrugAllergies(String drugAllergies) {
        this.drugAllergies = drugAllergies;
    }
    

    public Drug(){
        
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getfDADrugCategory() {
        return fDADrugCategory;
    }

    public void setfDADrugCategory(String fDADrugCategory) {
        this.fDADrugCategory = fDADrugCategory;
    }

    
    public String getStorageConditions() {
        return storageConditions;
    }

    public void setStorageConditions(String storageConditions) {
        this.storageConditions = storageConditions;
    }
    
    

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    

    @Override
    public String toString() {
        return drugName;
    }

    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getSuggestedListPrice() {
        return suggestedListPrice;
    }

    public void setSuggestedListPrice(String suggestedListPrice) {
        this.suggestedListPrice = suggestedListPrice;
    }

    public int getPowerOfDrugInMg() {
        return powerOfDrugInMg;
    }

    public void setPowerOfDrugInMg(int powerOfDrugInMg) {
        this.powerOfDrugInMg = powerOfDrugInMg;
    }

    public int getDrugQuantityInStore() {
        return drugQuantityInStore;
    }

    public void setDrugQuantityInStore(int drugQuantityInStore) {
        this.drugQuantityInStore = drugQuantityInStore;
    }
    
    
}
