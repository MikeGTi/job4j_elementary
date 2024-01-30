package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        ArrayList<Character> leftChars = new ArrayList<>(left.chars().mapToObj(c -> (char) c).toList());
        List<Character> rightChars = right.chars().mapToObj(c -> (char) c).toList();
        for (Character ch : rightChars) {
            if (!leftChars.remove(ch)) {
                break;
            }
        }
        return leftChars.size() == 0;
    }
}