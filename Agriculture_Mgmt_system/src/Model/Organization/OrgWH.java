
package Model.Organization;

import Model.Role.Role_ManurerProducer;
import Model.Role.Role;
import Model.Role.Role_WHManager;
import java.util.ArrayList;

/**
 *
 * @author shardul
 */
public class OrgWH extends Organization {
    public OrgWH(){
        super(Type.Warehouse.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role_WHManager());
        return roles;
    }  
}
