package ru.job4j.map;

import java.util.Map;
import java.util.TreeMap;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        TreeMap<Character, Integer> charCountMap = new TreeMap<>();
        char[] chars = str.toLowerCase().replaceAll(" ", "").toCharArray();
        for (char ch : chars) {
            charCountMap.computeIfPresent(ch, (k, v) -> charCountMap.get(ch) + 1);
            charCountMap.putIfAbsent(ch, 1);
        }
        int maxChar = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (maxChar < entry.getValue()) {
                maxChar = entry.getValue();
                rsl = entry.getKey();
            }
        }
        return rsl;
    }
}