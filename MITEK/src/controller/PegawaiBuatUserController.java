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
import model.PegawaiBuatUserModel;
import view.pegawai.panelBuatUserPegawai;

/**
 *
 * @author Tommy
 */
public class PegawaiBuatUserController {
    PegawaiBuatUserModel model = new PegawaiBuatUserModel();
    
    public void pegawai(panelBuatUserPegawai inframe){
        
        model.combobox      = inframe.pegawai;
        model.namespace     = "pegawai";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama", "pesan"};
        model.pegawai();
        
    }
    
    public void simpan(panelBuatUserPegawai inframe){
        
        ValueComboBox value = (ValueComboBox) inframe.pegawai.getSelectedItem();
        model.combobox      = inframe.pegawai;
        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("orangp", value.getValue()),
                                          new Params("idins", inframe.idins.getText()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan", "sandi"};
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan \nSandi Sementara : "+ok[2], "Sukses", 1);
            inframe.pegawai.setSelectedIndex(0);
            inframe.idins.setText("");
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
        
    }
}
