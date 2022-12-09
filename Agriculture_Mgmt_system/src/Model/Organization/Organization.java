/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Emp.EmployeeDir;
//import Model.Enterprise.Enterprise;
import Model.Yield.YieldDir;
import Model.Role.Role;
import Model.UserAccount.UserAccountDir;
import Model.WorkQueue.WorkQueue;


import java.util.ArrayList;

/**
 *
 * @author Hitesh
 */
public abstract class Organization {
    
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDir employeeDirectory;

    private UserAccountDir userAccountDirectory;

    private int organizationID;
    private YieldDir produceDirectory;
    
    private static int counter=0;
    

    public enum Type{
        //Declaring the enumerations for all organisation
        Farmer("Farmer Organization"), Customer("Customer Organization"), Warehouse("Warehouse Organization"), 
        OfficeStaff("Staff Organization"),OfficeAdmin("Admin Organization"),

        ManufacturerProducer("Production Organization"),ManufacturerWarehouse("Manufacturer Warehouse Organization"),
        ManufacturerSupplier("Supplier Organization"),ManufacturerAdmin("Admin Organization"),
        
        Fisher("Fisher Organization"), FishProducer("Fish prod Organization"), FishSupplier("Fish sup Organization");
        private String value;

        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDir();
        userAccountDirectory = new UserAccountDir();
        produceDirectory = new YieldDir();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDir getUserAccountDir() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDir getEmpDir() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
     public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    //To get the string of the object
    @Override
    public String toString() {
        return name;
    }
    
}
