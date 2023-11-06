package ru.job4j.type;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inches = input.nextInt();
        double precision = 100d;
        double centimeters = Math.round((double) inches * 2.54 * precision) / precision;
        System.out.printf("%.2f", centimeters);
    }
}
