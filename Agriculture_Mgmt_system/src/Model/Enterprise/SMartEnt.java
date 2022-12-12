/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Hitesh
 */
public class SMartEnt extends Enterprise {
    public SMartEnt(String name){
        super(name,Enterprise.EnterpriseType.SuperMart);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
