/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import function.ValueComboBox;
import javax.swing.JOptionPane;
import model.BillerEntriFeeMibisModel;
import view.biller.panelEntriFeeMibis;

/**
 *
 * @author lenovo
 */
public class BillerEntriFeeMibisController {
    BillerEntriFeeMibisModel model = new BillerEntriFeeMibisModel();
    
    public void mibis(panelEntriFeeMibis inframe){
        
        model.combobox      = inframe.mibis;
        model.namespace     = "mibis";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama"};
        model.mibis();
        
    }
    
    public void subproduk(panelEntriFeeMibis inframe){
        
        model.combobox      = inframe.subproduk;
        model.namespace     = "subproduk";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "namasubproduk"};
        model.subproduk();
        
    }
    
    public void simpan(panelEntriFeeMibis inframe){
        
        ValueComboBox valuemibis = (ValueComboBox) inframe.mibis.getSelectedItem();
        ValueComboBox valuesuproduk = (ValueComboBox) inframe.subproduk.getSelectedItem();
        
        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("mibisp", valuemibis.getValue()),
                                          new Params("feeppp", valuesuproduk.getValue()),
                                          new Params("hargap", inframe.harga.getText()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan", "sandi"};
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
            inframe.mibis.setSelectedItem(0);
            inframe.subproduk.setSelectedItem(0);
            inframe.harga.setText("");
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
        
    }
}
