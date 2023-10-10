package ru.geekbrains.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {

    private static final int POS_X = 100;
    private static final int POS_Y = 100;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    private final JButton btnStart = new JButton("Start");
    private final JButton btnStop = new JButton("Stop");
    private final JTextArea log = new JTextArea();
    private boolean isServerWorking;

    public ServerWindow() {

        isServerWorking = false;


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setAlwaysOnTop(true);

        log.setLineWrap(true);
        log.setWrapStyleWord(true);
        log.setEditable(false);


        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStart);
        panBottom.add(btnStop);

        add(panBottom, BorderLayout.SOUTH);
        add(log);

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking) {
                    isServerWorking = false;
                    log.append("Server stopped " + isServerWorking + "\n");
                } else {
                    log.append("Сервер не запущен" + "\n");
                }

            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isServerWorking) {
                    isServerWorking = true;
                    log.append("Server started " + isServerWorking + "\n");
                } else {
                    log.append("Сервер уже был запущен" + "\n");
                }
            }
        });


        setVisible(true);
    }
}
