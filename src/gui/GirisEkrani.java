package gui; //gui paketi 

import database.DbConnection;
import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciGiris;
import gui.options.ActionOptions;
import gui.options.ButtonOptions;
import gui.options.Dialogs;
import gui.options.IRegulator;
import gui.options.TextOptions;
import java.awt.Color;

public final class GirisEkrani extends javax.swing.JFrame implements IRegulator, IBilgiController {

    private KullaniciGiris kullaniciGirisOject = null;
    
    private final String KIMLIK_TEXT_ORIGINAL = "T.C No / Musteri No";
    private final String SIFRE_TEXT_ORIGINAL = "**********";

    public GirisEkrani() {
        initComponents();
        getEdits();
    }

    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null); //ekrani ortalar
        girisEkraniPanel.setFocusable(true); //fokusu panele verir
        this.setResizable(false);//tam ekranı kapatır
        //this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//ekran kapanmasını önler
        kimlikField.setText(KIMLIK_TEXT_ORIGINAL);
        sifreField.setText(SIFRE_TEXT_ORIGINAL);
        TextOptions.setOnlyNumber(kimlikField);
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.kimlikField.getText().equals(this.KIMLIK_TEXT_ORIGINAL)
                || String.valueOf(this.sifreField.getPassword()).equals(this.SIFRE_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public KullaniciGiris getKullaniciGirisOject() {
        if(this.kullaniciGirisOject == null) {
            kullaniciGirisOject = new KullaniciGiris();
        }
        return kullaniciGirisOject;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisEkraniPanel = new javax.swing.JPanel();
        hosgeldinMesaji = new javax.swing.JLabel();
        kimlikField = new javax.swing.JTextField();
        sifreField = new javax.swing.JPasswordField();
        girisButton = new javax.swing.JButton();
        soruLabel = new javax.swing.JLabel();
        basvurButton = new javax.swing.JButton();
        sifremiUnuttumLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tech Bank Giriş Ekranı");

        hosgeldinMesaji.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        hosgeldinMesaji.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinMesaji.setText("TECH BANKA HOŞGELDİNİZ");

        kimlikField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        kimlikField.setForeground(new java.awt.Color(204, 204, 204));
        kimlikField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikFieldFocusLost(evt);
            }
        });

        sifreField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        sifreField.setForeground(new java.awt.Color(204, 204, 204));
        sifreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreFieldFocusLost(evt);
            }
        });

        girisButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        girisButton.setText("Giriş");
        girisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButtonMouseExited(evt);
            }
        });
        girisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButtonActionPerformed(evt);
            }
        });

        soruLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        soruLabel.setText("Müşterimiz değil misiniz?");

        basvurButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        basvurButton.setText("Başvur");
        basvurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButtonMouseExited(evt);
            }
        });
        basvurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButtonActionPerformed(evt);
            }
        });

        sifremiUnuttumLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        sifremiUnuttumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sifremiUnuttumLabel.setText("Şifreni mi unuttun ?");
        sifremiUnuttumLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifremiUnuttumLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifremiUnuttumLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout girisEkraniPanelLayout = new javax.swing.GroupLayout(girisEkraniPanel);
        girisEkraniPanel.setLayout(girisEkraniPanelLayout);
        girisEkraniPanelLayout.setHorizontalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sifreField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hosgeldinMesaji, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kimlikField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addComponent(soruLabel)
                        .addGap(29, 29, 29)
                        .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sifremiUnuttumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(200, 200, 200))
        );
        girisEkraniPanelLayout.setVerticalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(hosgeldinMesaji, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(kimlikField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sifreField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sifremiUnuttumLabel)
                .addGap(32, 32, 32)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soruLabel)
                    .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /*
    button options
    */
    private void girisButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseEntered
        ButtonOptions.setBgFg(girisButton, Color.black, Color.white);
    }//GEN-LAST:event_girisButtonMouseEntered

    private void girisButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseExited
        ButtonOptions.setOriginalBgFg(girisButton);
    }//GEN-LAST:event_girisButtonMouseExited

    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        ButtonOptions.setBgFg(basvurButton, Color.black, Color.white);
    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        ButtonOptions.setOriginalBgFg(basvurButton);
    }//GEN-LAST:event_basvurButtonMouseExited

    /*
    text focus
    */
    private void kimlikFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikFieldFocusGained
        TextOptions.checkTheTextFocusGained(kimlikField, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_kimlikFieldFocusGained

    private void kimlikFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikFieldFocusLost
        TextOptions.checkTheTextFocusLost(kimlikField);
    }//GEN-LAST:event_kimlikFieldFocusLost

    private void sifreFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreFieldFocusGained
        TextOptions.checkTheTextFocusGained(sifreField, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_sifreFieldFocusGained

    private void sifreFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreFieldFocusLost
        TextOptions.checkTheTextFocusLost(sifreField);
    }//GEN-LAST:event_sifreFieldFocusLost

    /*
    button actions
    */
    private void girisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButtonActionPerformed
       if(this.bilgilerGecerliMi()) {
           String musteriKimlik = this.kimlikField.getText().trim();
           String sifre = String.valueOf(this.sifreField.getPassword());
           this.girisYap(musteriKimlik, sifre);
       } else {
           Dialogs.bosOlamazMesajiGoster(this);
       }
    }//GEN-LAST:event_girisButtonActionPerformed
    
    private void girisYap(String musteriKimlik, String sifre) {
        this.getKullaniciGirisOject().setMusteriKimlik(musteriKimlik);
        this.getKullaniciGirisOject().setSifre(sifre);
        
        if(getKullaniciGirisOject().girisBilgileriDogruMu()){
            ActionOptions.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Giriş bilgileri doğru değildir!\n"
            + "Lütfen bilgilerinizi kontrol edin!");
        }
    }
    
    
    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
        ActionOptions.setVisible(this, new BasvuruEkrani());
    }//GEN-LAST:event_basvurButtonActionPerformed

    private void sifremiUnuttumLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifremiUnuttumLabelMouseClicked
        ActionOptions.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifremiUnuttumLabelMouseClicked

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GirisEkrani().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basvurButton;
    private javax.swing.JButton girisButton;
    private javax.swing.JPanel girisEkraniPanel;
    private javax.swing.JLabel hosgeldinMesaji;
    private javax.swing.JTextField kimlikField;
    private javax.swing.JPasswordField sifreField;
    private javax.swing.JLabel sifremiUnuttumLabel;
    private javax.swing.JLabel soruLabel;
    // End of variables declaration//GEN-END:variables
}
