/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.pegawai;

import controller.PegawaiHakAksesController;
import function.ColumnsAutoSizer;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author lenovo
 */
public class panelHakAksesPegawai extends javax.swing.JPanel {
    PegawaiHakAksesController control = new PegawaiHakAksesController();
    /**
     * Creates new form panelHakAksesPegawai
     */
    public panelHakAksesPegawai() {
        initComponents();
        control.pegawai(this);
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
        pegawai = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelhakakses = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(panelHakAksesPegawai.class, "panelHakAksesPegawai.jLabel1.text")); // NOI18N

        pegawai.setActionCommand(org.openide.util.NbBundle.getMessage(panelHakAksesPegawai.class, "panelHakAksesPegawai.pegawai.actionCommand")); // NOI18N
        pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegawaiActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(panelHakAksesPegawai.class, "panelHakAksesPegawai.jLabel2.text")); // NOI18N

        tabelhakakses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelhakakses.setColumnSelectionAllowed(true);
        tabelhakakses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelhakakses.setRowHeight(25);
        tabelhakakses.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tabelhakakses);

        btnsimpan.setBackground(new java.awt.Color(0, 51, 255));
        btnsimpan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(btnsimpan, org.openide.util.NbBundle.getMessage(panelHakAksesPegawai.class, "panelHakAksesPegawai.btnsimpan.text")); // NOI18N
        btnsimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)))
                    .addComponent(btnsimpan))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnsimpan)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegawaiActionPerformed
        JComboBox combo = (JComboBox) evt.getSource();
        if(combo.isValid()){

            control.hakakses(this);
            DefaultTableModel dtm = (DefaultTableModel) tabelhakakses.getModel();
            dtm.addColumn("");

            TableColumn tc = tabelhakakses.getColumnModel().getColumn(2);
            tc.setCellEditor(tabelhakakses.getDefaultEditor(Boolean.class));
            tc.setCellRenderer(tabelhakakses.getDefaultRenderer(Boolean.class));
            ColumnsAutoSizer.sizeColumnsToFit(tabelhakakses);
            ColumnsAutoSizer.hiddenColumn(tabelhakakses, 0);
            tabelhakakses.moveColumn(2, 0);
            for (int i = 0; i < tabelhakakses.getRowCount(); i++) {
                tabelhakakses.setValueAt(false, i, 0);
            }
        }
    }//GEN-LAST:event_pegawaiActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed

        ArrayList<String> hakakses = new ArrayList<>();
        for (int i = 0; i < tabelhakakses.getRowCount(); i++) {
            Boolean isChecked = (Boolean) tabelhakakses.getValueAt(i, 0);
            if(isChecked){
                hakakses.add(tabelhakakses.getValueAt(i, 1).toString());
            }
        }
        control.simpan(this, hakakses);
    }//GEN-LAST:event_btnsimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox pegawai;
    public javax.swing.JTable tabelhakakses;
    // End of variables declaration//GEN-END:variables
}
