package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int switchWins = 0;
        int stayWins = 0;
        int game = 1000;
        double percentOfWins = 0;
        double percentOfLose = 0;
        Random rand = new Random();
        HashMap<Integer, String> results = new HashMap<>();

        for (int i = 0; i < game; i++) {
            int[] doors = {0, 0, 0};
            doors[rand.nextInt(3)] = 1; // ставим 1 (машина) за рандомную дверь
            int choice = rand.nextInt(3);   // делаем рандомный выбор из 3-х дверей
            int shown = -1;  // выбираем свободную от выбора и машины дверь для показа участнику
            for (int j = 0; j < 3; j++) {
                if (j != choice && doors[j] == 0) {
                    shown = j;
                    break;
                }
            }
            // Switch -операция смены выбора двери
            int other = -1;
            for (int j = 0; j < 3; j++) {
                if (j != choice && j != shown) {
                    other = j;
                    break;
                }
            }
            if (doors[other] == 1) {
                switchWins++;
                results.put(i, "Switched: Win");
            } else {
                results.put(i, "Switched: Lose");
            }
            // Stay - -операция не менять изначальный выбор
            if (doors[choice] == 1) {
                stayWins++;
                results.put(i, results.get(i) + ", Stayed: Win");
            } else {
                results.put(i, results.get(i) + ", Stayed: Lose");
            }
        }
        System.out.println("Results: " + results);
        System.out.println("");
        System.out.println("Switching wins " + switchWins + " out of " + game);
        System.out.println("Staying wins " + stayWins + " out of " + game);

        percentOfWins = (double) (switchWins * 100) / game;
        percentOfLose = (double) (stayWins * 100) / game;
        System.out.println("Процент побед при смене выбора = " + percentOfWins + "%");
        System.out.println("Процент побед при неизменном выборе = " + percentOfLose + "%");


    }
}