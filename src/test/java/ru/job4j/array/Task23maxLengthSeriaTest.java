package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task23maxLengthSeriaTest {

    @Test
    public void when1then1() {
        assertEquals(1, Task23maxLengthSeria.find(new int[] {1}));
    }

    @Test
    public void when21then1() {
        assertEquals(1, Task23maxLengthSeria.find(new int[] {2, 1}));
    }

    @Test
    public void when12then2() {
        assertEquals(2, Task23maxLengthSeria.find(new int[] {1, 2}));
    }

    @Test
    public void when120123then4() {
        assertEquals(4, Task23maxLengthSeria.find(new int[] {1, 2, 0, 1, 2, 3}));
    }

    @Test
    public void when121123then4() {
        assertEquals(4, Task23maxLengthSeria.find(new int[] {1, 2, 1, 1, 2, 3}));
    }

    @Test
    public void when321then1() {
        assertEquals(1, Task23maxLengthSeria.find(new int[] {3, 2, 1}));
    }
}