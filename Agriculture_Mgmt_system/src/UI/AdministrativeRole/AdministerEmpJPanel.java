
package UI.AdministrativeRole;

import Model.Emp.Emp;
import Model.Organization.Organization;
import Model.Organization.OrganizationDir;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hitesh
 */
public class AdministerEmpJPanel extends javax.swing.JPanel {

    private OrganizationDir organizationDir;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public AdministerEmpJPanel(JPanel userProcessContainer,OrganizationDir organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }
    
    public void populateOrganizationComboBox(){
        orgJComboBox.removeAllItems();
        
        for (Organization org1 : organizationDir.getOrganizationList()){
            orgJComboBox.addItem(org1);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        orgEpJCombo.removeAllItems();

        for (Organization org2 : organizationDir.getOrganizationList()){
            orgEpJCombo.addItem(org2);
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model21 = (DefaultTableModel) orgJTable.getModel();

        model21.setRowCount(0);
        
        for (Emp emp : organization.getEmpDir().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = emp.getId();
            row[1] = emp.getName();
            model21.addRow(row);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orgJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        orgJComboBox = new javax.swing.JComboBox();
        jLabel132 = new javax.swing.JLabel();
        bkJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        orgEpJCombo = new javax.swing.JComboBox();
        jLabel323 = new javax.swing.JLabel();
        jLabel4332 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orgJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgJTable);
        if (orgJTable.getColumnModel().getColumnCount() > 0) {
            orgJTable.getColumnModel().getColumn(0).setResizable(false);
            orgJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 550, 229));

        addJButton.setBackground(new java.awt.Color(255, 102, 102));
        addJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 250, -1));

        orgJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgJComboBoxActionPerformed(evt);
            }
        });
        add(orgJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 230, -1));

        jLabel132.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel132.setText("Organization Employees");
        add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        bkJButton.setBackground(new java.awt.Color(204, 255, 204));
        bkJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bkJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMback.png"))); // NOI18N
        bkJButton.setText("Back");
        bkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkJButtonActionPerformed(evt);
            }
        });
        add(bkJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Employee Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 161, -1));

        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 294, -1));

        orgEpJCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(orgEpJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 294, -1));

        jLabel323.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel323.setText("Organization");
        add(jLabel323, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 196, 50));

        jLabel4332.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4332.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4332.setText(" Manage Employees");
        add(jLabel4332, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 480, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMcorporate1.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        if (nameJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Kindly enter Employee Name");
        }

        else
        {
        Organization org34 = (Organization) orgEpJCombo.getSelectedItem();
        String nme = nameJTextField.getText();
        
        org34.getEmpDir().createEmp(nme);
        populateTable(org34);
        

        }
        
        nameJTextField.setText("");
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void bkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bkJButtonActionPerformed

    private void orgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgJComboBoxActionPerformed
        Organization org343 = (Organization) orgJComboBox.getSelectedItem();
        if (org343 != null){
            populateTable(org343);
        }
    }//GEN-LAST:event_orgJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton bkJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel4332;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox orgEpJCombo;
    private javax.swing.JComboBox orgJComboBox;
    private javax.swing.JTable orgJTable;
    // End of variables declaration//GEN-END:variables
}