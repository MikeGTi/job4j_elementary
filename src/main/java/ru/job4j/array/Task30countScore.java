package ru.job4j.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task30countScore {
    public static void array(int[] arr) {
        LinkedHashMap<Integer, Integer> scoresMap = new LinkedHashMap<>();
        for (int i = 5; i > 0; i--) {
            scoresMap.put(i, 0);
        }
        for (int j : arr) {
            scoresMap.computeIfPresent(j, (k, v) -> v + 1);
        }
        String delim = ", ";
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : scoresMap.entrySet()) {
            if (count == scoresMap.size() - 1) {
                delim = System.lineSeparator();
            }
            System.out.printf("%s: %s%s", entry.getKey(), entry.getValue(), delim);
            count++;
        }
    }
}
