package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task11BonusCupCoffeeTest {
    @Test
    public void countCup() {
        int rsl = Task11BonusCupCoffee.countCup(7, 6);
        assertThat(rsl, is(8));
    }

    @Test
    public void countCup1() {
        int rsl = Task11BonusCupCoffee.countCup(213, 6);
        assertThat(rsl, is(248));
    }
}