/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import function.ValueComboBox;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PegawaiHakAksesModel;
import view.pegawai.panelHakAksesPegawai;

/**
 *
 * @author Tommy
 */
public class PegawaiHakAksesController {
    PegawaiHakAksesModel model = new PegawaiHakAksesModel();
    
    public void pegawai(panelHakAksesPegawai inframe){
        
        model.combobox      = inframe.pegawai;
        model.namespace     = "pegawai";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama"};
        model.pegawai();

    }
    
    public void hakakses(panelHakAksesPegawai inframe){
        ValueComboBox value = (ValueComboBox) inframe.pegawai.getSelectedItem();
        model.table         = inframe.tabelhakakses;
        model.namespace     = "hakakses";
        model.params        = new Params[]{
                                          new Params("orangp", value.getValue()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama"};
        model.hakkases();
    }
    
    public void simpan(panelHakAksesPegawai inframe, ArrayList<String> hakakses){

        ValueComboBox value = (ValueComboBox) inframe.pegawai.getSelectedItem();
        model.namespace     = "simpan";
        String hasil=null;
        for (int i = 0; i < hakakses.size(); i++) {
            model.params        = new Params[]{
                                          new Params("orangp", value.getValue()),
                                          new Params("hakp", hakakses.get(i)),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
            model.kolom         = new String[]{"respon", "pesan"};
            String ok [] = model.simpan();
            if(ok[0].equals("1")){
                hasil = ok[0];
            }
            else{
                hasil = ok[1];
            }
        }
        
        
        if(hasil.equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);    
        }else{
            JOptionPane.showMessageDialog(inframe, hasil, "Gagal", 0);
        }
    }
}
