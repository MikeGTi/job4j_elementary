package ru.job4j.lambda;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.*;

public class MRPredicateTest {

    @Test
    public void whenEmptyThenTrue() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertTrue(predicate.test(""));
    }

    @Test
    public void whenNotEmptyThenFalse() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertFalse(predicate.test("a"));
    }
}