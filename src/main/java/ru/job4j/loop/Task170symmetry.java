package ru.job4j.loop;

public class Task170symmetry {
    public static boolean check(int num) {
        boolean rsl = true;
        String chars = String.valueOf(num);
        int middle = chars.length() % 2 == 0 ? chars.length() / 2 : (chars.length() / 2) + 1;
        for (int i = 0; i < middle; i++) {
            if (chars.charAt(i) != chars.charAt(chars.length() - i - 1)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
