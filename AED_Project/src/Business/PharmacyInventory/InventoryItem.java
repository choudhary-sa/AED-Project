/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmacyInventory;

import Business.Drug.Drug;

/**
 *
 * @author Saurabh
 */
public class InventoryItem {
    private String itemName;
    private Drug drugItem;
    private int stockValue=0;
    private String stockStatus;
    private String supplierName;
    private int threshold=10;

    @Override
    public String toString() {
        return drugItem.getDrugName();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    
    public InventoryItem(){
        this.drugItem=new Drug();
    }
    public Drug getDrugItem() {
        return drugItem;
    }

    public void setDrugItem(Drug drugItem) {
        this.drugItem = drugItem;
    }

    public int getStockValue() {
        return stockValue;
    }

    public void setStockValue(int stockValue) {
        this.stockValue = stockValue;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
    
    
    
}
