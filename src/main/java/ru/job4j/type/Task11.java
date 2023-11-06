package ru.job4j.type;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int centimeters = input.nextInt();
        double precision = 100d;
        double inches = Math.round((double) centimeters / 2.54 * precision) / precision;
        System.out.printf("%.2f", inches);
    }
}
