package ru.job4j.type;

public class Task26 {
    public static void main(String[] args) {
        transform(37);
    }

    public static void transform(int number) {
        number = ((number % 10) * 10 + (number / 10));
        number += 8;
        System.out.println(number);
    }

}
