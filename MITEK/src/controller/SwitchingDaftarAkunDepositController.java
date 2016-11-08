/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import model.SwitchingDaftarAkunDepositModel;
import view.switching.panelDaftarAkunDeposit;

/**
 *
 * @author lenovo
 */
public class SwitchingDaftarAkunDepositController {
    SwitchingDaftarAkunDepositModel model = new SwitchingDaftarAkunDepositModel();
    
    public void akundeposit(panelDaftarAkunDeposit inframe){
        
        model.progresbar    = null;
        model.table         = inframe.tabelakundeposit;
        model.namespace     = "akundeposit";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"NAMA SWITCHING", "KODE SWITCHING", "NAMA GRUP", "SALDO"};
        model.akundeposit();
        
    }
}
