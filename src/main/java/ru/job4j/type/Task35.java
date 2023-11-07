package ru.job4j.type;

public class Task35 {
    public static void main(String[] args) {
        firstLastChange(121);
    }

    public static void firstLastChange(int number) {
        int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        int result = num3 * 100 + num2 * 10 + num1;
        System.out.println(result);
    }

}
