package pawprint.manager;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Encyclopedia extends javax.swing.JFrame {

    
    Connection con;
    
    
    public Encyclopedia() {
        try {
            initComponents();
            
            Searchbutton.addActionListener(this::SearchbuttonActionPerformed);

            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/powPrint?useSSL=false","root","1510791365peru#&#&");
        } catch (SQLException ex) {
            Logger.getLogger(Encyclopedia.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Showresult = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Searchbutton = new javax.swing.JButton();
        Searchbar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(0, 153, 255));
        BackButton.setFont(new java.awt.Font("Amatic SC", 1, 36)); // NOI18N
        BackButton.setText("Go back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1022, 610, 210, 50));

        Showresult.setColumns(20);
        Showresult.setFont(new java.awt.Font("Amatic SC", 1, 36)); // NOI18N
        Showresult.setRows(5);
        jScrollPane1.setViewportView(Showresult);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 1050, 380));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Searchbutton.setBackground(new java.awt.Color(51, 153, 255));
        Searchbutton.setFont(new java.awt.Font("Amatic SC", 1, 36)); // NOI18N
        Searchbutton.setText("Search");
        Searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 80, 170, 50));

        Searchbar.setFont(new java.awt.Font("Amatic SC", 1, 36)); // NOI18N
        Searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbarActionPerformed(evt);
            }
        });
        jPanel1.add(Searchbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 820, 70));

        jLabel1.setFont(new java.awt.Font("Annai MN", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Disease Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 160, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pawprint/manager/doggo and catto.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 240, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbarActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_SearchbarActionPerformed

    private void SearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbuttonActionPerformed
        // TODO add your handling code here:
        
        
 
    String searchTerm = Searchbar.getText().trim();
    
    if (!searchTerm.isEmpty()) {
        try {
            PreparedStatement statement = con.prepareStatement("SELECT * FROM ENCYCLOPEDIA WHERE ISSUES LIKE ?");
            statement.setString(1, "%" + searchTerm + "%");
            ResultSet resultSet = statement.executeQuery();
            
            Showresult.setText(""); // Clear previous results
            
            while (resultSet.next()) {
                String issues = resultSet.getString("ISSUES");
                String symptoms = resultSet.getString("SYMPTOMS");
                String prevention = resultSet.getString("PREVENTION");
                String treatment = resultSet.getString("TREATMENT");
                String firstAid = resultSet.getString("FIRSTAID");
                
                Showresult.append("Issues: " + issues + "\n");
                Showresult.append("Symptoms: " + symptoms + "\n");
                Showresult.append("Prevention: " + prevention + "\n");
                Showresult.append("Treatment: " + treatment + "\n");
                Showresult.append("First Aid: " + firstAid + "\n\n");
            }
            
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error searching the database.");
        }
    } else {
        Showresult.setText("Please enter a search term.");  
    }//GEN-LAST:event_SearchbuttonActionPerformed
    }
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        Management m=new Management();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(Encyclopedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encyclopedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encyclopedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encyclopedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encyclopedia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField Searchbar;
    private javax.swing.JButton Searchbutton;
    private javax.swing.JTextArea Showresult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
