package ru.job4j.condition;

public class Square {

        public static double area(double perimeter, double aspectRatio) {
            double height = perimeter / (2 * (aspectRatio + 1));
            double length = height * aspectRatio;
            double area = length * height;

            return area;
        }

        public static void main(String[] args) {
            double result1 = Square.area(4, 1);
            System.out.println(" p = 4, k = 1, area = " + result1);

            result1 = Square.area(8, 2);
            System.out.println(" p = 8, k = 2, area = " + result1);

            result1 = Square.area(16, 3);
            System.out.println(" p = 16, k = 3, area = " + result1);
        }

}
