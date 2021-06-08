package com.company;

// Бинарный поиск работает только в том случае, если список отсортирован.
// При бинарном поиске каждый раз исключается половина элементов.

public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = new int[100]; // массив из 100 элементов int

        for (int a = 0; a < sortedArray.length; a++) {
            sortedArray[a] = a + 1;
        }

        int first = 0; //первый элемент массива
        int last = sortedArray.length - 1; //последний элемент массива

        binarySearch(sortedArray, 5, first, last);
    }

    public static void binarySearch(int[] sortedArray, int key, int low, int high) {

        int index = 0;
        int comparisonCount = 0; // для подсчета количества сравнений

        while (low <= high) {
            comparisonCount++;

            int mid = (low + high) / 2; // центр массива
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) { //
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                        " сравнений");
                System.out.println("Индекс числа " + key + " в массиве – " + index);
                break;
            }
        }
    }
}

