package ru.job4j.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        if (strings.length == 0) {
            return Map.of();
        }
        TreeMap<String, Boolean> map = new TreeMap<>(Comparator.naturalOrder());
        for (String s : strings) {
            map.merge(s, false, (k, v) -> true);
        }
        return map;
    }
}