package ru.job4j.type;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double precision = 100d;
        double celsius = Math.round(5 * ((double) fahrenheit - 32) / 9 * precision) / precision;
        System.out.printf("%.1f", celsius);
    }
}
