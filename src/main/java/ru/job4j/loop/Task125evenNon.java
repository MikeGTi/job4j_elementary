package ru.job4j.loop;

import java.util.StringJoiner;
import java.util.function.Predicate;

public class Task125evenNon {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(((int) (Math.sqrt(num) * 1000)) % 10 == 0 ? "Да" : "Нет");
    }

    private static int reverseNum(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    private static String getDigits(int num, Predicate<Integer> predicate, boolean reversed) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("");
        //num = reverseNum(num);
        while (num != 0) {
            if (predicate.test(num % 10)) {
                sj.add(String.valueOf(num % 10));
            }
            num /= 10;
        }
        return reversed ? new StringBuilder(sj.toString()).reverse().toString() : sj.toString();
    }

    public static void loop(int num) {
        String even = getDigits(num, x -> (x == 0 || x % 2 == 0), true);
        String nonEven = getDigits(num, x -> x % 2 == 1, true);
        System.out.print((even.isEmpty() ? "" : even + "\r\n") + (nonEven.isEmpty() ? "" : nonEven + "\r\n"));
    }
}
