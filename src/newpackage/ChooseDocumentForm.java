/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

/**
 *
 * @author DJay
 */
public class ChooseDocumentForm extends javax.swing.JFrame {

    /**
     * Creates new form ChooseDocumentForm
     */
    public ChooseDocumentForm() {
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
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        brdwebcam = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCOI = new javax.swing.JPanel();
        lblCOI = new javax.swing.JLabel();
        btnCOR = new javax.swing.JPanel();
        lblCOR = new javax.swing.JLabel();
        btnBC = new javax.swing.JPanel();
        lblBC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 32)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(3, 87, 122));
        jLabel13.setText("| Choose Document");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Barangay Fatima 1");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/topnavlogo.png"))); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/topnavbg.png"))); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 85));

        brdwebcam.setBackground(new java.awt.Color(255, 255, 255));
        brdwebcam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        brdwebcam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 20)); // NOI18N
        jLabel11.setText("<html>Pumili ng dokumento na kailangan ng residente.</html>");
        brdwebcam.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 550, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 17)); // NOI18N
        jLabel10.setText("<html>Choose a document that the resident needs.</html>");
        brdwebcam.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 550, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCOI.setBackground(new java.awt.Color(13, 76, 146));
        btnCOI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCOIMouseClicked(evt);
            }
        });

        lblCOI.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 28)); // NOI18N
        lblCOI.setForeground(new java.awt.Color(255, 255, 255));
        lblCOI.setText("Certificate of Indigency");

        javax.swing.GroupLayout btnCOILayout = new javax.swing.GroupLayout(btnCOI);
        btnCOI.setLayout(btnCOILayout);
        btnCOILayout.setHorizontalGroup(
            btnCOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCOILayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lblCOI)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        btnCOILayout.setVerticalGroup(
            btnCOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCOILayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblCOI)
                .addGap(25, 25, 25))
        );

        jPanel3.add(btnCOI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 90));

        btnCOR.setBackground(new java.awt.Color(255, 255, 255));
        btnCOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(13, 76, 146), 3));
        btnCOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCORMouseClicked(evt);
            }
        });

        lblCOR.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 28)); // NOI18N
        lblCOR.setForeground(new java.awt.Color(13, 76, 146));
        lblCOR.setText("Certificate of Residency");

        javax.swing.GroupLayout btnCORLayout = new javax.swing.GroupLayout(btnCOR);
        btnCOR.setLayout(btnCORLayout);
        btnCORLayout.setHorizontalGroup(
            btnCORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCORLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lblCOR)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        btnCORLayout.setVerticalGroup(
            btnCORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCORLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblCOR)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.add(btnCOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 550, 90));

        btnBC.setBackground(new java.awt.Color(13, 76, 146));
        btnBC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBCMouseClicked(evt);
            }
        });

        lblBC.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 28)); // NOI18N
        lblBC.setForeground(new java.awt.Color(255, 255, 255));
        lblBC.setText("Barangay Clearance");

        javax.swing.GroupLayout btnBCLayout = new javax.swing.GroupLayout(btnBC);
        btnBC.setLayout(btnBCLayout);
        btnBCLayout.setHorizontalGroup(
            btnBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBCLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(lblBC)
                .addGap(143, 143, 143))
        );
        btnBCLayout.setVerticalGroup(
            btnBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBCLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblBC)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.add(btnBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 550, 90));

        brdwebcam.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 550, 270));

        jPanel1.add(brdwebcam, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 590, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCOIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCOIMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCOIMouseClicked

    private void btnCORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCORMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCORMouseClicked

    private void btnBCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBCMouseClicked
        // TODO add your handling code here:
        //CameraScanForm csf = new CameraScanForm();
        //csf.show();
    }//GEN-LAST:event_btnBCMouseClicked

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
            java.util.logging.Logger.getLogger(ChooseDocumentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseDocumentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseDocumentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseDocumentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseDocumentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel brdwebcam;
    private javax.swing.JPanel btnBC;
    private javax.swing.JPanel btnCOI;
    private javax.swing.JPanel btnCOR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblBC;
    private javax.swing.JLabel lblCOI;
    private javax.swing.JLabel lblCOR;
    // End of variables declaration//GEN-END:variables
}
