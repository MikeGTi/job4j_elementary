package ru.job4j.condition;

public class Task32evenAmount2digits {
    public static void evenAmount(int number) {
        System.out.println((number / 10 % 2 == 0 ? 1 : 0) + (number % 10 % 2 == 0 ? 1 : 0));
    }
}