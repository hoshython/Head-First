package ch14;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(10, 10, 100, 100);
    }
}
