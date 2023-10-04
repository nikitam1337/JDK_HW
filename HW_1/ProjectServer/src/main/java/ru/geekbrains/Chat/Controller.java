package ru.geekbrains.Chat;
import ru.geekbrains.Logger;

public class Controller {
    private ClientGUI windowChat;

    public Controller() {
        Logger logger = new Logger("Chat");
        windowChat = new ClientGUI(this, logger);
    }

    public void sendMessage(String textMessage) {
        windowChat.addMassageToLog(textMessage);

    }



}

