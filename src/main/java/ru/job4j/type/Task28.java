package ru.job4j.type;

public class Task28 {
    public static void main(String[] args) {
        numSum(32);
    }

    public static void numSum(int number) {
        int num1 = number / 10;
        int num2 = number % 10;
        int result = num1 + num2;
        System.out.println(result);
    }

}
