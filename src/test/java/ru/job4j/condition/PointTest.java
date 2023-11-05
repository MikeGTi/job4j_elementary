package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to34then2dot82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when56to78then2dot82() {
        double expected = 2.82;
        int x1 = 5;
        int y1 = 6;
        int x2 = 7;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}