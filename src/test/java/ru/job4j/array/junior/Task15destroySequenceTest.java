package ru.job4j.array.junior;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertArrayEquals;

public class Task15destroySequenceTest {
    @Test
    public void test1() {
        assertArrayEquals("0000011111".toCharArray(), Task15destroySequence.destroy("1111100000".toCharArray()));
    }

    @Test
    public void test2() {
        assertArrayEquals("00000011111".toCharArray(), Task15destroySequence.destroy("11111000000".toCharArray()));

    }

    @Test
    public void test3() {
        assertArrayEquals("0000001011111".toCharArray(), Task15destroySequence.destroy("1111101000000".toCharArray()));
    }
}