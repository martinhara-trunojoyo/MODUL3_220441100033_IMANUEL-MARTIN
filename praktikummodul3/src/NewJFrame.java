
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Martin Hara
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btndaftar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        panel5 = new javax.swing.JPanel();
        buku1 = new javax.swing.JButton();
        buku11 = new javax.swing.JButton();
        buku2 = new javax.swing.JButton();
        buku12 = new javax.swing.JButton();
        buku3 = new javax.swing.JButton();
        buku13 = new javax.swing.JButton();
        buku4 = new javax.swing.JButton();
        buku14 = new javax.swing.JButton();
        buku5 = new javax.swing.JButton();
        buku15 = new javax.swing.JButton();
        buku6 = new javax.swing.JButton();
        buku16 = new javax.swing.JButton();
        buku7 = new javax.swing.JButton();
        buku17 = new javax.swing.JButton();
        buku8 = new javax.swing.JButton();
        buku18 = new javax.swing.JButton();
        buku9 = new javax.swing.JButton();
        buku19 = new javax.swing.JButton();
        buku10 = new javax.swing.JButton();
        buku20 = new javax.swing.JButton();
        paneldetail = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        namabuku = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel2.setText("Daftar Buku");

        jButton2.setText("jButton2");

        jButton4.setText("jButton4");

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERPUSTAKAAN TERBUKA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MARTIN LENNON LIBRARY COMPANY");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jalan Raya Camplong KM.4 Taddan, Camplong, Sampang, Jawa Timur,Indonesia");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin Hara\\Downloads\\buku.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(5, 0, 9, 9));

        jButton3.setText("LOGIN PETUGAS");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jButton3);

        jButton1.setText("LOGIN PEMINJAM");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jButton1);

        btndaftar.setText("DAFTAR BUKU");
        btndaftar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btndaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarActionPerformed(evt);
            }
        });
        jPanel3.add(btndaftar);

        jButton6.setText("SYARAT DAN KETENTUAN");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jButton6);

        jButton7.setText("SARAN BUKU");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jButton7);

        panel5.setBackground(new java.awt.Color(255, 255, 255));
        panel5.setLayout(new java.awt.GridLayout(10, 2, 4, 4));

        buku1.setText("AYAT AYAT CINTA");
        buku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku1ActionPerformed(evt);
            }
        });
        panel5.add(buku1);

        buku11.setText("BOYMAN");
        buku11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku11ActionPerformed(evt);
            }
        });
        panel5.add(buku11);

        buku2.setText("LASKAR PELANGI");
        buku2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku2ActionPerformed(evt);
            }
        });
        panel5.add(buku2);

        buku12.setText("MARIPOSA");
        buku12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku12ActionPerformed(evt);
            }
        });
        panel5.add(buku12);

        buku3.setText("AKU");
        buku3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku3ActionPerformed(evt);
            }
        });
        panel5.add(buku3);

        buku13.setText("DUA GARIS BIRU");
        buku13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku13ActionPerformed(evt);
            }
        });
        panel5.add(buku13);

        buku4.setText("DILAN 1990");
        buku4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku4ActionPerformed(evt);
            }
        });
        panel5.add(buku4);

        buku14.setText("MAYAT");
        buku14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku14ActionPerformed(evt);
            }
        });
        panel5.add(buku14);

        buku5.setText("MILEA");
        buku5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku5ActionPerformed(evt);
            }
        });
        panel5.add(buku5);

        buku15.setText("NOAH");
        buku15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku15ActionPerformed(evt);
            }
        });
        panel5.add(buku15);

        buku6.setText("DILAN 1991");
        buku6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku6ActionPerformed(evt);
            }
        });
        panel5.add(buku6);

        buku16.setText("BIOGRAFI");
        buku16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku16ActionPerformed(evt);
            }
        });
        panel5.add(buku16);

        buku7.setText("10 DOSA SOEHARTO");
        buku7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku7ActionPerformed(evt);
            }
        });
        panel5.add(buku7);

        buku17.setText("STMJ");
        buku17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku17ActionPerformed(evt);
            }
        });
        panel5.add(buku17);

        buku8.setText("HITLER MATI DI BOGOR");
        buku8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku8ActionPerformed(evt);
            }
        });
        panel5.add(buku8);

        buku18.setText("PAMUNGKAS");
        buku18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku18ActionPerformed(evt);
            }
        });
        panel5.add(buku18);

        buku9.setText("MADURAKSA");
        buku9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku9ActionPerformed(evt);
            }
        });
        panel5.add(buku9);

        buku19.setText("HINDIA ");
        buku19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku19ActionPerformed(evt);
            }
        });
        panel5.add(buku19);

        buku10.setText("WARKOP DKI");
        buku10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku10ActionPerformed(evt);
            }
        });
        panel5.add(buku10);

        buku20.setText("NADIN");
        buku20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku20ActionPerformed(evt);
            }
        });
        panel5.add(buku20);

        jLabel6.setText("DETAIL BUKU");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel7.setText("NAMA BUKU : ");
        jPanel6.add(jLabel7, new java.awt.GridBagConstraints());

        jLabel8.setText("PENGARANG :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        jPanel6.add(jLabel8, gridBagConstraints);

        jLabel10.setText("TAHUN TERBIT :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel6.add(jLabel10, gridBagConstraints);

        jLabel11.setText("PENERBIT          :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        jPanel6.add(jLabel11, gridBagConstraints);

        jLabel9.setText("NO ISBN         :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        jPanel6.add(jLabel9, gridBagConstraints);

        namabuku.setText("TEST");
        jPanel6.add(namabuku, new java.awt.GridBagConstraints());

        jLabel13.setText("MARTIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        jPanel6.add(jLabel13, gridBagConstraints);

        jLabel15.setText("2004");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        jPanel6.add(jLabel15, gridBagConstraints);

        jLabel16.setText("GRASINDO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        jPanel6.add(jLabel16, gridBagConstraints);

        jLabel14.setText("000-696969-230124");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel6.add(jLabel14, gridBagConstraints);

        javax.swing.GroupLayout paneldetailLayout = new javax.swing.GroupLayout(paneldetail);
        paneldetail.setLayout(paneldetailLayout);
        paneldetailLayout.setHorizontalGroup(
            paneldetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldetailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(104, 104, 104))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        paneldetailLayout.setVerticalGroup(
            paneldetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(paneldetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(paneldetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buku9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku9ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Maduraksa");
    }//GEN-LAST:event_buku9ActionPerformed

    private void btndaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarActionPerformed
        // TODO add your handling code here:
         panel5.setVisible(true);
         
         
    }//GEN-LAST:event_btndaftarActionPerformed

    private void buku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku1ActionPerformed
        // TODO add your handling code here:
        paneldetail.setVisible(true);
        namabuku.setText("Ayat ayat cinta");
        
    }//GEN-LAST:event_buku1ActionPerformed

    private void buku2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku2ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Laskar Pelangi");
    }//GEN-LAST:event_buku2ActionPerformed

    private void buku11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku11ActionPerformed
 paneldetail.setVisible(true);
        namabuku.setText("Boyman");        // TODO add your handling code here:
    }//GEN-LAST:event_buku11ActionPerformed

    private void buku12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku12ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Mariposa");
    }//GEN-LAST:event_buku12ActionPerformed

    private void buku3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku3ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Aku");
    }//GEN-LAST:event_buku3ActionPerformed

    private void buku13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku13ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Dua Garis Biru");
    }//GEN-LAST:event_buku13ActionPerformed

    private void buku4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku4ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Dilan 1990");
    }//GEN-LAST:event_buku4ActionPerformed

    private void buku14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku14ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Mayat");
    }//GEN-LAST:event_buku14ActionPerformed

    private void buku5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku5ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Milea");
    }//GEN-LAST:event_buku5ActionPerformed

    private void buku15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku15ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Noah");
    }//GEN-LAST:event_buku15ActionPerformed

    private void buku6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku6ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Dilan 1991");
    }//GEN-LAST:event_buku6ActionPerformed

    private void buku16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku16ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Biografi");
    }//GEN-LAST:event_buku16ActionPerformed

    private void buku7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku7ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("10 dosa soeharto");
    }//GEN-LAST:event_buku7ActionPerformed

    private void buku17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku17ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("STMJ");
    }//GEN-LAST:event_buku17ActionPerformed

    private void buku8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku8ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Hitler Mati Di bogor");
    }//GEN-LAST:event_buku8ActionPerformed

    private void buku18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku18ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Pamungkas");
    }//GEN-LAST:event_buku18ActionPerformed

    private void buku19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku19ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Hindia");
    }//GEN-LAST:event_buku19ActionPerformed

    private void buku10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku10ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Warkop DKI");
    }//GEN-LAST:event_buku10ActionPerformed

    private void buku20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku20ActionPerformed
        // TODO add your handling code here:
         paneldetail.setVisible(true);
        namabuku.setText("Nadin");
    }//GEN-LAST:event_buku20ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           NewJFrame frame = new NewJFrame(); // Buat objek NewJFrame
        frame.setVisible(true); // Tampilkan frame
        
        // Akses panel5 dari dalam objek NewJFrame
        frame.panel5.setVisible(false);
        frame.paneldetail.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndaftar;
    private javax.swing.JButton buku1;
    private javax.swing.JButton buku10;
    private javax.swing.JButton buku11;
    private javax.swing.JButton buku12;
    private javax.swing.JButton buku13;
    private javax.swing.JButton buku14;
    private javax.swing.JButton buku15;
    private javax.swing.JButton buku16;
    private javax.swing.JButton buku17;
    private javax.swing.JButton buku18;
    private javax.swing.JButton buku19;
    private javax.swing.JButton buku2;
    private javax.swing.JButton buku20;
    private javax.swing.JButton buku3;
    private javax.swing.JButton buku4;
    private javax.swing.JButton buku5;
    private javax.swing.JButton buku6;
    private javax.swing.JButton buku7;
    private javax.swing.JButton buku8;
    private javax.swing.JButton buku9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel namabuku;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel paneldetail;
    // End of variables declaration//GEN-END:variables
}
