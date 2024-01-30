package ru.job4j.loop;

public class Task70circle {
    public static void loop(int a, int b, int r, int[] coords) {
        int in = 0;
        int on = 0;
        double belongCircleCount = 0;
        double r2 = Math.ceil(Math.pow(r, 2));
        for (int i = 1; i < coords.length; i += 2) {
            belongCircleCount = Math.ceil(Math.pow(coords[i - 1] - a, 2) + Math.pow(coords[i] - b, 2));
            if (belongCircleCount == r2) {
                on++;
            } else if (belongCircleCount < r2) {
                in++;
            }
        }
        System.out.println("На окружности: " + on + ", внутри: " + in);
    }
}
