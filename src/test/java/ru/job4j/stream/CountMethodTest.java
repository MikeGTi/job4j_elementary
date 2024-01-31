package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class CountMethodTest {

    @Test
    public void whenList123then3() {
        assertEquals(3, CountMethod.count(Stream.of(1, 2, 3)));
    }

    @Test
    public void whenStreamEmptyThen0() {
        assertEquals(0, CountMethod.count(Stream.of()));
    }
}