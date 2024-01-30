package ru.job4j.condition;

public class Task59linearEquation {
    public static void getLinearEquation(int a, int b) {
        String rsl;
        if (a == 0 || b == 0) {
            rsl = "Нет решения";
            if (a == 0 && b == 0) {
                rsl = "Бесконечное множество";
            }
        } else {
            rsl = String.valueOf((double) -b / a);
        }
        System.out.println(rsl);
    }
}
