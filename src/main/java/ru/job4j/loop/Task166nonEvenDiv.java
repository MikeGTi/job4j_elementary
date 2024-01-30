package ru.job4j.loop;

import java.util.StringJoiner;

public class Task166nonEvenDiv {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i < 301; i++) {
            if (i % 10 == 0) {
                if (getNonEvenDividersSum(i) % 10 == 0) {
                    sj.add(i + "");
                }
            }
        }
        System.out.println(sj);
    }

    private static int getNonEvenDividersSum(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
