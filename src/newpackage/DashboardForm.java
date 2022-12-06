/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

/**
 *
 * @author DJay
 */
public class DashboardForm extends javax.swing.JFrame {

    /**
     * Creates new form DashboardForm
     */
    public DashboardForm() {
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

        jpBackground = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblResidentsData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblQr = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnscanqrcode = new javax.swing.JButton();
        btnuploadqrcode = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Document Fill-Up Automation System - Dashboard");

        jpBackground.setBackground(new java.awt.Color(255, 255, 255));
        jpBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Barangay Fatima 1");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        lblResidentsData.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30)); // NOI18N
        lblResidentsData.setForeground(new java.awt.Color(255, 255, 255));
        lblResidentsData.setText("Residents Data");
        lblResidentsData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResidentsDataMouseClicked(evt);
            }
        });
        jPanel6.add(lblResidentsData, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 23, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/topnavlogo.png"))); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblLogout.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Log Out");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        jPanel6.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1271, 23, -1, -1));

        lblDashboard.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setText("Dashboard");
        jPanel6.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 23, -1, -1));

        jPanel8.setBackground(new java.awt.Color(104, 185, 225));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 240, 85));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/topnavbg.png"))); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpBackground.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 85));

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 32)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(3, 87, 122));
        jLabel13.setText("| Dashboard");
        jpBackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQr.setBackground(new java.awt.Color(102, 102, 102));
        lblQr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/qrlogo.png"))); // NOI18N
        jPanel2.add(lblQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 150));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 17)); // NOI18N
        jLabel10.setText("<html>This application processes document by using QR code technology.</html>");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 420, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 23)); // NOI18N
        jLabel11.setText("<html>Ang application na ito ay nagpo-proseso ng mga dokumento sa pamamagitan ng QR code.</html>");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 420, -1));

        jpBackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 590, 180));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(3, 87, 122));
        jLabel14.setText("Scan QR Code");
        jpBackground.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 0, 17)); // NOI18N
        jLabel12.setText("<html>Start processing documents by scanning resident QR code.</html>");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 550, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 1, 23)); // NOI18N
        jLabel15.setText("<html>Simulan ang pag-proseso ng mga dokumento sa pag-scan ng QR code ng residente.</html>");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 550, -1));

        btnscanqrcode.setBackground(new java.awt.Color(13, 76, 146));
        btnscanqrcode.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20)); // NOI18N
        btnscanqrcode.setForeground(new java.awt.Color(255, 255, 255));
        btnscanqrcode.setText("Scan QR Code");
        btnscanqrcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscanqrcodeActionPerformed(evt);
            }
        });
        jPanel5.add(btnscanqrcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 307, 70));

        btnuploadqrcode.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20)); // NOI18N
        btnuploadqrcode.setForeground(new java.awt.Color(13, 76, 146));
        btnuploadqrcode.setText("Upload QR Code Image");
        btnuploadqrcode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(13, 76, 146), 3, true));
        jPanel5.add(btnuploadqrcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 307, 70));

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        jLabel16.setText("Upload QR code if camera is unavailable");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jpBackground.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 413, 590, 456));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(3, 87, 122));
        jLabel7.setText("Transaction History");
        jpBackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 640));

        jpBackground.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 750, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpBackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 870, 1440, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblResidentsDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResidentsDataMouseClicked
        // TODO add your handling code here:
        ResidentsDataForm rdf = new ResidentsDataForm();
        rdf.show();
        
        dispose();
    }//GEN-LAST:event_lblResidentsDataMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LogInForm lif = new LogInForm();
        lif.show();
        
        dispose();
        
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void btnscanqrcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscanqrcodeActionPerformed
        // TODO add your handling code here:
        CameraScanForm csf = new CameraScanForm();
        csf.show();
    }//GEN-LAST:event_btnscanqrcodeActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnscanqrcode;
    private javax.swing.JButton btnuploadqrcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQr;
    private javax.swing.JLabel lblResidentsData;
    // End of variables declaration//GEN-END:variables
}
