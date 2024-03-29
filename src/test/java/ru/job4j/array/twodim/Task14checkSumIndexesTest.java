package ru.job4j.array.twodim;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task14checkSumIndexesTest {
    @Test
    public void whenOneOneThenEmpty() {
        int[][] data = {
                {1}
        };
        int[] rsl = Task14checkSumIndexes.collectNewArray(data, 0);
        int[] expected = {};
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenOneOneSumOneThenEmpty() {
        int[][] data = {
                {1}
        };
        int[] rsl = Task14checkSumIndexes.collectNewArray(data, 1);
        int[] expected = {1};
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenTwoSumOneThen() {
        int[][] data = {
                {2, 1},
                {1, 2}
        };
        int[] rsl = Task14checkSumIndexes.collectNewArray(data, 1);
        int[] expected = {2, 2};
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectNewArray() {
        int[][] data = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[] rsl = Task14checkSumIndexes.collectNewArray(data, 3);
        int[] expected = {1, 2, 3, 5, 6, 8, 9, 11, 12, 14, 15, 16};
        assertThat(rsl, is(expected));
    }
}