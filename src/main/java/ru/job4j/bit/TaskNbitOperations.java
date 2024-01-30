package ru.job4j.bit;

public class TaskNbitOperations {
    public static void main(String[] args) {
        byte state1 = 1; //bin 00000001
        byte state2 = 2; //bin 00000010
        byte state3 = 4; //bin 00000100
        print123((byte) (state1 | state2 | state3));
    }

    private static void print123(byte state1or2or3) {
        byte mask1 = 1;
        byte mask2 = 2;
        byte mask3 = 4;
        //System.out.println(state1or2or3);
        if ((state1or2or3 & mask1) != 0) {
            System.out.println("state1 bit is 1");
        } else {
            System.out.println("state1 bit is 0");
        }
        if ((state1or2or3 & mask2) != 0) {
            System.out.println("state2 bit is 1");
        } else {
            System.out.println("state2 bit is 0");
        }
        if ((state1or2or3 & mask3) != 0) {
            System.out.println("state3 bit is 1");
        } else {
            System.out.println("state3 bit is 0");
        }
    }
}
