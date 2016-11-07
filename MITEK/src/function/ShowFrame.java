/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.util.Random;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Tommy
 */
public class ShowFrame {
    Random rand = new Random();
    int x = 300;
    int y = 100;
    
    public void ShowFrame(JInternalFrame inframe, JDesktopPane desktoppane){
        try {
            desktoppane.add(inframe);
            inframe.setVisible(true);
            inframe.setLocation(rand.nextInt(x)+20, rand.nextInt(y)+20);
            //inframe.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
