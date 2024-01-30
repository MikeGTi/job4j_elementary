package ru.job4j.type;

public class Task34 {
    public static void main(String[] args) {
        evenAmount(4012);
    }

    public static void evenAmount(int number) {
        int num0 = number / 1000;
        int num1 = (number / 100) % 10;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        int result = (isEven(num0) ? 1 : 0) + (isEven(num1) ? 1 : 0) + (isEven(num2) ? 1 : 0) + (isEven(num3) ? 1 : 0);
        System.out.println(result);
    }

    private static boolean isEven(int num) {
        return (num % 2) == 0;
    }
}
