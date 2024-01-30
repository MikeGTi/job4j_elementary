package ru.job4j.set;

import java.util.HashSet;
import java.util.List;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        return new HashSet<>(List.of(combination)).size() == 1;
    }
}