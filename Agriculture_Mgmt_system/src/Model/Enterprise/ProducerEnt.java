
package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Hitesh
 */
public class ProducerEnt extends Enterprise {
    
     public ProducerEnt(String name){
        super(name,Enterprise.EnterpriseType.Producer);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
