package ru.job4j.array.twodim;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task16splitTest {

    @Test
    public void test() {
        assertArrayEquals(new String[] {"one", "two"}, convert(Task16split.split("one two".toCharArray(), ' ')));
        assertArrayEquals(new String[] {"one", "two", "three"}, convert(Task16split.split("one two three".toCharArray(), ' ')));
        assertArrayEquals(new String[] {"onetwothree"}, convert(Task16split.split("onetwothree".toCharArray(), ' ')));
    }

    private String[] convert(char[][] splitted) {
        String[] result = new String[splitted.length];
        int ri = 0;
        for (char[] row : splitted) {
            result[ri++] = new String(row);
        }
        return result;
    }

}