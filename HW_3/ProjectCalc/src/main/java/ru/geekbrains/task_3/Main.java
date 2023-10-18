package ru.geekbrains.task_3;

public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair("element1", 2);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println("\n" + pair + "\n");
    }
}
