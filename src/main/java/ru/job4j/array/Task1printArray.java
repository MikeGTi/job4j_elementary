package ru.job4j.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Task1printArray {

    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 3, 3, 1};
        printOnlyUnique(arr);
        printOnlyUniqueNaive(arr);
    }

    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i : arr) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj);
    }

    public static void printOnlyUnique(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("");
        LinkedHashMap<Integer, Integer> numsMap = new LinkedHashMap<>();
        for (int num : nums) {
            numsMap.putIfAbsent(num, 1);
            numsMap.computeIfPresent(num, (k, v) -> v + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() == 1) {
                sj.add(entry.getKey().toString());
            }
        }
        System.out.println(sj);
    }

    public static void printOnlyUniqueNaive(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("");
        int count = 0;
        for (int item1 : nums) {
            for (int item2 : nums) {
                if (item1 == item2) {
                    count++;
                }
                if (count > 1) {
                    break;
                }
            }
            if (count == 1) {
                sj.add(String.valueOf(item1));
            }
            count = 0;
        }
        System.out.println(sj);
    }
}
