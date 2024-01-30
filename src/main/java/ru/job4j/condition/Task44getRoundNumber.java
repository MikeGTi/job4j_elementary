package ru.job4j.condition;

public class Task44getRoundNumber {

    public static void getRoundNumber(int number) {
        System.out.println((int) ((float) number / 10 + 0.5) * 10);
    }
}