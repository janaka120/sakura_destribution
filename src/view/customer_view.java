/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.customer_controler;
import model.add_customer_model;

/**
 *
 * @author janaka
 */
public class customer_view extends javax.swing.JFrame {

    /**
     * Creates new form customer_view
     */
    public customer_view() {
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

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbaddcust_txtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbaddcust_txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbaddcust_txtaddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        tbaddcust_txtcontect = new javax.swing.JTextField();
        tbcust_butclear = new javax.swing.JButton();
        tbcust_butadd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setText("Sakura Destributors");

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ADD Customer Forum");

        jLabel3.setText("Customer ID");

        tbaddcust_txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbaddcust_txtidActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel5.setText("Address");

        tbaddcust_txtaddress.setColumns(20);
        tbaddcust_txtaddress.setRows(5);
        jScrollPane1.setViewportView(tbaddcust_txtaddress);

        jLabel6.setText("Contect No.");

        tbcust_butclear.setText("Clear");

        tbcust_butadd.setText("ADD");
        tbcust_butadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbcust_butaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tbcust_butclear)
                            .addGap(48, 48, 48)
                            .addComponent(tbcust_butadd))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbaddcust_txtname)
                                .addComponent(tbaddcust_txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                .addComponent(tbaddcust_txtcontect, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbaddcust_txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tbaddcust_txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbaddcust_txtcontect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbcust_butclear)
                    .addComponent(tbcust_butadd))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        tbaddcust_txtid.getAccessibleContext().setAccessibleName("");
        tbaddcust_txtid.getAccessibleContext().setAccessibleParent(null);

        jTabbedPane1.addTab("Add Customer", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Add Customer");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbaddcust_txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbaddcust_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbaddcust_txtidActionPerformed

    private void tbcust_butaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbcust_butaddActionPerformed
        // TODO add your handling code here:
        add_customer_model add_customer= new add_customer_model();
        add_customer.setCustID(tbaddcust_txtid.getText());
        //System.out.println("custID"+customer_view.getCustID());
        add_customer.setCustName(tbaddcust_txtname.getText());
        add_customer.setCustAddress(tbaddcust_txtaddress.getText());
        add_customer.setCustContect(tbaddcust_txtcontect.getText());
        customer_controler.add_customer(add_customer);
    }//GEN-LAST:event_tbcust_butaddActionPerformed

    
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
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_view().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea tbaddcust_txtaddress;
    private javax.swing.JTextField tbaddcust_txtcontect;
    private javax.swing.JTextField tbaddcust_txtid;
    private javax.swing.JTextField tbaddcust_txtname;
    private javax.swing.JButton tbcust_butadd;
    private javax.swing.JButton tbcust_butclear;
    // End of variables declaration//GEN-END:variables
}