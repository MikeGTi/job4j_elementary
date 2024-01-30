package ru.job4j.condition;

public class Task48changeNumThreeNumbers {
    public static void changeNum(int num1, double num2, int num3) {
        System.out.println((num1 % 2 == 0) ? String.valueOf(num1 * num2) : String.valueOf(num1 + num3));
    }
}
