/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

import java.awt.Color;
import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author DJay
 */
public class ResidentsDataForm extends javax.swing.JFrame {

    /**
     * Creates new form ResidentsDataForm
     */
    public ResidentsDataForm() {
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

        jpBG = new javax.swing.JPanel();
        jpTopnavbg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        lblResidentsData = new javax.swing.JLabel();
        jpRD = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblNavbg = new javax.swing.JLabel();
        registerborder = new javax.swing.JPanel();
        lblRegistration = new javax.swing.JLabel();
        lblLastname = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        lblFirstname = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        lblInitial = new javax.swing.JLabel();
        txtInitial = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblHousenum = new javax.swing.JLabel();
        txtHousenum = new javax.swing.JTextField();
        lblStreet = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblYearstay = new javax.swing.JLabel();
        txtYearstay = new javax.swing.JTextField();
        lblDateofbirth = new javax.swing.JLabel();
        txtDateofbirth = new javax.swing.JTextField();
        lblPlaceofbirth = new javax.swing.JLabel();
        txtPlaceofbirth = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblDefaultimage = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        tableborder = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        residentsTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnGenerate = new javax.swing.JButton();
        jpFooter = new javax.swing.JPanel();
        lblResidentsDataTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jpBG.setBackground(new java.awt.Color(255, 255, 255));
        jpBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTopnavbg.setBackground(new java.awt.Color(255, 255, 255));
        jpTopnavbg.setPreferredSize(new java.awt.Dimension(1440, 90));
        jpTopnavbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Barangay Fatima 1");
        jpTopnavbg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        lblDashboard.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setText("Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        jpTopnavbg.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 23, -1, -1));

        lblResidentsData.setBackground(new java.awt.Color(255, 255, 255));
        lblResidentsData.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        lblResidentsData.setForeground(new java.awt.Color(255, 255, 255));
        lblResidentsData.setText("Residents Data");
        jpTopnavbg.add(lblResidentsData, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 23, -1, -1));

        jpRD.setBackground(new java.awt.Color(104, 185, 225));
        jpRD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpTopnavbg.add(jpRD, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 240, 85));

        lblLogout.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Log Out");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        jpTopnavbg.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1271, 23, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/topnavlogo.png"))); // NOI18N
        jpTopnavbg.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblNavbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/topnavbg.png"))); // NOI18N
        jpTopnavbg.add(lblNavbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpBG.add(jpTopnavbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 90));

        registerborder.setBackground(new java.awt.Color(255, 255, 255));
        registerborder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        registerborder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistration.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        lblRegistration.setForeground(new java.awt.Color(0, 102, 153));
        lblRegistration.setText("Registration Form");
        registerborder.add(lblRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblLastname.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblLastname.setText("Last Name");
        registerborder.add(lblLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtLname.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtLname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, 30));

        lblFirstname.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblFirstname.setText("First Name");
        registerborder.add(lblFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtFname.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtFname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 190, 30));

        lblInitial.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblInitial.setText("Middle Initial");
        registerborder.add(lblInitial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtInitial.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtInitial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtInitial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 30));

        lblAddress.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblAddress.setText("Address");
        registerborder.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        lblHousenum.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblHousenum.setText("House #");
        registerborder.add(lblHousenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txtHousenum.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtHousenum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtHousenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 100, 30));

        lblStreet.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblStreet.setText("Street");
        registerborder.add(lblStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        txtStreet.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtStreet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, 30));

        lblGender.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblGender.setText("Gender");
        registerborder.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        rbtnMale.setBackground(new java.awt.Color(255, 255, 255));
        rbtnMale.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        rbtnMale.setText("Male");
        rbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaleActionPerformed(evt);
            }
        });
        registerborder.add(rbtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        rbtnFemale.setBackground(new java.awt.Color(255, 255, 255));
        rbtnFemale.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        rbtnFemale.setText("Female");
        rbtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemaleActionPerformed(evt);
            }
        });
        registerborder.add(rbtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        lblAge.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblAge.setText("Age");
        registerborder.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        txtAge.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 190, 30));

        lblYearstay.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblYearstay.setText("Years of Stay");
        registerborder.add(lblYearstay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        txtYearstay.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtYearstay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtYearstay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 190, 30));

        lblDateofbirth.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblDateofbirth.setText("Date of birth");
        registerborder.add(lblDateofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        txtDateofbirth.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtDateofbirth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtDateofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 190, 30));

        lblPlaceofbirth.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblPlaceofbirth.setText("Place of birth");
        registerborder.add(lblPlaceofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        txtPlaceofbirth.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtPlaceofbirth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtPlaceofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 190, 30));

        lblContact.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblContact.setText("Contact #");
        registerborder.add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        txtContact.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 190, 30));

        lblDefaultimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/defaultimage.png"))); // NOI18N
        registerborder.add(lblDefaultimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        btnClear.setBackground(new java.awt.Color(13, 76, 146));
        btnClear.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        registerborder.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 140, 40));

        btnUpload.setBackground(new java.awt.Color(13, 76, 146));
        btnUpload.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(255, 255, 255));
        btnUpload.setText("Upload Image");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        registerborder.add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 140, 40));

        btnAdd.setBackground(new java.awt.Color(13, 76, 146));
        btnAdd.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        registerborder.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 140, 40));

        btnUpdate.setBackground(new java.awt.Color(13, 76, 146));
        btnUpdate.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        registerborder.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, 140, 40));

        jpBG.add(registerborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 630, 690));

        tableborder.setBackground(new java.awt.Color(255, 255, 255));
        tableborder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        tableborder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        residentsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(residentsTable);

        tableborder.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 720, 530));

        txtSearch.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        tableborder.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 170, 30));

        lastname.setFont(new java.awt.Font("Microsoft YaHei", 0, 19)); // NOI18N
        lastname.setText("Search");
        tableborder.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        btnDelete.setBackground(new java.awt.Color(13, 76, 146));
        btnDelete.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        tableborder.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 140, 40));

        btnGenerate.setBackground(new java.awt.Color(13, 76, 146));
        btnGenerate.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnGenerate.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerate.setText("Generate I.D");
        tableborder.add(btnGenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 140, 40));

        jpBG.add(tableborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 740, 690));

        jpFooter.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpFooterLayout = new javax.swing.GroupLayout(jpFooter);
        jpFooter.setLayout(jpFooterLayout);
        jpFooterLayout.setHorizontalGroup(
            jpFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        jpFooterLayout.setVerticalGroup(
            jpFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jpBG.add(jpFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 870, 1380, 30));

        lblResidentsDataTitle.setFont(new java.awt.Font("Microsoft YaHei", 1, 32)); // NOI18N
        lblResidentsDataTitle.setForeground(new java.awt.Color(3, 87, 122));
        lblResidentsDataTitle.setText("| Residents Data");
        jpBG.add(lblResidentsDataTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        // TODO add your handling code here:
        DashboardForm df = new DashboardForm();
        df.show();
        
        dispose();
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void rbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaleActionPerformed
        // TODO add your handling code here:
        gender = "Male";
        if(rbtnMale.isSelected()){
            rbtnFemale.setSelected(false);
        }
    }//GEN-LAST:event_rbtnMaleActionPerformed

    private void rbtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemaleActionPerformed
        // TODO add your handling code here:
        gender = "Female";
        if(rbtnFemale.isSelected()){
            rbtnMale.setSelected(false);
        }
    }//GEN-LAST:event_rbtnFemaleActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LogInForm lif = new LogInForm();
        lif.show();
        
        dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        String filename = file.getAbsolutePath();
        ImageIcon imgIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblDefaultimage.getWidth(), lblDefaultimage.getHeight(), Image.SCALE_SMOOTH));
        lblDefaultimage.setIcon(imgIcon);
        
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtLname.setText("");
        txtFname.setText("");
        txtInitial.setText("");
        txtHousenum.setText("");
        txtStreet.setText("");
        rbtnMale.setSelected(false);
        rbtnFemale.setSelected(false);
        txtAge.setText("");
        txtYearstay.setText("");
        lblDefaultimage.setIcon(new ImageIcon ("C:\\Users\\Reymart\\Documents\\GitHub\\document-fill-up-automation-system\\src\\assets\\defaultimage.png"));
        txtDateofbirth.setText("");
        txtPlaceofbirth.setText("");
        txtContact.setText("");
        
        
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(ResidentsDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentsDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentsDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentsDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentsDataForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBG;
    private javax.swing.JPanel jpFooter;
    private javax.swing.JPanel jpRD;
    private javax.swing.JPanel jpTopnavbg;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDateofbirth;
    private javax.swing.JLabel lblDefaultimage;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHousenum;
    private javax.swing.JLabel lblInitial;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblNavbg;
    private javax.swing.JLabel lblPlaceofbirth;
    private javax.swing.JLabel lblRegistration;
    private javax.swing.JLabel lblResidentsData;
    private javax.swing.JLabel lblResidentsDataTitle;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblYearstay;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JPanel registerborder;
    private javax.swing.JTable residentsTable;
    private javax.swing.JPanel tableborder;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDateofbirth;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtHousenum;
    private javax.swing.JTextField txtInitial;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPlaceofbirth;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtYearstay;
    // End of variables declaration//GEN-END:variables
    private String gender;
    private byte[] resident_image = null;
}

