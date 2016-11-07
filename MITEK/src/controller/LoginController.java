/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import java.net.InetAddress;
import java.security.MessageDigest;
import javax.swing.JOptionPane;
import model.LoginModel;
import view.login.FrameLogin;
import view.FrameUtama;

/**
 *
 * @author Tommy
 */
public class LoginController {
    
    public void login(FrameLogin flogin, FrameUtama futama){
        
        try {
            LoginModel model = new LoginModel();
            InetAddress ip = InetAddress.getLocalHost();
            
            model.pglogin    = null;
            model.namespace  = "login";
            model.params     = new Params[]{
                                            new Params("username", flogin.username.getText()),
                                            new Params("password", md5(flogin.password.getText())),
                                            new Params("alamat", ip.getHostAddress()),
                                            new Params("browser", "Java 8.1")
                                            };
            model.kolom      = new String[]{"rididuser", "namap", "sesip", "respon", "pesan"}; 
            String ok [] = model.login();
            
            if(ok[3].equals("1")){
                
                Main.iduser    = ok[0];
                Main.user      = ok[1];
                Main.session   = ok[2];
                Main.ipaddress = ip.getHostAddress();
                
                System.out.println(ip.getHostAddress());
                System.out.println(ok[0]);
                System.out.println(ok[2]);
                
                futama.setVisible(true);
                flogin.setVisible(false);
                flogin.username.setText("");
                flogin.password.setText("");
                //flogin.pglogin.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(flogin, ok[4], "Error", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void logout(FrameLogin flogin, FrameUtama futama){
        
        try {
            LoginModel model = new LoginModel();
            InetAddress ip = InetAddress.getLocalHost();
            
            model.pglogin       = null;
            model.namespace     = "logout";
            model.params        = new Params[]{
                                                new Params("rididuser", Main.iduser),
                                                new Params("sesip", Main.session),
                                                new Params("alamatp", ip.getHostAddress())
                                              };

            model.kolom         = new String[]{"respon"};
            String ok [] = model.login();

            if(ok[0].equals("1")){

                Main.iduser   = "";
                Main.user     = "";
                Main.session  = "";
                
                System.exit(0);

            }
            else{
                JOptionPane.showMessageDialog(futama, "Terjadi Kesalahan", "Error", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private String md5(String text){
        
        String data = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(text.getBytes());
            byte[] digest = md.digest();
            StringBuffer sb = new StringBuffer();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
                data = sb.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return data;
    }
}
