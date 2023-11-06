package ru.job4j.condition;

public class Triangle {
    public static double area(double a, double b, double c) {
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        double rsl = Triangle.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
