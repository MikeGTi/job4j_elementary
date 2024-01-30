package ru.job4j.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task34indexes {
    public static int[] sumOfTwo(int[] numbers, int goal) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int val1;
        int[] rsl = null;
        for (int i = 0; i < numbers.length; i++) {
            numsMap.put(numbers[i], i);
            val1 = goal - numbers[i];
            if (numsMap.containsKey(val1) && !Objects.equals(i, numsMap.get(val1))) {
                rsl = new int[2];
                rsl[0] = numsMap.get(val1);
                rsl[1] = i;
                break;
            }
        }
        return rsl;
    }

}
