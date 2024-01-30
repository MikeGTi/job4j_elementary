package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        boolean rsl = true;
        for (String w : s.split(" ")) {
            if (words.contains(w)) {
                rsl = false;
                break;
            }
        }
        return rsl ? "Вы сделали правильный выбор!" : "Выберите другую статью...";
    }
}