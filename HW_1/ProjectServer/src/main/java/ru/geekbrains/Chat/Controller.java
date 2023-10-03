package ru.geekbrains.Chat;
import ru.geekbrains.Logger;

public class Controller {
    private ClientGUI windowChat;
    private Logger logger;

    public Controller() {
        Logger logger = new Logger("Chat");
        windowChat = new ClientGUI(this);

    }

    public void sendMessage(String textMessage) {
        windowChat.addMassageToLog(textMessage);
    }



}

