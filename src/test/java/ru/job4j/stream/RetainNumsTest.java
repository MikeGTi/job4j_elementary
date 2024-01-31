package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RetainNumsTest {
    @Test
    public void test() {
        assertEquals(List.of(1, 2, 3), RetainNums.retain(List.of(1, 2, 3)));
        assertEquals(List.of(1, 2, 3), RetainNums.retain(List.of(1, 2, 3, 4)));
        assertEquals(List.of(1, 2, 3, 5), RetainNums.retain(List.of(1, 2, 3, 4, 5, 8)));
        assertEquals(List.of(), RetainNums.retain(List.of(4, 8)));
        assertEquals(List.of(), RetainNums.retain(List.of()));
    }
}