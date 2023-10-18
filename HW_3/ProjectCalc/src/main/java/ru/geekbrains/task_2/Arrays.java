package ru.geekbrains.task_2;

import java.util.ArrayList;

/*
- Напишите обобщенный метод compareArrays(),
который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
 */
public class Arrays {

    public static <T> boolean compareArrays(T[] arr, T[] arr2) {
        boolean  isTheLengthsEquals = arr.length == arr2.length;
        boolean isTheClaasEquals = arr.getClass().getName().equals(arr2.getClass().getName());
        return isTheLengthsEquals && isTheClaasEquals;
    }
}
