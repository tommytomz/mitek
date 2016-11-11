/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Main;
import function.Params;
import function.ValueComboBox;
import javax.swing.JOptionPane;
import model.BillerEntriTarifRpAdminModel;
import view.biller.panelEntriTarifRpAdmin;

/**
 *
 * @author lenovo
 */
public class BillerEntriTarifRpAdminController {
    BillerEntriTarifRpAdminModel model = new BillerEntriTarifRpAdminModel();
    
    public void subproduk(panelEntriTarifRpAdmin inframe){
        
        model.combobox      = inframe.namasubproduk;
        model.namespace     = "subproduk";
        model.params        = new Params[]{
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"rid", "namasubproduk"};
        model.subproduk();
        
    }
    
    public void negara(panelEntriTarifRpAdmin inpegawai){
       
        model.combobox = inpegawai.negara;    
        model.namespace = "negara";
        model.params    = new Params[]{new Params("up", "1")}; 
        model.kolom     = new String[]{"rid", "nama"};
        model.daerah();
        
    }
    
    public void provinsi(panelEntriTarifRpAdmin inpegawai){
        
       ValueComboBox value = (ValueComboBox) inpegawai.negara.getSelectedItem();
        model.combobox = inpegawai.provinsi;    
        model.namespace = "provinsi";
        model.params    = new Params[]{new Params("up", value.getValue())}; 
        model.kolom     = new String[]{"rid", "nama"};
        model.daerah();
        
    }
    
    public void kabupaten(panelEntriTarifRpAdmin inpegawai){
        
        ValueComboBox value = (ValueComboBox) inpegawai.provinsi.getSelectedItem();
        model.combobox      = inpegawai.kabupaten;
        model.namespace     = "kabupaten";
        model.params        = new Params[]{new Params("up", value.getValue())};   
        model.kolom         = new String[]{"rid", "nama"};
        model.daerah();
        
    }
    
    public void kecamatan(panelEntriTarifRpAdmin inpegawai){
        
        ValueComboBox value = (ValueComboBox) inpegawai.kabupaten.getSelectedItem();
        model.combobox      = inpegawai.kecamatan;
        model.namespace     = "kecamatan";
        model.params        = new Params[]{new Params("up", value.getValue())};  
        model.kolom         = new String[]{"rid", "nama"};
        model.daerah();
        
    }
    
    public void kelurahan(panelEntriTarifRpAdmin inpegawai){
        
        ValueComboBox value = (ValueComboBox) inpegawai.kecamatan.getSelectedItem();
        model.combobox      = inpegawai.kelurahan;
        model.namespace     = "kelurahan";
        model.params        = new Params[]{new Params("up", value.getValue())};
        model.kolom         = new String[]{"rid", "nama"};
        model.daerah();
        
    }
    
    public void simpan(panelEntriTarifRpAdmin inframe){
        
        String daerah = "";
        ValueComboBox valuesuproduk        = (ValueComboBox) inframe.namasubproduk.getSelectedItem();
        ValueComboBox valuesnegara         = (ValueComboBox) inframe.negara.getSelectedItem();
        ValueComboBox valuesprovinsi       = (ValueComboBox) inframe.provinsi.getSelectedItem();
        ValueComboBox valueskabupaten      = (ValueComboBox) inframe.kabupaten.getSelectedItem();
        ValueComboBox valueskecamatan      = (ValueComboBox) inframe.kecamatan.getSelectedItem();
        ValueComboBox valueskelurahan      = (ValueComboBox) inframe.kelurahan.getSelectedItem();
        
        if(valueskelurahan.getValue().equals("") && valueskecamatan.getValue().equals("") && valueskabupaten.getValue().equals("") && valuesprovinsi.getValue().equals("")){
            daerah = valuesnegara.getValue();
        }
        else if(valueskelurahan.getValue().equals("") && valueskecamatan.getValue().equals("") && valueskabupaten.getValue().equals("")){
            daerah = valuesprovinsi.getValue();
        }
        else if(valueskelurahan.getValue().equals("") && valueskecamatan.getValue().equals("")){
            daerah = valueskabupaten.getValue();
        }
        else if(valueskelurahan.getValue().equals("")){
            daerah = valueskecamatan.getValue();
        }
        else if(!valueskelurahan.getValue().equals("")){
            daerah = valueskelurahan.getValue();
        }
        
        model.namespace     = "simpan";
        model.params        = new Params[]{
                                          new Params("subprodukp", valuesuproduk.getValue()),
                                          new Params("daerahp", daerah),
                                          new Params("hargap", inframe.harga.getText().replace(".", "")),
                                          new Params("rididuser", Main.iduser),
                                          new Params("sesip", Main.session),
                                          new Params("alamatp", Main.ipaddress)
                                          };
        model.kolom         = new String[]{"respon", "pesan"};
        
        String [] ok = model.simpan();
        if(ok[0].equals("1")){
            JOptionPane.showMessageDialog(inframe, "Data berhasil di simpan", "Sukses", 1);
            inframe.namasubproduk.setSelectedIndex(0);
            //inframe.daerah.setSelectedItem(0);
            
        }else{
            JOptionPane.showMessageDialog(inframe, ok[1], "Gagal", 0);
        }
    }
}
