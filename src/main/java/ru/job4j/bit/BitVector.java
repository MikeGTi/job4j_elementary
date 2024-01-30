package ru.job4j.bit;

import java.nio.ByteBuffer;

public class BitVector {
    int[] bitStore;

    public BitVector(int sizeInBits) {
        this.bitStore = new int[(sizeInBits >> 5) + 1];
    }

    public BitVector(int[] numbers) {
        this.bitStore = numbers;
    }

    private int getRow(int bit) {
        //System.out.printf("Row: %d", (int) Math.floor(bit >> 5));
        return (int) Math.floor(bit >> 5);
    }

    private int getCol(int bit) {
        //System.out.printf(", col: %d%n", bit % 32);
        return bit % 32;
    }

    public boolean isSetBit(int index) {
        //printByte(bitStore[getRow(index)], 32);
        return (bitStore[getRow(index)] & (1 << getCol(index))) != 0;
    }

    /*public int getBit(int index) {

    }*/

    public int setBit(int index) {
        //return bitStore[getRow(index)] | (1 << getCol(index));
        System.out.printf("Row: %d", getRow(index));
        System.out.printf(", col: %d%n", getCol(index));
        int rsl = bitStore[getRow(index)] | (1 << getCol(index));
        printByte(getCol(index));
        return rsl;
    }

    public int inverseBit(int index) {
        return bitStore[getRow(index)] ^ (1 << getCol(index));
    }

    public int resetBit(int index) {
        return bitStore[getRow(index)] & ~(1 << getCol(index));
    }

    public void printByte(int val) {
        byte[] bytes = ByteBuffer.allocate(Integer.SIZE / Byte.SIZE).putInt(val).array();
        for (byte b : bytes) {
            //System.out.format("0x%02X ", b);
            for (int i = 7; i >= 0; i--) {
                int bit = (b >> i) & 1;
                System.out.print(bit);
            }
            System.out.println();
        }
        System.out.printf("%n%n");
    }
}
