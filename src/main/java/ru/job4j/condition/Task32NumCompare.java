package ru.job4j.condition;

public class Task32NumCompare {
    public static void numCompare(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num2 + " " + num1);
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println(num1 + " " + num2);
            System.out.println(num2 + " " + num1);
        }
    }
}