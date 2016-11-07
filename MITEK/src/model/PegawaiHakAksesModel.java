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
import javax.swing.JTable;

/**
 *
 * @author Tommy
 */
public class PegawaiHakAksesModel {
    public JComboBox combobox;
    public JTable table;
    public String namespace;
    public Params params[];
    public String kolom[];
    
    public void pegawai(){
        
        SoapMitek sm = new SoapMitek();
        String urlxml = "http://"+Main.host+"/mitek/pegawai/hakakses.php";
        sm.getSoapToComboBox(combobox, urlxml, namespace, params, kolom);
        
    }
    
    public void hakkases(){
        SoapMitek sm = new SoapMitek();
        String urlxml = "http://"+Main.host+"/mitek/pegawai/hakakses.php";
        sm.getDataSoap(null, table, urlxml, namespace, params, kolom);
    }
    
    public String [] simpan(){
        SoapMitek sm = new SoapMitek();
        String urlxml = "http://"+Main.host+"/mitek/pegawai/hakakses.php";
        String [] data = sm.sendSoap(null, urlxml, namespace, params, kolom);
        return data;
    }
}
