/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import java.security.MessageDigest;
import javax.swing.JOptionPane;
import model.PegawaiGantiSandiModel;
import view.pegawai.InfGantiSandi;
import view.pegawai.panelGantiSandi;

/**
 *
 * @author Tommy
 */
public class PegawaiGantiSandiController {
    PegawaiGantiSandiModel model = new PegawaiGantiSandiModel();
    
    public void simpan(panelGantiSandi inframe){
        
        if(inframe.sandibaru.getText().equals(inframe.ulangsandibaru.getText())){
            model.namespace     = "simpan";
            model.params        = new Params[]{
                                              new Params("sandibaru", inframe.sandibaru.getText()),
                                              new Params("sandilama", md5(inframe.sandilama.getText())),
                                              new Params("rididuser", Main.iduser),
                                              new Params("sesip", Main.session),
                                              new Params("alamatp", Main.ipaddress)
                                              };
            model.kolom         = new String[]{"respon", "pesan"};
            String [] ok = model.simpan();
            if(ok[0].equals("1")){
                JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
                inframe.sandibaru.setText("");
                inframe.sandilama.setText("");
                inframe.ulangsandibaru.setText("");
                System.exit(0);
                
            }else{
                JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
            }
        }
        else{
            JOptionPane.showMessageDialog(inframe, "Sandi baru tidak sama", "Gagal", 0);
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
