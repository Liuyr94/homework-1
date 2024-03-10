package com.bessonov.homework.arrays;

import java.util.Arrays;

public class EverySecondElementWithNullStopper {
    public static void main(String[] args) {
        System.out.println("Создаём массив строк и заполняем его");
        String[] array = { "1", "2", "3", "4", "5", null, "7", "8", "9", "10", "11", "12" };
        System.out.println("Выводим наш заполненный массив: \n" + Arrays.toString(array));


        System.out.println("Выводим каждый второй элемент массива: ");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
            if (array[i] == null) {
                return;
            }
        }
        System.out.println();
    }
}
