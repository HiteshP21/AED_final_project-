/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Enterprise.FoodDeptEnt;
import Model.Enterprise.SMartEnt;
import Model.Organization.OrgCust;
import Model.Organization.OrgSMart;
import Model.Organization.OrgFarmer;
import Model.Organization.Organization;
import Model.Yield.YieldDir;
import Model.YieldReview.YieldReviewDir;
import Model.PrimaryItem.PrimaryItemsDir;
import Model.PrimaryItemReview.PrimaryItemReviewDir;
import Model.UserAccount.UserAccount;
import UI.SMartRole.SMartWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Hitesh
 */
public class Role_SMart extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business,YieldDir yieldDir, PrimaryItemsDir rmDir,YieldReviewDir prDir,PrimaryItemReviewDir rmrDir) {
        return new SMartWorkAreaJPanel(userProcessContainer,account, (OrgSMart)organization,enterprise,prDir);
        
    }
    
}
