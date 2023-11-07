package ru.job4j.type;

public class Task25 {
    public static void main(String[] args) {
        separate(37);
    }

    public static void separate(int number) {
        int num2 = (number / 10) % 10;
        if (num2 > 0) {
            num2 = num2 * 10;
        }
        System.out.println(number / 100 + "00+" + num2 + "+" + number % 10);
    }

}
