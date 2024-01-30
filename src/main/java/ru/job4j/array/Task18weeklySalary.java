package ru.job4j.array;

public class Task18weeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        boolean weekend = false;
        for (int i = 0; i < hours.length; i++) {
            if (i > 4) {
                weekend = true;
            }
            sum += countDaySalary(hours[i], weekend, i + 1);
        }
        System.out.println("Total: " + sum);
        return sum;
    }

    private static int countDaySalary(int num, boolean weekend, int day) {
        int add = weekend ? 2 : 1;
        int daySum;
        if (num < 9) {
            daySum = num * (10 * add);
        } else {
            daySum = num / 8 * (80 * add);
            daySum += num % 8 * (15.0 * add);
        }
        /* for debug
         * System.out.println("Day " + day + ", hours: " + num + ", salary: " + daySum);
         */
        return daySum;
    }
}
