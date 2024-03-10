package com.bessonov.homework.arrays;

import java.util.Arrays;

public class EverySecondElementPrinter {
    public static void main(String[] args) {
        System.out.println("Создаём целочисленный массив и заполняем его");
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        System.out.println("Выводим наш заполненный массив: \n" + Arrays.toString(array));


        System.out.println("Выводим каждый второй элемент массива: ");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
