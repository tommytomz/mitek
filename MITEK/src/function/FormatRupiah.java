/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author lenovo
 */
public class FormatRupiah {
    
    public static String format(String nominal){
        Locale locale               = null;
        NumberFormat rupiahFormat   = null;
        String rupiah               = null;
         
        locale = new Locale("ca", "CA");
        rupiahFormat = NumberFormat.getCurrencyInstance(locale);
         
        rupiah = rupiahFormat.format(Double.parseDouble(nominal.replace(".", ""))).substring(4);
        rupiah = rupiah.replace(",00", "");
        
        return rupiah;
    }
}
