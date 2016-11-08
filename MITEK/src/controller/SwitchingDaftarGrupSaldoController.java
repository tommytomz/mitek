/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import model.SwitchingDaftarGrupSaldoModel;
import view.switching.panelDaftarGrupSaldo;

/**
 *
 * @author lenovo
 */
public class SwitchingDaftarGrupSaldoController {
    SwitchingDaftarGrupSaldoModel model = new SwitchingDaftarGrupSaldoModel();
    
    public void grupsaldo(panelDaftarGrupSaldo inframe){
        
        model.progresbar    = null;
        model.table         = inframe.tabelgrupsaldo;
        model.namespace     = "grupsaldo";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"NAMA"};
        model.grupsaldo();
        
    }
}
