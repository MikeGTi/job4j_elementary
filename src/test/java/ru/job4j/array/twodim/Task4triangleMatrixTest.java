package ru.job4j.array.twodim;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task4triangleMatrixTest {

    @Test
    public void whenRows1() {
        int[][] result = {
                {1}
        };
        assertArrayEquals(result, Task4triangleMatrix.rows(1));
    }

    @Test
    public void whenRows2() {
        int[][] result = {
                {1}, {2, 3}
        };
        assertArrayEquals(result, Task4triangleMatrix.rows(2));
    }

    @Test
    public void whenRows3() {
        int[][] result = {
                {1}, {2, 3}, {4, 5, 6}
        };
        assertArrayEquals(result, Task4triangleMatrix.rows(3));
    }

}