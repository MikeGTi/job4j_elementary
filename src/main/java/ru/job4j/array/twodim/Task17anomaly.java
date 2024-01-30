package ru.job4j.array.twodim;

import java.util.Arrays;

public class Task17anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        boolean anomalyFlag;
        int startInd = 0;
        int endInd = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                anomalyFlag = true;
                if (startInd == 0) {
                    startInd = i;
                }
                endInd = i;
            } else {
                anomalyFlag = false;
            }

            if ((!anomalyFlag && endInd != 0) || i == data.length - 1 && endInd != 0) {
                result[count++] = new int[]{startInd, endInd};
                startInd = 0;
                endInd = 0;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
