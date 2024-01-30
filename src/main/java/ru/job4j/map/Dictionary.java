package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        if (strings.length == 0) {
            return Map.of();
        }
        Map<String, List<String>> rsl = new HashMap<>();
        for (String s : strings) {
            rsl.computeIfPresent(s.substring(0, 1), (k, v) -> {
                        v.add(s);
                        return v;
                    }
            );
            rsl.putIfAbsent(s.substring(0, 1), new ArrayList<>(List.of(s)));
        }
        return rsl;
    }
}