/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.biller;

import controller.BillerEntriHargaSubProdukController;
import function.FormatRupiah;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JComboBox;

/**
 *
 * @author lenovo
 */
public class panelEntriHargaSubProduk extends javax.swing.JPanel {
    BillerEntriHargaSubProdukController control = new BillerEntriHargaSubProdukController();
    /**
     * Creates new form PanelEntriHargaSubProduk
     */
    public panelEntriHargaSubProduk() {
        initComponents();
        control.switching(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        namasubproduk = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        namaswitching = new javax.swing.JComboBox<>();
        btnsimpan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(panelEntriHargaSubProduk.class, "panelEntriHargaSubProduk.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(panelEntriHargaSubProduk.class, "panelEntriHargaSubProduk.jLabel4.text")); // NOI18N

        namaswitching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaswitchingActionPerformed(evt);
            }
        });

        btnsimpan.setBackground(new java.awt.Color(0, 51, 255));
        btnsimpan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(btnsimpan, org.openide.util.NbBundle.getMessage(panelEntriHargaSubProduk.class, "panelEntriHargaSubProduk.btnsimpan.text")); // NOI18N
        btnsimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(panelEntriHargaSubProduk.class, "panelEntriHargaSubProduk.jLabel6.text")); // NOI18N

        harga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        harga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hargaKeyReleased(evt);
            }
        });

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
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namasubproduk, 0, 321, Short.MAX_VALUE)
                            .addComponent(namaswitching, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaswitching, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(namasubproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        control.simpan(this);
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void hargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargaKeyReleased
       harga.setText(FormatRupiah.format(harga.getText()));
    }//GEN-LAST:event_hargaKeyReleased

    private void namaswitchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaswitchingActionPerformed
        JComboBox combo = (JComboBox) evt.getSource();
        if(combo.isValid()){
            control.subproduk(this);
        }
    }//GEN-LAST:event_namaswitchingActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnsimpan;
    public javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JComboBox namasubproduk;
    public javax.swing.JComboBox<String> namaswitching;
    // End of variables declaration//GEN-END:variables
}
