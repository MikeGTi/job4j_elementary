package ru.job4j.hash;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Task5employeeTest {
    @Test
    public void whenMulti() {
        var input = List.of(
                new Task5employee.Task(1, 1),
                new Task5employee.Task(1, 2),
                new Task5employee.Task(1, 1)
        );
        var expected = List.of(1);
        var result = Task5employee.multiAssign(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenOnlyUnique() {
        var input = List.of(
                new Task5employee.Task(1, 1),
                new Task5employee.Task(1, 2),
                new Task5employee.Task(1, 3)
        );
        var expected = List.of();
        var result = Task5employee.multiAssign(input);
        assertThat(result, is(expected));
    }
}