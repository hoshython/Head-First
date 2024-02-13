package ch17;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;

import static java.nio.charset.StandardCharsets.UTF_8;

public class SimpleChatClientA {
    private JTextField outgoing;
    private PrintWriter writer;

    private void go() {
        setUpNetworking("127.0.0.1");

        outgoing = new JTextField(20);

        JButton sendButton = new JButton("send");
        sendButton.addActionListener(e -> sendMessage());

        JPanel mainPanel = new JPanel();
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);

        JFrame frame = new JFrame();
        frame.setTitle("Simple Chat Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 100);
        frame.setVisible(true);
    }


    private void setUpNetworking(String address) {
        try {
            InetSocketAddress serverAddress = new InetSocketAddress(address, 5000);
            SocketChannel socketChannel = SocketChannel.open(serverAddress);
            writer = new PrintWriter(Channels.newWriter(socketChannel, UTF_8));
            System.out.println("Networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage() {
        writer.println(outgoing.getText());
        writer.flush();
        outgoing.setText("");
        outgoing.requestFocus();
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
}
