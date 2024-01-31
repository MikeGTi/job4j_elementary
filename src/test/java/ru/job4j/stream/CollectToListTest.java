package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CollectToListTest {
    @Test
    public void whenList12ThenList12() {
        List<Integer> input = List.of(1, 2);
        List<Integer> expect = List.of(1, 2);
        assertEquals(expect, CollectToList.collect(input.stream()));
    }

    @Test
    public void whenEmptyListThenEmptyList() {
        List<Integer> input = List.of();
        List<Integer> expect = List.of();
        assertEquals(expect, CollectToList.collect(input.stream()));
    }
}