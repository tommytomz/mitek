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
import model.BillerEntriFeeDefaultMibisModel;
import view.biller.panelEntriFeeDefaultMibis;

/**
 *
 * @author lenovo
 */
public class BillerEntriFeeDefaultMibisController {
    BillerEntriFeeDefaultMibisModel model = new BillerEntriFeeDefaultMibisModel();
    
    public void subproduk(panelEntriFeeDefaultMibis inframe){
        
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
    
    public void simpan(panelEntriFeeDefaultMibis inframe){
        
        ValueComboBox valuesubproduk = (ValueComboBox) inframe.subproduk.getSelectedItem();
        
        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("feeppp", valuesubproduk.getValue()),
                                          new Params("hargap", inframe.harga.getText()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan", "sandi"};
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
            inframe.subproduk.setSelectedIndex(0);
            inframe.harga.setText("");
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
        
    }
}
