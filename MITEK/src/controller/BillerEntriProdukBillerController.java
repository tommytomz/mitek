/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import function.ValueComboBox;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;
import model.BillerEntriProdukBillerModel;
import view.biller.panelEntriProdukBiller;

/**
 *
 * @author lenovo
 */
public class BillerEntriProdukBillerController {
    BillerEntriProdukBillerModel model = new BillerEntriProdukBillerModel();
    
    public void tampilbiller(panelEntriProdukBiller inframe){
        model.combobox      = inframe.namabiller;
        model.namespace     = "biller";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "nama"};
        model.tampilbiller();
    }
    
    public void simpan(panelEntriProdukBiller inframe){
        try {
            ValueComboBox value = (ValueComboBox) inframe.namabiller.getSelectedItem();
            model.namespace     = "simpan"; 
            model.params        = new Params[]{
                                                new Params("billerp", value.getValue()),
                                                new Params("namap", inframe.namaproduk.getText()),
                                                new Params("kodep", inframe.kode.getText()),
                                                new Params("gambarp", ImageToHex(inframe.foto.getText())),
                                                new Params("rididuser", Main.iduser),
                                                new Params("sesip", Main.session),
                                                new Params("alamatp", Main.ipaddress)
                                              };
                                               
            model.kolom         = new String[]{"respon", "pesan", "sandi"};
            String [] ok = model.simpan();
            if(ok[0].equals("1")){
                JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
                inframe.namabiller.setSelectedItem("Pilih");
                inframe.namaproduk.setText("");
                inframe.kode.setText("");
                inframe.foto.setText("");
                inframe.image.setText("");
                
            }else{
                JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String ImageToHex(String url) throws FileNotFoundException{
        File file = new File(url);
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);    
                //System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
        }
        String hex = DatatypeConverter.printHexBinary(bos.toByteArray());

     return hex;
    }
}
