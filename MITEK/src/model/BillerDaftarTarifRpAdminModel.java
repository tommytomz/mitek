/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import config.Main;
import config.SoapMitek;
import function.Params;
import javax.swing.JProgressBar;
import javax.swing.JTable;

/**
 *
 * @author lenovo
 */
public class BillerDaftarTarifRpAdminModel {
    public JProgressBar progresbar;
    public JTable table;
    public String namespace;
    public Params params[];
    public String kolom[];
    
    public void tarifrpadmin(){
        
        SoapMitek sm = new SoapMitek();
        String urlxml = "http://"+Main.host+"/mitek/biller/daftartariprpadmin.php";
        sm.getDataSoap(progresbar, table, urlxml, namespace, params, kolom);
    }
}
