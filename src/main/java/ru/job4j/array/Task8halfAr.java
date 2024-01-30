package ru.job4j.array;

import java.util.StringJoiner;

public class Task8halfAr {
    public static void array(int[] arr) {
        StringJoiner sj1 = new StringJoiner(" ");
        StringJoiner sj2 = new StringJoiner(" ");
        sj1.setEmptyValue("");
        sj2.setEmptyValue("");
        int i;
        for (i = 0; i < arr.length; i++) {
            if (i >= arr.length / 2 + arr.length % 2) {
                sj2.add(String.valueOf(arr[i]));
            } else {
                sj1.add(String.valueOf(arr[i]));
            }
        }
        System.out.println(sj1);
        System.out.println(sj2);
    }
}
