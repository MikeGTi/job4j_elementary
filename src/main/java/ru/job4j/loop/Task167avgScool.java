package ru.job4j.loop;

import java.util.StringJoiner;

public class Task167avgScool {
    public static void loop(int[] first, int[] second, int[] third) {
        double firstAvg = getAvg(first);
        double secondAvg = getAvg(second);
        double thirdAvg = getAvg(third);
        int count = (firstAvg > 4.5 ? 1 : 0) + (secondAvg > 4.5 ? 1 : 0) + (thirdAvg > 4.5 ? 1 : 0);
        double max = Math.max(Math.max(firstAvg, secondAvg), thirdAvg);
        System.out.println("Оценки: " + getItems(first) + ", средняя: " + firstAvg);
        System.out.println("Оценки: " + getItems(second) + ", средняя: " + secondAvg);
        System.out.println("Оценки: " + getItems(third) + ", средняя: " + thirdAvg);
        System.out.println("Выше 4.5: " + count + ", наивысшая: " + max);
    }

    private static String getItems(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            sj.add(nums[i] + "");
        }
        return sj.toString();
    }

    private static double getAvg(int[] num) {
        int sum = 0;
        double avg = 0;
        int i;
        for (i = 0; i < num.length; i++) {
            sum += num[i];

        }
        avg = (sum + 0.0) / i + 0.0;
        return avg;
    }
}
