/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitek;

import function.Params;
import function.ValueComboBox;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tommy
 */


public class ComboBoxItem 
{


    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("t", "tes");
        map.put("r", "res");
        
        //System.out.println(map.);
        Params [] s = new Params[2];
        s[0] = new Params("g", "s");
        s[1] = new Params("r", "h");
        
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getValue());
        }
     }

}
