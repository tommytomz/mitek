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
import model.MitekEntriFeeppModel;
import view.mitek.panelEntriFeepp;

/**
 *
 * @author lenovo
 */
public class MitekEntriFeeppController {
    MitekEntriFeeppModel model = new MitekEntriFeeppModel();
    
    public void subproduk(panelEntriFeepp inframe){
        
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
    
    public void feemap(panelEntriFeepp inframe){
        
        model.combobox      = inframe.feemap;
        model.namespace     = "feema";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "metode"};
        model.feemap();
        
    }
    
    public void simpan(panelEntriFeepp inframe){
        
        ValueComboBox valuesubproduk = (ValueComboBox) inframe.subproduk.getSelectedItem();
        ValueComboBox valuefeemap    = (ValueComboBox) inframe.feemap.getSelectedItem();
        
        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("subprodukp", valuesubproduk.getValue()),
                                          new Params("feemap", valuefeemap.getValue()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan"};
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
            inframe.subproduk.setSelectedIndex(0);
            inframe.feemap.setSelectedIndex(0);
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
    }
}
