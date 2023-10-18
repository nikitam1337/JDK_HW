package ru.geekbrains.task_1;
/*
- Написать класс Калькулятор (необобщенный),
        который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
        Параметры этих методов –  два числа разного типа (но необязательно разного между собой),
        над которыми должна быть произведена операция.
 */
public class Calculator {

    /**
     *
     * @param first слагаемое
     * @param second слагаемое
     * @return  возвращает результат сложения
     * @param <F>
     * @param <S>
     */
    public static <F extends Number, S extends Number> double sum(F first, S second) {
        return first.doubleValue() + second.doubleValue();
    }

    /**
     *
     * @param first множитель
     * @param second множитель
     * @return  произведение
     * @param <F>
     * @param <S>
     */
    public static <F extends Number, S extends Number> double multiply(F first, S second) {
        return first.doubleValue() * second.doubleValue();
    }

    /**
     *
     * @param first делимое
     * @param second делитель
     * @return частное
     * @param <F>
     * @param <S>
     */
    public static <F extends Number, S extends Number> double divide(F first, S second) {
        return first.doubleValue() / second.doubleValue();
    }

    /**
     *
     * @param first Уменьшаемое
     * @param second Вычитаемое
     * @return
     * @param <F>
     * @param <S>
     */
    public static <F extends Number, S extends Number> double subtract(F first, S second) {
        return first.doubleValue() - second.doubleValue();
    }
}
