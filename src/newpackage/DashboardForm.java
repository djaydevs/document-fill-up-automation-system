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
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblQr = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblBC = new javax.swing.JLabel();
        lblCOI = new javax.swing.JLabel();
        lblCOR = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jPanel6.add(lblResidentsData, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/topnavlogo.png"))); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblLogout.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Log Out");
        jPanel6.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 30, -1, -1));

        lblDashboard.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setText("Dashboard");
        jPanel6.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/topnavbg.png"))); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpBackground.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 85));

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 32)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(3, 87, 122));
        jLabel13.setText("| Dashboard");
        jpBackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQr.setBackground(new java.awt.Color(102, 102, 102));
        lblQr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/defaultimage.png"))); // NOI18N
        lblQr.setText("jLabel8");
        jPanel2.add(lblQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 149, 120));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        jLabel10.setText("Choose from the list of documents that will be process, then start scanning residents QR code.");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        jLabel11.setText("Pumili ng dokumentong kailangan i-proseso bago magpatuloy sa pag-scan ng QR code ng residente. ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jpBackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1360, 160));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(3, 87, 122));
        jLabel14.setText("List of documents");
        jpBackground.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBC.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 35)); // NOI18N
        lblBC.setText("Barangay Clearance");
        jPanel3.add(lblBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        lblCOI.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 35)); // NOI18N
        lblCOI.setText("Certificate of Indigency");
        jPanel3.add(lblCOI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lblCOR.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 35)); // NOI18N
        lblCOR.setText("Certificate of Residency");
        jPanel3.add(lblCOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jPanel5.setBackground(new java.awt.Color(104, 185, 225));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 1, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 540, -1));

        jPanel7.setBackground(new java.awt.Color(104, 185, 225));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 1, true));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 188, 540, -1));

        jpBackground.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 540, 270));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(3, 87, 122));
        jLabel7.setText("Transaction History");
        jpBackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 490));

        jpBackground.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 730, 510));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JLabel lblBC;
    private javax.swing.JLabel lblCOI;
    private javax.swing.JLabel lblCOR;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQr;
    private javax.swing.JLabel lblResidentsData;
    // End of variables declaration//GEN-END:variables
}
