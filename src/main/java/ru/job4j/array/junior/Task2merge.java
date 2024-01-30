package ru.job4j.array.junior;

public class Task2merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int rslCount = 0;
        int leftCount = 0;
        int rightCount = 0;
        int leftValue;
        int rightValue;
        while (rslCount < rsl.length) {
            leftValue = (leftCount < left.length) ? left[leftCount] : -1;
            rightValue = (rightCount < right.length) ? right[rightCount] : -1;

            if (leftValue != -1 && leftValue <= rightValue) {
                rsl[rslCount++] = leftValue;
                leftCount++;
            } else {
                rsl[rslCount++] = rightValue;
                rightCount++;
            }
        }
        return rsl;
    }
}
