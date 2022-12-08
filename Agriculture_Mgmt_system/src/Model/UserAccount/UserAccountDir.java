/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserAccount;

import Model.Emp.Emp;
import Model.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitesh
 */
public class UserAccountDir {
        private ArrayList<UserAccount> userAccountList;

    public UserAccountDir() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getuName().equals(username) && ua.getPwd().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Emp employee, Role role){
        UserAccount userAccount = new UserAccount();
       
        //Logic to check if duplicate username has been added in the system
        if (checkIfUsernameIsUnique(username))
        {
            userAccount.setuName(username);
            userAccount.setPwd(password);
            userAccount.setEmp(employee);
            userAccount.setRole(role);
            userAccountList.add(userAccount);
        }
        else {
            //Below to be deleted
            //JOptionPane.showMessageDialog(null,username+" already exists");
            JOptionPane.showMessageDialog(null,"There is already an account with username: '"+username+"'");
        }
        
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        boolean flag = true;
        for (UserAccount ua : userAccountList){
            if (ua.getuName().equals(username))
                flag = false;
            else
                flag = true;
        } 
        
        return flag;
    }
}
    
