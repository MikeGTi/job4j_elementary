package ru.job4j.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        if (list.size() == 0) {
            return list;
        }
        String last = list.remove(list.size() - 1);

        if (index > 0 && index < list.size() - 1) {
            list.set(index, last);
        }
        return list;
    }
}