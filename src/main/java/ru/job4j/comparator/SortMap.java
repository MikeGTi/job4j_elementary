package ru.job4j.comparator;

import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        return new TreeMap<>(map).descendingMap();
    }
}

