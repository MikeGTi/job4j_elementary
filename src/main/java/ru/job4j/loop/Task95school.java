package ru.job4j.loop;

public class Task95school {
    public static void loop(int[] math, int[] info) {
        int count = 0;
        int fmCount = 0;
        int fiCount = 0;
        for (int i = 0; i < math.length; i++) {
            if (((double) math[i] + (double) info[i]) / 2 > 6.9) {
                count++;
                if (math[i] > info[i]) {
                    fmCount++;
                } else {
                    fiCount++;
                }
            }
        }
        System.out.println("Зачислено: " + count + ", ФМ: " + fmCount + ", ФИ: " + fiCount);
    }
}
