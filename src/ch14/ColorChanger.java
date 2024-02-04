package ch14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChanger {
    private JFrame frame;
    private JLabel label;
    private static int counter = 0;

    public static void main(String[] args) {
        ColorChanger gui = new ColorChanger();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setTitle("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton colorButton = new JButton();
        colorButton.setText("Change color");
        colorButton.addActionListener(new ButtonListener());

        JButton labelButton = new JButton();
        labelButton.setText("Change label");
        labelButton.addActionListener(new LabelListener());

        label = new JLabel();
        label.setText("I am label " + counter);

        frameMethod(colorButton, labelButton, frame, label);
    }

    static void frameMethod(JButton colorButton, JButton labelButton, JFrame frame, JLabel label) {
        DrawPanel drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }

    public class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            counter++;
            label.setText("I am label " + counter);
        }
    }
}
