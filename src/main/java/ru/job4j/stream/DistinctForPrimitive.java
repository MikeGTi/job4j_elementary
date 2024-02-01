package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class DistinctForPrimitive {
    public static List<Integer> collect(int[] data) {
        return Arrays.stream(data).distinct().boxed().toList();
    }
}
