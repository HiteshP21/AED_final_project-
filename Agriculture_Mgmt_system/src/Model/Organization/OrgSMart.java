/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Yield.YieldDir;
import Model.Role.Role;
import Model.Role.Role_SMart;
import java.util.ArrayList;

/**
 *
 * @author Hitesh
 */
public class OrgSMart extends Organization{
    public OrgSMart(){
        super(Type.SuperMartAdmin.getValue());
    
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role_SMart());
        return roles;
    }
}