package ru.job4j.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4getNonDuplicateIndexList {

    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 3, 3, 1};
        System.out.println(Arrays.toString(array(arr)));
    }

    public static int[] array(int[] nums) {
        LinkedHashMap<Integer, Integer> numsMap = new LinkedHashMap<>();
        int count = 0;
        int i = 0;
        for (int num : nums) {
            i++;
            if (!numsMap.containsKey(num)) {
                numsMap.put(num, i);
            } else {
                numsMap.replace(num, numsMap.get(num) * 10 + i);
                count++;
            }
        }
        i = 0;
        int[] rsl = new int[numsMap.size() - count];
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (!(entry.getValue() > 9)) {
                rsl[i++] = entry.getValue() - 1;
            }
        }
        return rsl;
    }
}
