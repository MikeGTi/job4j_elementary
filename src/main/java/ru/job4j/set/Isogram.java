package ru.job4j.set;

import java.util.HashSet;
import java.util.List;

public class Isogram {
    public static boolean checkString(String s) {
        return new HashSet<>(List.of(s.split(""))).size() == s.length();
    }
}