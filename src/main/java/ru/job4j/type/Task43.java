package ru.job4j.type;

public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        int num11 = (number1 / 100) % 10;
        int num12 = (number1 / 10) % 10;
        int num13 = number1 % 10;

        int num21 = (number2 / 100) % 10;
        int num22 = (number2 / 10) % 10;
        int num23 = number2 % 10;

        int result1 = num11 * 100 + num12 * 10 + num23;
        int result2 = num21 * 100 + num22 * 10 + num13;
        System.out.printf("%s%n%s%n", result1, result2);
    }
}
