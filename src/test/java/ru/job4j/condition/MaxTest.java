package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To1Then4() {
        int left = 4;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To23Then23() {
        int left = 3;
        int right = 23;
        int result = Max.max(left, right);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}