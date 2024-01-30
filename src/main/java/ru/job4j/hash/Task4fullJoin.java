package ru.job4j.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task4fullJoin {
    public static List<Integer> extractUnique(List<Integer> left, List<Integer> right) {
        HashMap<Integer, Integer> rightMap = new HashMap<>();
        for (Integer num : right) {
            rightMap.putIfAbsent(num, 1);
        }
        HashMap<Integer, Integer> leftMap = new HashMap<>();
        for (Integer num : left) {
            leftMap.putIfAbsent(num, 1);
        }
        List<Integer> rsl = new ArrayList<>();
        for (Integer num : right) {
            if (!leftMap.containsKey(num)) {
                rsl.add(num);
            }
        }
        for (Integer num : left) {
            if (!rightMap.containsKey(num)) {
                rsl.add(num);
            }
        }
        return rsl;
    }
}
