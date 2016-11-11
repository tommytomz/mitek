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
import model.SwitchingEntriUtpiTransModel;
import view.switching.panelEntriUtpiTrans;

/**
 *
 * @author lenovo
 */
public class SwitchingEntriUtpiTransController {
    SwitchingEntriUtpiTransModel model = new SwitchingEntriUtpiTransModel();
    
    public void uptitrans(panelEntriUtpiTrans inframe){
        
        model.combobox      = inframe.uptitrans;
        model.namespace     = "utpitrans";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama"};
        model.uptitrans();
        
    }
    
    public void simpan(panelEntriUtpiTrans inframe){
        
        ValueComboBox valuesuptitrans   = (ValueComboBox) inframe.uptitrans.getSelectedItem();
        
        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("upp", valuesuptitrans.getValue()),
                                          new Params("namap", inframe.nama.getText()),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan", "sandi"};
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
            inframe.uptitrans.setSelectedIndex(0);
            inframe.nama.setText("");
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
    }
}
