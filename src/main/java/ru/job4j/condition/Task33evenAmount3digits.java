package ru.job4j.condition;

public class Task33evenAmount3digits {
    public static void evenAmount(int number) {
        System.out.println((number / 100 % 2 == 0 ? 1 : 0)
                + (number / 10 % 2 == 0 ? 1 : 0)
                + (number % 10 % 2 == 0 ? 1 : 0));
    }
}