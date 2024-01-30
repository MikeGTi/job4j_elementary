package ru.job4j.bit;

public class BitUtils {
    public static boolean isSetBit(int number, int index) {
        return (number & (1 << index)) != 0;
    }

    public static int setBit(int number, int index) {
        return number | (1 << index);
    }

    public static int inverseBit(int number, int index) {
        return number ^ (1 << index);
    }

    public static int resetBit(int number, int index) {
        return number & ~(1 << index);
    }
}
