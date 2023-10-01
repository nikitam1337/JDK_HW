package ru.geekbrains;

import javax.swing.*;
import java.awt.*;

public class ClientGUI extends JFrame {
    private static final int POS_X = 700;
    private static final int POS_Y = 500;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private final JPanel panelTop = new JPanel(new GridLayout(2,3));
    private final JButton btnLogin = new JButton("Login");
    private final JButton btnSend = new JButton("Send");
    private final JTextField fieldLogin = new JTextField("Login");
    private final JTextField fieldPassword = new JTextField("Password");
    private final JTextField fieldIP = new JTextField("IP Adders");
    private final JTextField fieldPort= new JTextField("Port");
    private final JTextField fieldMessage= new JTextField();
    private final JTextArea areaMessages = new JTextArea();



    ClientGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat Client");
        setAlwaysOnTop(true);

        panelTop.add(fieldIP);
        panelTop.add(fieldPort);
        panelTop.add(fieldLogin);
        panelTop.add(fieldPassword);
        panelTop.add(btnLogin);
        add(panelTop, BorderLayout.NORTH);

        setVisible(true);
    }

}
