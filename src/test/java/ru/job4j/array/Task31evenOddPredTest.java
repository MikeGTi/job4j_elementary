package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task31evenOddPredTest {

    @Test
    public void whenWinOdd() {
        assertEquals(2, Task31evenOddPred.whoWin(new int[] {5, 10, 4, 3}));
    }

    @Test
    public void whenWiEven() {
        assertEquals(1, Task31evenOddPred.whoWin(new int[] {10, 5, 4, 3}));
    }

    @Test
    public void whenNobody() {
        assertEquals(0, Task31evenOddPred.whoWin(new int[] {6, 5, 4, 5}));
    }

}