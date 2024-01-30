package ru.job4j.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        List<String> abcList = Arrays.asList(s.split(""));
        abcList.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        abcList.forEach(sb::append);
        return sb.toString();
    }
}