package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task170symmetryTest {
    @Test
    public void checkTrue() {
        boolean check = Task170symmetry.check(1112111);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        boolean check = Task170symmetry.check(123456321);
        assertThat(check, is(false));
    }

    @Test
    public void checkFalseEvenLength() {
        boolean check = Task170symmetry.check(12345321);
        assertThat(check, is(false));
    }

    @Test
    public void checkTrueEvenLength() {
        boolean check = Task170symmetry.check(12344321);
        assertThat(check, is(true));
    }
}