package ru.job4j.loop;

public class Task172hamming {
    public static int checkStrings(String left, String right) {
        char[] leftChars = left.toCharArray();
        char[] rightChars = right.toCharArray();
        int rsl = 0;
        for (int i = 0; i < leftChars.length; i++) {
            if (leftChars[i] != rightChars[i]) {
                rsl++;
            }
        }
        return rsl;
    }
}
