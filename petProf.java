package pawprint.manager;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class petProf extends javax.swing.JFrame {

    public petProf() {
        initComponents();
        
    }
    int q,i,number,deleteItem;
public void updateDB()
{
    try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/powPrint?useSSL=false","root","1510791365peru#&#&");
             PreparedStatement pstm=con.prepareStatement("select * from pet "); 
             ResultSet rs=pstm.executeQuery();
             ResultSetMetaData stData=rs.getMetaData();
             q=stData.getColumnCount();
             DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel();
             RecordTable.setRowCount(0);
             
             while(rs.next())
             {
                 Vector colData= new Vector();
                 for( i=1;i<=q;i++)
                 {
                     colData.add(rs.getString("number"));
                     colData.add(rs.getString("name"));
                     colData.add(rs.getString("species"));
                     colData.add(rs.getString("breed"));
                     colData.add(rs.getString("age"));
                     colData.add(rs.getString("gender"));
                     colData.add(rs.getString("color"));
                     colData.add(rs.getString("hc"));
                 }
                 RecordTable.addRow(colData);
             }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
 }                                        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        colfld = new javax.swing.JTextField();
        brfld = new javax.swing.JTextField();
        spfld = new javax.swing.JTextField();
        agfld = new javax.swing.JTextField();
        hcfld = new javax.swing.JTextField();
        genfld = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        resbtn = new javax.swing.JButton();
        dltbtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        updbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnfld = new javax.swing.JTextField();
        srchfld = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Annai MN", 3, 36)); // NOI18N
        jLabel1.setText("Pet Profile");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 190, -1));

        jLabel3.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Species:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 110, 30));

        jLabel4.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Health condition:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 160, 30));

        jLabel6.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Breed:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 30));

        jLabel7.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("Age:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, 30));

        jLabel8.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Gender:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 110, 30));

        jLabel9.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("Color:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, 30));

        colfld.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        jPanel1.add(colfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 330, 30));

        brfld.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        jPanel1.add(brfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 330, 30));

        spfld.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        spfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spfldActionPerformed(evt);
            }
        });
        jPanel1.add(spfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 330, 30));

        agfld.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        jPanel1.add(agfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 330, 30));

        hcfld.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        jPanel1.add(hcfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 330, 30));

        genfld.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        jPanel1.add(genfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 330, 30));

        jTable1.setFont(new java.awt.Font("Annai MN", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Name", "Species", "Breed", "Age", "Gender", "Color", "Health Condition"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(114, 95, 203));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 477, 1040, 280));

        resbtn.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        resbtn.setForeground(new java.awt.Color(102, 51, 0));
        resbtn.setText("Reset");
        resbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resbtnActionPerformed(evt);
            }
        });
        jPanel1.add(resbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 100, -1));

        dltbtn.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        dltbtn.setText("Delete");
        dltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbtnActionPerformed(evt);
            }
        });
        jPanel1.add(dltbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 100, -1));

        jButton4.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 51, 0));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 100, -1));

        addbtn.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        addbtn.setForeground(new java.awt.Color(102, 51, 0));
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 100, -1));

        updbtn.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        updbtn.setText("Update");
        updbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updbtnActionPerformed(evt);
            }
        });
        jPanel1.add(updbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pawprint/manager/puku.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 190, 250));

        jLabel10.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Search:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 80, 40));

        pnfld.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        pnfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnfldActionPerformed(evt);
            }
        });
        jPanel1.add(pnfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 330, 30));

        srchfld.setFont(new java.awt.Font("Annai MN", 1, 24)); // NOI18N
        srchfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srchfldKeyReleased(evt);
            }
        });
        jPanel1.add(srchfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, 180, 50));

        jLabel11.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("Pet's name:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spfldActionPerformed

    private void resbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resbtnActionPerformed
       pnfld.setText("");
       spfld.setText("");
       brfld.setText("");
       colfld.setText("");
       genfld.setText("");
       hcfld.setText("");
       agfld.setText("");
           
    }//GEN-LAST:event_resbtnActionPerformed

    private void dltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbtnActionPerformed
        DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel();
        int selectedRows=jTable1.getSelectedRow();
        try{
             number=Integer.parseInt(RecordTable.getValueAt(selectedRows, 0).toString());
             deleteItem=JOptionPane.showConfirmDialog(null, "Confirm if you want to deete item","Waiting", JOptionPane.YES_NO_OPTION);
            if(deleteItem==JOptionPane.YES_NO_OPTION)
            {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/powPrint?useSSL=false","root","1510791365peru#&#&");
             PreparedStatement pstm=con.prepareStatement("delete from pet where number = ? "); 
             pstm.setInt(1,number);
             pstm.executeUpdate();
             JOptionPane.showMessageDialog(this, "Record Updated");
             updateDB();
             
              pnfld.setText("");
              pnfld.requestFocus();
              spfld.setText("");
              brfld.setText("");
              colfld.setText("");
              genfld.setText("");
              hcfld.setText("");
              agfld.setText("");
            }
        }catch(Exception e){
           java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null,e);
        }
    }//GEN-LAST:event_dltbtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Management m=new Management();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/powPrint?useSSL=false","root","1510791365peru#&#&");
             PreparedStatement pstm=con.prepareStatement("insert into pet(name,species,breed,age,gender,color,hc)value(?,?,?,?,?,?,?) "); 
            
             pstm.setString(1, pnfld.getText());
             pstm.setString(2, spfld.getText());
             pstm.setString(3, brfld.getText());
             pstm.setString(4, agfld.getText());
             pstm.setString(5, genfld.getText());
             pstm.setString(6, colfld.getText());
             pstm.setString(7, hcfld.getText());
             
             pstm.executeUpdate();
             JOptionPane.showMessageDialog(this, "Record Added");
             updateDB();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void updbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updbtnActionPerformed
         
        DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel();
        int selectedRows=jTable1.getSelectedRow();
        try{
            number=Integer.parseInt(RecordTable.getValueAt(selectedRows, 0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/powPrint?useSSL=false","root","1510791365peru#&#&");
             PreparedStatement pstm=con.prepareStatement("update pet set name = ?,species = ?,breed = ?,age = ?,"
                     + "gender = ?,color = ?,hc = ? where number = ?"); 
             pstm.setInt(8, number);
             pstm.setString(1, pnfld.getText());
             pstm.setString(2, spfld.getText());
             pstm.setString(3, brfld.getText());
             pstm.setString(4, agfld.getText());
             pstm.setString(5, genfld.getText());
             pstm.setString(6, colfld.getText());
             pstm.setString(7, hcfld.getText());
            // pstm.setString(8, );
             
             pstm.executeUpdate();
             JOptionPane.showMessageDialog(this, "Record Updated");
             updateDB();
        }catch(ClassNotFoundException e)
        {
           java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null,e);
        }catch(SQLException e)
        {
           java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null,e);
        }
    }//GEN-LAST:event_updbtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel();
        int selectedRows=jTable1.getSelectedRow();
         
         pnfld.setText(RecordTable.getValueAt(selectedRows, 1).toString());
         spfld.setText(RecordTable.getValueAt(selectedRows, 2).toString());
         brfld.setText(RecordTable.getValueAt(selectedRows, 3).toString());
         agfld.setText(RecordTable.getValueAt(selectedRows, 4).toString());
         genfld.setText(RecordTable.getValueAt(selectedRows, 5).toString());
         colfld.setText(RecordTable.getValueAt(selectedRows, 6).toString());
         hcfld.setText(RecordTable.getValueAt(selectedRows, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void pnfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnfldActionPerformed

    private void srchfldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srchfldKeyReleased
       DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel();
       TableRowSorter<DefaultTableModel>ob= new TableRowSorter<>(RecordTable);
       jTable1.setRowSorter(ob);
       ob.setRowFilter(RowFilter.regexFilter(srchfld.getText()));
    }//GEN-LAST:event_srchfldKeyReleased

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
            java.util.logging.Logger.getLogger(petProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(petProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(petProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(petProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new petProf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField agfld;
    private javax.swing.JTextField brfld;
    private javax.swing.JTextField colfld;
    private javax.swing.JButton dltbtn;
    private javax.swing.JTextField genfld;
    private javax.swing.JTextField hcfld;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pnfld;
    private javax.swing.JButton resbtn;
    private javax.swing.JTextField spfld;
    private javax.swing.JTextField srchfld;
    private javax.swing.JButton updbtn;
    // End of variables declaration//GEN-END:variables
}
