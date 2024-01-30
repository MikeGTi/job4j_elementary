package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task10GameTest {
    @Test
    public void when0point2509then1() {
        int rsl = Task10Game.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1));
    }

    @Test
    public void when0point912then0() {
        int rsl = Task10Game.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0));
    }
}