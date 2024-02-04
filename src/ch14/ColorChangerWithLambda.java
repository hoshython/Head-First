package ch14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangerWithLambda {
    private JFrame frame;
    private JLabel label;
    private static int counter = 0;

    public static void main(String[] args) {
        ColorChangerWithLambda gui = new ColorChangerWithLambda();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setTitle("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton colorButton = new JButton();
        colorButton.setText("Change color");
        colorButton.addActionListener(event -> frame.repaint());

        label = new JLabel();
        label.setText("I am label " + counter);

        JButton labelButton = new JButton();
        labelButton.setText("Change label");
        labelButton.addActionListener(event -> labelButton.setText("I am label " + ++counter));

        DrawPanel drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
