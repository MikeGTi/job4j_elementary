package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task18weeklySalaryTest {
    @Test
    public void calculateIs400() {
        int[] hours = {8, 8, 8, 8, 8, 0, 0};
        int rsl = Task18weeklySalary.calculate(hours);
        assertThat(rsl, is(400));
    }

    @Test
    public void calculateIs410() {
        int[] hours = {10, 10, 10, 0, 8, 0, 0};
        int rsl = Task18weeklySalary.calculate(hours);
        assertThat(rsl, is(410));
    }

    @Test
    public void calculateIs690() {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        int rsl = Task18weeklySalary.calculate(hours);
        assertThat(rsl, is(690));
    }
}