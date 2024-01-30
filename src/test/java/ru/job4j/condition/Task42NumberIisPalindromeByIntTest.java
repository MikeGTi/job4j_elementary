package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Task42NumberIisPalindromeByIntTest {
    public String ln = System.lineSeparator();

    @Test
    public void when373ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(373);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when37573ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(37573);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when3ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(3);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when11121ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(11121);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when211ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(211);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when372ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(372);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when55ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(55);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5335ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(5335);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4455ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(4455);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4555ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(4555);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42number.isPalindromeByInt(100);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }
}