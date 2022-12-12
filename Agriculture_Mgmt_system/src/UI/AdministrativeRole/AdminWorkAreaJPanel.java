


package UI.AdministrativeRole;

import Model.Enterprise.Enterprise;
import Model.Enterprise.FoodDeptEnt;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Hitesh
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    FoodDeptEnt enterprise;
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = (FoodDeptEnt)enterprise;
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        valLbl.setText(enterprise.getName());
    }
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1423 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        mngeEmpJButton = new javax.swing.JButton();
        mngeOrgJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1423.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1423.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1423.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1423.setText(" Enterprise Administrator");
        add(jLabel1423, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 570, 70));

        userJButton.setBackground(new java.awt.Color(51, 255, 255));
        userJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userJButton.setText("Manage Users");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 300, 30));

        mngeEmpJButton.setBackground(new java.awt.Color(153, 51, 255));
        mngeEmpJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mngeEmpJButton.setText("Manage Employees");
        mngeEmpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngeEmpJButtonActionPerformed(evt);
            }
        });
        add(mngeEmpJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 300, -1));

        mngeOrgJButton.setBackground(new java.awt.Color(153, 255, 153));
        mngeOrgJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mngeOrgJButton.setText("Manage Organization");
        mngeOrgJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngeOrgJButtonActionPerformed(evt);
            }
        });
        add(mngeOrgJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 300, -1));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 30));

        valLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(valLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, 20));

        jLabel1.setBackground(new java.awt.Color(204, 102, 0));
        jLabel1.setForeground(new java.awt.Color(255, 51, 204));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void mngeOrgJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngeOrgJButtonActionPerformed

        AdministerOrgJPanel mngOrgJP = new AdministerOrgJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", mngOrgJP);
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    }//GEN-LAST:event_mngeOrgJButtonActionPerformed

    private void mngeEmpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngeEmpJButtonActionPerformed

        AdministerEmpJPanel mngeEmp = new AdministerEmpJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", mngeEmp);
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    }//GEN-LAST:event_mngeEmpJButtonActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        AdministerUserAccountJPanel mueaeajp = new AdministerUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", mueaeajp);
        
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1423;
    private javax.swing.JButton mngeEmpJButton;
    private javax.swing.JButton mngeOrgJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valLbl;
    // End of variables declaration//GEN-END:variables
    
}

