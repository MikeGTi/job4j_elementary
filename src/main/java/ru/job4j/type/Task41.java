package ru.job4j.type;

public class Task41 {
    public static void main(String[] args) {
        rightCircleShift(1234);
    }

    public static void rightCircleShift(int number) {
        int num1 = (number / 100) % 10;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        int result = num3 * 100 + num1 * 10 + num2;
        System.out.println(result);
    }
}
