package ru.job4j.type;

import java.util.ArrayList;
import java.util.Collections;

public class Task45 {
    public static void main(String[] args) {
        leftNumChange(123, 456);
    }

    public static void leftNumChange(int number1, int number2) {
        ArrayList<Integer> nums1 = getNumbers(number1);
        ArrayList<Integer> nums2 = getNumbers(number2);
        int buffer1 = nums1.get(0);

        nums1.set(0, nums2.get(0));
        nums2.set(0, buffer1);

        int result1 = collectDigitFromNumbers(nums1);
        int result2 = collectDigitFromNumbers(nums2);
        System.out.println(result1 + "\n" + result2);
    }

    private static ArrayList<Integer> getNumbers(int num) {
        ArrayList<Integer> result = new ArrayList<>();
        while (num > 0) {
            result.add(num % 10);
            num  = num / 10;
        }
        Collections.reverse(result);
        return result;
    }

    private static int collectDigitFromNumbers(ArrayList<Integer> numbers) {
        StringBuilder result = new StringBuilder();
        numbers.forEach(result::append);
        return Integer.parseInt(result.toString());
    }
}
