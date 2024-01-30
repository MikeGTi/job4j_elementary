package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task49pairsCharStringTest {
    @Test
    public void checkTrue() {
        boolean rsl = Task49pairsCharString.check("", "");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkTrue1() {
        boolean rsl = Task49pairsCharString.check("sparkling", "groups");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkFalse() {
        boolean rsl = Task49pairsCharString.check("booking", "grabber");
        assertThat(rsl, is(false));
    }

    @Test
    public void checkFirstNotEqLastEq() {
        boolean rsl = Task49pairsCharString.check("eagle", "like");
        assertThat(rsl, is(false));
    }
}