package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        if (s.length() == 0) {
            return Map.of();
        }
        Map<Character, List<Integer>> rsl = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            rsl.putIfAbsent(chars[i], new ArrayList<>());
            int finalI = i;
            rsl.computeIfPresent(chars[i], (k, v) -> {
                        v.add(finalI);
                        return v;
                    }
            );
        }
        return rsl;
    }
}