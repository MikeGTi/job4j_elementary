package ru.job4j.io;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double squareSideLength = input.nextDouble();
        double circleRadius = input.nextDouble();
        double precision = 10d;
        System.out.println(Math.round(squareSideLength * 4 * precision) / precision);
        System.out.println(Math.round(2 * Math.PI * circleRadius * precision) / precision);
        System.out.println(Math.round(Math.PI * circleRadius * circleRadius * precision) / precision);
    }
}
