/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import config.Main;
import config.SoapMitek;
import function.Params;
import javax.swing.JComboBox;

/**
 *
 * @author lenovo
 */
public class BillerEntriProdukBillerModel {
    public JComboBox combobox;
    public String namespace;
    public Params params[];
    public String kolom[];
    
    public void tampilbiller(){
        SoapMitek sm = new SoapMitek();
        String urlxml  = "http://"+Main.host+"/mitek/biller/entriprodukbiller.php";
        sm.getSoapToComboBox(combobox, urlxml, namespace, params, kolom);
    }
    
    public String [] simpan(){
        SoapMitek sm = new SoapMitek();
        String urlxml  = "http://"+Main.host+"/mitek/biller/entriprodukbiller.php";
        String data [] = sm.sendSoap(null, urlxml, namespace, params, kolom);
        return data;
    }
}
