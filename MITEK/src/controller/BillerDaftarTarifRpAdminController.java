/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import model.BillerDaftarTarifRpAdminModel;
import view.biller.panelDaftarTarifRpAdmin;

/**
 *
 * @author lenovo
 */
public class BillerDaftarTarifRpAdminController {
    BillerDaftarTarifRpAdminModel model = new BillerDaftarTarifRpAdminModel();
    
    public void tarifrpadmin(panelDaftarTarifRpAdmin inframe){
        
        model.progresbar    = null;
        model.table         = inframe.tabeltarifrpadmin;
        model.namespace     = "tarifrpadmin";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"NAMA SUB PRODUK", "KODE SUB PRODUK", "NAMA DAERAH", "HARGA"};
        model.tarifrpadmin();
        
    }
}
