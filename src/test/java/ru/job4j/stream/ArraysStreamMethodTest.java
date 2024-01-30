package ru.job4j.stream;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysStreamMethodTest {
    @Test
    public void when123ThenCount3() {
        Integer[] data = {1, 2, 3};
        assertEquals(3, ArraysStreamMethod.createStream(data).count());
    }

    @Test
    public void whenNullThenCount0() {
        Integer[] data = {};
        assertEquals(0, ArraysStreamMethod.createStream(data).count());
    }
}