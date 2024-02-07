package ch15;

import javax.swing.*;
import java.awt.*;

public class CheckBox1 {
    public static void main(String[] args) {
        CheckBox1 gui = new CheckBox1();
        gui.run();
    }
    private void run(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CheckBox");

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        JPanel panel2 = new JPanel();

        frame.getContentPane().add(BorderLayout.CENTER, panel1);
        frame.getContentPane().add(BorderLayout.SOUTH, panel2);

        JCheckBox checkBox1 = new JCheckBox();
        checkBox1.setText("CheckBox 1");

        JCheckBox checkBox2 = new JCheckBox();
        checkBox2.setText("CheckBox 2");

        JTextArea textArea = new JTextArea(6, 15);
        checkBox1.addItemListener(e -> {
            if (checkBox1.isSelected()) {
                textArea.append("Item 1 selected\n");
            } else {
                textArea.append("Item 1 deselected\n");
            }
        });
        checkBox2.addItemListener(e -> {
            if (checkBox2.isSelected()) {
                textArea.append("Item 2 selected\n");
            } else {
                textArea.append("Item 2 deselected\n");
            }
        });



        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel2.add(scrollPane);
        panel1.add(checkBox1);
        panel1.add(checkBox2);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
