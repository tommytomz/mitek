/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.switching;

import controller.SwitchingDaftarGrupSaldoController;

/**
 *
 * @author lenovo
 */
public class panelDaftarGrupSaldo extends javax.swing.JPanel {
    SwitchingDaftarGrupSaldoController control = new SwitchingDaftarGrupSaldoController();
    /**
     * Creates new form panelGrupSaldo
     */
    public panelDaftarGrupSaldo() {
        initComponents();
        control.grupsaldo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelgrupsaldo = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        tabelgrupsaldo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelgrupsaldo.setColumnSelectionAllowed(true);
        tabelgrupsaldo.setRowHeight(25);
        jScrollPane1.setViewportView(tabelgrupsaldo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabelgrupsaldo;
    // End of variables declaration//GEN-END:variables
}
