/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author Tommy
 */
public class Menu {
    private String name;
    private String produkIcon;
 
        public Menu(String name, String menuIcon) {
            this.name = name;
            this.produkIcon = menuIcon;
        }
 
        public String getName() {
            return name;
        }
 
        public void setName(String name) {
            this.name = name;
        }
 
        public String getProdukIcon() {
            return produkIcon;
        }
 
        public void setProdukIcon(String menuIcon) {
            this.produkIcon = menuIcon;
        }
}
