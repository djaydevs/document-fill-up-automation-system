/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.*;
import java.nio.file.FileSystems;
import static java.nio.file.Files.write;
import java.nio.file.Path;
import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;
import java.io.File;
import java.io.FileInputStream;
import static java.lang.String.format;
import javax.imageio.ImageIO;

public class ResidentsDataForm extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    String gender;
    String filename = null;
    byte[] resident_image;
    private ImageIcon format = null;

    public ResidentsDataForm() {
        initComponents();
        show_resident();
        populationCount();
        generateIDPanel.setVisible(false);
    }  
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
        lblPlaceofbirth = new javax.swing.JLabel();
        txtPlaceofbirth = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDefaultimage = new javax.swing.JLabel();
        invalid = new javax.swing.JLabel();
        date_chooser = new com.toedter.calendar.JDateChooser();
        btnUpdateRIN = new javax.swing.JButton();
        btnDeleteRIN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tableborder = new javax.swing.JPanel();
        btnGenerate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResidents = new javax.swing.JTable();
        lblPopulation = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lastname1 = new javax.swing.JLabel();
        txtSearchtable = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jpFooter = new javax.swing.JPanel();
        lblResidentsDataTitle = new javax.swing.JLabel();
        generateIDPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch2 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnClear2 = new javax.swing.JButton();
        printID = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        printPanel = new javax.swing.JPanel();
        lblQrCode = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rinLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblAge2 = new javax.swing.JLabel();
        lblContact2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jpBG.setBackground(new java.awt.Color(255, 255, 255));
        jpBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTopnavbg.setBackground(new java.awt.Color(255, 255, 255));
        jpTopnavbg.setPreferredSize(new java.awt.Dimension(1440, 90));
        jpTopnavbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30)); // NOI18N
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
        jpTopnavbg.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 3, -1, 80));

        lblResidentsData.setBackground(new java.awt.Color(255, 255, 255));
        lblResidentsData.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        lblResidentsData.setForeground(new java.awt.Color(255, 255, 255));
        lblResidentsData.setText("Residents Data");
        jpTopnavbg.add(lblResidentsData, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 3, 220, 80));

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
        jpTopnavbg.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1271, 3, -1, 80));

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
        txtHousenum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHousenum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtHousenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 100, 30));

        lblStreet.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblStreet.setText("Street");
        registerborder.add(lblStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        txtStreet.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtStreet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        registerborder.add(lblDateofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        lblPlaceofbirth.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblPlaceofbirth.setText("Place of birth");
        registerborder.add(lblPlaceofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        txtPlaceofbirth.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtPlaceofbirth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        registerborder.add(txtPlaceofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 190, 30));

        lblContact.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblContact.setText("Contact #");
        registerborder.add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, -1, -1));

        txtContact.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
        });
        registerborder.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 190, 30));

        btnClear.setBackground(new java.awt.Color(13, 76, 146));
        btnClear.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        registerborder.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 660, 140, 40));

        btnUpload.setBackground(new java.awt.Color(13, 76, 146));
        btnUpload.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(255, 255, 255));
        btnUpload.setText("Upload Image");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        registerborder.add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, 40));

        btnAdd.setBackground(new java.awt.Color(13, 76, 146));
        btnAdd.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        registerborder.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 140, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDefaultimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/defaultimage.png"))); // NOI18N
        jPanel1.add(lblDefaultimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 150));

        registerborder.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 170, 170));

        invalid.setForeground(new java.awt.Color(255, 0, 0));
        registerborder.add(invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, -1, -1));

        date_chooser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 98, 130), 2, true));
        registerborder.add(date_chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 190, 30));

        btnUpdateRIN.setBackground(new java.awt.Color(13, 76, 146));
        btnUpdateRIN.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btnUpdateRIN.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateRIN.setText("Update ");
        btnUpdateRIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRINActionPerformed(evt);
            }
        });
        registerborder.add(btnUpdateRIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 140, 40));

        btnDeleteRIN.setBackground(new java.awt.Color(13, 76, 146));
        btnDeleteRIN.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btnDeleteRIN.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteRIN.setText("Delete");
        btnDeleteRIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRINActionPerformed(evt);
            }
        });
        registerborder.add(btnDeleteRIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, 140, 40));

        jLabel12.setText("Update and Delete using RIN");
        registerborder.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, -1, -1));

        jpBG.add(registerborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 540, 720));

        tableborder.setBackground(new java.awt.Color(255, 255, 255));
        tableborder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        tableborder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerate.setBackground(new java.awt.Color(13, 76, 146));
        btnGenerate.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnGenerate.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerate.setText("Generate I.D");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });
        tableborder.add(btnGenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 140, 40));

        tblResidents.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 1, true));
        tblResidents.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        tblResidents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RIN", "Last Name", "First Name", "MI", "House #", "Street", "Gender", "Age", "Year of Stay", "Birthday", "Birhplace", "Contact #"
            }
        ));
        tblResidents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResidentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResidents);

        tableborder.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 810, 530));

        lblPopulation.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblPopulation.setForeground(new java.awt.Color(0, 102, 153));
        lblPopulation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPopulation.setToolTipText("");
        tableborder.add(lblPopulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 690, 30, 20));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("POPULATION :");
        jLabel4.setToolTipText("");
        tableborder.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 110, 40));

        txtSearch.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 130), 2));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        tableborder.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 30));

        lastname1.setFont(new java.awt.Font("Microsoft YaHei", 0, 19)); // NOI18N
        lastname1.setText("Enter RIN :");
        tableborder.add(lastname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtSearchtable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 98, 130), 2, true));
        txtSearchtable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchtableKeyReleased(evt);
            }
        });
        tableborder.add(txtSearchtable, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 130, 30));

        lblSearch.setFont(new java.awt.Font("Microsoft YaHei", 0, 19)); // NOI18N
        lblSearch.setText("Search");
        tableborder.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(13, 76, 146));
        btnUpdate.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        tableborder.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 140, 40));

        btnDelete.setBackground(new java.awt.Color(13, 76, 146));
        btnDelete.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        tableborder.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 140, 40));

        jLabel22.setText("Update and Delete using table click");
        tableborder.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, -1, -1));

        jpBG.add(tableborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 830, 720));

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

        generateIDPanel.setBackground(new java.awt.Color(255, 255, 255));
        generateIDPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        generateIDPanel.setPreferredSize(new java.awt.Dimension(1440, 815));
        generateIDPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 3, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel2.setText("Enter RIN :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        txtSearch2.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtSearch2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 98, 130), 2, true));
        txtSearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch2KeyReleased(evt);
            }
        });
        jPanel3.add(txtSearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 190, 40));

        btnSearch.setBackground(new java.awt.Color(13, 76, 146));
        btnSearch.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 120, 40));

        btnClear2.setBackground(new java.awt.Color(13, 76, 146));
        btnClear2.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        btnClear2.setForeground(new java.awt.Color(255, 255, 255));
        btnClear2.setText("Clear");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 110, 40));

        printID.setBackground(new java.awt.Color(13, 76, 146));
        printID.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        printID.setForeground(new java.awt.Color(255, 255, 255));
        printID.setText("SAVE OR PRINT ID");
        printID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printIDActionPerformed(evt);
            }
        });
        jPanel3.add(printID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 230, 40));

        jButton2.setBackground(new java.awt.Color(13, 76, 146));
        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 40));

        printPanel.setBackground(new java.awt.Color(255, 255, 255));
        printPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 185, 225), 2, true));
        printPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQrCode.setBackground(new java.awt.Color(102, 102, 102));
        lblQrCode.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        lblQrCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQrCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblQrCode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        printPanel.add(lblQrCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 200));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Contact :");
        printPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 80, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Barangay Fatima 1, CSJDM Bulacan, Philippines");
        printPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 580, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Resident Profiling Identification Card");
        printPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, 30));

        rinLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        rinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rinLabel.setText("RIN");
        printPanel.add(rinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 200, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Sex :");
        printPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 80, 30));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Age :");
        printPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 80, 30));

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Address");
        printPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 80, 30));

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Name :");
        printPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 80, 30));

        lblSex.setFont(new java.awt.Font("Microsoft YaHei", 0, 17)); // NOI18N
        lblSex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        printPanel.add(lblSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 190, 30));

        lblAge2.setFont(new java.awt.Font("Microsoft YaHei", 0, 17)); // NOI18N
        lblAge2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        printPanel.add(lblAge2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 190, 30));

        lblContact2.setFont(new java.awt.Font("Microsoft YaHei", 0, 17)); // NOI18N
        lblContact2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        printPanel.add(lblContact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 240, 30));

        lblName.setFont(new java.awt.Font("Microsoft YaHei", 0, 17)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        printPanel.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 220, 30));

        addressLbl.setFont(new java.awt.Font("Microsoft YaHei", 0, 17)); // NOI18N
        addressLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        printPanel.add(addressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 230, 30));

        jPanel3.add(printPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 340));

        generateIDPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 620, 480));

        jpBG.add(generateIDPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 1440, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public class Resident {
        private int rin;
        private String l_name, f_name, mi, house_number, street, gender, age,
                year_of_stay,birthday, birthplace, contact_number;
        private byte[] picture;
        public Resident (int rin, String l_name, String f_name, String mi, 
                String house_number, String street, String gender, String age,
                String year_of_stay,String birthday, String birthplace, 
                String contact_number, byte[]image)
        {
            this.rin=rin;
            this.l_name=l_name;
            this.f_name=f_name;
            this.mi=mi;
            this.house_number=house_number;
            this.street=street;
            this.gender=gender;
            this.age=age;
            this.year_of_stay=year_of_stay;
            this.birthday=birthday;
            this.birthplace=birthplace;
            this.contact_number=contact_number;
            this.picture=image;
        }
        public int getrin(){
            return rin;
        }

        public void setrin(int Rin) {
            rin = Rin;
        }

        public String getl_name(){
            return l_name;
        }

        public void setl_name (String l_Name) {
            l_name = l_Name;
        }

        public String getf_name(){
            return f_name;
        }

        public void setf_name (String f_Name) {
            f_name = f_Name;
        }

        public String getmi(){
            return mi;
        }

        public void setmi (String MI) {
            mi = MI;
        }

        public String gethouse_number(){
            return house_number;
        }

        public void sethouse_number (String house_Number) {
            house_number = house_Number;
        }

        public String getstreet(){
            return street;
        }

        public void setstreet (String Street) {
            street = Street;
        }

        public String getgender(){
            return gender;
        }

        public void setgender (String Gender) {
            gender = Gender;
        }

        public String getage(){
            return age;
        }

        public void setage (String Age) {
            age = Age;
        }

        public String getyear_of_stay(){
            return year_of_stay;
        }

        public void setyear_of_stay (String Year_Of_Stay) {
            year_of_stay = Year_Of_Stay;
        }

        public String getbirthday(){
            return birthday;
        }

        public void setbirthday (String Birthday) {
            birthday = Birthday;
        }

        public String getbirthplace(){
            return birthplace;
        }

        public void setbirthplace (String BirthPlace) {
            birthplace = BirthPlace;
        }

        public String getcontact_number(){
            return contact_number;
        }

        public void setcontact_number (String Contact_Number) {
            contact_number = Contact_Number;
        }

        public byte[] getImage(){
            return picture;
        }

        public void setImage (byte[] Image) {
            picture = Image;
        }
    }
    public ArrayList<Resident> residentList(){
        ArrayList<Resident> residentsList = new ArrayList<>();
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
            String sql = "SELECT *FROM ROOT.TBL_RESIDENTS";
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql); 
            Resident resident;
            while(rs.next()){
                resident = new Resident(rs.getInt("rin"),rs.getString("l_name"),rs.getString("f_name"),rs.getString("mi"),rs.getString("house_number"),rs.getString("street"),
                rs.getString("gender"),rs.getString("age"),rs.getString("year_of_stay"),rs.getString("birthday"), rs.getString("birthplace"),rs.getString("contact_number"),rs.getBytes("profile"));
                residentsList.add(resident);
            }    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return residentsList; 
    }
    public void show_resident(){
        ArrayList<Resident> list = residentList();
        DefaultTableModel model = (DefaultTableModel)tblResidents.getModel();
        Object[] row = new Object[12];
        
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getrin();
            row[1]=list.get(i).getl_name();
            row[2]=list.get(i).getf_name();
            row[3]=list.get(i).getmi();
            row[4]=list.get(i).gethouse_number();        
            row[5]=list.get(i).getstreet();        
            row[6]=list.get(i).getgender() ;       
            row[7]=list.get(i).getage();       
            row[8]=list.get(i).getyear_of_stay();       
            row[9]=list.get(i).getbirthday();     
            row[10]=list.get(i).getbirthplace();
            row[11]=list.get(i).getcontact_number();
            model.addRow(row);
        }
    }
    private void populationCount(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
            String sql = "SELECT COUNT(rin) FROM ROOT.TBL_RESIDENTS";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               int sum = rs.getInt(1);
               String str = String.valueOf(sum);
               lblPopulation.setText(str);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
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
    private JFrame logout;
    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here: 
        logout = new JFrame("Log Out");
        if(JOptionPane.showConfirmDialog(logout,"Are you sure you want to Logout?","Message",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            LogInForm lif = new LogInForm();
            lif.show();
            dispose();
        }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblDefaultimage.getWidth(),lblDefaultimage.getHeight(),Image.SCALE_SMOOTH));
        lblDefaultimage.setIcon(imageIcon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            for(int readNum; (readNum = fis.read(buff)) != -1;){
                bos.write(buff,0,readNum);
            }
            resident_image=bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_btnUploadActionPerformed
    
    private void printID (JPanel panel){
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print ID");
        printerJob.setPrintable(new Printable(){
            @Override
            public int print (Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if(pageIndex > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D graphics2D = (Graphics2D)graphics;
                graphics2D.translate(pageFormat.getImageableX()*3, pageFormat.getImageableY()*3);
                graphics2D.scale(0.5,0.5);
                
                panel.paint(graphics2D);
                
                return Printable.PAGE_EXISTS;
            }
         });
        
        boolean returningResult = printerJob.printDialog();
        if(returningResult){
            try{
                printerJob.print();
            }catch(PrinterException printerException){
                JOptionPane.showMessageDialog(this, "Print Error:" + printerException.getMessage());
            }
        }   
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtLname.setText("");
        txtFname.setText("");
        txtInitial.setText("");
        txtHousenum.setText("");
        txtStreet.setText("");
        rbtnMale.setSelected(false);
        rbtnFemale.setSelected(false);
        txtAge.setText("");
        txtYearstay.setText("");
        date_chooser.setCalendar(null);
        txtPlaceofbirth.setText("");
        txtContact.setText("");
        lblDefaultimage.setIcon(new ImageIcon ("D:\\Documents\\NetbeansProject\\DocFillUpAutomationSystem\\src\\assets\\defaultimage.png"));       
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        // TODO add your handling code here:
        String contactNo = txtContact.getText();
        int length = contactNo.length();
        
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            if(length<11){
                txtContact.setEditable(true);
                invalid.setText("");  
            }else{
                txtContact.setEditable(false);
            }
        }else{
            if(evt.getExtendedKeyCode () == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE){
                txtContact.setEditable(true);
            }else{
                txtContact.setEditable(false);
                invalid.setText("Invalid input");
            }
        }  
    }//GEN-LAST:event_txtContactKeyPressed
//Change the filepath     
private String filepath = "D:\\Documents\\NetBeansProjects\\DocFillUpAutomationSystem\\generated_qr";    
        
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try{
            //generate the qr code and save it to temporay file
            String qrCode = filepath + txtLname.getText() + "," + txtFname.getText() + "-QRCODE.png";
            QRCodeWriter writer = new QRCodeWriter();
            BitMatrix bitMatrix = writer.encode(txtFname.getText() + " " +
               txtInitial.getText() + ". " + txtLname.getText() + ";" + txtAge.getText() + 
               ";" + txtHousenum.getText() + " " + txtStreet.getText() + 
               ";" + txtYearstay.getText(), BarcodeFormat.QR_CODE, 200, 200);

            Path path = FileSystems.getDefault().getPath(qrCode);
            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
          
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
            String sql = "INSERT INTO ROOT.TBL_RESIDENTS (l_name,f_name,mi,house_number,street,gender,age,year_of_stay,birthday,birthplace,contact_number,profile,qr_code) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, txtLname.getText());
            ps.setString(2, txtFname.getText());
            ps.setString(3, txtInitial.getText());
            ps.setString(4, txtHousenum.getText());
            ps.setString(5, txtStreet.getText());
            ps.setString(6, gender);
            ps.setString(7, txtAge.getText());
            ps.setString(8, txtYearstay.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(date_chooser.getDate());
            ps.setString(9, date);
            ps.setString(10, txtPlaceofbirth.getText());
            ps.setString(11, txtContact.getText());
            ps.setBytes(12,resident_image);
            
            File imgFile = new File(qrCode);
            FileInputStream fin = new FileInputStream(imgFile);
            ps.setBinaryStream(13, fin, (int) imgFile.length());  
            
            txtLname.setText("");
            txtFname.setText("");
            txtInitial.setText("");
            txtHousenum.setText("");
            txtStreet.setText("");
            rbtnMale.setSelected(false);
            rbtnFemale.setSelected(false);
            txtAge.setText("");
            txtYearstay.setText("");
            date_chooser.setCalendar(null);
            txtPlaceofbirth.setText("");
            txtContact.setText("");
            lblDefaultimage.setIcon(new ImageIcon ("C:\\Users\\Reymart\\Documents\\GitHub\\document-fill-up-automation-system\\src\\assets\\defaultimage.png"));
            
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tblResidents.getModel();
            model.setRowCount(0);
            show_resident();
            populationCount();
            JOptionPane.showMessageDialog(null, "Resident Data Added !");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int ask = JOptionPane.showConfirmDialog(null, "Do you really want to delete?","Message",
            JOptionPane.YES_NO_OPTION);
        if(ask == 0){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
            int row = tblResidents.getSelectedRow();
            String value = (tblResidents.getModel().getValueAt(row,0)).toString();
            String sql = "DELETE FROM ROOT.TBL_RESIDENTS WHERE RIN="+value;
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel)tblResidents.getModel();
            model.setRowCount(0);
            show_resident();
            txtLname.setText("");
            txtFname.setText("");
            txtInitial.setText("");
            txtHousenum.setText("");
            txtStreet.setText("");
            rbtnMale.setSelected(false);
            rbtnFemale.setSelected(false);
            txtAge.setText("");
            txtYearstay.setText("");
            date_chooser.setCalendar(null);
            txtPlaceofbirth.setText("");
            txtContact.setText("");
            lblDefaultimage.setIcon(new ImageIcon ("C:\\Users\\Reymart\\Documents\\GitHub\\document-fill-up-automation-system\\src\\assets\\defaultimage.png"));
            JOptionPane.showMessageDialog(null, "Resident Data Deleted!");
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         } 
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblResidentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResidentsMouseClicked
        int row = tblResidents.getSelectedRow();
        TableModel model = tblResidents.getModel();
        txtLname.setText(model.getValueAt(row,1).toString());
        txtFname.setText(model.getValueAt(row,2).toString());
        txtInitial.setText(model.getValueAt(row,3).toString());
        txtHousenum.setText(model.getValueAt(row,4).toString());
        txtStreet.setText(model.getValueAt(row,5).toString());
        String sex = model.getValueAt(row,6).toString();
            if(sex.equals("Male")){
                rbtnMale.setSelected(true);
            }else {
                rbtnFemale.setSelected(true);
            }
        txtAge.setText(model.getValueAt(row,7).toString());
        txtYearstay.setText(model.getValueAt(row,8).toString());
        try{
            int srow = tblResidents.getSelectedRow();
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(srow,9));
            date_chooser.setDate(date);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        txtPlaceofbirth.setText(model.getValueAt(row,10).toString());
        txtContact.setText(model.getValueAt(row,11).toString());
        byte[] img = (residentList().get(row).getImage());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblDefaultimage.getWidth(),lblDefaultimage.getHeight(),Image.SCALE_SMOOTH));
        lblDefaultimage.setIcon(imageIcon);
        resident_image = img;
    }//GEN-LAST:event_tblResidentsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         try{
            //generate the qr code and save it to temporay file
            String qrCode = filepath + txtLname.getText() + "," + txtFname.getText() + "-QRCODE.png";
            QRCodeWriter writer = new QRCodeWriter();
            BitMatrix bitMatrix = writer.encode(txtFname.getText() + " " +
               txtInitial.getText() + ". " + txtLname.getText() + ";" + txtAge.getText() + 
               ";" + txtHousenum.getText() + " " + txtStreet.getText() + 
               ";" + txtYearstay.getText(), BarcodeFormat.QR_CODE, 200, 200);

             Path path = FileSystems.getDefault().getPath(qrCode);
             MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
             
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
            int row = tblResidents.getSelectedRow();
            String value = (tblResidents.getModel().getValueAt(row,0)).toString();
            //String value = txtRIN.getText().toString();
            String sql = "UPDATE ROOT.TBL_RESIDENTS SET l_name = ?, f_name = ?, mi = ?, house_number = ?,"
                    + "street = ?, gender = ?, age = ?, year_of_stay = ?, birthday = ?, birthplace = ?,"
                    + "contact_number = ?, profile = ?, qr_code = ? WHERE rin ="+value;
            ps = conn.prepareStatement(sql);
            ps.setString(1, txtLname.getText());
            ps.setString(2, txtFname.getText());
            ps.setString(3, txtInitial.getText());
            ps.setString(4, txtHousenum.getText());
            ps.setString(5, txtStreet.getText());
            ps.setString(6, gender);
            ps.setString(7, txtAge.getText());
            ps.setString(8, txtYearstay.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(date_chooser.getDate());
            ps.setString(9, date);
            ps.setString(10, txtPlaceofbirth.getText());
            ps.setString(11, txtContact.getText());
            byte [] img = resident_image;
            ps.setBytes(12,img);
            
            File imgFile = new File(qrCode);
            FileInputStream fin = new FileInputStream(imgFile);
            ps.setBinaryStream(13, fin, (int) imgFile.length());
            
            txtLname.setText("");
            txtFname.setText("");
            txtInitial.setText("");
            txtHousenum.setText("");
            txtStreet.setText("");
            rbtnMale.setSelected(false);
            rbtnFemale.setSelected(false);
            txtAge.setText("");
            txtYearstay.setText("");
            date_chooser.setCalendar(null);
            txtPlaceofbirth.setText("");
            txtContact.setText("");
            lblDefaultimage.setIcon(new ImageIcon ("C:\\Users\\Reymart\\Documents\\GitHub\\document-fill-up-automation-system\\src\\assets\\defaultimage.png"));
            
            
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tblResidents.getModel();
            model.setRowCount(0);
            show_resident();
            JOptionPane.showMessageDialog(null, "Resident Data Updated !");
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        /*try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
            String sql = "SELECT *FROM ROOT.TBL_RESIDENTS WHERE rin = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, txtSearch.getText().toString());
            rs = ps.executeQuery();
            if(rs.next()){
                String setLname = rs.getString("l_name");
                txtLname.setText(setLname);
                String setFname = rs.getString("f_name");
                txtFname.setText(setFname);
                String setMi = rs.getString("mi");
                txtInitial.setText(setMi);
                String setHousenum = rs.getString("house_number");
                txtHousenum.setText(setHousenum);
                String setStreet = rs.getString("street");
                txtStreet.setText(setStreet);
                String sex = rs.getString("gender");
                if(sex.equals("Male")){
                rbtnMale.setSelected(true);
                }else {
                rbtnFemale.setSelected(true);
                } 
                String setAge = rs.getString("age");
                txtAge.setText(setAge);
                String setYearstay = rs.getString("year_of_stay");
                txtYearstay.setText(setYearstay);
                date_chooser.setDate(rs.getDate("birthday"));
                String setBirthplace = rs.getString("birthplace");
                txtPlaceofbirth.setText(setBirthplace);
                String setContact = rs.getString("contact_number");
                txtContact.setText(setContact);
                byte[] img = rs.getBytes("profile");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblDefaultimage.getWidth(),lblDefaultimage.getHeight(),Image.SCALE_SMOOTH));
                lblDefaultimage.setIcon(imageIcon);
                resident_image = img;
            } 
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }*/
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchtableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchtableKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)this.tblResidents.getModel();
        String search =this.txtSearchtable.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tblResidents.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search)); 
    }//GEN-LAST:event_txtSearchtableKeyReleased

    private void btnUpdateRINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRINActionPerformed

        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
            String sql = "UPDATE ROOT.TBL_RESIDENTS SET l_name = ?, f_name = ?, mi = ?, house_number = ?,street = ?, gender = ?, age = ?, year_of_stay = ?, birthday = ?, birthplace = ?,contact_number = ?, profile = ? WHERE rin=?";
            ps = conn.prepareStatement(sql);
            ps.setString(13, txtSearch.getText());
            ps.setString(1, txtLname.getText());
            ps.setString(2, txtFname.getText());
            ps.setString(3, txtInitial.getText());
            ps.setString(4, txtHousenum.getText());
            ps.setString(5, txtStreet.getText());
            ps.setString(6, gender);
            ps.setString(7, txtAge.getText());
            ps.setString(8, txtYearstay.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(date_chooser.getDate());
            ps.setString(9, date);
            ps.setString(10, txtPlaceofbirth.getText());
            ps.setString(11, txtContact.getText());
            byte [] img = resident_image;
            ps.setBytes(12,img);
            
            txtSearch.setText("");
            txtLname.setText("");
            txtFname.setText("");
            txtInitial.setText("");
            txtHousenum.setText("");
            txtStreet.setText("");
            rbtnMale.setSelected(false);
            rbtnFemale.setSelected(false);
            txtAge.setText("");
            txtYearstay.setText("");
            date_chooser.setCalendar(null);
            txtPlaceofbirth.setText("");
            txtContact.setText("");
            lblDefaultimage.setIcon(new ImageIcon ("C:\\Users\\Reymart\\Documents\\GitHub\\document-fill-up-automation-system\\src\\assets\\defaultimage.png"));
            
            
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tblResidents.getModel();
            model.setRowCount(0);
            show_resident();
            JOptionPane.showMessageDialog(null, "Resident Data Updated using RIN !");
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
    }//GEN-LAST:event_btnUpdateRINActionPerformed

    private void btnDeleteRINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRINActionPerformed
         int ask = JOptionPane.showConfirmDialog(null, "Do you really want to delete?","Message",
            JOptionPane.YES_NO_OPTION);
        if(ask == 0){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
            String sql = "DELETE FROM ROOT.TBL_RESIDENTS WHERE rin=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, txtSearch.getText());
            ps.executeUpdate();
            
            
            DefaultTableModel model = (DefaultTableModel)tblResidents.getModel();
            model.setRowCount(0);
            show_resident();
            
            txtSearch.setText("");
            JOptionPane.showMessageDialog(null, "Resident Data Deleted!");
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         } 
        }
    }//GEN-LAST:event_btnDeleteRINActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        // TODO add your handling code here:
        generateIDPanel.setVisible(true);
        registerborder.setVisible(false);
        tableborder.setVisible(false);              
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void txtSearch2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch2KeyReleased

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        // TODO add your handling code here:
        txtSearch2.setText("");
        rinLabel.setText("");
        lblName.setText("");
        addressLbl.setText("");
        lblSex.setText("");
        lblAge2.setText("");
        lblContact2.setText("");
        lblQrCode.setText("");
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        generateIDPanel.setVisible(false);
        registerborder.setVisible(true);
        tableborder.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void printIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printIDActionPerformed
        printID(printPanel);
    }//GEN-LAST:event_printIDActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/brgyDB", "root", "admin");
            String sql = "SELECT *FROM ROOT.TBL_RESIDENTS WHERE rin = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, txtSearch2.getText().toString());
            rs = ps.executeQuery();
            if(rs.next()){
                String setRin = rs.getString("rin");
                rinLabel.setText(setRin);
                String setLname = rs.getString("l_name");
                String setFname = rs.getString("f_name");
                String setMi = rs.getString("mi");
                lblName.setText(setLname + "," +"  "+ setFname + "  " +setMi);
                String setHousenum = rs.getString("house_number");
                String setStreet = rs.getString("street");
                addressLbl.setText(setHousenum + "  " + setStreet);
                String sex = rs.getString("gender");
                lblSex.setText(sex);
                String setAge = rs.getString("age");
                lblAge2.setText(setAge);
                String setContact = rs.getString("contact_number");
                lblContact2.setText(setContact);  
                LoadImage();
            } 
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed
 
    public void LoadImage() {
        try {
            byte[] qrCode = rs.getBytes("qr_code");
            format = new ImageIcon(qrCode);
            Image qr = format.getImage();
            Image qrcode = qr.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon img = new ImageIcon(qrcode);
            
            lblQrCode.setIcon(img);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
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
    private javax.swing.JLabel addressLbl;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteRIN;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateRIN;
    private javax.swing.JButton btnUpload;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JPanel generateIDPanel;
    private javax.swing.JLabel invalid;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBG;
    private javax.swing.JPanel jpFooter;
    private javax.swing.JPanel jpRD;
    private javax.swing.JPanel jpTopnavbg;
    private javax.swing.JLabel lastname1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAge2;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblContact2;
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
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNavbg;
    private javax.swing.JLabel lblPlaceofbirth;
    private javax.swing.JLabel lblPopulation;
    private javax.swing.JLabel lblQrCode;
    private javax.swing.JLabel lblRegistration;
    private javax.swing.JLabel lblResidentsData;
    private javax.swing.JLabel lblResidentsDataTitle;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblYearstay;
    private javax.swing.JButton printID;
    private javax.swing.JPanel printPanel;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JPanel registerborder;
    private javax.swing.JLabel rinLabel;
    private javax.swing.JPanel tableborder;
    private javax.swing.JTable tblResidents;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtHousenum;
    private javax.swing.JTextField txtInitial;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPlaceofbirth;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearch2;
    private javax.swing.JTextField txtSearchtable;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtYearstay;
    // End of variables declaration//GEN-END:variables
}

