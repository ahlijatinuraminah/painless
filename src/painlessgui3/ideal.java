/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painlessgui3;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import painlessgui.print;
import painlessgui.start;

/**
 *
 * @author BiBul
 */
public class ideal extends javax.swing.JFrame {

    /**
     * Creates new form ideal
     */
    public ideal() {
        initComponents();
        setTitle("PainLESS v1.0.0");
        setIcon();
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
        detail = new javax.swing.JButton();
        mesos = new javax.swing.JToggleButton();
        satuan = new javax.swing.JLabel();
        DONE = new javax.swing.JButton();
        namaUser1 = new javax.swing.JLabel();
        tinggiBadan1 = new javax.swing.JLabel();
        beratBadan1 = new javax.swing.JLabel();
        jenisKelamin1 = new javax.swing.JLabel();
        umurUser1 = new javax.swing.JLabel();
        bmrResult1 = new javax.swing.JLabel();
        gizi1 = new javax.swing.JLabel();
        karbo1 = new javax.swing.JLabel();
        proto1 = new javax.swing.JLabel();
        lemaks1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        resultt = new javax.swing.JLabel();
        sknny = new javax.swing.JLabel();
        hearts = new javax.swing.JLabel();
        mascular = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detail.setText("Detail");
        detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailActionPerformed(evt);
            }
        });
        jPanel1.add(detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 70, 30));

        mesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/MESOMORPH.png"))); // NOI18N
        mesos.setContentAreaFilled(false);
        mesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesosActionPerformed(evt);
            }
        });
        jPanel1.add(mesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        satuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/cm  kg    thn  Kkl  Kkl  gram_day  gram_day  gram_day.png"))); // NOI18N
        jPanel1.add(satuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 80, -1));

        DONE.setText("DONE");
        DONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DONEActionPerformed(evt);
            }
        });
        jPanel1.add(DONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        namaUser1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        namaUser1.setText("jLabel1");
        jPanel1.add(namaUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        tinggiBadan1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tinggiBadan1.setText("jLabel1");
        jPanel1.add(tinggiBadan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 30, -1));

        beratBadan1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        beratBadan1.setText("jLabel1");
        jPanel1.add(beratBadan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 30, -1));

        jenisKelamin1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jenisKelamin1.setText("jLabel1");
        jPanel1.add(jenisKelamin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 90, -1));

        umurUser1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        umurUser1.setText("jLabel1");
        jPanel1.add(umurUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 30, -1));

        bmrResult1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bmrResult1.setText("jLabel1");
        jPanel1.add(bmrResult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 30, -1));

        gizi1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gizi1.setText("jLabel1");
        jPanel1.add(gizi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 30, -1));

        karbo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        karbo1.setText("jLabel1");
        jPanel1.add(karbo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 30, -1));

        proto1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        proto1.setText("jLabel1");
        jPanel1.add(proto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 30, -1));

        lemaks1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lemaks1.setText("jLabel1");
        jPanel1.add(lemaks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 30, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/PainLESS.png"))); // NOI18N
        logo.setText("jLabel1");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 330, -1));

        resultt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/ Tinggi Badan  Berat Badan   Jenis Kelamin  Umur   BMR  Kebutuh.png"))); // NOI18N
        resultt.setText("jLabel1");
        jPanel1.add(resultt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 180, -1));

        sknny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/ideal.png"))); // NOI18N
        sknny.setText("jLabel2");
        jPanel1.add(sknny, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 600, -1));

        hearts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/heart-cardiogram-health-icon-image-vector-12781394.png"))); // NOI18N
        hearts.setText("jLabel2");
        jPanel1.add(hearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 410, -1));

        mascular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/Mascular.png"))); // NOI18N
        mascular.setText("jLabel2");
        jPanel1.add(mascular, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 450, 610));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painlessgui3/Cloud.png"))); // NOI18N
        bg.setText("jLabel6");
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DONEActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
            start e = new start();
            e.setVisible(true);
    }//GEN-LAST:event_DONEActionPerformed

    private void mesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesosActionPerformed
        // TODO add your handling code here:
           if ( mesos.isSelected()){
    mascular.setIcon( new ImageIcon(getClass().getResource("/painlessgui3/meso.png")));
}
else {
     mascular.setIcon( new ImageIcon(getClass().getResource("/painlessgui3/Mascular.png")));
    }                                     
    
    }//GEN-LAST:event_mesosActionPerformed

    private void detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailActionPerformed
            print a = new print();
            a.setVisible(true);
    }//GEN-LAST:event_detailActionPerformed

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
            java.util.logging.Logger.getLogger(ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ideal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ideal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DONE;
    public static javax.swing.JLabel beratBadan1;
    private javax.swing.JLabel bg;
    public static javax.swing.JLabel bmrResult1;
    private javax.swing.JButton detail;
    public static javax.swing.JLabel gizi1;
    private javax.swing.JLabel hearts;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel jenisKelamin1;
    public static javax.swing.JLabel karbo1;
    public static javax.swing.JLabel lemaks1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mascular;
    private javax.swing.JToggleButton mesos;
    public static javax.swing.JLabel namaUser1;
    public static javax.swing.JLabel proto1;
    private javax.swing.JLabel resultt;
    private javax.swing.JLabel satuan;
    private javax.swing.JLabel sknny;
    public static javax.swing.JLabel tinggiBadan1;
    public static javax.swing.JLabel umurUser1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/painlessgui/Painlessicon.png")));
    }
}
