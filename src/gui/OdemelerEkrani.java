package gui;

import database.IBilgiController;
import database.transactions.FaturaOdemeleri;
import database.transactions.HesapBilgileri;
import gui.options.ActionOptions;
import gui.options.ButtonOptions;
import gui.options.Dialogs;
import gui.options.IRegulator;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OdemelerEkrani extends javax.swing.JFrame implements IRegulator, IBilgiController {

    private FaturaOdemeleri faturaOdemeleriObject = null;
    
    public OdemelerEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        odemelerPanel.setFocusable(true);
        this.kullaniciAdiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.elektrikBorcu.setText(String.valueOf(getHesapBilgileri().getElektrikFaturasi()));
        this.suBorcu.setText(String.valueOf(getHesapBilgileri().getSuFaturasi()));
        this.dogalgazBorcu.setText(String.valueOf(getHesapBilgileri().getDogalgazFaturasi()));
        this.internetBorcu.setText(String.valueOf(getHesapBilgileri().getInternetFaturasi()));
    }

    
    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public FaturaOdemeleri getFaturaOdemeleriObject() {
        if(this.faturaOdemeleriObject == null) {
            faturaOdemeleriObject = new FaturaOdemeleri();
        }
        return faturaOdemeleriObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odemelerPanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        kullaniciAdiLabel = new javax.swing.JLabel();
        mesajElektrikLabel = new javax.swing.JLabel();
        elektrikBorcu = new javax.swing.JLabel();
        elektrikBorcuOde = new javax.swing.JButton();
        mesajSuLabel = new javax.swing.JLabel();
        suBorcu = new javax.swing.JLabel();
        suBorcuOde = new javax.swing.JButton();
        mesajDogalgazLabel = new javax.swing.JLabel();
        dogalgazBorcu = new javax.swing.JLabel();
        dogalgazBorcuOde = new javax.swing.JButton();
        mesajInternetLabel = new javax.swing.JLabel();
        internetBorcu = new javax.swing.JLabel();
        internetBorcuOde = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tech Bank Ödemeler Ekranı");
        setPreferredSize(new java.awt.Dimension(744, 540));

        odemelerPanel.setPreferredSize(new java.awt.Dimension(744, 540));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        kullaniciAdiLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        kullaniciAdiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciAdiLabel.setText("Sayın (kullanıcı adı)");
        kullaniciAdiLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        mesajElektrikLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        mesajElektrikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajElektrikLabel.setText("Toplam elektrik faturası borcunuz:");

        elektrikBorcu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        elektrikBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektrikBorcu.setText("(elekt. borç)");

        elektrikBorcuOde.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        elektrikBorcuOde.setText("ÖDE");
        elektrikBorcuOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elektrikBorcuOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                elektrikBorcuOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                elektrikBorcuOdeMouseExited(evt);
            }
        });
        elektrikBorcuOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektrikBorcuOdeActionPerformed(evt);
            }
        });

        mesajSuLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        mesajSuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSuLabel.setText("Toplam su faturası borcunuz:");

        suBorcu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        suBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suBorcu.setText("(su. borç)");

        suBorcuOde.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        suBorcuOde.setText("ÖDE");
        suBorcuOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suBorcuOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suBorcuOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suBorcuOdeMouseExited(evt);
            }
        });
        suBorcuOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suBorcuOdeActionPerformed(evt);
            }
        });

        mesajDogalgazLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        mesajDogalgazLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajDogalgazLabel.setText("Toplam doğalgaz faturası borcunuz:");

        dogalgazBorcu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        dogalgazBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dogalgazBorcu.setText("(dogalg. borç)");

        dogalgazBorcuOde.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        dogalgazBorcuOde.setText("ÖDE");
        dogalgazBorcuOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dogalgazBorcuOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dogalgazBorcuOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dogalgazBorcuOdeMouseExited(evt);
            }
        });
        dogalgazBorcuOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogalgazBorcuOdeActionPerformed(evt);
            }
        });

        mesajInternetLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        mesajInternetLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajInternetLabel.setText("Toplam internet faturası borcunuz:");

        internetBorcu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        internetBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internetBorcu.setText("(inter. borç)");

        internetBorcuOde.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        internetBorcuOde.setText("ÖDE");
        internetBorcuOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        internetBorcuOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                internetBorcuOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                internetBorcuOdeMouseExited(evt);
            }
        });
        internetBorcuOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetBorcuOdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout odemelerPanelLayout = new javax.swing.GroupLayout(odemelerPanel);
        odemelerPanel.setLayout(odemelerPanelLayout);
        odemelerPanelLayout.setHorizontalGroup(
            odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerPanelLayout.createSequentialGroup()
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(kullaniciAdiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(odemelerPanelLayout.createSequentialGroup()
                                .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(elektrikBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(elektrikBorcuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(odemelerPanelLayout.createSequentialGroup()
                                .addComponent(mesajSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suBorcuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(odemelerPanelLayout.createSequentialGroup()
                                .addComponent(mesajDogalgazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dogalgazBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dogalgazBorcuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(odemelerPanelLayout.createSequentialGroup()
                                .addComponent(mesajInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(internetBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(internetBorcuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(odemelerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        odemelerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dogalgazBorcu, elektrikBorcu, internetBorcu, suBorcu});

        odemelerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dogalgazBorcuOde, elektrikBorcuOde, internetBorcuOde, suBorcuOde});

        odemelerPanelLayout.setVerticalGroup(
            odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addGap(0, 0, 0)
                .addComponent(kullaniciAdiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elektrikBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elektrikBorcuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(mesajSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suBorcuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(mesajDogalgazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogalgazBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogalgazBorcuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(mesajInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(internetBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(internetBorcuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionOptions.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    /**
     * color
     */
    private void setBgFg(Component c) {
        ButtonOptions.setBgFg((JButton) c, Color.black, Color.white);
    }

    private void elektrikBorcuOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikBorcuOdeMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_elektrikBorcuOdeMouseEntered

    private void elektrikBorcuOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikBorcuOdeMouseExited
        ButtonOptions.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_elektrikBorcuOdeMouseExited

    private void suBorcuOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suBorcuOdeMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_suBorcuOdeMouseEntered

    private void suBorcuOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suBorcuOdeMouseExited
        ButtonOptions.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_suBorcuOdeMouseExited

    private void dogalgazBorcuOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazBorcuOdeMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_dogalgazBorcuOdeMouseEntered

    private void dogalgazBorcuOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazBorcuOdeMouseExited
        ButtonOptions.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_dogalgazBorcuOdeMouseExited

    private void internetBorcuOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetBorcuOdeMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_internetBorcuOdeMouseEntered

    private void internetBorcuOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetBorcuOdeMouseExited
        ButtonOptions.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_internetBorcuOdeMouseExited

    /**
     * actions
     */
    private void elektrikBorcuOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektrikBorcuOdeActionPerformed
        double elektrikTutari = Double.valueOf(this.elektrikBorcu.getText());
        if(faturaOncedenOdenmisMi(elektrikTutari)) {
            Dialogs.ozelMesajGoster(this, "Elektrik faturası zaten ödenmiş !");
        } else {
            this.faturayiOde("elektrik", elektrikTutari);
        }
    }//GEN-LAST:event_elektrikBorcuOdeActionPerformed

    private void suBorcuOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suBorcuOdeActionPerformed
        double suTutari = Double.valueOf(this.suBorcu.getText());
        if (this.faturaOncedenOdenmisMi(suTutari)) {
            Dialogs.ozelMesajGoster(this, "Su faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("su", suTutari);
        }
    }//GEN-LAST:event_suBorcuOdeActionPerformed

    private void dogalgazBorcuOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogalgazBorcuOdeActionPerformed
        double dogalgazTutari = Double.valueOf(this.dogalgazBorcu.getText());
        if (this.faturaOncedenOdenmisMi(dogalgazTutari)) {
            Dialogs.ozelMesajGoster(this, "Doğalgaz faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("dogalgaz", dogalgazTutari);
        }
    }//GEN-LAST:event_dogalgazBorcuOdeActionPerformed

    private void internetBorcuOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetBorcuOdeActionPerformed
        double internetTutari = Double.valueOf(this.internetBorcu.getText());
        if (this.faturaOncedenOdenmisMi(internetTutari)) {
            Dialogs.ozelMesajGoster(this, "İnternet faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("internet", internetTutari);
        }
    }//GEN-LAST:event_internetBorcuOdeActionPerformed

    private boolean faturaOncedenOdenmisMi(double odenecekTutar) {
        return odenecekTutar == 0.0;
    }
    
    private void faturayiOde (String faturaIsmi, double faturaTutari) {
        this.getFaturaOdemeleriObject().setFaturaIsmi(faturaIsmi);
        this.getFaturaOdemeleriObject().setFaturaTutari(faturaTutari);
        
        if(getFaturaOdemeleriObject().faturaOdendiMi()) {
            Dialogs.ozelMesajGoster(this, "Faturanız başarıyla ödenmiştir.");
            ActionOptions.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Ödeme işlemi gerçekleştirilemedi !");
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
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dogalgazBorcu;
    private javax.swing.JButton dogalgazBorcuOde;
    private javax.swing.JLabel elektrikBorcu;
    private javax.swing.JButton elektrikBorcuOde;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel internetBorcu;
    private javax.swing.JButton internetBorcuOde;
    private javax.swing.JLabel kullaniciAdiLabel;
    private javax.swing.JLabel mesajDogalgazLabel;
    private javax.swing.JLabel mesajElektrikLabel;
    private javax.swing.JLabel mesajInternetLabel;
    private javax.swing.JLabel mesajSuLabel;
    private javax.swing.JPanel odemelerPanel;
    private javax.swing.JLabel suBorcu;
    private javax.swing.JButton suBorcuOde;
    // End of variables declaration//GEN-END:variables

}
