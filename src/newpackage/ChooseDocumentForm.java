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
        jPanel4 = new javax.swing.JPanel();
        indigencypanel = new javax.swing.JPanel();
        residencypanel = new javax.swing.JPanel();
        clearancepanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Barangay Fatima 1");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/topnavlogo.png"))); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/topnavbg.png"))); // NOI18N
        jLabel18.setText("  ");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 85));

        brdwebcam.setBackground(new java.awt.Color(255, 255, 255));
        brdwebcam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        brdwebcam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 20)); // NOI18N
        jLabel11.setText("<html>Pumili ng dokumento na kailangan ng residente.</html>");
        brdwebcam.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 410, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 17)); // NOI18N
        jLabel10.setText("<html>Choose a document that the resident needs.</html>");
        brdwebcam.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 550, -1));

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
                .addGap(58, 58, 58)
                .addComponent(lblCOI)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        btnCOILayout.setVerticalGroup(
            btnCOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCOILayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblCOI)
                .addGap(25, 25, 25))
        );

        jPanel3.add(btnCOI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 90));

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
                .addGap(58, 58, 58)
                .addComponent(lblCOR)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        btnCORLayout.setVerticalGroup(
            btnCORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCORLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblCOR)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.add(btnCOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 430, 90));

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
            .addGroup(btnBCLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lblBC)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        btnBCLayout.setVerticalGroup(
            btnBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBCLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblBC)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.add(btnBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 430, 90));

        brdwebcam.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 430, 270));

        jPanel1.add(brdwebcam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 470, 390));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indigencypanel.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout indigencypanelLayout = new javax.swing.GroupLayout(indigencypanel);
        indigencypanel.setLayout(indigencypanelLayout);
        indigencypanelLayout.setHorizontalGroup(
            indigencypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        indigencypanelLayout.setVerticalGroup(
            indigencypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1056, Short.MAX_VALUE)
        );

        jPanel4.add(indigencypanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 816, 1056));

        residencypanel.setBackground(new java.awt.Color(255, 51, 204));

        javax.swing.GroupLayout residencypanelLayout = new javax.swing.GroupLayout(residencypanel);
        residencypanel.setLayout(residencypanelLayout);
        residencypanelLayout.setHorizontalGroup(
            residencypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        residencypanelLayout.setVerticalGroup(
            residencypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1056, Short.MAX_VALUE)
        );

        jPanel4.add(residencypanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 816, 1056));

        clearancepanel.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout clearancepanelLayout = new javax.swing.GroupLayout(clearancepanel);
        clearancepanel.setLayout(clearancepanelLayout);
        clearancepanelLayout.setHorizontalGroup(
            clearancepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        clearancepanelLayout.setVerticalGroup(
            clearancepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1056, Short.MAX_VALUE)
        );

        jPanel4.add(clearancepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 816, 1056));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 93, 816, 1056));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCOIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCOIMouseClicked
        // TODO add your handling code here:
        indigencypanel.setVisible(true);
        residencypanel.setVisible(false);
        clearancepanel.setVisible(false);
    }//GEN-LAST:event_btnCOIMouseClicked

    private void btnCORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCORMouseClicked
        // TODO add your handling code here:
        indigencypanel.setVisible(false);
        residencypanel.setVisible(true);
        clearancepanel.setVisible(false);
    }//GEN-LAST:event_btnCORMouseClicked

    private void btnBCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBCMouseClicked
        // TODO add your handling code here:
        indigencypanel.setVisible(false);
        residencypanel.setVisible(false);
        clearancepanel.setVisible(true);
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
    private javax.swing.JPanel clearancepanel;
    private javax.swing.JPanel indigencypanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblBC;
    private javax.swing.JLabel lblCOI;
    private javax.swing.JLabel lblCOR;
    private javax.swing.JPanel residencypanel;
    // End of variables declaration//GEN-END:variables
}
