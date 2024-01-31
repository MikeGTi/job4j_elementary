package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ReduceMethodOneArgumentTest {

    @Test
    public void when1then1() {
        assertEquals(Integer.valueOf(1), ReduceMethodOneArgument.reduce(List.of(1)));
    }

    @Test
    public void when123then6() {
        assertEquals(Integer.valueOf(6), ReduceMethodOneArgument.reduce(List.of(1, 2, 3)));
    }

    @Test
    public void when1234then24() {
        assertEquals(Integer.valueOf(6), ReduceMethodOneArgument.reduce(List.of(1, 2, 3)));
    }
}