package ru.job4j.array.junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task14SetsTest {
    @Test
    public void diffWhenTwoEmptyThenEmpty() {
        assertArrayEquals(new int[] {}, Task14sets.diff(new int[] {}, new int[] {}));
    }

    @Test
    public void diffWhenFirstEmptyThenEmpty() {
        assertArrayEquals(new int[] {}, Task14sets.diff(new int[] {}, new int[] {1}));

    }

    @Test
    public void diffWhenSecondEmptyThenSecond() {
        assertArrayEquals(new int[] {1}, Task14sets.diff(new int[] {1}, new int[] {}));
    }

    @Test
    public void diffWhenFirst123second2Then13() {
        assertArrayEquals(new int[] {1, 3}, Task14sets.diff(new int[] {1, 2, 3}, new int[] {2}));
    }

    @Test
    public void diffWhenFirst13second2Then13() {
        assertArrayEquals(new int[] {1, 3}, Task14sets.diff(new int[] {1, 3}, new int[] {2}));
    }

    @Test
    public void andWhenFirst123Second45ThenEmpty() {
        assertArrayEquals(new int[] {}, Task14sets.and(new int[] {1, 2, 3}, new int[] {4, 5}));
    }

    @Test
    public void andWhenFirst123Second145Then1() {
        assertArrayEquals(new int[] {1}, Task14sets.and(new int[] {1, 2, 3}, new int[] {1, 4, 5}));
    }

    @Test
    public void andWhenFirst12345Second45Then45() {
        assertArrayEquals(new int[] {4, 5}, Task14sets.and(new int[] {1, 2, 3, 4, 5}, new int[] {4, 5}));
    }

    @Test
    public void orWhenEmpty() {
        assertArrayEquals(new int[] {}, Task14sets.or(new int[] {}, new int[] {}));
        assertArrayEquals(new int[] {1}, Task14sets.or(new int[] {1}, new int[] {}));
        assertArrayEquals(new int[] {1}, Task14sets.or(new int[] {}, new int[] {1}));
    }

    @Test
    public void orWhenFirst12Second12Then12() {
        assertArrayEquals(new int[] {1, 2}, Task14sets.or(new int[] {1, 2}, new int[] {1, 2}));
    }

    @Test
    public void orWhenFirst12Second123Then123() {
        assertArrayEquals(new int[] {1, 2, 3}, Task14sets.or(new int[] {1, 2}, new int[] {1, 2, 3}));
    }

    @Test
    public void orWhenFirst1Second23Then123() {
        assertArrayEquals(new int[] {1, 2, 3}, Task14sets.or(new int[] {1}, new int[] {2, 3}));
    }

    @Test
    public void diffSymmetricWhenEmpty() {
        assertArrayEquals(new int[] {}, Task14sets.diffSymmetric(new int[] {}, new int[] {}));
        assertArrayEquals(new int[] {1}, Task14sets.diffSymmetric(new int[] {1}, new int[] {}));
        assertArrayEquals(new int[] {1}, Task14sets.diffSymmetric(new int[] {}, new int[] {1}));
        assertArrayEquals(new int[] {}, Task14sets.diffSymmetric(new int[] {1}, new int[] {1}));
    }

    @Test
    public void diffSymmetricWhenFirst12Second23Then13() {
        assertArrayEquals(new int[] {1, 3}, Task14sets.diffSymmetric(new int[] {1, 2}, new int[] {2, 3}));
    }

    @Test
    public void diffSymmetricWhenFirst12Second34Then1234() {
        assertArrayEquals(new int[] {1, 2, 3, 4}, Task14sets.diffSymmetric(new int[] {1, 2}, new int[] {3, 4}));
    }
}