package ru.job4j.array;

public class Task23maxLengthSeria {
    public static int find(int[] array) {
        int count = 0;
        int value = array[0];
        int maxCount = 1;
        for (int i : array) {
            count = (i >= value) ? count + 1 : 1;
            value = i;
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
