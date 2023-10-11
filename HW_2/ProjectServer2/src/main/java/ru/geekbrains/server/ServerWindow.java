package ru.geekbrains.server;

import ru.geekbrains.client.Client;
import ru.geekbrains.client.ClientGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame implements ServerView {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;

    JButton btnStart, btnStop;
    JTextArea log;

    private Server server;

    public ServerWindow() {
        this.server = new Server(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setLocationRelativeTo(null);

        createPanel();

        setVisible(true);
    }

    public Server returnServer(){
        return server;
    }

    private void createPanel() {
        log = new JTextArea();
        add(log);
        add(createButtons(), BorderLayout.SOUTH);
    }

    private Component createButtons() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (server.getStatusServer()) {
                    showMessage("Сервер уже был запущен");
                } else {
                    server.startServer();
                    showMessage("Сервер запущен!");
                }
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!server.getStatusServer()) {
                    showMessage("Сервер уже был остановлен");
                } else {
                    server.stopServer();
                    for (Client client : server.getClientList()) {
                        server.disconnectUser(client);
                    }
                    //TODO поправить удаление
                    showMessage("Сервер остановлен!");
                }
            }
        });

        panel.add(btnStart);
        panel.add(btnStop);
        return panel;
    }

    @Override
    public void showMessage(String text) {
        log.append(text + "\n");
    }

    @Override
    public void stopServer() {

    }

    @Override
    public void startServer() {

    }
}
