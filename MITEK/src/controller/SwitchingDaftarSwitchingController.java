/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import model.SwitchingDaftarSwitchingModel;
import view.switching.panelDaftarSwitching;

/**
 *
 * @author lenovo
 */
public class SwitchingDaftarSwitchingController {
    SwitchingDaftarSwitchingModel model = new SwitchingDaftarSwitchingModel();
    
    public void switching(panelDaftarSwitching inframe){
        
        model.progresbar    = null;
        model.table         = inframe.tabelswitching;
        model.namespace     = "switching";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"RID", "NAMA", "KODE"};
        model.switching();
        
    }
}
