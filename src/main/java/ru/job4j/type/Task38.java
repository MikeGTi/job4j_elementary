package ru.job4j.type;

public class Task38 {
    public static void main(String[] args) {
        leftShift(1234);
    }

    public static void leftShift(int number) {
        int num1 = (number / 100) % 10;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        int result = (num1 * 100 + num2 * 10 + num3) * 10;
        System.out.println(result);
    }

}
