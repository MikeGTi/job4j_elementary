package ru.job4j.condition;

public class Task55transformFraction {
    public static void transformFraction(int num1, int num2) {
        String rsl = "Подсчет не производится";
        if (num1 >= num2) {
            rsl = (num1 / num2) + ((num1 % num2 != 0) ? " " + num1 % num2 + "/" + num2 : "");
        }
        System.out.println(rsl);
    }
}
