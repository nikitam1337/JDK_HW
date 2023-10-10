package ru.geekbrains;


import ru.geekbrains.client.ClientGUI;
import ru.geekbrains.server.Server;
import ru.geekbrains.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        new ClientGUI(server);
        new ClientGUI(server);
    }
}
