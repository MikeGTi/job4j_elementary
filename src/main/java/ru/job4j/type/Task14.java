package ru.job4j.type;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cathetA = input.nextDouble();
        double cathetB = input.nextDouble();
        double hypotenuse = input.nextDouble();
        double perimeter = cathetA + cathetB + hypotenuse;
        double area = (cathetA * cathetB) * 0.5;
        System.out.printf("%.1f%n%.1f", perimeter, area);
    }
}
