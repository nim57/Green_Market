/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package greenmart;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DELL
 */
public class Homepage extends javax.swing.JFrame {

    function functio = new function();
    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        functio.productTable(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtf_search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtf_name = new javax.swing.JTextField();
        txtf_pid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtf_price = new javax.swing.JTextField();
        txtf_quntity = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(111, 172, 144));

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Log out");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GREENMART SUPERMARKET");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/greenmart/colorful-shopping-cart-artwork_131796-1219-modified.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, Short.MAX_VALUE)
                    .addGap(167, 167, 167)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtf_search.setText("Search here");
        txtf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_searchActionPerformed(evt);
            }
        });
        txtf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtf_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txtf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 243, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Cart");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 489, -1, 38));

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Viwe Cart");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(911, 520, -1, 38));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Quntity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 61, 649, 300));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Product ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 386, 96, -1));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 435, 96, -1));

        txtf_name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtf_name.setForeground(new java.awt.Color(0, 102, 102));
        txtf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txtf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 431, 212, 31));

        txtf_pid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtf_pid.setForeground(new java.awt.Color(0, 102, 102));
        txtf_pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_pidActionPerformed(evt);
            }
        });
        jPanel1.add(txtf_pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 382, 212, 31));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Quantity");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 386, 96, -1));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Price");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 435, 96, -1));

        txtf_price.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtf_price.setForeground(new java.awt.Color(0, 102, 102));
        txtf_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_priceActionPerformed(evt);
            }
        });
        jPanel1.add(txtf_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 431, 212, 31));

        txtf_quntity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtf_quntity.setForeground(new java.awt.Color(0, 102, 102));
        txtf_quntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_quntityActionPerformed(evt);
            }
        });
        txtf_quntity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtf_quntityKeyReleased(evt);
            }
        });
        jPanel1.add(txtf_quntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 382, 212, 31));

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Clear");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(911, 468, 101, -1));

        btn_refresh.setBackground(new java.awt.Color(0, 102, 102));
        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setText("Refresh");
        btn_refresh.setBorderPainted(false);
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 110, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        Login login = new Login();
        login.show();
        dispose();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int id = Integer.valueOf(txtf_pid.getText());
        String name = txtf_name.getText();
        String quntity= txtf_quntity.getText();
        String prices = txtf_price.getText();
        
        
        if( name.trim().equals("") || prices.trim().equals("")||quntity.trim().equals("")){
          
          JOptionPane.showMessageDialog(rootPane, "Fill All Data");
      }
      else{
        if(functio.add_cart(id,name,quntity,prices)){
            JOptionPane.showMessageDialog(rootPane, "New Product Added Successfully");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Try agan");
        }
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
         Viewcart cart = new Viewcart();
         cart.show();
         dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rIndex = jTable1.getSelectedRow();

        txtf_pid.setText(model.getValueAt(rIndex, 0).toString());
        txtf_name.setText(model.getValueAt(rIndex, 1).toString());
        txtf_quntity.setText(model.getValueAt(rIndex, 3).toString());
        txtf_price.setText(model.getValueAt(rIndex, 4).toString());    
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtf_searchKeyReleased
        DefaultTableModel ob = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<> (ob);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtf_search.getText()));
    }//GEN-LAST:event_txtf_searchKeyReleased

    private void txtf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_nameActionPerformed

    private void txtf_pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_pidActionPerformed

    private void txtf_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_priceActionPerformed

    private void txtf_quntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_quntityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_quntityActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        txtf_pid.setText("");
         txtf_name.setText("");
         txtf_quntity.setText("");
         txtf_price.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtf_quntityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtf_quntityKeyReleased
        
         String quntity= txtf_quntity.getText();
        String prices = txtf_price.getText();
        
        int qun = Integer.parseInt(quntity);
        int pri = Integer.parseInt(prices);
        
        int new_prices = qun*pri;
        String pricesss = String.valueOf(new_prices);
         txtf_price.setText(pricesss);
        
    }//GEN-LAST:event_txtf_quntityKeyReleased

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed

        jTable1.setModel(new DefaultTableModel(null,new Object[]{"ID","Name","Category","Quntity","Prices"}));
       functio.productTable(jTable1);
    }//GEN-LAST:event_btn_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtf_name;
    private javax.swing.JTextField txtf_pid;
    private javax.swing.JTextField txtf_price;
    private javax.swing.JTextField txtf_quntity;
    private javax.swing.JTextField txtf_search;
    // End of variables declaration//GEN-END:variables
}
