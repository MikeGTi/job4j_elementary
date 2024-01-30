package ru.job4j.array;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Task13statisticNums {
    public static void array(int[] arr) {
        HashMap<Integer, Integer> numsMap = getFilledHashMap(arr);
        printMap(numsMap);
        StringJoiner sjAbsentNums = getAbsentNums(numsMap);

        int sum = numsMap.values().stream().reduce(Integer::sum).orElse(0);
        int max = numsMap.values().stream().reduce(Integer::max).orElse(0);
        int countNotNull = countNotNullNums(numsMap);
        int avg = (int) Math.ceil((double) sum / (double) countNotNull);
        avg = (avg == max && max != 1) ? avg - 1 : avg;

        StringJoiner sjMoreNums = new StringJoiner(" ");
        sjMoreNums.setEmptyValue("0");
        if (arr.length != 1) {
            for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
                if (entry.getValue() > 1 && entry.getValue() == max && countNotNull > 1) {
                    sjMoreNums.add(entry.getKey().toString());
                }
            }
        }
        avg = (avg == 1) ? 2 : avg;
        StringJoiner sjLessNums = new StringJoiner(" ");
        sjLessNums.setEmptyValue("0");
        if (arr.length != 1 && !"0".equals(sjMoreNums.toString())) {
            for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
                if (entry.getValue() > 0 && entry.getValue() < avg) {
                    sjLessNums.add(entry.getKey().toString());
                }
            }
        }
        System.out.printf("Чаще: %s, отсутствует: %s, реже: %s%n", sjMoreNums, sjAbsentNums, sjLessNums);
    }

    private static void printMap(HashMap<Integer, Integer> numsMap) {
        StringJoiner sj = new StringJoiner(", ");
        for (Map.Entry<Integer, Integer> e : numsMap.entrySet()) {
            sj.add(String.format("%s: %s", e.getKey(), e.getValue()));
        }
        System.out.println(sj);
    }

    private static StringJoiner getAbsentNums(HashMap<Integer, Integer> numsMap) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("");
        for (Map.Entry<Integer, Integer> e : numsMap.entrySet()) {
            if (e.getValue() == 0) {
                sj.add(e.getKey().toString());
            }
        }
        return sj;
    }

    private static int countNotNullNums(HashMap<Integer, Integer> numsMap) {
        int notNull = 9;
        for (Map.Entry<Integer, Integer> e : numsMap.entrySet()) {
            if (e.getValue() == 0) {
                notNull--;
            }
        }
        return notNull;
    }

    private static HashMap<Integer, Integer> getFilledHashMap(int[] arr) {
        HashMap<Integer, Integer> rsl = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            rsl.put(i, 0);
        }
        for (int i : arr) {
            rsl.computeIfPresent(i, (k, v) -> v + 1);
        }
        return rsl;
    }

    public static void main(String[] args) {
        Task13statisticNums.array(new int[]{1, 2, 2, 4, 5, 2, 7, 8, 7});
    }
}
