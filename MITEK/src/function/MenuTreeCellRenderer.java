/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;


import java.awt.Component;
import java.awt.Font;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;



/**
 *
 * @author Tommy
 */
public class MenuTreeCellRenderer implements TreeCellRenderer{
    private JLabel label;
    Random rand = new Random();
    int x = 300;
    int y = 100;
    
    public MenuTreeCellRenderer(){
        label = new JLabel();
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        Object o = ((DefaultMutableTreeNode) value).getUserObject();
            label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 11));
            
            if (o instanceof Menu) {
                Menu menu = (Menu) o;
                URL imageUrl = getClass().getResource(menu.getProdukIcon());
                if (imageUrl != null) {
                    label.setIcon(new ImageIcon(imageUrl));
                }
                label.setText(menu.getName());
                
                if(selected){
//                    InfDataPegawai infdatapegawai = new InfDataPegawai();
//                    if(menu.getName().equals("Data Pegawai")){
//                         infdatapegawai.setVisible(true);
//                        FrameUtama.dpframe.add(infdatapegawai);
//                        infdatapegawai.setLocation(rand.nextInt(x)+20, rand.nextInt(y)+20);
//                       
//                          System.out.println(menu.getName());
//                    }
                    
//                    if(menu.getName().equals("BAF")){
//                        FrameMenu.panelHal.add(new panelBAF(), "panelhal");
//                        CardLayout cl = (CardLayout) FrameMenu.panelHal.getLayout();
//                        cl.show(FrameMenu.panelHal, "panelhal");
//                        FrameMenu.treeProduk.clearSelection();
//                    }
   
                }
            } else {
                label.setIcon(null);
                label.setText("" + value);
            }
            return label;
    }
}
