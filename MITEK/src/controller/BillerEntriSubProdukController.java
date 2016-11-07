/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import static controller.BillerEntriProdukBillerController.ImageToHex;
import function.Params;
import function.ValueComboBox;
import javax.swing.JOptionPane;
import model.BillerEntriSubProdukModel;
import view.biller.panelEntriSubProduk;

/**
 *
 * @author lenovo
 */
public class BillerEntriSubProdukController {
    BillerEntriSubProdukModel model = new BillerEntriSubProdukModel();
    
    public void tampilproduk(panelEntriSubProduk inframe){
        model.combobox      = inframe.namaproduk;
        model.namespace     = "produk";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "namaproduk"};
        model.tampilproduk();
    }
    
    public void simpan(panelEntriSubProduk inframe){
        try {
            ValueComboBox valueproduk   = (ValueComboBox) inframe.namaproduk.getSelectedItem();
            ValueComboBox valuedk       = (ValueComboBox) inframe.debetkredit.getSelectedItem();
            model.namespace     = "simpan"; 
            model.params        = new Params[]{
                                                new Params("produkp", valueproduk.getValue()),
                                                new Params("namap", inframe.namasubproduk.getText()),
                                                new Params("kodep", inframe.kode.getText()),
                                                new Params("gambarp", ImageToHex(inframe.foto.getText())),
                                                new Params("dkp", valuedk.getValue()),
                                                new Params("rididuser", Main.iduser),
                                                new Params("sesip", Main.session),
                                                new Params("alamatp", Main.ipaddress)
                                              };
                                               
            model.kolom         = new String[]{"respon", "pesan", "sandi"};
            String [] ok = model.simpan();
            if(ok[0].equals("1")){
                JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
                inframe.namaproduk.setSelectedItem("Pilih");
                inframe.namasubproduk.setText("");
                inframe.kode.setText("");
                inframe.foto.setText("");
                inframe.image.setText("");
                inframe.debetkredit.setSelectedItem("Pilih");
            }else{
                JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
