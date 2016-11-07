/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import model.BillerDaftarSubProdukModel;
import view.biller.panelDaftarSubProduk;

/**
 *
 * @author lenovo
 */
public class BillerDaftarSubProdukController {
    BillerDaftarSubProdukModel model = new BillerDaftarSubProdukModel();
    
    public void subproduk(panelDaftarSubProduk inframe){
        
        model.progresbar    = null;
        model.table         = inframe.tabelsubproduk;
        model.namespace     = "subproduk";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"RID", "NAMA SUB PRODUK", "KODE SUB PRODUK", "GAMBAR SUB PRODUK", "NAMA PRODUK", "KODE PRODUK", "GAMBAR PRODUK", "NAMA BILLER", "KODE BILLER", "GAMBAR BILLER"};
        model.subproduk();
        
    }
}
