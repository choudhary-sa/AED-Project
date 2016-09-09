/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmacyInventory;

import Business.Drug.DrugCatalog;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class InventoryList {
    private ArrayList<InventoryItem> inventoryList;
    private DrugCatalog druglist;
    
    public InventoryList()
    {
        
        this.inventoryList=new ArrayList<>();
    }

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<InventoryItem> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
    
    
    public InventoryItem addInventoryItem(){
        InventoryItem i= new InventoryItem();
        inventoryList.add(i);
        return i;
    } 
 
    public void deleteInventoryItem(InventoryItem d){
        inventoryList.remove(d);     
    }
    
     public InventoryItem searchInventoryItem(String itemName) {
        for (InventoryItem d : inventoryList) {
            if (d.getDrugItem().getDrugName().equals(itemName)) {
                return d;
            }
        }
        return null;
    }
}
