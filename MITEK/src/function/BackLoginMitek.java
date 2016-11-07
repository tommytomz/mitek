
package function;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author echo
 */
public class BackLoginMitek extends JPanel {

    private Image image;

    public BackLoginMitek() {
        ImageIcon icon = new ImageIcon(getClass().getResource("../images/loginmitek.png"));
        image = icon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();

        g2.drawImage(image, 0, 0, getWidth(), getHeight(), null);

        g2.dispose();
    }
}
