package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ReductionWithTwoArgumentsTest {
    @Test
    public void whenEmptyThen5() {
        assertEquals(Integer.valueOf(5), ReductionWithTwoArguments.collect(List.of()));
    }

    @Test
    public void when1then5() {
        assertEquals(Integer.valueOf(5), ReductionWithTwoArguments.collect(List.of(1)));
    }

    @Test
    public void when12then10() {
        assertEquals(Integer.valueOf(10), ReductionWithTwoArguments.collect(List.of(1, 2)));
    }

    @Test
    public void when123then30() {
        assertEquals(Integer.valueOf(30), ReductionWithTwoArguments.collect(List.of(1, 2, 3)));
    }
}