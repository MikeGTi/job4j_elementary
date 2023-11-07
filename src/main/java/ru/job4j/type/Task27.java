package ru.job4j.type;

public class Task27 {
    public static void main(String[] args) {
        transform(327);
    }

    public static void transform(int number) {
        int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        int result = num3 * 100 + num2 * 10 + num1;

        result -= 20;
        System.out.println(result);
    }

}
