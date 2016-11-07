/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import model.BillerDaftarBillerModel;
import view.biller.panelDaftarBiller;

/**
 *
 * @author lenovo
 */
public class BillerDaftarBillerController {
    BillerDaftarBillerModel model = new BillerDaftarBillerModel();
    
    public void biller(panelDaftarBiller inframe){
        
        model.progresbar    = null;
        model.table         = inframe.tabelbank;
        model.namespace     = "biller";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"RID", "NAMA", "KODE", "GAMBAR"};
        model.biller();
        
    }
}
