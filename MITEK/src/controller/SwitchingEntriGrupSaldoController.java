/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import javax.swing.JOptionPane;
import model.SwitchingEntriGrupSaldoModel;
import view.switching.panelEntriGrupSaldo;


/**
 *
 * @author lenovo
 */
public class SwitchingEntriGrupSaldoController {
    SwitchingEntriGrupSaldoModel model = new SwitchingEntriGrupSaldoModel();
    
    public void simpan(panelEntriGrupSaldo inframe){
        try {
            
            model.namespace     = "simpan"; 
            model.params        = new Params[]{
                                                new Params("namap", inframe.namagrupsaldo.getText()),                                                
                                                new Params("rididuser", Main.iduser),
                                                new Params("sesip", Main.session),
                                                new Params("alamatp", Main.ipaddress)
                                              };
                                               
            model.kolom         = new String[]{"respon", "pesan", "sandi"};
            String [] ok = model.simpan();
            if(ok[0].equals("1")){
                JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);              
                inframe.namagrupsaldo.setText("");
                
            }else{
                JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
