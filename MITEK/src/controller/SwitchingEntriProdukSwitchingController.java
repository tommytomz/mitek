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
import model.SwitchingEntriProdukSwitchingModel;
import view.switching.panelEntriProdukSwitching;

/**
 *
 * @author lenovo
 */
public class SwitchingEntriProdukSwitchingController {
    SwitchingEntriProdukSwitchingModel model = new SwitchingEntriProdukSwitchingModel();
    
    public void subproduk(panelEntriProdukSwitching inframe){
        
        model.combobox      = inframe.namasubproduk;
        model.namespace     = "subproduk";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "namasubproduk"};
        model.subproduk();
        
    }
    
    public void switching(panelEntriProdukSwitching inframe){
        
        model.combobox      = inframe.namaswitching;
        model.namespace     = "switching";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama"};
        model.switching();
        
    }
    
    public void bank(panelEntriProdukSwitching inframe){
        
        model.combobox      = inframe.namabank;
        model.namespace     = "bank";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama"};
        model.switching();
        
    }
    
    public void grupsaldo(panelEntriProdukSwitching inframe){
        
        model.combobox      = inframe.grupsaldo;
        model.namespace     = "grupsaldo";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama"};
        model.switching();
        
    }
    
    public void simpan(panelEntriProdukSwitching inframe){
        
        ValueComboBox valuesuproduk     = (ValueComboBox) inframe.namasubproduk.getSelectedItem();
        ValueComboBox valueswitching    = (ValueComboBox) inframe.namaswitching.getSelectedItem();
        ValueComboBox valuesbank        = (ValueComboBox) inframe.namabank.getSelectedItem();
        ValueComboBox valuesgeupsaldo   = (ValueComboBox) inframe.grupsaldo.getSelectedItem();
        
        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("subprodukp", valuesuproduk.getValue()),
                                          new Params("switchingp", valueswitching.getValue()),
                                          new Params("bankp", valuesbank.getValue()),
                                          new Params("grupsaldop", valuesgeupsaldo.getValue()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan", "sandi"};
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
            inframe.namasubproduk.setSelectedIndex(0);
            inframe.namaswitching.setSelectedIndex(0);
            inframe.namabank.setSelectedIndex(0);
            inframe.grupsaldo.setSelectedIndex(0);
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
    }
}
