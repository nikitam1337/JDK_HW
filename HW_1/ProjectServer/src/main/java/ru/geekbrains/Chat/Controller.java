package ru.geekbrains.Chat;

public class Controller {
    ClientGUI windowChat;

    public Controller() {
        windowChat = new ClientGUI(this);

    }

    public void sendMessage(String textMessage) {
        windowChat.addMassageToLogArea(textMessage);
    }

}

