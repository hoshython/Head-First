package ch14;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomColor extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillRect(70, 70, 100, 100);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        g.fill3DRect(200, 200, 100, 100, false);

        Graphics2D g2d2 = (Graphics2D) g;
        GradientPaint gradientPaint = new GradientPaint(250, 10, Color.blue, 270, 150, Color.orange);
        g2d2.setPaint(gradientPaint);
        g2d2.fillOval(250, 10, 150, 150);
    }
}
