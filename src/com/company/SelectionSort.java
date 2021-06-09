package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 99, 24, 41, 27, 15, 0, 24};
        selectionSort(array);
    }

    // Итерационный алгоритм:

    public static void selectionSort(int[] array) {
        int min, container;

        for (int index = 0; index < array.length; index++) {
            min = index;
            for (int searchMinValue = index + 1; searchMinValue < array.length; searchMinValue++) {
                if (array[searchMinValue] < array[min]) {
                    min = searchMinValue;
                }
            }

            container = array[min];
            array[min] = array[index];
            array[index] = container;

//            пустому container присваивается число из массива array с индексом [min]
//                    =>
//                        числу из массива array с индексом [min] присваивается число из массива array с индексом [index]
//                            =>
//                                числу из массива array с индексом [index] присваивается число из container

        }

        System.out.println(Arrays.toString(array));
    }
}
