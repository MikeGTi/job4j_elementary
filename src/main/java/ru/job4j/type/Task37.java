package ru.job4j.type;

public class Task37 {
    public static void main(String[] args) {
        leftShift(123);
    }

    public static void leftShift(int number) {
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        int result = (num2 * 10 + num3) * 10;
        System.out.println(result);
    }

}
