package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DropWhileMethodTest {
    @Test
    public void whenMinus2To3then123() {
        assertEquals(
                List.of(1, 2, 3),
                DropWhileMethod.dropWhile(List.of(3, 2, 1, -1, -2))
        );
    }

    @Test
    public void when0then0() {
        assertEquals(
                List.of(0),
                DropWhileMethod.dropWhile(List.of(0))
        );
    }
}