/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import model.BillerDaftarProdukModel;
import view.biller.panelDaftarProduk;

/**
 *
 * @author lenovo
 */
public class BillerDaftarProdukController {
    BillerDaftarProdukModel model = new BillerDaftarProdukModel();
    
    public void biller(panelDaftarProduk inframe){
        
        model.progresbar    = null;
        model.table         = inframe.tabelproduk;
        model.namespace     = "produk";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"RID", "NAMA PRODUK", "KODE PRODUK", "NAMA BILLER", "KODE BILLER"};
        model.produk();
        
    }
}
