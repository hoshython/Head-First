package ch14;

import javax.swing.*;
import java.awt.*;

public class SouthButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("South Button");
        JButton button = new JButton("Click me!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
