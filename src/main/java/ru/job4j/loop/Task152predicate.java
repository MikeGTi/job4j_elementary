package ru.job4j.loop;

import java.util.StringJoiner;
import java.util.function.Predicate;

public class Task152predicate {
    public static void main(String[] args) {
        for (int i = 10; i < 21; i++) {
            System.out.println("Число: " + i + ", делители: " + getDividers(i));
            //System.out.println("Число: " + i + ", сумма делителей: " + getDividersSum(i));
        }
    }

    public static void loop() {
        System.out.println(getNumbers(10, 21, i -> i % 2 == 0));
        System.out.println(getNumbers(10, 21, i -> i % 3 == 0));
        System.out.println(getNumbers(10, 21, i -> i % 4 == 0));
    }

    private static int getDividersSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static String getDividers(int n) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sj.add(i + "");
            }
        }
        return sj.toString();
    }

    private static String getNumbers(int n, int m, Predicate<Integer> pred) {
        if (n > m) {
            n = n + m;
            m = n - m;
            n = n - m;
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int i = n; i < m; i++) {
            if (pred.test(i)) {
                sj.add(i + "");
            }
        }
        return sj.toString();
    }

}
