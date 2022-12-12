
package Model.Organization;

import Model.Role.Role;
import Model.Role.Role_Management;
import java.util.ArrayList;

/**
 *
 * @author shardul
 */
public class OrgManagement extends Organization{

    public OrgManagement() {
        super(Organization.Type.OfficeStaff.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role_Management());
        return roles;
    }
     
   
    
    
}
