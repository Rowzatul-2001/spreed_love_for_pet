package pawprint.manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class ExpenseTracker extends javax.swing.JFrame {

    /**
     * Creates new form ExpenseTracker
     */
    
    Connection con1,con2;
    
    
    public ExpenseTracker() {
       
          
        
        try {
            initComponents();
            
            con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/powPrint?useSSL=false","root","1510791365peru#&#&");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/powPrint?useSSL=false","root","1510791365peru#&#&");
           
            displayCategory();
             getEntries();
           
        } catch (SQLException ex) {
            Logger.getLogger(ExpenseTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
    
   private void getEntries() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing rows

        try {
            if (!con2.isClosed()) {
                Statement stmt = con2.createStatement();
                String query = "SELECT * FROM EXPENSE";

                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    int id = rs.getInt("SL_NO");
                    String date = rs.getString("DATE");
                    String categoryName = rs.getString("CATEGORY_NAME");
                    String amount = rs.getString("AMOUNT");
                    
                    
                      model.addRow(new Object[]{id, date, categoryName, amount});
                }

                rs.close();
                stmt.close();
            } else {
                System.out.println("Connection is closed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExpenseTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    private void displayCategory() {
    try {
        if (!con1.isClosed()) {
            Statement ps = con1.createStatement();
            ResultSet rs = ps.executeQuery("SELECT * FROM addcat");

            jComboBox1.removeAllItems(); // Clear existing items

            while (rs.next()) {
                jComboBox1.addItem(rs.getString("CATEGORY_NAME"));
            }
            
            rs.close();
            ps.close();
        } else {
            System.out.println("Connection is closed");
        }
    } catch (SQLException ex) {
        Logger.getLogger(ExpenseTracker.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel2.setText("Category:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 70, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 130, 30));

        jLabel3.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 40, 40));

        jLabel4.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel4.setText("Amount:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 70, 40));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 140, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jButton1.setText("Add New Category");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 170, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 400, 120, 40));

        jLabel5.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jLabel5.setText("This Month Spendings:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 340, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Category", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 910, 320));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 320, 120, 40));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, -1));

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 470, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pawprint/manager/blank1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddCategory ac=new AddCategory();
        ac.show();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                                             
    // TODO add your handling code here:
    java.util.Date dt = jDateChooser1.getDate();
    String s1 = jTextField1.getText();
    String s2 = (String) jComboBox1.getSelectedItem();
    
    if (dt != null && !s1.equals("") && !s2.equals("")) {
        try {
            Statement stmt = con2.createStatement();
            String insertQuery = "INSERT INTO EXPENSE (DATE, CATEGORY_NAME, AMOUNT) VALUES ('" + dt + "', '" + s2 + "', '" + s1 + "')";
            stmt.executeUpdate(insertQuery);
            stmt.close();
            getEntries();
            
            // Refresh the display after inserting
            // You can call your method to update the table here
        } catch (SQLException ex) {
            Logger.getLogger(ExpenseTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        // Handle invalid input here
    }


        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                             
                      
    try {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int slNo = (int) jTable1.getValueAt(selectedRow, 0); // Get the SL_NO from the selected row

            Statement stmt = con2.createStatement();
            stmt.executeUpdate("DELETE FROM EXPENSE WHERE SL_NO=" + slNo);

            getEntries(); // Refresh the table
        } else {
            // No row is selected
        }
    } catch (SQLException ex) {
        Logger.getLogger(ExpenseTracker.class.getName()).log(Level.SEVERE, null, ex);
    }




        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Management m=new Management();
        m.setVisible(true);
        this.setVisible(false);
        new ExpenseTracker().setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ExpenseTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpenseTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpenseTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpenseTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpenseTracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
