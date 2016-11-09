/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import model.BillerDaftarHargaSubProdukModel;
import view.biller.panelDaftarHargaSubProduk;

/**
 *
 * @author lenovo
 */
public class BillerDaftarHargaSubProdukController {
    BillerDaftarHargaSubProdukModel model = new BillerDaftarHargaSubProdukModel();
    
    public void hargasubproduk(panelDaftarHargaSubProduk inframe){
        
        model.progresbar    = null;
        model.table         = inframe.tabelhargasubproduk;
        model.namespace     = "hargasubproduk";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"NAMA SWITCHING", "KODE SWITCHING", "NAMA PRODUK", "KODE PRODUK", "HARGA"};
        model.hargasubproduk();
        
    }
}
