package ru.job4j.loop;

import java.util.StringJoiner;
import java.util.function.Predicate;

public class Task126evenNonIndex {

    private static String getDigitsIndex(int num, Predicate<Integer> predicate) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("");
        int i = String.valueOf(num).length();
        while (i != 0) {
            if (predicate.test(i)) {
                sj.add(String.valueOf(num % 10));
            }
            num /= 10;
            i--;
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(String.valueOf(num).length());

    }

    public static void loop(int num) {
        System.out.println(new StringBuilder(getDigitsIndex(num, x -> x % 2 == 0)).reverse());
        System.out.println(new StringBuilder(getDigitsIndex(num, x -> x % 2 == 1)).reverse());
    }
}
