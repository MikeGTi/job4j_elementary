package ru.job4j.array.twodim;

public class Task15cinema {

    public static int[] checkEmptyPlace(char[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                if (isPlaceFree(places, i, j)) {
                    if (isCovidRestrictionOk(places, i, j)
                            || isPlaceFree(places, i, j - 1) && j != 0
                            || i == places.length - 1 && j == places[i].length - 1) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{};
    }

    private static boolean isCovidRestrictionOk(char[][] places, int row, int col) {
        return isPlaceFree(places, row - 1, col)
                && isPlaceFree(places, row + 1, col)
                && isPlaceFree(places, row, col - 1)
                && isPlaceFree(places, row, col + 1)
                ||
                !isPlaceFree(places, row - 1, col - 1)
                        && !isPlaceFree(places, row - 1, col + 1)
                        && !isPlaceFree(places, row + 1, col + 1)
                        && !isPlaceFree(places, row + 1, col - 1);
    }

    private static boolean isPlaceFree(char[][] places, int row, int col) {
        boolean rsl;
        try {
            rsl = ('O' == places[row][col] || '0' == places[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            rsl = true;
        }
        return rsl;
    }
}
