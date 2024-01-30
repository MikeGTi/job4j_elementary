package ru.job4j.array.twodim;

import java.util.Arrays;

public class Task4triangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int count2 = 1;
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = count2++;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        int[][] arr = rows(3);
        for (int[] ints : arr) {
            Arrays.stream(ints).forEach(System.out::print);
            System.out.println();
        }
    }
}
