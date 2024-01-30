package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task13HelloWorldTest {
    @Test
    public void checkNumberHelloWorld() {
        String s = Task13HelloWorld.checkNumber(15);
        assertThat(s, is("Hello, World!!!"));
    }

    @Test
    public void checkNumberHello() {
        String s = Task13HelloWorld.checkNumber(9);
        assertThat(s, is("Hello"));
    }

    @Test
    public void checkNumberWorld() {
        String s = Task13HelloWorld.checkNumber(25);
        assertThat(s, is("World"));
    }

    @Test
    public void checkNumberDefault() {
        String s = Task13HelloWorld.checkNumber(14);
        assertThat(s, is("Operation not support"));
    }
}