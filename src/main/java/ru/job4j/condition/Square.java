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
            System.out.println(" p = 4, k = 1, s = 1, area = " + result1);
        }

}
