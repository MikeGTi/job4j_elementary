package ru.job4j.condition;

public class Task47changeNum {

    public static void changeNum(int number) {
        int first = number % 10;
        int second = number / 10 % 10;
        int third = number / 100 % 10;

        int rsl = (number > 500) ? first * 100 + second * 10 + third : third * 100 + first * 10 + second;
        System.out.println(rsl);
    }
}
