package ru.job4j.condition;

import java.util.StringJoiner;

public class Task57triangleType {
    public static void triangleType(int a, int b) {
        if (a + b >= 180) {
            System.out.println("Ошибка");
        } else {
            int c = 180 - a - b;
            StringJoiner sj = new StringJoiner(" ");
            if (a == 90 || b == 90 || c == 90 || (a == 45 && b == 45 || a == 45 && c == 45 || b == 45 && c == 45)) {
                sj.add("Прямоугольный");
            } else {
                if (a > 90 || b > 90 || c > 90) {
                    sj.add("Тупоугольный");
                } else {
                    //(a < 90 && b < 90 || a < 90 && c < 90 || b < 90 && c < 90)
                    sj.add("Остроугольный");
                }
            }
            if (a == b || b == c || a == c) {
                sj.add("Равнобедренный");
            }
            if (a == 60 && b == 60 || a == 60 && c == 60 || b == 60 && c == 60) {
                sj.add("Равносторонний");
            }
            System.out.println(sj);
        }
    }
}
