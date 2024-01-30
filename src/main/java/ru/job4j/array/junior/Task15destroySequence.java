package ru.job4j.array.junior;

public class Task15destroySequence {
    public static char[] destroy(char[] seq) {
        char[] rsl = new char[seq.length];
        for (int i = 0; i < seq.length; i++) {
            rsl[i] = (i < 5) ? '0' : (i > seq.length - 6) ? '1' : seq[i];
        }
        return rsl;
    }
}
