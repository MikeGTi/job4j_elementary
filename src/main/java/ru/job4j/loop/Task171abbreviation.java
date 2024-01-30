package ru.job4j.loop;

import java.util.StringJoiner;

public class Task171abbreviation {
    public static String collect(String s) {
        StringJoiner sj = new StringJoiner("");
        sj.setEmptyValue("");
        String[] str = s.split(" ");
        char ch;
        for (int i = 0; i < str.length; i++) {
            ch = str[i].toCharArray()[0];
            if (ch == Character.toUpperCase(ch)) {
                sj.add(ch + "");
            }
        }
        return sj.toString();
    }
}
