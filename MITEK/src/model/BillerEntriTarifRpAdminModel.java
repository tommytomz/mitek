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
public class BillerEntriTarifRpAdminModel {
    public JComboBox combobox;
    public String namespace;
    public Params params[];
    public String kolom[];
    
    public void subproduk(){
        
        SoapMitek sm = new SoapMitek();
        String urlxml = "http://"+Main.host+"/mitek/biller/entritarifrpadmin.php";
        sm.getSoapToComboBox(combobox, urlxml, namespace, params, kolom);
        
    }
    
    public void daerah(){
        SoapMitek sm = new SoapMitek();
        String urlxml = "http://"+Main.host+"/mitek/daerah/daerah.php";
        sm.getSoapToComboBox(combobox, urlxml, namespace, params, kolom);
    }
    
    public String [] simpan(){
     
        SoapMitek sm = new SoapMitek();
        String urlxml = "http://"+Main.host+"/mitek/biller/entritarifrpadmin.php";
        String [] data = sm.sendSoap(null, urlxml, namespace, params, kolom);
        return data;
    }
    
}
