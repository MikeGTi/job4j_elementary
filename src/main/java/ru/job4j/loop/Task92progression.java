package ru.job4j.loop;

import java.util.StringJoiner;

public class Task92progression {
    public static void loop(int a1, int n1, int a2, int n2) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("Нет чисел");
        int dif = Math.abs((a2 - a1) / (n2 - n1));
        if (Math.abs(n2 - n1) != 1) {
            for (int i = a1 + dif; i < a2; i += dif) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
