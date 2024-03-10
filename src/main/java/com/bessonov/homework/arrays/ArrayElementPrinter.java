package com.bessonov.homework.arrays;

import java.util.Arrays;

public class ArrayElementPrinter {
    public static void main(String[] args) {
        System.out.println("Создаём целочисленный массив и заполняем его");
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        System.out.println("Выводим наш заполненный массив: \n" + Arrays.toString(array));

        System.out.println("Используем do...while для перебора элементов массивы и вывода их в консоль: ");
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
        System.out.println();

        System.out.println("Используем while для перебора элементов массивы и вывода их в консоль: ");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        System.out.println("Используем for для перебора элементов массивы и вывода их в консоль: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();

        System.out.println("Используем for...each для перебора элементов массивы и вывода их в консоль: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
