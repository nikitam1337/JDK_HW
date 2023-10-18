package ru.geekbrains.task_1;


public class Main {
    public static void main(String[] args) {
        Double resultSum = calculator.sum(15, 3.2);
        Double resultDivide = calculator.divide(10, 3.1);
        Double resultMultiply = calculator.multiply(2.5, 3.0);
        Double resultSubtract = calculator.subtract(8.2f, 3);

        System.out.print("sum = " + resultSum + "\n");
        System.out.print("Divide = " + resultDivide + "\n" );
        System.out.print("Multiply = " + resultMultiply + "\n");
        System.out.print("Subtract = " + resultSubtract  + "\n");
    }
}