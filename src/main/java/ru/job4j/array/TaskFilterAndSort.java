package ru.job4j.array;

import java.util.Arrays;
import java.util.Comparator;

public class TaskFilterAndSort {
    public static void main(String[] args) {
        String[] s = {"a", "y", "x", "a", "d", "y", "m"};
        System.out.printf("Unsorted: %s%n", Arrays.toString(s));
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<String> comparatorReversed = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Arrays.sort(s, comparator);
        System.out.printf("Sorted:   %s%n", Arrays.toString(s));

        Arrays.sort(s, comparatorReversed);
        System.out.printf("Reversed: %s%n", Arrays.toString(s));
    }
}
