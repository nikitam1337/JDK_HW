package ru.geekbrains;

public class Logger {
    private final String logFilePath;

    public Logger(String ident) {
        if (ident == null) ident = "";
        logFilePath = "log_" + ident + ".log";
    }

    public void saveToFile(String message) {
        try {
            // Проверяем наличие файла лога и создаем его, если он не существует
            if (!Files.exists(Paths.get(logFilePath))) {
                Files.createFile(Path.of(logFilePath));
            }

            // Генерируем строку с текущим временем и сообщением
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            String formattedMessage = "[" + timeFormat.format(new Date()) + "] " + message + "\n";

            // Открываем файл лога для записи (режим 'append' - дозапись)
            try (FileWriter writer = new FileWriter(logFilePath, true)) {
                writer.write(formattedMessage);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода при записи в файл лога: " + e.getMessage());
        }
    }


}
