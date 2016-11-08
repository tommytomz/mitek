/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import config.Main;
import config.SoapMitek;
import function.Params;

/**
 *
 * @author lenovo
 */
public class SwitchingEntriGrupSaldoModel {
    public String namespace;
    public Params params[];
    public String kolom[];
    
    public String [] simpan(){
        SoapMitek sm = new SoapMitek();
        String urlxml  = "http://"+Main.host+"/mitek/switching/entrigrupsaldo.php";
        String data [] = sm.sendSoap(null, urlxml, namespace, params, kolom);
        return data;
    }
}
