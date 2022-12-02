/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

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
        lblResidentsData1 = new javax.swing.JLabel();
        lblResidentsData = new javax.swing.JLabel();
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
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        tableborder = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        residentsTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        kButton6 = new com.k33ptoo.components.KButton();
        kButton7 = new com.k33ptoo.components.KButton();
        jpFooter = new javax.swing.JPanel();
        kButton1 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jpBG.setBackground(new java.awt.Color(255, 255, 255));
        jpBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTopnavbg.setBackground(new java.awt.Color(255, 255, 255));
        jpTopnavbg.setPreferredSize(new java.awt.Dimension(1440, 90));
        jpTopnavbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblResidentsData1.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        lblResidentsData1.setForeground(new java.awt.Color(255, 255, 255));
        lblResidentsData1.setText("Logout");
        jpTopnavbg.add(lblResidentsData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, -1, -1));

        lblResidentsData.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        lblResidentsData.setForeground(new java.awt.Color(255, 255, 255));
        lblResidentsData.setText("| Residents Data");
        jpTopnavbg.add(lblResidentsData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

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
        registerborder.add(rbtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        rbtnFemale.setBackground(new java.awt.Color(255, 255, 255));
        rbtnFemale.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        rbtnFemale.setText("Female");
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

        lblDefaultimage.setIcon(new javax.swing.ImageIcon("C:\\Users\\Reymart\\Desktop\\assets\\defaultimage.png")); // NOI18N
        registerborder.add(lblDefaultimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        kButton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton2.setkBorderRadius(25);
        kButton2.setkEndColor(new java.awt.Color(140, 185, 225));
        kButton2.setkHoverEndColor(new java.awt.Color(13, 76, 146));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(13, 76, 146));
        kButton2.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(13, 76, 146));
        kButton2.setLabel("Upload Image");
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        registerborder.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 140, 40));

        kButton3.setText("Clear");
        kButton3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton3.setkBorderRadius(25);
        kButton3.setkEndColor(new java.awt.Color(140, 185, 225));
        kButton3.setkHoverEndColor(new java.awt.Color(13, 76, 146));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(13, 76, 146));
        kButton3.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton3.setkStartColor(new java.awt.Color(13, 76, 146));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        registerborder.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 140, 40));

        kButton4.setText("Add");
        kButton4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton4.setkBorderRadius(25);
        kButton4.setkEndColor(new java.awt.Color(140, 185, 225));
        kButton4.setkHoverEndColor(new java.awt.Color(13, 76, 146));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(13, 76, 146));
        kButton4.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(13, 76, 146));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        registerborder.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 140, 40));

        kButton5.setText("Update");
        kButton5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        kButton5.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton5.setkBorderRadius(25);
        kButton5.setkEndColor(new java.awt.Color(140, 185, 225));
        kButton5.setkHoverEndColor(new java.awt.Color(13, 76, 146));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new java.awt.Color(13, 76, 146));
        kButton5.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton5.setkStartColor(new java.awt.Color(13, 76, 146));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        registerborder.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, 140, 40));

        jpBG.add(registerborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 630, 690));

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

        kButton6.setText("Generate I.D");
        kButton6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        kButton6.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton6.setkBorderRadius(25);
        kButton6.setkEndColor(new java.awt.Color(140, 185, 225));
        kButton6.setkHoverEndColor(new java.awt.Color(13, 76, 146));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(13, 76, 146));
        kButton6.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton6.setkStartColor(new java.awt.Color(13, 76, 146));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });
        tableborder.add(kButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 140, 40));

        kButton7.setText("Delete");
        kButton7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        kButton7.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton7.setkBorderRadius(25);
        kButton7.setkEndColor(new java.awt.Color(140, 185, 225));
        kButton7.setkHoverEndColor(new java.awt.Color(13, 76, 146));
        kButton7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton7.setkHoverStartColor(new java.awt.Color(13, 76, 146));
        kButton7.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton7.setkStartColor(new java.awt.Color(13, 76, 146));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        tableborder.add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 140, 40));

        jpBG.add(tableborder, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 740, 690));

        jpFooter.setBackground(new java.awt.Color(255, 255, 255));

        kButton1.setText("Back");
        kButton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton1.setkBorderRadius(25);
        kButton1.setkEndColor(new java.awt.Color(140, 185, 225));
        kButton1.setkHoverEndColor(new java.awt.Color(13, 76, 146));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(13, 76, 146));
        kButton1.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(13, 76, 146));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFooterLayout = new javax.swing.GroupLayout(jpFooter);
        jpFooter.setLayout(jpFooterLayout);
        jpFooterLayout.setHorizontalGroup(
            jpFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFooterLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1201, Short.MAX_VALUE))
        );
        jpFooterLayout.setVerticalGroup(
            jpFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFooterLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpBG.add(jpFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 1380, 70));

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

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton6ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton7ActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBG;
    private javax.swing.JPanel jpFooter;
    private javax.swing.JPanel jpTopnavbg;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KButton kButton7;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDateofbirth;
    private javax.swing.JLabel lblDefaultimage;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHousenum;
    private javax.swing.JLabel lblInitial;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNavbg;
    private javax.swing.JLabel lblPlaceofbirth;
    private javax.swing.JLabel lblRegistration;
    private javax.swing.JLabel lblResidentsData;
    private javax.swing.JLabel lblResidentsData1;
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
}