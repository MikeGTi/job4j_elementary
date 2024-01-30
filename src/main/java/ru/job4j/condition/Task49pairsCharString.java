package ru.job4j.condition;

public class Task49pairsCharString {
    public static boolean check(String l, String r) {
        return l.isEmpty() && r.isEmpty()
                || r.endsWith(String.valueOf(l.charAt(0))) && l.endsWith(String.valueOf(r.charAt(0)));
    }
}
