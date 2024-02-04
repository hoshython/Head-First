package ch14;

import javax.swing.*;

public class SimpleGuiRunner4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Circle Color");
        JPanel panel = new RandomColor();

        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
