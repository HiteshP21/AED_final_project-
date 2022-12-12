/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WHManagerRole;

import Model.EcoSys;
import Model.Enterprise.*;
import Model.Enterprise.FoodDeptEnt;
import Model.Enterprise.SMartEnt;
import Model.Organization.OrgStoreWH;
import Model.Organization.OrgWH;
import Model.Organization.Organization;
import Model.Yield.YieldDir;
import Model.YieldReview.YieldReviewDir;
import Model.PrimaryItemReview.PrimaryItemReviewDir;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Hitesh
 */
public class StoreWHworkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private OrgStoreWH swhOrg;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private YieldDir syieldDir;
    private YieldReviewDir prDirectory;
    private PrimaryItemReviewDir rmrDirectory;
    private Enterprise enterprise1;
    
    private EcoSys business;
    

    /**
     * Creates new form StoreMgmtWorkAreaJPanel
     */
    public static boolean flag = false;
    
    public StoreWHworkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSys business,YieldDir yeildDir) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.swhOrg = (OrgStoreWH)organization;
        this.syieldDir = yeildDir;
        
        storeenterprisename.setText(enterprise.getName());

        populateStoreRequestTable();
//        populateProduceTable();
//        populateCustomerReviewTable();
//        populateSupplierReviewTable();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateStoreRequestTable(){
     DefaultTableModel model = (DefaultTableModel)storeRequestJTable1.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : swhOrg.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getEmp().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmp().getName();
            row[3] = request.getStatus();
            
            row[4] = request.getHarvestQty();
            row[5] = request.getPrimItemQty();
            model.addRow(row);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        storeRequestJTable1 = new javax.swing.JTable();
        storejLabel1 = new javax.swing.JLabel();
        storeenterprisename = new javax.swing.JLabel();
        storeenterpriseLabel1 = new javax.swing.JLabel();
        storeprocessJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storeRequestJTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        storeRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Crop Quantity", "Raw Material Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        storeRequestJTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storeRequestJTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(storeRequestJTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 969, 96));

        storejLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        storejLabel1.setText("Requests");
        add(storejLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        storeenterprisename.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(storeenterprisename, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 127, 30));

        storeenterpriseLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        storeenterpriseLabel1.setText("Enterprise :");
        add(storeenterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 127, 30));

        storeprocessJButton.setBackground(new java.awt.Color(255, 102, 102));
        storeprocessJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        storeprocessJButton.setText("Process");
        storeprocessJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeprocessJButtonActionPerformed(evt);
            }
        });
        add(storeprocessJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void storeRequestJTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storeRequestJTable1MouseClicked
//        disableWarehouseButton();
    }//GEN-LAST:event_storeRequestJTable1MouseClicked

    private void storeprocessJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeprocessJButtonActionPerformed

        int selectedRow = storeRequestJTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Kindly select a record!");
        }

        YieldRequest request = (YieldRequest)storeRequestJTable1.getValueAt(selectedRow, 0);

        request.setStatus("Under Process");
        //under process with the cropping
        ProcessReqJPanel processWorkRequestJPanel = new ProcessReqJPanel(userProcessContainer, request);
        userProcessContainer.add("ProcessProduceJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        /**
        *
        * /*submit the inputs and wait the output

        creates new panel for new role in the organization

        data to be defined.

        data passed in the function.

        */
    }//GEN-LAST:event_storeprocessJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable storeRequestJTable1;
    private javax.swing.JLabel storeenterpriseLabel1;
    private javax.swing.JLabel storeenterprisename;
    private javax.swing.JLabel storejLabel1;
    private javax.swing.JButton storeprocessJButton;
    // End of variables declaration//GEN-END:variables
}
