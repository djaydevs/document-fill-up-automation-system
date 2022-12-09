/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DJay
 */
public class LogInForm extends javax.swing.JFrame {

    /**
     * Creates new form LogInForm
     */
    public LogInForm() {
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

        jPanel1 = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        lbforgotpass = new javax.swing.JLabel();
        etuname = new javax.swing.JTextField();
        line = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        icpass = new javax.swing.JLabel();
        lbpass = new javax.swing.JLabel();
        icuname = new javax.swing.JLabel();
        lbuname = new javax.swing.JLabel();
        lblogin = new javax.swing.JLabel();
        lbtitle = new javax.swing.JLabel();
        lbbrgy = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        loginbg = new javax.swing.JLabel();
        etpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogin.setBackground(new java.awt.Color(13, 76, 146));
        btnlogin.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setLabel("LOG IN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1134, 624, 237, 73));

        lbforgotpass.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        lbforgotpass.setForeground(new java.awt.Color(104, 185, 225));
        lbforgotpass.setText("<html><p><u>Forgot Password?</u></p></html>");
        jPanel1.add(lbforgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 850, -1, -1));

        etuname.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        etuname.setBorder(null);
        etuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etunameActionPerformed(evt);
            }
        });
        jPanel1.add(etuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 325, 500, 70));

        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginline.png"))); // NOI18N
        jPanel1.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 396, -1, -1));

        line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginline.png"))); // NOI18N
        jPanel1.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, -1, -1));

        icpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconlock.png"))); // NOI18N
        jPanel1.add(icpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 495, -1, -1));

        lbpass.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        lbpass.setForeground(new java.awt.Color(3, 87, 122));
        lbpass.setText("Password");
        jPanel1.add(lbpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 447, -1, -1));

        icuname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconperson.png"))); // NOI18N
        jPanel1.add(icuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 316, -1, -1));

        lbuname.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        lbuname.setForeground(new java.awt.Color(3, 87, 122));
        lbuname.setText("Username");
        jPanel1.add(lbuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 274, -1, -1));

        lblogin.setFont(new java.awt.Font("Microsoft YaHei", 1, 48)); // NOI18N
        lblogin.setForeground(new java.awt.Color(3, 87, 122));
        lblogin.setText("Log In");
        jPanel1.add(lblogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 177, -1, -1));

        lbtitle.setFont(new java.awt.Font("Microsoft YaHei", 1, 48)); // NOI18N
        lbtitle.setForeground(new java.awt.Color(12, 57, 107));
        lbtitle.setText("<html><p><center>DOCUMENT FILL-UP<br>AUTOMATION SYSTEM</center></p></html>");
        jPanel1.add(lbtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 430, -1, -1));

        lbbrgy.setFont(new java.awt.Font("Microsoft YaHei", 1, 40)); // NOI18N
        lbbrgy.setForeground(new java.awt.Color(255, 255, 255));
        lbbrgy.setText("BARANGAY FATIMA 1");
        jPanel1.add(lbbrgy, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 300, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginlogo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 76, -1, -1));

        loginbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginbg.png"))); // NOI18N
        jPanel1.add(loginbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        etpass.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        etpass.setBorder(null);
        etpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                etpassKeyPressed(evt);
            }
        });
        jPanel1.add(etpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 490, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void etunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etunameActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        if (etuname.getText().equals("") || (etpass.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Please enter username and password"); 
        } else 
        {
            try {
            //connection string and statement query
           Connection conn = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
           PreparedStatement pst = conn.prepareStatement("SELECT * FROM tbl_users WHERE username=? AND password=?");
           pst.setString(1, etuname.getText());
           pst.setString(2, etpass.getText());
           ResultSet rs = pst.executeQuery();
               
               if (rs.next()) {
                   JOptionPane.showMessageDialog(this, "login Succesfully");
                   new DashboardForm().show();
                   this.dispose();
               }else {
                   etuname.setText("");
                   etpass.setText("");
                   JOptionPane.showMessageDialog(this, "username or password is incorrect");
               }          
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
       }
    }//GEN-LAST:event_btnloginActionPerformed

    private void etpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etpassKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                if (etuname.getText().equals("") || (etpass.getText().equals(""))) {
                JOptionPane.showMessageDialog(this, "Please enter username and password"); 
            } else 
            {
                try {
                //connection string and statement query
               Connection conn = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
               PreparedStatement pst = conn.prepareStatement("SELECT * FROM tbl_users WHERE username=? AND password=?");
               pst.setString(1, etuname.getText());
               pst.setString(2, etpass.getText());
               ResultSet rs = pst.executeQuery();

                   if (rs.next()) {
                       JOptionPane.showMessageDialog(this, "login Succesfully");
                       new DashboardForm().show();
                       this.dispose();
                   }else {
                       etuname.setText("");
                       etpass.setText("");
                       JOptionPane.showMessageDialog(this, "username or password is incorrect");
                   }          
           } catch (SQLException e) {
               JOptionPane.showMessageDialog(this, e.getMessage());
           }
           }
        } 
    }//GEN-LAST:event_etpassKeyPressed

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
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JPasswordField etpass;
    private javax.swing.JTextField etuname;
    private javax.swing.JLabel icpass;
    private javax.swing.JLabel icuname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbbrgy;
    private javax.swing.JLabel lbforgotpass;
    private javax.swing.JLabel lblogin;
    private javax.swing.JLabel lbpass;
    private javax.swing.JLabel lbtitle;
    private javax.swing.JLabel lbuname;
    private javax.swing.JLabel line;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel loginbg;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
