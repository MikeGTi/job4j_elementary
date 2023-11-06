package ru.job4j.io;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        printValuesSumAndMultiply(x, y);
    }

    public static void printValuesSumAndMultiply(int x, int y) {
        System.out.println("Переменные: " + x + " " + y);
        System.out.println("Сумма: " + (x + y));
        System.out.println("Произведение: " + (x * y));

    }
}
