package ru.job4j.loop;

public class Task80grades {
    public static void loop(int[] grades) {
        double goodAvg = 0;
        double badAvg = 0;
        int sumGood = 0;
        int sumBad = 0;
        int countGood = 0;
        int countBad = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 3) {
                sumBad += grades[i];
                countBad++;
            } else {
                sumGood += grades[i];
                countGood++;
            }
            goodAvg = (countGood != 0 ? (sumGood / (double) countGood) : 0);
            badAvg = (countBad != 0 ? (sumBad / (double) countBad) : 0);
        }
        System.out.println("Средняя удовл. оценка: " + goodAvg + ", средняя неуд. оценка: " + badAvg);
    }
}
