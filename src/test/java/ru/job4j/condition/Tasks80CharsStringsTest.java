package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Tasks80CharsStringsTest {

    @Test
    public void whenAAndAThenEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertTrue(Tasks80charsStrings.isIdentical('A', 'A'));
    }

    @Test
    public void whenAAndBThenNotEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertFalse(Tasks80charsStrings.isIdentical('A', 'B'));
    }
}