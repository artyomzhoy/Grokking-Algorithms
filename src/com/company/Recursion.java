package com.company;

public class Recursion {
    public static void main(String[] args) {
        recursionCase(10);
        System.out.println(factorialCase(5));
    }

//    Рекурсивные функции в java – это функции, которые вызывают сами себя.
//    Когда вы пишете рекурсивную функцию, в ней необходимо указать, в какой момент следует прервать рекурсию.
//    Вот почему каждая рекурсивная функция состоит из двух частей: базового случая и рекурсивного случая.

    public static void basicCase(int value) {
        System.out.println(value);
        value -= 1;
        basicCase(value);
        //        В данном случае она бесконечна.

    }

    public static void recursionCase(int value) {
        System.out.println(value);
        if (value <= 0) {
            return;
        } else {
            value -= 1;
            recursionCase(value);
            //        А в этом она имеет условие для своего завершения.
        }
    }

    public static int factorialCase(int value) {

        if (value <= 1) {
            return 1;
        } else {
            return value * factorialCase(value - 1);
        }
    }
}
