package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class TriangleTest {

    @Test
    void area() {
        assertThat(Triangle.area(2, 2, 2)).isEqualTo(1.73, withPrecision(0.01));
    }

    @Test
    void whenExist() {
        assertThat(Triangle.exist(2, 2, 2)).isTrue();
    }

    @Test
    void whenNotExist() {
        assertThat(Triangle.exist(2, 2, 10)).isFalse();
    }
}