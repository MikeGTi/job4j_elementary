package ru.job4j.loop;

public class Task173cryptography {
    public static String code(String s) {
        String rsl = s.length() == 0 ? "empty" : s;
        if (s.length() > 4) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < s.length() - 4; i++) {
                chars[i] = '#';
            }
            rsl = String.valueOf(chars);
        }
        return rsl;
    }
}
