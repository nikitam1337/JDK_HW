package ru.geekbrains.server;

import ru.geekbrains.client.Client;
import ru.geekbrains.client.ClientGUI;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private ServerView serverView;
    public static final String LOG_PATH = "src/main/java/ru/geekbrains/server/repository/log.txt";

    List<Client> clientList;

    boolean work;

    public Server(ServerView serverView) {
        clientList = new ArrayList<>();
        this.serverView = serverView;

    }

    public void startServer(){
//        serverView.startServer();
        work = true;
    }
    public void stopServer(){
//        serverView.stopServer();
        work = false;
    }
    public boolean getStatusServer(){
        return work;
    }

    public List<Client> getClientList(){
        return clientList;
    }
    public boolean connectUser(Client client) {
        if (!work) {
            return false;
        }
        clientList.add(client);
        return true;
    }

    public void disconnectUser(Client client) {

        // TODO Доделать метод отключения клиентов от сервера
        if (client != null) {
            client.disconnect();
        }
        clientList.remove(client);

    }


    public String getHistory() {
        return readLog();
    }

    public void sendMessage(String text) {
        if (!work) {
            return;
        }
        serverView.showMessage(text);
        answerAll(text);
        saveInLog(text);
    }


    private void answerAll(String text) {
        for (Client client : clientList) {
            client.printText(text);
        }
    }

    private void saveInLog(String text) {
        try (FileWriter writer = new FileWriter(LOG_PATH, true)) {
            writer.write(text);
            writer.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String readLog() {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(LOG_PATH);) {
            int c;
            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }
            stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
