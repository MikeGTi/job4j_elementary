package ru.job4j.stream;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CollectToSetTest {
    @Test
    public void whenSet12ThenSet12() {
        Set<Integer> input = Set.of(1, 2);
        Set<Integer> expect = Set.of(1, 2);
        assertEquals(expect, CollectToSet.collect(input.stream()));
    }

    @Test
    public void whenEmptySetThenEmptySet() {
        Set<Integer> input = Set.of();
        Set<Integer> expect = Set.of();
        assertEquals(expect, CollectToSet.collect(input.stream()));
    }
}