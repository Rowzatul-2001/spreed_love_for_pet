
package pawprint.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rowzatulzannathprerona
 */
public class Reminder extends javax.swing.JFrame {

    /**
     * Creates new form Reminder
     */
    public Reminder() {
        initComponents();
       addData();
    }

   private void addData()
   {
      DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
      int rc=dtm.getRowCount();
      while(rc--!=0)
      {
          dtm.removeRow(0);
      }
      try{
          FileInputStream f=new FileInputStream("task.txt");
          Scanner sc=new Scanner(f);
          while(true)
          {
              try{
                  Vector row=new Vector();
                  row.add(sc.nextLine());
                  dtm.addRow(row);
              }catch(Exception ex){
                  break;
              }
          }
          f.close();
          sc.close();
      }catch(Exception e)
      {
          System.out.println(e);
      }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        adbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bckbtn = new javax.swing.JButton();
        dltbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Annai MN", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reminder");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 870, 70));

        jLabel2.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Task :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, 40));

        t.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 570, 40));

        adbtn.setBackground(new java.awt.Color(0, 0, 0));
        adbtn.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        adbtn.setForeground(new java.awt.Color(0, 204, 204));
        adbtn.setText("Add");
        adbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adbtnActionPerformed(evt);
            }
        });
        jPanel1.add(adbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 100, 30));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Annai MN", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Task"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 580, 350));

        bckbtn.setBackground(new java.awt.Color(0, 0, 0));
        bckbtn.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        bckbtn.setForeground(new java.awt.Color(0, 204, 204));
        bckbtn.setText("Back");
        bckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bckbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 100, 30));

        dltbtn.setBackground(new java.awt.Color(0, 0, 0));
        dltbtn.setFont(new java.awt.Font("Annai MN", 1, 14)); // NOI18N
        dltbtn.setForeground(new java.awt.Color(0, 204, 204));
        dltbtn.setText("Delete");
        dltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbtnActionPerformed(evt);
            }
        });
        jPanel1.add(dltbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pawprint/manager/doggo and catto.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 210, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tActionPerformed

    private void adbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adbtnActionPerformed
          try{
              FileOutputStream f=new FileOutputStream("task.txt",true);
              PrintStream p=new PrintStream(f);
              String task=t.getText();
              p.println(task);
                JOptionPane.showMessageDialog(null,"Task added");
                addData();
              p.close();
              f.close();
              t.setText(" ");
          }catch(Exception e){
              JOptionPane.showMessageDialog(null,e.getMessage());
          }   
    }//GEN-LAST:event_adbtnActionPerformed

    private void bckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckbtnActionPerformed
            Management m=new Management()  ;
            m.setVisible(true);
            this.setVisible(false);
            
    }//GEN-LAST:event_bckbtnActionPerformed

    private void dltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbtnActionPerformed
         int ri=jTable1.getSelectedRow();
         if(ri!=-1){
             String task=(String)jTable1.getValueAt(ri, 0);
             try{
             FileOutputStream f=new FileOutputStream("temp.txt");
             PrintStream p=new PrintStream(f);
             try{
           FileInputStream ff=new FileInputStream("task.txt");
            Scanner sc=new Scanner(ff);
          while(true)
          {
              try{
                  String s=sc.nextLine();
                  if(!task.equalsIgnoreCase(s))
                p.println(s);
              }catch(Exception ex){
                  break;
              }
          }
          p.close();
          f.close();
          sc.close();
          ff.close();
          File file=new File("task.txt");
          file.delete();
          File tempfile=new File("temp.txt");
          File newfile=new File("task.txt");
          tempfile.renameTo(newfile);
          addData();
      }catch(Exception e)
      {
          System.out.println(e);
      }
             }catch(Exception e){
              JOptionPane.showMessageDialog(null,e.getMessage());
          }   
         }
         else{
             JOptionPane.showMessageDialog(null,"please select a row"); 
         }
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
          
    }//GEN-LAST:event_dltbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reminder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adbtn;
    private javax.swing.JButton bckbtn;
    private javax.swing.JButton dltbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t;
    // End of variables declaration//GEN-END:variables
}
