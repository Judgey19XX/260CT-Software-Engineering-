/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoyaltyMembership;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bachirjibril
 */
public class UpdateMembership extends javax.swing.JFrame {

    /**
     * Creates new form UpdateMembership
     */
    public UpdateMembership() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfDOB = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfContactNumber = new javax.swing.JTextField();
        tfSessions = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        cbLoyaltyMembership = new javax.swing.JComboBox<String>();
        lMessage = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("First Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 77, -1, -1));

        jLabel2.setText("Last Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 115, -1, -1));

        jLabel3.setText("Date of Birth:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 147, -1, -1));

        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 179, -1, -1));

        jLabel5.setText("contact Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 217, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lithos Pro", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sphere snow ski-slope");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 520, 70));

        jLabel7.setText("sessions:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 255, -1, -1));

        jLabel8.setText("Loyalty Membership:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 298, -1, -1));
        getContentPane().add(tfFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 72, 318, -1));
        getContentPane().add(tfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 110, 318, -1));
        getContentPane().add(tfDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 142, 318, -1));
        getContentPane().add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 174, 318, -1));
        getContentPane().add(tfContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 212, 318, -1));
        getContentPane().add(tfSessions, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 250, 318, -1));

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });
        getContentPane().add(bAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(bUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Date of Birth", "Contact Number ", "Sessions ", "loyalty Membership"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCustomer);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 725, 340));

        cbLoyaltyMembership.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "loyalty Membership", "standard Membership" }));
        getContentPane().add(cbLoyaltyMembership, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 294, 322, -1));

        lMessage.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 327, 412, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoyaltyMembership/ski1.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        lMessage.setText("");
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        if(!tfFirstName.getText(). trim(). equals("")){
            model.addRow(new Object[]{tfFirstName.getText(),tfLastName.getText(),tfDOB.getText(),tfContactNumber.getText(),tfSessions.getText(),cbLoyaltyMembership.getSelectedItem(). toString(),});    
    }                                    
        else{ 
            lMessage.setText("Product Name should not be left Blank");
        }
    
    }//GEN-LAST:event_bAddActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
          lMessage.setText("");
          
         DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
       if(tblCustomer.getSelectedRow()==-1){
            if(tblCustomer.getRowCount() == 0){
                lMessage.setText("Table is empty");
            } else{
                lMessage.setText("You must select a product");
            }
        }else{
        
            model.setValueAt(tfFirstName.getText(), tblCustomer.getSelectedRow(), 0);
            model.setValueAt(tfLastName.getText(), tblCustomer.getSelectedRow(), 1);
            model.setValueAt(tfDOB.getText(), tblCustomer.getSelectedRow(), 2);
            model.setValueAt(tfContactNumber.getText(), tblCustomer.getSelectedRow(), 3);
            model.setValueAt(tfSessions.getText(), tblCustomer.getSelectedRow(), 4);
            model.setValueAt(cbLoyaltyMembership.getSelectedItem().toString(), tblCustomer.getSelectedRow(), 5);
       }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
     DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
      tfFirstName.setText(model.getValueAt(tblCustomer.getSelectedRow(),0).toString());
      tfLastName.setText(model.getValueAt(tblCustomer.getSelectedRow(),1).toString());
      tfDOB.setText(model.getValueAt(tblCustomer.getSelectedRow(),2).toString());
      tfContactNumber.setText(model.getValueAt(tblCustomer.getSelectedRow(),3).toString());
      tfSessions.setText(model.getValueAt(tblCustomer.getSelectedRow(),4).toString());
      cbLoyaltyMembership.setSelectedItem(model.getValueAt(tblCustomer.getSelectedRow(),5).toString()); 
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        if(tblCustomer.getSelectedRow()==-1){
            if(tblCustomer.getRowCount() == 0){
                lMessage.setText("Table is empty");
            } else{
                lMessage.setText("You must select a product");
            }
        }else{
                model.removeRow(tblCustomer.getSelectedRow());
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMembership().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cbLoyaltyMembership;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lMessage;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField tfContactNumber;
    private javax.swing.JTextField tfDOB;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfSessions;
    // End of variables declaration//GEN-END:variables
}
