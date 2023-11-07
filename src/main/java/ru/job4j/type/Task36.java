package ru.job4j.type;

public class Task36 {
    public static void main(String[] args) {
        firstLastChange(4265);
    }

    public static void firstLastChange(int number) {
        int num0 = number / 1000;
        int num1 = (number / 100) % 10;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        int result = num3 * 1000 + num1 * 100 + num2 * 10 + num0;
        System.out.println(result);
    }

}
