package ru.job4j.array.twodim;

import java.util.Arrays;
import java.util.StringJoiner;

public class Task16split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2 + 1][];
        int commonCount = 0;
        StringJoiner sj = new StringJoiner("");
        sj.setEmptyValue("");
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                sj.add(String.valueOf(str[i]));
            }
            if (str[i] == c || i == str.length - 1) {
                result[commonCount] = sj.toString().toCharArray();
                sj = new StringJoiner("");
                sj.setEmptyValue("");
                commonCount++;
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}
