/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import model.SwitchingDaftarProdukSwitchingModel;
import view.switching.panelDaftarProdukSwitching;

/**
 *
 * @author lenovo
 */
public class SwitchingDaftarProdukSwitchingController {
    SwitchingDaftarProdukSwitchingModel model = new SwitchingDaftarProdukSwitchingModel();
    
    public void produkswitching(panelDaftarProdukSwitching inframe){
        
        model.progresbar    = null;
        model.table         = inframe.tabelprodukswitching;
        model.namespace     = "produkswitching";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"RID", "NAMA SWITCHING", "NAMA SUB PRODUK", "NAMA GRUP SALDO", "NAMA BANK"};
        model.produkswitching();
        
    }
}
