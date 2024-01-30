package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task172hammingTest {
    @Test
    public void checkStringsIs3() {
        int rsl = Task172hamming.checkStrings("2173896", "2233796");
        assertThat(rsl, is(3));
    }

    @Test
    public void checkStringsIs5() {
        int rsl = Task172hamming.checkStrings("abcde", "bcdef");
        assertThat(rsl, is(5));
    }

    @Test
    public void checkStringsIs0() {
        int rsl = Task172hamming.checkStrings("abcde", "abcde");
        assertThat(rsl, is(0));
    }
}