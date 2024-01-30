package ru.job4j.stream;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StreamOfMethodTest {
    @Test
    public void whenUserStreamMethod() {
        assertEquals("abc",
                StreamOfMethod.createStream().map(Object::toString).collect(Collectors.joining()));
    }

    @Test
    public void whenUserStreamMethodThenListAbc() {
        assertEquals(Stream.of('a', 'b', 'c').collect(Collectors.toList()),
                StreamOfMethod.createStream().collect(Collectors.toList()));
    }
}