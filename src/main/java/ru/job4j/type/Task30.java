package ru.job4j.type;

public class Task30 {
    public static void main(String[] args) {
        difference(25);
    }

    public static void difference(int number) {
        int num1 = number / 10;
        int num2 = number % 10;
        int result = Math.abs(num1 - num2);
        System.out.println(result);
    }

}
