package com.bessonov.homework.cycles;

public class MultiplyDigits {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пожалуйста, введите число в качестве аргумента командной строки.");
            return;
        }

        String input = args[0];
        int product = 1;

        System.out.print("Умножение цифр числа " + input + ": ");

        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            int num = Character.getNumericValue(digit);
            product *= num;

            System.out.print(num);

            if (i < input.length() - 1) {
                System.out.print(" * ");
            } else {
                System.out.print(" = " + product);
            }
        }
    }
}
