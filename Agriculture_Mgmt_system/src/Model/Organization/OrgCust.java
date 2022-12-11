
package Model.Organization;


import Model.Role.Role_Cust;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Hitesh
 */
public class OrgCust extends Organization {
     public OrgCust(){
        super(Type.Customer.getValue());
    }
  
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role_Cust());
        return roles;
    }
}
