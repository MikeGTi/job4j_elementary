package ru.job4j.bit;

public class Task8000numbers {
    public static void main(String[] args) {
        /*int[] numbers1 = IntStream.range(1, 8001).toArray();
        printDuplicates(numbers1, 8000);*/

        int[] numbers2 = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 255, 255, 256};
        printDuplicates(numbers2, 256);

        /*BitVector bv = new BitVector(5);
        bv.printByte(2);*/

    }

    public static void printDuplicates(int[] numbers, int maxNum) {
        boolean[] readedNums = new boolean[maxNum];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            //System.out.printf("Current num: %d%n", number);
            if (readedNums[number]) {
                System.out.printf("Duplicate: %d%n", number);
            } else {
                readedNums[number] = true;
            }
        }
    }
}
