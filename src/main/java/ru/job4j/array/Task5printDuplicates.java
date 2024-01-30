package ru.job4j.array;

import java.util.LinkedHashMap;
import java.util.StringJoiner;

public class Task5printDuplicates {
    public static void array(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.replace(num, map.get(num) + 1);
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("");
        map.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey().toString()).forEach(sj::add);

        if (sj.length() != 0) {
            System.out.println(sj);
        } else {
            System.out.print(sj);
        }
    }
}
