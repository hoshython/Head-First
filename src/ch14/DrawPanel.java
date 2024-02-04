package ch14;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        g.setColor(Color.black);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(30, 30, 100, 100);
    }
}
