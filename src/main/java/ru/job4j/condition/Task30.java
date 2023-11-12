package ru.job4j.condition;

public class Task30 {
    public static void numModify(int number) {
        if (number < 0) {
            System.out.println(-number);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        numModify(0);
        numModify(5);
        numModify(-5);
    }
}