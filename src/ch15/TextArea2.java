package ch15;

import javax.swing.*;
import java.awt.*;

public class TextArea2 {
    private JPanel centerPanel;
    private JTextArea textArea;
    public static void main(String[] args) {
        TextArea2 gui = new TextArea2();
        gui.run();
    }
    private void run(){
        JFrame frame = new JFrame();
        frame.setTitle("JTextArea Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        centerPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);

        JPanel southPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, southPanel);

        textArea = new JTextArea(10 , 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JButton button = new JButton();
        button.setText("Just Click It");
        button.addActionListener(e -> textArea.append("Button Clicked!\n"));

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        centerPanel.add(scrollPane);
        southPanel.add(button);

        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, southPanel);

        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
