package ru.job4j.io;

public class Task19 {

    public static void main(String[] args) {
        int x = 9;
        printValue(x);
        printValuePow2(x);
    }

    public static void printValue(int x) {
        System.out.println("Значение x равно " + x);
    }

    public static void printValuePow2(int x) {
        System.out.println("Значение x^2 равно " + (int) Math.pow(x, 2));
    }
}
