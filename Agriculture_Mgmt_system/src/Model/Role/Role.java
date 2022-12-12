/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Yield.YieldDir;
import Model.YieldReview.YieldReviewDir;
import Model.PrimaryItem.PrimaryItemsDir;
import Model.PrimaryItemReview.PrimaryItemReviewDir;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;


/**
 *
 * @author shardul
 */
public abstract class Role {
    
    
    public enum RoleType{
        OfficeAdmin("Admin"),
        ManufacturerAdmin("Admin"),
        Customer("Customer"),
        SuperMartAdmin("SuperMart"),
        StoreManager("store Manager"),
        StorewarehouseManager("Swarehousemanager"),
        Farmer("Farmer"),
        ManufacturerSupplier("Supplier"),
        WarehouseManager("Warehouse Manager"),
        ManufacturerWarehouseManager("Manufacturer Warehouse Manager"),
        ManufacturerProducer("Producer"),
        OfficeStaff("Staff");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise, EcoSys business,YieldDir produceDirectory, PrimaryItemsDir rmDirectory,YieldReviewDir prDirectory,PrimaryItemReviewDir rmrDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
