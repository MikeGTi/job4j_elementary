package ru.job4j.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task3innerJoin {
    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        if (left.size() == 0 || right.size() == 0) {
            return List.of();
        }
        HashMap<Integer, Integer> rightMap = new HashMap<>();
        for (Integer num : right) {
            rightMap.putIfAbsent(num, 1);
        }
        List<Integer> rsl = new ArrayList<>();
        for (Integer num : left) {
            if (rightMap.containsKey(num)) {
                rsl.add(num);
            }
        }
        return rsl;
    }
}
