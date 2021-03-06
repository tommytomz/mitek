/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.mitek.panelDaftarFeepp;
import view.mitek.panelEntriFeepp;
import view.switching.panelEntriGrupSaldo;
import view.switching.panelEntriProdukSwitching;
import view.switching.panelEntriSwitching;
import controller.LoginController;
import function.Menu;
import function.ShowFrame;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;
import config.Main;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.netbeans.swing.tabcontrol.DefaultTabDataModel;
import org.netbeans.swing.tabcontrol.TabData;
import org.netbeans.swing.tabcontrol.TabbedContainer;
import view.biller.*;
import view.login.DialogUser;
import view.pegawai.panelBuatUserPegawai;
import view.pegawai.panelEntriPegawai;
import view.pegawai.panelHakAksesPegawai;
import view.pegawai.panelResetSandiPegawai;
import view.rekondana.panelEntriDepositSwitching;
import view.switching.*;
import view.mitek.*;

/**
 *
 * @author Tommy
 */
public class FrameUtama extends javax.swing.JFrame {
    Menu [] menu = null;
    LoginController control = new LoginController();
    ShowFrame sf = new ShowFrame();
    public static DefaultTabDataModel dtdm;
    public String namanode;
    /**
     * Creates new form FrameUtama
     */
    public FrameUtama() {
        dtdm  = new DefaultTabDataModel();
        dtdm.addTab(0 , new TabData(new panel(), null, "Home", "Home"));
        initComponents();
        
        tabpage.getSelectionModel().setSelectedIndex(tabpage.getTabCount()-1);
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        ImageIcon icon = new ImageIcon("src/images/ido.png");
        this.setIconImage(icon.getImage());
        
//        this.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent we){
//                FrameLogin flogin = new FrameLogin();
//                int pilih = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar dari aplikasi ini ?", "Informasi", JOptionPane.OK_CANCEL_OPTION);
//                if(pilih == JOptionPane.OK_OPTION){
//                    control.logout(flogin, FrameUtama.this);
//                }
//            }
//        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpframe = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeMenu = new javax.swing.JTree();
        panelatas = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tabpage = new org.netbeans.swing.tabcontrol.TabbedContainer(dtdm, TabbedContainer.TYPE_EDITOR);

        dpframe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dpframe.setOpaque(false);

        javax.swing.GroupLayout dpframeLayout = new javax.swing.GroupLayout(dpframe);
        dpframe.setLayout(dpframeLayout);
        dpframeLayout.setHorizontalGroup(
            dpframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dpframeLayout.setVerticalGroup(
            dpframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".: MITRA TEKNIS :.");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        treeMenu.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Menu MITEK");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Pendaftaran");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Rekon Data");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Rekon Dana");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Deposit Switching");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Pegawai");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Data Pegawai");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Buat User Pegawai");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Hak Akses Pegawai");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reset Sandi Pegawai");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Biller");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Bank");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Biller");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Bentuk Deposit");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Fee Mibis");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Fee Default Mibis");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Harga Sub Produk");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Produk Biller");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Sub Produk");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Tarif Fee");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Rupiah Admin");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Biller");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Produk");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Sub Produk");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Harga Sub Produk");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Tarif Fee");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Tarif Rp Admin");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mitek");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Dasar Fee Produk");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Grup Saldo Mitek");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Dasar Fee Produk");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Switching");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Akun Deposit");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Akun Utpi");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Dep Trans");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Dasar Fee Produk");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Grup Saldo");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Switching");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Produk Switching");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entri Utpi Trans");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Akun Deposit");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Dasar Fee Produk");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Grup Saldo");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Switching");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Daftar Produk Switching");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Pesediaan");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Tools");
        treeNode1.add(treeNode2);
        treeMenu.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        treeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(treeMenu);

        panelatas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelatas.setOpaque(false);

        lbluser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbluser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbluser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbluserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelatasLayout = new javax.swing.GroupLayout(panelatas);
        panelatas.setLayout(panelatasLayout);
        panelatasLayout.setHorizontalGroup(
            panelatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelatasLayout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelatasLayout.setVerticalGroup(
            panelatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelatasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ido.png"))); // NOI18N

        tabpage.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelatas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(panelatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tabpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lbluser.setText(Main.user);
    }//GEN-LAST:event_formWindowActivated

    private void lbluserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbluserMouseClicked
        DialogUser duser = new DialogUser(this, true);
        duser.setVisible(true);
    }//GEN-LAST:event_lbluserMouseClicked

    private void treeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeMenuMouseClicked
        menupegawai();
        menubiller();
        menumitek();
        menuswitching();
    }//GEN-LAST:event_treeMenuMouseClicked
    
    private void menupegawai(){
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) treeMenu.getLastSelectedPathComponent();
        namanode = node.toString();
            if(node.isLeaf()){
                //pegawai
                if(namanode.equals("Data Pegawai")){
                    addTab(tabpage, dtdm, new panelEntriPegawai(), null, "Data Pegawai", "Data Pegawai");
                }
                if(namanode.equals("Buat User Pegawai")){
                    addTab(tabpage, dtdm, new panelBuatUserPegawai(), null, "Buat User Pegawai", "Buat User Pegawai");
                }
                if(namanode.equals("Hak Akses Pegawai")){
                    addTab(tabpage, dtdm, new panelHakAksesPegawai(), null, "Hak Akses Pegawai", "Hak Akses Pegawai");
                }
                if(namanode.equals("Reset Sandi Pegawai")){
                    addTab(tabpage, dtdm, new panelResetSandiPegawai(), null, "Reset Sandi Pegawai", "Reset Sandi Pegawai");
                }
            }
    }
    
    private void menubiller(){
        //TreePath tp = treeMenu.getPathForLocation(this.getX(), this.getY());
        //if(tp!=null){
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) treeMenu.getLastSelectedPathComponent();
            namanode = node.toString();
            if(node.isLeaf()){
                
                //biller
                if(namanode.equals("Entri Bank")){
                    addTab(tabpage, dtdm, new panelEntriBank(), null, "Entri Bank", "Entri Bank");
                }
                if(namanode.equals("Entri Biller")){
                    addTab(tabpage, dtdm, new panelEntriBiller(), null, "Entri Biller", "Entri Biller");
                }
                if(namanode.equals("Entri Produk Biller")){
                    addTab(tabpage, dtdm, new panelEntriProdukBiller(), null, "Entri Produk Biller", "Entri Produk Biller");
                }
                if(namanode.equals("Entri Sub Produk")){
                    addTab(tabpage, dtdm, new panelEntriSubProduk(), null, "Entri Sub Produk", "Entri Sub Produk");
                }
                if(namanode.equals("Entri Fee Mibis")){
                    addTab(tabpage, dtdm, new panelEntriFeeMibis(), null, "Entri Fee Mibis", "Entri Fee Mibis");
                }
                if(namanode.equals("Entri Fee Default Mibis")){
                    addTab(tabpage, dtdm, new panelEntriFeeDefaultMibis(), null, "Entri Fee Default Mibis", "Entri Fee Default Mibis");
                }
                if(namanode.equals("Entri Tarif Fee")){
                    addTab(tabpage, dtdm, new panelEntriTarifFee(), null, "Entri Tarif Fee", "Entri Tarif Fee");
                }
                if(namanode.equals("Entri Harga Sub Produk")){
                    addTab(tabpage, dtdm, new panelEntriHargaSubProduk(), null, "Entri Harga Sub Produk", "Entri Harga Sub Produk");
                }
                if(namanode.equals("Entri Rupiah Admin")){
                    addTab(tabpage, dtdm, new panelEntriTarifRpAdmin(), null, "Entri Rupiah Admin", "Entri Rupiah Admin");
                }
                
                if(namanode.equals("Daftar Biller")){
                    addTab(tabpage, dtdm, new panelDaftarBiller(), null, "Daftar Biller", "Daftar Biller");
                }
                if(namanode.equals("Daftar Produk")){
                    addTab(tabpage, dtdm, new panelDaftarProduk(), null, "Daftar Produk", "Daftar Produk");
                }
                if(namanode.equals("Daftar Sub Produk")){
                    addTab(tabpage, dtdm, new panelDaftarSubProduk(), null, "Daftar Sub Produk", "Daftar Sub Produk");
                }
                if(namanode.equals("Daftar Harga Sub Produk")){
                    addTab(tabpage, dtdm, new panelDaftarHargaSubProduk(), null, "Daftar Harga Sub Produk", "Daftar Harga Sub Produk");
                }
                if(namanode.equals("Daftar Tarif Fee")){
                    addTab(tabpage, dtdm, new panelDaftarTarifFee(), null, "Daftar Tarif Fee", "Daftar Tarif Fee");
                }
                if(namanode.equals("Daftar Tarif Rp Admin")){
                    addTab(tabpage, dtdm, new panelDaftarTarifRpAdmin(), null, "Daftar Tarif Rupiah Admin", "Daftar Tarif Rupiah Admin");
                }
                
            }
            
        //}
    }
    
    private void menumitek(){
        //TreePath tp = treeMenu.getPathForLocation(this.getX(), this.getY());
        //if(tp!=null){
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) treeMenu.getLastSelectedPathComponent();
            namanode = node.toString();
            if(node.isLeaf()){
                if(namanode.equals("Entri Dasar Fee Produk")){
                    addTab(tabpage, dtdm, new panelEntriFeepp(), null, "Entri Dasar Fee Produk", "Entri Dasar Fee Produk");
                }
                if(namanode.equals("Entri Grup Saldo Mitek")){
                    addTab(tabpage, dtdm, new view.mitek.panelEntriGrupSaldo(), null, "Entri Grup Saldo Mitek", "Entri Grup Saldo Mitek");
                }
                
                if(namanode.equals("Daftar Dasar Fee Produk")){
                    addTab(tabpage, dtdm, new panelDaftarFeepp(), null, "Daftar Dasar Fee Produk", "Daftar Dasar Fee Produk");
                }
            }
            
        //}
    }
    
    private void menuswitching(){

            DefaultMutableTreeNode node = (DefaultMutableTreeNode) treeMenu.getLastSelectedPathComponent();
            namanode = node.toString();
            if(node.isLeaf()){
                if(namanode.equals("Entri Akun Deposit")){
                    addTab(tabpage, dtdm, new panelEntriAkunDeposit(), null, "Entri Akun Deposit", "Entri Akun Deposit");
                }
                if(namanode.equals("Entri Akun Utpi")){
                    addTab(tabpage, dtdm, new panelEntriAkunUtpi(), null, "Entri Akun Utpi", "Entri Akun Utpi");
                }
                if(namanode.equals("Entri Produk Switching")){
                    addTab(tabpage, dtdm, new panelEntriProdukSwitching(), null, "Entri Produk Switching", "Entri Produk Switching");
                }
                if(namanode.equals("Entri Switching")){
                    addTab(tabpage, dtdm, new panelEntriSwitching(), null, "Entri Switching", "Entri Switching");
                }
                if(namanode.equals("Entri Grup Saldo")){
                    addTab(tabpage, dtdm, new panelEntriGrupSaldo(), null, "Entri Grup Saldo", "Entri Grup Saldo");
                }
                if(namanode.equals("Entri Dep Trans")){
                    addTab(tabpage, dtdm, new panelEntriDepTrans(), null, "Entri Dep Trans", "Entri Dep Trans");
                }
                if(namanode.equals("Entri Utpi Trans")){
                    addTab(tabpage, dtdm, new panelEntriUtpiTrans(), null, "Entri Utpi Trans", "Entri Utpi Trans");
                }
                
                
                if(namanode.equals("Daftar Akun Deposit")){
                    addTab(tabpage, dtdm, new panelDaftarAkunDeposit(), null, "Daftar Akun Deposit", "Daftar Akun Deposit");
                }
                if(namanode.equals("Daftar Switching")){
                    addTab(tabpage, dtdm, new panelDaftarSwitching(), null, "Daftar Switching", "Daftar Switching");
                }
                if(namanode.equals("Daftar Produk Switching")){
                    addTab(tabpage, dtdm, new panelDaftarProdukSwitching(), null, "Daftar Produk Switching", "Daftar Produk Switching");
                }
                if(namanode.equals("Daftar Grup Saldo")){
                    addTab(tabpage, dtdm, new panelDaftarGrupSaldo(), null, "Daftar Grup Saldo", "Daftar Grup Saldo");
                }
                
                
                if(namanode.equals("Entri Deposit Switching")){
                    addTab(tabpage, dtdm, new panelEntriDepositSwitching(), null, "Entri Deposit Switching", "Entri Deposit Switching");
                }
            }
                
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUtama().setVisible(true);
            }
        });
    }
    
    public static void addTab(TabbedContainer tab, DefaultTabDataModel dtdm, JPanel panel, Icon icon, String caption, String tooltip ){
        
        TabData td = new TabData(new JScrollPane(panel), icon, caption, tooltip);
        List<TabData> index = tab.getModel().getTabs();
        int idx=0;
        for(int i=0; i<index.size(); i++){
           if(td.getText().equals(index.get(i).toString())){
               idx=i;
           }
        }
            
        if(idx<1){
            dtdm.addTab(tab.getTabCount(), td);
            tab.getSelectionModel().setSelectedIndex(tab.getTabCount()-1);
        }
        else{
            tab.getSelectionModel().setSelectedIndex(idx);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane dpframe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPanel panelatas;
    public static org.netbeans.swing.tabcontrol.TabbedContainer tabpage;
    public static javax.swing.JTree treeMenu;
    // End of variables declaration//GEN-END:variables
}
