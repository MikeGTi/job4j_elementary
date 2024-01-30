package ru.job4j.array.twodim;

import java.util.Arrays;

public class Task18pushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        printGrid(array);
        int size = Math.max(row, Math.max(column, Math.max(array.length - row, array[0].length - column))) + 1;
        int[] values = new int[4];
        Arrays.fill(values, array[row][column]);
        int shift = 1;
        while (shift != size) {
            values = fillArray(array, row, column, shift, values);
            shift++;
        }
        array[row][column] = 0;
        printGrid(array);
    }

    private static int[] fillArray(int[][] array, int row, int col, int shift, int[] values) {
        int[] rsl = new int[4];
        rsl[0] = getValue(array, row - shift, col);
        setValue(array, row - shift, col, values[0]);

        rsl[1] = getValue(array, row, col + shift);
        setValue(array, row, col + shift, values[1]);

        rsl[2] = getValue(array, row + shift, col);
        setValue(array, row + shift, col, values[2]);

        rsl[3] = getValue(array, row, col - shift);
        setValue(array, row, col - shift, values[3]);
        return rsl;
    }

    private static void setValue(int[][] array, int row, int col, int val) {
        try {
            array[row][col] = val;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds");
        }
    }

    private static int getValue(int[][] array, int row, int col) {
        int rsl = 0;
        try {
            rsl = array[row][col];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds");
        }
        return rsl;
    }

    public static void printGrid(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.printf("%5d ", ints[j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
