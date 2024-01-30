package ru.job4j.condition;

public class Task33mathPow2 {
    public static void numSquare(int number) {
        System.out.println(number < 0 ? (int) Math.pow(number, 2) : "Ошибка");
    }
}