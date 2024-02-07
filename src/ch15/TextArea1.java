package ch15;

import javax.swing.*;
import java.awt.*;

public class TextArea1 {
    public static void main(String[] args) {
        TextArea1 gui = new TextArea1();
        gui.run();
    }
    private void run(){
        JFrame frame = new JFrame();
        frame.setTitle("JTextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JPanel panel1 = new JPanel();
        frame.getContentPane().add(BorderLayout.CENTER, panel1);
        panel1.add(scrollPane);

        JButton button = new JButton();
        button.setText("Just Click It");

        JPanel panel2 = new JPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
