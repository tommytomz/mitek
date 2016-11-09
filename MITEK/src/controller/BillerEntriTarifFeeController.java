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
import model.BillerEntriTarifFeeModel;
import view.biller.panelEntriTarifFee;

/**
 *
 * @author lenovo
 */
public class BillerEntriTarifFeeController {
    BillerEntriTarifFeeModel model = new BillerEntriTarifFeeModel();
    
    public void subproduk(panelEntriTarifFee inframe){
        
        ValueComboBox valueswitching = (ValueComboBox) inframe.namaswitching.getSelectedItem();
        model.combobox      = inframe.namasubproduk;
        model.namespace     = "subproduk";
        model.params        = new Params[]{
                                          new Params("ridswitching", valueswitching.getValue()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "namasubproduk"};
        model.subproduk();
        
    }
    
    public void switching(panelEntriTarifFee inframe){
        
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
    
    public void feema(panelEntriTarifFee inframe){
        
        model.combobox      = inframe.metode;
        model.namespace     = "feema";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "metode"};
        model.feema();
        
    }
    
    public void simpan(panelEntriTarifFee inframe){
        
        ValueComboBox valuesuproduk  = (ValueComboBox) inframe.namasubproduk.getSelectedItem();
        ValueComboBox valueswitching = (ValueComboBox) inframe.namaswitching.getSelectedItem();
        ValueComboBox valuedk        = (ValueComboBox) inframe.debetkredit.getSelectedItem();
        ValueComboBox valuemetode    = (ValueComboBox) inframe.metode.getSelectedItem();
        ValueComboBox valuecb        = (ValueComboBox) inframe.cb.getSelectedItem();
        
        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("subprodukp", valuesuproduk.getValue()),
                                          new Params("switchingp", valueswitching.getValue()),
                                          new Params("dk", valuedk.getValue()),
                                          new Params("feemap", valuemetode.getValue()),
                                          new Params("cbp", valuecb.getValue()),
                                          new Params("hargap", inframe.harga.getText().replaceAll(".", "")),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan", "sandi"};
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
            inframe.namasubproduk.setSelectedItem(0);
            inframe.namaswitching.setSelectedItem(0);
            inframe.debetkredit.setSelectedItem(0);
            inframe.metode.setSelectedItem(0);
            inframe.harga.setText("");
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
    }
}
