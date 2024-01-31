package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BoxedMethodTest {

    @Test
    public void when123Then123() {
        assertEquals(
                List.of(1, 2, 3),
                BoxedMethod.boxed(new int[] {1, 2, 3})
        );
    }

    @Test
    public void whenEmptyThenEmpty() {
        assertEquals(
                List.of(),
                BoxedMethod.boxed(new int[] {})
        );
    }

}