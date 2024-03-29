package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static List<String> sorted(List<String> strings) {
        return strings.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }
}
