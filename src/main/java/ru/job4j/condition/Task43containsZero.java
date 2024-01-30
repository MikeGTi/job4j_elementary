package ru.job4j.condition;

public class Task43containsZero {

    public static void containsZero(int number) {
        int first = number % 10;
        int second = number / 10 % 10;
        int third = number / 100 % 10;
        if (first == 0 || second == 0 || third == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}