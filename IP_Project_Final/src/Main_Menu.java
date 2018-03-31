import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tejas
 */
public class Main_Menu extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public Main_Menu() {
        initComponents();
        this.setTitle("Game Store - Main Menu");
        this.getContentPane().setBackground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        pdbbtn = new javax.swing.JButton();
        cdbbtn = new javax.swing.JButton();
        search_chg_btn = new javax.swing.JButton();
        signoutbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pdbbtn.setBackground(new java.awt.Color(204, 0, 0));
        pdbbtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        pdbbtn.setForeground(new java.awt.Color(255, 255, 255));
        pdbbtn.setText("View All Platforms");
        pdbbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdbbtnActionPerformed(evt);
            }
        });
        getContentPane().add(pdbbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 440, 80));

        cdbbtn.setBackground(new java.awt.Color(204, 0, 0));
        cdbbtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        cdbbtn.setForeground(new java.awt.Color(255, 255, 255));
        cdbbtn.setText("View All Video Games");
        cdbbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdbbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cdbbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 440, 80));

        search_chg_btn.setBackground(new java.awt.Color(204, 0, 0));
        search_chg_btn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        search_chg_btn.setForeground(new java.awt.Color(255, 255, 255));
        search_chg_btn.setText("Add / Update / Delete Records");
        search_chg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_chg_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_chg_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 440, 80));

        signoutbtn.setBackground(new java.awt.Color(204, 0, 0));
        signoutbtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        signoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        signoutbtn.setText("Sign Out");
        signoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(signoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 440, 70));

        exitbtn.setBackground(new java.awt.Color(204, 0, 0));
        exitbtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("Exit Application");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 440, 70));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Main Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 540, 20));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cdbbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdbbtnActionPerformed
        if (DBApplication.completeDB == null)
            DBApplication.completeDB = new VideoGames_View();
        
        DBApplication.completeDB.clear();
        DBApplication.completeDB.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cdbbtnActionPerformed

    private void signoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutbtnActionPerformed
        int res = jOptionPane1.showConfirmDialog(this,"Are you sure "
                + "you want to log out?");
        if (res == jOptionPane1.YES_OPTION){
        
        if (DBApplication.loginscreen == null)
            DBApplication.loginscreen = new Login_Screen();

        DBApplication.loginscreen.clear();
        DBApplication.loginscreen.setVisible(true);
        this.setVisible(false);}
    }//GEN-LAST:event_signoutbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        int res = jOptionPane1.showConfirmDialog(this,"Are you sure "
                + "you want to exit?");
        if (res == jOptionPane1.YES_OPTION)
            System.exit(0);
        
    }//GEN-LAST:event_exitbtnActionPerformed

    private void pdbbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdbbtnActionPerformed
        if (DBApplication.platformDB == null)
            DBApplication.platformDB = new Platforms_View();
        
        DBApplication.platformDB.clear();
        DBApplication.platformDB.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pdbbtnActionPerformed

    private void search_chg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_chg_btnActionPerformed
        if (DBApplication.isChairman == true) {
            if (DBApplication.searchDB == null)
                DBApplication.searchDB = new Search_Add_Update();
            
            DBApplication.searchDB.setVisible(true);
            this.setVisible(false);
        }
        else
            jOptionPane1.showMessageDialog(this, "This functionality is enabled"
                    + " for Chairman only.");
    }//GEN-LAST:event_search_chg_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cdbbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton pdbbtn;
    private javax.swing.JButton search_chg_btn;
    private javax.swing.JButton signoutbtn;
    // End of variables declaration//GEN-END:variables
}