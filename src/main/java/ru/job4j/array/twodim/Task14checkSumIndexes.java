package ru.job4j.array.twodim;

import java.util.Arrays;

public class Task14checkSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] rsl = new int[data.length * data.length];
        int ind = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j != sum) {
                    rsl[ind++] = data[i][j];
                }
            }
        }
        return Arrays.copyOf(rsl, ind);
    }
}