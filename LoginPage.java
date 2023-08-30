
package pawprint.manager;
import java.sql.*;
import javax.swing.JOptionPane;
public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
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

        unfield = new javax.swing.JTextField();
        pfield = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unfield.setFont(new java.awt.Font("Annai MN", 1, 24)); // NOI18N
        unfield.setBorder(null);
        unfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unfieldActionPerformed(evt);
            }
        });
        getContentPane().add(unfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 290, 40));

        pfield.setFont(new java.awt.Font("Annai MN", 1, 24)); // NOI18N
        pfield.setBorder(null);
        getContentPane().add(pfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 290, 40));

        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 100, 50));

        backbtn.setContentAreaFilled(false);
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 80, 50));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Annai MN", 1, 24)); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 430, 110, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pawprint/manager/LoginPage.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unfieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/powPrint?useSSL=false","root","1510791365peru#&#&");
            String username=unfield.getText();
            String password=pfield.getText();
            
            
            Statement stm=con.createStatement();
            String sql="select * from login where username='"+username+"'and password='"+password+"'";
            ResultSet rs=stm.executeQuery(sql);
            
            if(rs.next())
            {
                dispose();
                
                Management mp=new Management();
                mp.show();
            }
            else{
                JOptionPane.showMessageDialog(this,"username or password is wrong");
            }
            con.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
       Openingpage op=new Openingpage();
       op.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        unfield.setText("");
        pfield.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPasswordField pfield;
    public static javax.swing.JTextField unfield;
    // End of variables declaration//GEN-END:variables
}
