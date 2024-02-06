package ch14;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;


public class SimpleAnimation1 {
    private int xPosition;
    private int yPosition;

    public static void main(String[] args) {
        SimpleAnimation1 gui = new SimpleAnimation1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingPanel panel = new DrawingPanel();

        frame.getContentPane().add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);

        for (int i = 0; i < 150; i++) {
            xPosition++;
            yPosition++;
            panel.repaint();
            Toolkit.getDefaultToolkit().sync();
            try {
                TimeUnit.MILLISECONDS.sleep(30);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class DrawingPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.black);
            g.fillOval(xPosition, yPosition, 50, 50);
        }
    }
}
