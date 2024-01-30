package ru.job4j.loop;

import java.util.StringJoiner;

public class Task91progression {
    public static void loop(int n1, int n2, int n3) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("Нет");
        int dif = n3 - n2;
        if (n2 - n1 == dif) {
            for (int i = n3 + dif; i < n3 + 4 * dif; i += dif) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
