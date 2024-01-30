package ru.job4j.type;

public class Task29 {
    public static void main(String[] args) {
        numSum(325);
        numSum(121);
    }

    public static void numSum(int number) {
        int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        int result = num1 + num2 + num3;
        System.out.println(result);
    }

}
