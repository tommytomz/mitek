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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;
import model.PegawaiModel;
import view.pegawai.panelEntriPegawai;

/**
 *
 * @author Tommy
 */
public class PegawaiController {
    PegawaiModel model = new PegawaiModel(); 
    
    public void provinsi(panelEntriPegawai inpegawai){
       
        model.combobox = inpegawai.provinsi;    
        model.namespace = "provinsi";
        model.params    = new Params[]{new Params("up", "1")}; 
        model.kolom     = new String[]{"rid", "nama"};
        model.daerah();
        
    }
    
    public void kabupaten(panelEntriPegawai inpegawai){
        
        ValueComboBox value = (ValueComboBox) inpegawai.provinsi.getSelectedItem();
        model.combobox      = inpegawai.kabupaten;
        model.namespace     = "kabupaten";
        model.params        = new Params[]{new Params("up", value.getValue())};   
        model.kolom         = new String[]{"rid", "nama"};
        model.daerah();
        
    }
    
    public void kecamatan(panelEntriPegawai inpegawai){
        
        ValueComboBox value = (ValueComboBox) inpegawai.kabupaten.getSelectedItem();
        model.combobox      = inpegawai.kecamatan;
        model.namespace     = "kecamatan";
        model.params        = new Params[]{new Params("up", value.getValue())};  
        model.kolom         = new String[]{"rid", "nama"};
        model.daerah();
        
    }
    
    public void kelurahan(panelEntriPegawai inpegawai){
        
        ValueComboBox value = (ValueComboBox) inpegawai.kecamatan.getSelectedItem();
        model.combobox      = inpegawai.kelurahan;
        model.namespace     = "kelurahan";
        model.params        = new Params[]{new Params("up", value.getValue())};
        model.kolom         = new String[]{"rid", "nama"};
        model.daerah();
        
    }
    
    public void simpan(panelEntriPegawai inpegawai){
        try {
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/y");
            ValueComboBox valuejk = (ValueComboBox) inpegawai.jeniskelamin.getSelectedItem();
            ValueComboBox valuekel = (ValueComboBox) inpegawai.kelurahan.getSelectedItem();
            
            model.namespace     = "pegawai"; 
            model.params        = new Params[]{
                                                new Params("namap", inpegawai.namapegawai.getText()),
                                                new Params("jenikelaminp", valuejk.getValue()),
                                                new Params("tgllahirp", sdf.format(inpegawai.tanggallahir.getDate())),
                                                new Params("nokontakp", inpegawai.nokontak.getText()),
                                                new Params("noktpp", inpegawai.noktp.getText()),
                                                new Params("emailp", inpegawai.email.getText()),
                                                new Params("daerahp", valuekel.getValue()),
                                                new Params("alamatlengkapp", inpegawai.alamat.getText()),
                                                new Params("gambarp", ""+ImageToHex(inpegawai.foto.getText())),
                                                new Params("idp", Main.iduser),
                                                new Params("sessip", Main.session),
                                                new Params("alamatp", Main.ipaddress)
                                              };
                                               
            model.kolom         = new String[]{"respon", "pesan"};
            String [] ok = model.simpan();
            if(ok[0].equals("1")){
                JOptionPane.showMessageDialog(inpegawai, "Data berhasil di simpan", "Sukses", 1);
                inpegawai.namapegawai.setText("");
                inpegawai.jeniskelamin.setSelectedIndex(0);
                inpegawai.tanggallahir.setDate(null);
                inpegawai.nokontak.setText("");
                inpegawai.noktp.setText("");
                inpegawai.email.setText("");
                inpegawai.provinsi.setSelectedIndex(0);
                inpegawai.kabupaten.removeAllItems();
                inpegawai.kecamatan.removeAllItems();
                inpegawai.kelurahan.removeAllItems();
                inpegawai.alamat.setText("");
                inpegawai.foto.setText("");
            }else{
                JOptionPane.showMessageDialog(inpegawai, ok[1], "Gagal", 0);
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
