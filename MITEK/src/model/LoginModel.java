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

/**
 *
 * @author Tommy
 */
public class LoginModel {
    public JProgressBar pglogin;
    public String urlxml = "http://"+Main.host+"/mitek/login/login.php";
    public String namespace;
    public Params params [];
    public String kolom [];
    
    public String [] login(){
        SoapMitek soapmitek = new SoapMitek();
        String data [] = soapmitek.sendSoap(null, urlxml, namespace, params, kolom);
        
        return data;
    }
    
    public String [] logout(){
        SoapMitek soapmitek = new SoapMitek();
        String data [] = soapmitek.sendSoap(null, urlxml, namespace, params, kolom);
        
        return data;
    }
}
