package ru.job4j.condition;

public class Task52isEqual {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        System.out.println((double) ((a1 * b2 - b1 * a2)) != 0 ? "Нет" : "Да");
    }
}
