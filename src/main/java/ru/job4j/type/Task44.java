package ru.job4j.type;

import java.util.ArrayList;
import java.util.Collections;

public class Task44 {
    public static void main(String[] args) {
        rightNumChange(123, 4567);
    }

    public static void rightNumChange(int number1, int number2) {
        ArrayList<Integer> nums1 = getNumbers(number1);
        ArrayList<Integer> nums2 = getNumbers(number2);
        int buffer1 = nums1.get(nums1.size() - 1);

        nums1.set(nums1.size() - 1, nums2.get(nums2.size() - 1));
        nums2.set(nums2.size() - 1, buffer1);

        int result1 = collectDigitFromNumbers(nums1);
        int result2 = collectDigitFromNumbers(nums2);
        System.out.println(result1 + System.lineSeparator() + result2);
    }

    private static ArrayList<Integer> getNumbers(int num) {
        ArrayList<Integer> result = new ArrayList<>();
        while (num > 0) {
            result.add(num % 10);
            num = num / 10;
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
