package ru.geekbrains.task_2;

public class Main {
    public static void main(String[] args) {

        String[] arr1 = new String[]{"Winter", "Spring", "Summer"};
        String[] arr2 = new String[]{"Winter", "Spring", "Autumn"};

        Integer[] arr3 = new Integer[]{1, 2, 3, 4};
        Integer[] arr4 = new Integer[]{5, 6, 7, 8};

        Integer[] arr5 = new Integer[]{5, 6, 8};
        Integer[] arr6 = new Integer[]{5, 6, 7, 8};

        Integer[] arr7 = new Integer[]{5, 6, 7, 8};
        String[] arr8 = new String[]{"Winter", "Spring", "Autumn"};



        Arrays arraysCheck = new Arrays();

        System.out.println(arraysCheck.compareArrays(arr1, arr2));
        System.out.println(arraysCheck.compareArrays(arr3, arr4));
        System.out.println(arraysCheck.compareArrays(arr5, arr6));
        System.out.println(arraysCheck.compareArrays(arr7, arr8));
    }
}

