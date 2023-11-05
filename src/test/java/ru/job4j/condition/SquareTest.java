package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SquareTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = Square.area(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K2Square3dot55() {
        double expected = 3.55;
        int p = 8;
        double k = 2;
        double out = Square.area(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP16K3Square12() {
        int expected = 12;
        int p = 16;
        double k = 3;
        double out = Square.area(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}