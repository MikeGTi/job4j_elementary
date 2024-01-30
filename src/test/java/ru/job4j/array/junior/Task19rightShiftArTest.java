package ru.job4j.array.junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task19rightShiftArTest {
    @Test
    public void whenShift1() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 1, 2, 3, 4};
        Task19rightShiftAr.shift(input, 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void whenShift2() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {4, 5, 1, 2, 3};
        Task19rightShiftAr.shift(input, 2);
        assertArrayEquals(expected, input);
    }

    @Test
    public void whenShift5() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Task19rightShiftAr.shift(input, 5);
        assertArrayEquals(expected, input);
    }

    @Test
    public void whenShift25() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Task19rightShiftAr.shift(input, 25);
        assertArrayEquals(expected, input);
    }

    @Test
    public void whenShift27() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {4, 5, 1, 2, 3};
        Task19rightShiftAr.shift(input, 27);
        assertArrayEquals(expected, input);
    }
}