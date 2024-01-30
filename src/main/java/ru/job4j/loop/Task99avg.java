package ru.job4j.loop;

public class Task99avg {

    public static void loop(int[] num) {
        int max = num[0];
        int min = num[0];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
            sum += num[i];
            avg = (sum + 0.0) / (i + 1.0);
        }
        //System.out.println("Max & Min average: " + ((max + min + 0.0) / 2.0));
        //System.out.println("Average (all): " + avg);
        System.out.println((max + min + 0.0) / 2.0 <= avg ? "Нет" : "Больше");
    }
}
