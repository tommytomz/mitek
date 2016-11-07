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
import model.PegawaiResetSandiModel;
import view.pegawai.panelResetSandiPegawai;

/**
 *
 * @author lenovo
 */
public class PegawaiResetSandiController {
    PegawaiResetSandiModel model = new PegawaiResetSandiModel();
    
    public void pegawai(panelResetSandiPegawai inframe){
        model.combobox      = inframe.pegawai;
        model.namespace     = "pegawai";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"id", "nama", "pesan"};
        model.pegawai();
    }
    
    public void simpan(panelResetSandiPegawai inframe){
        
        ValueComboBox value = (ValueComboBox) inframe.pegawai.getSelectedItem();
        model.combobox      = inframe.pegawai;
        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("idr", value.getValue()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan", "sandio"};
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan \nSandi Sementara : "+ok[2], "Sukses", 1);
            inframe.pegawai.setSelectedItem(new ValueComboBox("", "Piltommyih"));
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
    }
}
