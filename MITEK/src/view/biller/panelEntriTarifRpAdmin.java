/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.biller;

import controller.BillerEntriTarifRpAdminController;
import function.FormatRupiah;
import function.ValueComboBox;
import javax.swing.JComboBox;

/**
 *
 * @author lenovo
 */
public class panelEntriTarifRpAdmin extends javax.swing.JPanel {
    BillerEntriTarifRpAdminController control = new BillerEntriTarifRpAdminController();
    /**
     * Creates new form panelEntriTarifRpAdmin
     */
    public panelEntriTarifRpAdmin() {
        initComponents();
        control.subproduk(this);
        control.negara(this);
        provinsi.addItem(new ValueComboBox("", ""));
        kabupaten.addItem(new ValueComboBox("", ""));
        kecamatan.addItem(new ValueComboBox("", ""));
        kelurahan.addItem(new ValueComboBox("", ""));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        namasubproduk = new javax.swing.JComboBox();
        harga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        provinsi = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        kabupaten = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        kecamatan = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        kelurahan = new javax.swing.JComboBox();
        negara = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(panelEntriTarifRpAdmin.class, "panelEntriTarifRpAdmin.jLabel6.text")); // NOI18N

        harga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        harga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hargaKeyReleased(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(panelEntriTarifRpAdmin.class, "panelEntriTarifRpAdmin.jLabel2.text")); // NOI18N

        btnsimpan.setBackground(new java.awt.Color(0, 51, 255));
        btnsimpan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(btnsimpan, org.openide.util.NbBundle.getMessage(panelEntriTarifRpAdmin.class, "panelEntriTarifRpAdmin.btnsimpan.text")); // NOI18N
        btnsimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(panelEntriTarifRpAdmin.class, "panelEntriTarifRpAdmin.jLabel7.text")); // NOI18N

        provinsi.setActionCommand(org.openide.util.NbBundle.getMessage(panelEntriTarifRpAdmin.class, "panelEntriTarifRpAdmin.provinsi.actionCommand")); // NOI18N
        provinsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinsiActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(panelEntriTarifRpAdmin.class, "panelEntriTarifRpAdmin.jLabel8.text")); // NOI18N

        kabupaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kabupatenActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(panelEntriTarifRpAdmin.class, "panelEntriTarifRpAdmin.jLabel9.text")); // NOI18N

        kecamatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kecamatanActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(panelEntriTarifRpAdmin.class, "panelEntriTarifRpAdmin.jLabel10.text")); // NOI18N

        negara.setActionCommand(org.openide.util.NbBundle.getMessage(panelEntriTarifRpAdmin.class, "panelEntriTarifRpAdmin.negara.actionCommand")); // NOI18N
        negara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negaraActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(panelEntriTarifRpAdmin.class, "panelEntriTarifRpAdmin.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namasubproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(kelurahan, javax.swing.GroupLayout.Alignment.LEADING, 0, 276, Short.MAX_VALUE)
                                .addComponent(kecamatan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kabupaten, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(provinsi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(negara, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(namasubproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(negara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(provinsi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(kelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargaKeyReleased
        harga.setText(FormatRupiah.format(harga.getText()));
    }//GEN-LAST:event_hargaKeyReleased

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        control.simpan(this);
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void provinsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinsiActionPerformed

        JComboBox combo = (JComboBox) evt.getSource();
        if(combo.isValid()){
            ValueComboBox v = (ValueComboBox) provinsi.getSelectedItem();
            System.out.println(v.getValue());
            control.kabupaten(this);
        }
    }//GEN-LAST:event_provinsiActionPerformed

    private void kabupatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kabupatenActionPerformed

        JComboBox combo = (JComboBox) evt.getSource();
        if(combo.isValid()){
            control.kecamatan(this);
        }
    }//GEN-LAST:event_kabupatenActionPerformed

    private void kecamatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kecamatanActionPerformed

        JComboBox combo = (JComboBox) evt.getSource();
        if(combo.isValid()){
            control.kelurahan(this);
        }
    }//GEN-LAST:event_kecamatanActionPerformed

    private void negaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negaraActionPerformed
        
        JComboBox combo = (JComboBox) evt.getSource();
        if(combo.isValid()){
            control.provinsi(this);
        }
        
    }//GEN-LAST:event_negaraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnsimpan;
    public javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JComboBox kabupaten;
    public javax.swing.JComboBox kecamatan;
    public javax.swing.JComboBox kelurahan;
    public javax.swing.JComboBox namasubproduk;
    public javax.swing.JComboBox negara;
    public javax.swing.JComboBox provinsi;
    // End of variables declaration//GEN-END:variables
}
