package ru.job4j.array;

public class Task6statisticNums {
    public static int[] array(int[] nums) {
        int[] rsl = new int[3];
        for (int num : nums) {
            if (num > 0) {
                rsl[2] += 1;
            } else if (num < 0) {
                rsl[0] += 1;
            } else {
                rsl[1] += 1;
            }
        }
        return rsl;
    }
}
