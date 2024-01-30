package ru.job4j.array.twodim;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task17anomalyTest {
    @Test
    public void whenNoTask17anomaly() {
        int[][] expect = {};
        int[] data = {5, 10, 15};
        int up = 16;
        int down = 4;
        assertArrayEquals(expect, Task17anomaly.found(data, up, down));
    }

    @Test
    public void whenOneTask17anomalyInPoint() {
        int[][] expect = {new int[] {1, 1}};
        int[] data = {5, 16, 15};
        int up = 16;
        int down = 4;
        int[][] out = Task17anomaly.found(data, up, down);
        assertArrayEquals(expect, out);
    }

    @Test
    public void whenOneTask17anomalyInPointInDiapason() {
        int[][] expect = {new int[] {1, 2}};
        int[] data = {5, 16, 17, 15};
        int up = 16;
        int down = 4;
        assertArrayEquals(expect, Task17anomaly.found(data, up, down));
    }

    @Test
    public void whenTwoTask17anomalyInPointInDiapason() {
        int[][] expect = {new int[] {1, 2}, new int[] {5, 6}};
        int[] data = {5, 16, 17, 15, 10, 1, 2};
        int up = 16;
        int down = 4;
        int[][] out = Task17anomaly.found(data, up, down);
        assertArrayEquals(expect, out);
    }
}