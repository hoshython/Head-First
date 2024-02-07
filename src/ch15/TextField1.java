package ch15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField1 {
    private JLabel nameHolder;
    private JTextField textField;
    private JPanel centerPanel;
    public static void main(String[] args) {
        TextField1 gui = new TextField1();
        gui.run();
    }
    private void run(){
        JFrame frame = new JFrame("JTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font1 = new Font("serif", Font.PLAIN, 14);

        textField = new JTextField( 20);
        textField.requestFocus();

        JLabel label = new JLabel("Enter your name");
        label.setFont(font1);

        nameHolder = new JLabel();

        JPanel panel = new JPanel();

        JButton button = new JButton("Submit");
        button.addActionListener(new MyButton());

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        centerPanel = new JPanel();
        centerPanel.add(nameHolder);

        System.out.println(textField.getText());

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    private class MyButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = textField.getText();
//            name = "Hello " + name;
//            nameHolder.setText(name);
            nameHolder.setText("<html><font size='4' face='serif'>Hello </font><font size='8' face='Arial'>" + name + "</font></html>");
        }
    }
}
