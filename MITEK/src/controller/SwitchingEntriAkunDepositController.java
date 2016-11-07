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
import model.SwitchingEntriAkunDepositModel;
import view.switching.panelEntriAkunDeposit;

/**
 *
 * @author lenovo
 */
public class SwitchingEntriAkunDepositController {
    SwitchingEntriAkunDepositModel model = new SwitchingEntriAkunDepositModel();
    
    public void switching(panelEntriAkunDeposit inframe){
        
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
    
    public void grupsaldo(panelEntriAkunDeposit inframe){
        
        model.combobox      = inframe.grupsaldo;
        model.namespace     = "grupsaldo";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama"};
        model.grupsaldo();
        
    }
    
    public void simpan(panelEntriAkunDeposit inframe){
        
        ValueComboBox valueswitching = (ValueComboBox) inframe.namaswitching.getSelectedItem();
        ValueComboBox valuegrupsaldo = (ValueComboBox) inframe.grupsaldo.getSelectedItem();

        
        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("switchingp", valueswitching.getValue()),
                                          new Params("grupsaldo", valuegrupsaldo.getValue()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan", "sandi"};
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
            inframe.namaswitching.setSelectedItem(0);
            inframe.grupsaldo.setSelectedItem(0);
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
    }
}
