package ru.job4j.type;

public class Task39 {
    public static void main(String[] args) {
        leftCircleShift(1234);
    }

    public static void leftCircleShift(int number) {
        int num1 = (number / 100) % 10;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        int result = num2 * 100 + num3 * 10 + num1;
        System.out.println(result);
    }
}
