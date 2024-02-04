package ch14;

import javax.swing.*;

public class SimpleGuiRunner3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new MyImagePanel();
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(660, 900);
        frame.setVisible(true);
    }
}
