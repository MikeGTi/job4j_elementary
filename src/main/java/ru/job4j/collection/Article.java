package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Article {
    public static boolean generateBy(String origin, String line) {
        List<String> originWords = new ArrayList<>(Arrays.asList(origin.split("[^a-zA-Zа-яА-Я]+")));
        List<String> lineWords = new ArrayList<>(Arrays.asList(line.split("[^a-zA-Zа-яА-Я]+")));
        boolean rsl = true;
        for (String word : lineWords) {
            if (!originWords.remove(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean generateByOnMap(String origin, String line) {
        String[] originWords = origin.split("[^a-zA-Zа-яА-Я]+");
        HashMap<String, Integer> originWordsMap = new HashMap<>();
        for (String s : originWords) {
            if (originWordsMap.containsKey(s)) {
                originWordsMap.replace(s, originWordsMap.get(s) + 1);
            } else {
                originWordsMap.put(s, 1);
            }
        }
        boolean rsl = true;
        String[] words = line.split("[^a-zA-Zа-яА-Я]+");
        for (String word : words) {
            if (!originWordsMap.containsKey(word)) {
                rsl = false;
                break;
            } else {
                if (originWordsMap.get(word) == 1) {
                    originWordsMap.remove(word);
                } else {
                    originWordsMap.replace(word, originWordsMap.get(word) - 1);
                }
            }
        }
        return rsl;
    }
}
