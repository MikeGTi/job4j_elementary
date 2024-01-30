package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task14LeapYearTest {
    @Test
    public void checkYearFalse() {
        boolean b = Task14LeapYear.checkYear(2019);
        assertThat(b, is(false));
    }

    @Test
    public void checkYearFalse1() {
        boolean b = Task14LeapYear.checkYear(1800);
        assertThat(b, is(false));
    }

    @Test
    public void checkYearTrue() {
        boolean b = Task14LeapYear.checkYear(2020);
        assertThat(b, is(true));
    }

    @Test
    public void checkYearTrue1() {
        boolean b = Task14LeapYear.checkYear(2000);
        assertThat(b, is(true));
    }
}