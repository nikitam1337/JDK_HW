package ru.geekbrains.Chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ClientGUI extends JFrame {

    //# region private final
    private static final int POS_X = 700;
    private static final int POS_Y = 500;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private final JPanel panelTop = new JPanel(new GridLayout(2,3));
    private final JPanel panelBottom = new JPanel(new BorderLayout());

    private final JButton btnLogin = new JButton("Login");
    private final JButton btnSend = new JButton("Send");

    private final JTextField fieldLogin = new JTextField("Login");
    private final JTextField fieldPassword = new JPasswordField("Password");
    private final JTextField fieldIP = new JTextField("IP Adders");
    private final JTextField fieldPort= new JTextField("Port");
    private final JTextField fieldMessage= new JTextField();

    private final JTextArea areaLog = new JTextArea();
    //# endregion


    public ClientGUI(Controller controller){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat Client");
        setAlwaysOnTop(true);

        areaLog.setLineWrap(true);
        areaLog.setWrapStyleWord(true);
        areaLog.setEditable(false);

        panelTop.add(fieldIP);
        panelTop.add(fieldPort);
        panelTop.add(Box.createHorizontalStrut(10));
        panelTop.add(fieldLogin);
        panelTop.add(fieldPassword);
        panelTop.add(btnLogin);

        panelBottom.add(fieldMessage);
        panelBottom.add(btnSend, BorderLayout.EAST);

        add(panelTop, BorderLayout.NORTH);
        add(new JScrollPane(areaLog));
        add(panelBottom, BorderLayout.SOUTH);


        fieldMessage.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    String msg = fieldMessage.getText();
                    controller.sendMessage(msg);
                    fieldMessage.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        setVisible(true);
    }





}
