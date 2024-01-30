package ru.job4j.stream;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StreamIterateTest {
    @Test
    public void when123456Then135() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Integer[] data = {1, 2, 3, 4, 5, 6};
        StreamIterate.showArray(data);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "1" + ln
                    + "3" + ln
                    + "5" + ln
        ));
    }
}