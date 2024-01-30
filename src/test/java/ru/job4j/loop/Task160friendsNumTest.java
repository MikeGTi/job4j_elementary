package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task160friendsNumTest {
    public String ln = System.lineSeparator();

    @Test
    public void when1184Then1210() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task160friendsNum.loop(1184);
        String expected = "1210" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when2620Then2924() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task160friendsNum.loop(2620);
        String expected = "2924" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5020Then5564() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task160friendsNum.loop(5020);
        String expected = "5564" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when6232Then6368() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task160friendsNum.loop(6232);
        String expected = "6368" + ln;
        assertThat(out.toString(), is(expected));
    }
}