package com.bessonov.homework.cycles;

public class Factorial {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пожалуйста, введите число в качестве аргумента командной строки.");
            return;
        }

        int number = Integer.parseInt(args[0]);
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }
}
