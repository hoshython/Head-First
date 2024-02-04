package ch14;

import javax.swing.*;
import java.awt.*;

public class MyImagePanel extends JPanel {
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon(getClass().getResource("catdog.jpg")).getImage();
        g.drawImage(image, 3, 4, this);
    }
}
