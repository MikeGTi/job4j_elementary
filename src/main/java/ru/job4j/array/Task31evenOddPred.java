package ru.job4j.array;

import java.util.function.Predicate;

public class Task31evenOddPred {
    public static int whoWin(int[] players) {
        int rsl = getNumbersSum(players, x -> x % 2 == 0) - getNumbersSum(players, x -> x % 2 == 1);
        if (rsl != 0) {
            rsl = (rsl > 0) ? 1 : 2;
        }
        return rsl;
    }

    private static int getNumbersSum(int[] arr, Predicate<Integer> pred) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pred.test(i)) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
