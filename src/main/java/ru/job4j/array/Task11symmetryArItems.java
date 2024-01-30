package ru.job4j.array;

import java.util.StringJoiner;

public class Task11symmetryArItems {
    public static void array(int[] arr) {
        StringJoiner sj1 = new StringJoiner("");
        int i = 0;
        String add = " ";
        while (i < (arr.length - 1) / 2 + (arr.length - 1) % 2) {
            if (i == arr.length - 1) {
                add = "";
            }
            sj1.add(arr[i] + add);
            sj1.add(arr[arr.length - 1 - i] + System.lineSeparator());
            i++;
        }
        System.out.printf(sj1.toString());
        if (arr.length % 2 != 0) {
            System.out.println(arr[arr.length / 2]);
        }
    }
}
