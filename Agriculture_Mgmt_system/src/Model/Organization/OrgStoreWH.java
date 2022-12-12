/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;
import Model.Role.Role;
import Model.Role.Role_StoreWHManager;
//import Model.Role.Role_Management;
import java.util.ArrayList;

/**
 *
 * @author Hitesh
 */
public class OrgStoreWH extends Organization{
    public OrgStoreWH() {
        super(Type.StorewarehouseManager.getValue());
    }
        
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role_StoreWHManager());
        return roles;
    }
    
}
