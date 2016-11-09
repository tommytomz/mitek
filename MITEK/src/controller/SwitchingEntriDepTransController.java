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
import model.SwitchingEntriDepTransModel;
import view.switching.panelEntriAkunDeposit;
import view.switching.panelEntriDepTrans;

/**
 *
 * @author lenovo
 */
public class SwitchingEntriDepTransController {
    SwitchingEntriDepTransModel model = new SwitchingEntriDepTransModel();
    
    public void deptrans(panelEntriDepTrans inframe){
        
        model.combobox      = inframe.deptrans;
        model.namespace     = "deptrans";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama"};
        model.deptrans();
        
    }
    
    public void simpan(panelEntriDepTrans inframe){
        
        ValueComboBox valuedeptrans = (ValueComboBox) inframe.deptrans.getSelectedItem();

        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("upp", valuedeptrans.getValue()),
                                          new Params("namap", inframe.nama.getText()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan", "sandi"};
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
            inframe.deptrans.setSelectedItem(0);
            inframe.nama.setText("");
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
    }
}
