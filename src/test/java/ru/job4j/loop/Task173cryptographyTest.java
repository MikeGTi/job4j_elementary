package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task173cryptographyTest {
    @Test
    public void codeLengthGreat4() {
        String code = Task173cryptography.code("4556364607935616");
        assertThat(code, is("############5616"));
    }

    @Test
    public void codeLengthLess4() {
        String code = Task173cryptography.code("123");
        assertThat(code, is("123"));
    }

    @Test
    public void codeEmptyString() {
        String code = Task173cryptography.code("");
        assertThat(code, is("empty"));
    }
}