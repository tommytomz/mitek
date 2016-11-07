/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.rekondana;

import com.toedter.calendar.JDateChooser;
import function.ValueComboBox;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class panelEntriDepositSwitching extends javax.swing.JPanel {

    private JTextField     keterangan;
    private JLabel         labelketerangan;
    
    private JComboBox[]     jenismutasi;
    private JLabel []       labeljenismutasi;
    
    private JComboBox[]     debetkredit;
    private JLabel []       labeldebetkredit;
    
    private JComboBox[]     ridmutasi;
    private JLabel []       labelridmutasi;
    
    private JComboBox[]     ridkor;
    private JLabel []       labelridkor;
    
    private JComboBox[]     transmut;
    private JLabel []       labeltransmut;
    
    private JTextField[]    ref;
    private JLabel []       labelref;
    
    private JTextField[]    ketmut;
    private JLabel []       labelketmut;
    
    private JDateChooser[]  tanggalmutasi;
    private JLabel []       labeltanggalmutasi;
    
    private JTextField[]    rpmutasi;
    private JLabel []       labelrpmutasi;
    
    int b = 10;
    int k = 0;

    /**
     * Creates new form panelEntriDepositSwitching
     */
    public panelEntriDepositSwitching() {
        initComponents();
        
        
        jenismutasi = new JComboBox[10];
        labeljenismutasi = new JLabel[10];
        
        debetkredit = new JComboBox[10];
        labeldebetkredit = new JLabel[10];
        
        ridmutasi = new JComboBox[10];
        labelridmutasi = new JLabel[10];
        
        ridkor = new JComboBox[10];
        labelridkor = new JLabel[10];
        
        transmut = new JComboBox[10];
        labeltransmut = new JLabel[10];
        
        ref = new JTextField[10];
        labelref = new JLabel[10];
        
        ketmut = new JTextField[10];
        labelketmut = new JLabel[10];
        
        tanggalmutasi = new JDateChooser[10];
        labeltanggalmutasi = new JLabel[10];
        
        rpmutasi = new JTextField[10];
        labelrpmutasi = new JLabel[10];
        
        
        keterangan = new JTextField(20);
        labelketerangan = new JLabel("Keterangan");
        
        jenismutasi[0] = new JComboBox();
        labeljenismutasi[0] = new JLabel("jenis Mutasi");
        
        debetkredit[0] = new JComboBox();
        labeldebetkredit[0] = new JLabel("Debet/Kredit");
        
        ridmutasi[0] = new JComboBox();
        labelridmutasi[0] = new JLabel("Akun");
        
        ridkor[0] = new JComboBox();
        labelridkor[0] = new JLabel("Koreksi");
        
        transmut[0] = new JComboBox();
        labeltransmut[0] = new JLabel("Transaksi Mutasi");
        
        ref[0] = new JTextField(20);
        labelref[0] = new JLabel("Referensi");
        
        ketmut[0] = new JTextField(20);
        labelketmut[0] = new JLabel("Keterangan Mutasi");
        
        tanggalmutasi[0] = new JDateChooser();
        labeltanggalmutasi[0] = new JLabel("Tanggal Mutasi");
        
        rpmutasi[0] = new JTextField(20);
        labelrpmutasi[0] = new JLabel("Rupiah");
        
        
        panellabel.setLayout(new GridLayout(10, 1));
        panelcomponent.setLayout(new GridLayout(10, 1));
        
        jenismutasi[0].addItem(new ValueComboBox("", "Pilih"));
        jenismutasi[0].addItem(new ValueComboBox("deposit switching", "Deposit Switching"));
        jenismutasi[0].addItem(new ValueComboBox("kas bank", "Kas Bank"));
        jenismutasi[0].addItem(new ValueComboBox("kas", "Kas"));
        
        debetkredit[0].addItem(new ValueComboBox("", "Pilih"));
        debetkredit[0].addItem(new ValueComboBox("d", "Debet"));
        debetkredit[0].addItem(new ValueComboBox("k", "kredit"));
        
        panellabel.add(labelketerangan);
        panellabel.add(labeljenismutasi[0]);
        panellabel.add(labeldebetkredit[0]);
        panellabel.add(labelridmutasi[0]);
        panellabel.add(labelridkor[0]);
        panellabel.add(labeltransmut[0]);
        panellabel.add(labelref[0]);
        panellabel.add(labelketmut[0]);
        panellabel.add(labeltanggalmutasi[0]);
         panellabel.add(labelrpmutasi[0]);
         
        JPanel pketerangan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pketerangan.add(keterangan);
        pketerangan.setOpaque(false);
        panelcomponent.add(pketerangan);
        
        JPanel pjenismutasi = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pjenismutasi.add(jenismutasi[0]);
        pjenismutasi.setOpaque(false);
        panelcomponent.add(pjenismutasi);
        
        JPanel pdebetkredit = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pdebetkredit.add(debetkredit[0]);
        pdebetkredit.setOpaque(false);
        panelcomponent.add(pdebetkredit);
        
        JPanel pridmut = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pridmut.add(ridmutasi[0]);
        pridmut.setOpaque(false);
        panelcomponent.add(pridmut);

        JPanel pridkor = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pridkor.add(ridkor[0]);
        pridkor.setOpaque(false);
        panelcomponent.add(pridkor);
        
        JPanel ptransmut = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ptransmut.add(transmut[0]);
        ptransmut.setOpaque(false);
        panelcomponent.add(ptransmut);
        
        JPanel pref = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pref.add(ref[0]);
        pref.setOpaque(false);
        panelcomponent.add(pref);
        
        JPanel pketmut = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pketmut.add(ketmut[0]);
        pketmut.setOpaque(false);
        panelcomponent.add(pketmut);
        
        JPanel ptanggalmutasi = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ptanggalmutasi.add(tanggalmutasi[0]);
        ptanggalmutasi.setOpaque(false);
        panelcomponent.add(ptanggalmutasi);
        
        JPanel prpmutasi = new JPanel(new FlowLayout(FlowLayout.LEFT));
        prpmutasi.add(rpmutasi[0]);
        prpmutasi.setOpaque(false);
        panelcomponent.add(prpmutasi);
        
        this.revalidate();
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        panelcomponent = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panellabel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(panelEntriDepositSwitching.class, "panelEntriDepositSwitching.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        panelcomponent.setOpaque(false);

        javax.swing.GroupLayout panelcomponentLayout = new javax.swing.GroupLayout(panelcomponent);
        panelcomponent.setLayout(panelcomponentLayout);
        panelcomponentLayout.setHorizontalGroup(
            panelcomponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        panelcomponentLayout.setVerticalGroup(
            panelcomponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        panellabel.setOpaque(false);

        javax.swing.GroupLayout panellabelLayout = new javax.swing.GroupLayout(panellabel);
        panellabel.setLayout(panellabelLayout);
        panellabelLayout.setHorizontalGroup(
            panellabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );
        panellabelLayout.setVerticalGroup(
            panellabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panellabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelcomponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panellabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelcomponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        k++;
        b++;
        
        ref[k] = new JTextField(20);
        labelref[k] = new JLabel("Total");
        
        rpmutasi[k] = new JTextField(20);
        labelrpmutasi[k] = new JLabel("Rupiah");
        
        panellabel.setLayout(new GridLayout((b + 1), 1));
        panelcomponent.setLayout(new GridLayout((b + 1), 1));
        
        
        panellabel.add(labelref[k]);
        panellabel.add(labelrpmutasi[k]);
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(ref[k]);
        p.add(rpmutasi[k]);
        p.setOpaque(false);
        
        panelcomponent.add(p);

        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelcomponent;
    private javax.swing.JPanel panellabel;
    // End of variables declaration//GEN-END:variables
    
}
