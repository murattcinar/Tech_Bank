package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.SifreYenileme;
import gui.options.ActionOptions;
import gui.options.ButtonOptions;
import gui.options.Dialogs;
import gui.options.IRegulator;
import gui.options.TextOptions;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class SifreYenilemeEkrani extends javax.swing.JFrame implements IRegulator, IBilgiController{

    private SifreYenileme sifreYenilemeObject = null;
    
    public SifreYenilemeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);//tam ekranı kapatır
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//ekran kapanmasını önler
        sifreYenilemePanel.setFocusable(true);
        TextOptions.setOnlyNumber(tcNoText);
        TextOptions.setMaxLimit(tcNoText, 11);
        TextOptions.setOnlyNumber(telNoText);
        TextOptions.setMaxLimit(telNoText, 11);
        if(getHesapBilgileri().getKullaniciId() == 0) {
            this.eskiSifreField.setEnabled(false);
        }
    }
  
    public JPasswordField getEskiSifreField() {
        return eskiSifreField;
    }

    private boolean isEnabledEskiSifreField() {
        return this.getEskiSifreField().isEnabled();
    }
    
    
    @Override
    public boolean bilgilerGecerliMi() {
        return TextOptions.textAlanlariDolumu(this.sifreYenilemePanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public SifreYenileme getSifreYenilemeObject() {
        if(this.sifreYenilemeObject == null) {
            sifreYenilemeObject = new SifreYenileme();
        }
        return sifreYenilemeObject;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sifreYenilemePanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        sifreYenilemeLabel = new javax.swing.JLabel();
        telNoLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        guvenlikLabel = new javax.swing.JLabel();
        guvenlikText = new javax.swing.JTextField();
        eskiSifreLabel = new javax.swing.JLabel();
        yeniSifreLabel = new javax.swing.JLabel();
        yeniSifreTekrarLabel = new javax.swing.JLabel();
        eskiSifreField = new javax.swing.JPasswordField();
        yeniSifreField = new javax.swing.JPasswordField();
        yeniSifreTekrarField = new javax.swing.JPasswordField();
        sifreYenileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sifreYenilemePanel.setToolTipText("Tech Bank Şifre Yenileme Ekranı");

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        sifreYenilemeLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        sifreYenilemeLabel.setText("Şifre Yenileme");

        telNoLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        telNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel.setText("Telefon No:");

        telNoText.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        tcNoLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("T.C No:");

        tcNoText.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        guvenlikLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        guvenlikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikLabel.setText("Güvenlik Sorusu Cevabı:");

        guvenlikText.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        eskiSifreLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eskiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eskiSifreLabel.setText("Eski Şifre:");

        yeniSifreLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        yeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreLabel.setText("Yeni Şifre:");

        yeniSifreTekrarLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        yeniSifreTekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreTekrarLabel.setText("Yeni Şifre Tekrar:");

        eskiSifreField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        yeniSifreField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        yeniSifreTekrarField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        sifreYenileButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        sifreYenileButton.setText("Şifreyi Yenile");
        sifreYenileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreYenileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sifreYenileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sifreYenileButtonMouseExited(evt);
            }
        });
        sifreYenileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreYenileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sifreYenilemePanelLayout = new javax.swing.GroupLayout(sifreYenilemePanel);
        sifreYenilemePanel.setLayout(sifreYenilemePanelLayout);
        sifreYenilemePanelLayout.setHorizontalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                            .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(guvenlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(38, 38, 38)
                                            .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(guvenlikText)
                                                    .addComponent(eskiSifreField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                                .addComponent(yeniSifreTekrarField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sifreYenilemePanelLayout.createSequentialGroup()
                                            .addComponent(yeniSifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(sifreYenileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(yeniSifreField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))))
                            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telNoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcNoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        sifreYenilemePanelLayout.setVerticalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addGap(18, 18, 18)
                .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eskiSifreField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniSifreTekrarField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniSifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniSifreField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sifreYenileButton)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        if (isEnabledEskiSifreField()){
        ActionOptions.setVisible(this, new AyarlarEkrani());
        } else {
            ActionOptions.setVisible(this, new GirisEkrani());
        }
    }//GEN-LAST:event_geriIconMouseClicked

    private void sifreYenileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreYenileButtonMouseEntered
        ButtonOptions.setBgFg(sifreYenileButton, Color.black, Color.white);
    }//GEN-LAST:event_sifreYenileButtonMouseEntered

    private void sifreYenileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreYenileButtonMouseExited
        ButtonOptions.setOriginalBgFg(sifreYenileButton);
    }//GEN-LAST:event_sifreYenileButtonMouseExited

    private void sifreYenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreYenileButtonActionPerformed
       if(this.bilgilerGecerliMi()) {
            this.sifreyiYenile();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_sifreYenileButtonActionPerformed

    
    private void sifreyiYenile() {
        String yeniSifre = String.valueOf(this.yeniSifreField.getPassword());
        String yeniSifreTekrar = String.valueOf(this.yeniSifreField.getPassword());
        
        if(yeniSifre.equals(yeniSifreTekrar)) {
            this.sifreyiOnayla();
        } else {
            Dialogs.ozelMesajGoster(this, "Şifreler uyuşmuyor!");
        }
    }
    
    private void sifreyiOnayla() {
        this.getSifreYenilemeObject().setTcNo(this.tcNoText.getText());
        this.getSifreYenilemeObject().setTelNo(this.telNoText.getText());
        this.getSifreYenilemeObject().setGuvenlikCevap(this.guvenlikText.getText());
        
        if(this.isEnabledEskiSifreField()) {
            this.getSifreYenilemeObject().setEskiSifre(String.valueOf(this.eskiSifreField.getPassword()));
        }
        this.getSifreYenilemeObject().setYeniSifre(String.valueOf(this.yeniSifreTekrarField.getPassword()));
        
        if(this.getSifreYenilemeObject().sifreYenilendiMi()) {
            Dialogs.ozelMesajGoster(this, "Şifreniz başarıyla yenilenmiştir.");
            if(this.isEnabledEskiSifreField()) {
                ActionOptions.setVisible(this, new HesapEkrani());
            } else {
                ActionOptions.setVisible(this, new GirisEkrani());
            }
        } else {
            Dialogs.ozelMesajGoster(this, "Şifreniz yenilenemedi!\n"
                    + "Lütfen bilgilerinizi kontrol ediniz!");
        }
    }
    
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
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField eskiSifreField;
    private javax.swing.JLabel eskiSifreLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel guvenlikLabel;
    private javax.swing.JTextField guvenlikText;
    private javax.swing.JButton sifreYenileButton;
    private javax.swing.JLabel sifreYenilemeLabel;
    private javax.swing.JPanel sifreYenilemePanel;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telNoLabel;
    private javax.swing.JTextField telNoText;
    private javax.swing.JPasswordField yeniSifreField;
    private javax.swing.JLabel yeniSifreLabel;
    private javax.swing.JPasswordField yeniSifreTekrarField;
    private javax.swing.JLabel yeniSifreTekrarLabel;
    // End of variables declaration//GEN-END:variables

}
