/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import model.SwitchingDaftarFeeppModel;
import view.switching.panelDaftarFeepp;

/**
 *
 * @author lenovo
 */
public class SwitchingDaftarFeeppController {
    SwitchingDaftarFeeppModel model = new SwitchingDaftarFeeppModel();
    
    public void feepp(panelDaftarFeepp inframe){
        
        model.progresbar    = null;
        model.table         = inframe.tabelfeepp;
        model.namespace     = "feep";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"NAMA SUB PRODUK", "KODE SUB PRODUK", "DK SUB PRODUK", "NAMA PRODUK", "KODE PRODUK", "NAMA BILLER", "KODE BILLER", "METODE FEE", "ACUAN FEE"};
        model.feepp();
        
    }
}
