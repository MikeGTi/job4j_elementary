package ru.job4j.array.junior;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task14sets {
    public static int[] diff(int[] left, int[] right) {
        if (left.length == 0 || right.length == 0) {
            return left;
        }
        int[] rsl = new int[left.length];
        int count = 0;
        HashMap<Integer, Integer> rightNumsMap = new HashMap<>();
        for (int num : right) {
            rightNumsMap.put(num, num);
        }
        for (int i : left) {
            if (!rightNumsMap.containsKey(i)) {
                rsl[count++] = i;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    public static int[] and(int[] left, int[] right) {
        if (left.length == 0 || right.length == 0) {
            return left;
        }
        int[] rsl = new int[Math.max(left.length, right.length)];
        int count = 0;
        HashMap<Integer, Integer> rightNumsMap = new HashMap<>();
        for (int num : right) {
            rightNumsMap.put(num, num);
        }
        for (int num : left) {
            if (rightNumsMap.containsKey(num)) {
                rsl[count++] = num;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    public static int[] or(int[] left, int[] right) {
        if (left.length == 0 && right.length != 0) {
            return right;
        }
        if (left.length != 0 && right.length == 0) {
            return left;
        }
        Set<Integer> numsSet = new HashSet<>();
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int count = 0;
        while (i < left.length) {
            if (!numsSet.contains(left[i])) {
                numsSet.add(left[i]);
                rsl[count++] = left[i];
            }
            i++;
        }
        i = 0;
        while (i < right.length) {
            if (!numsSet.contains(right[i])) {
                numsSet.add(right[i]);
                rsl[count++] = right[i];
            }
            i++;
        }
        return Arrays.copyOf(rsl, count);
    }

    public static int[] diffSymmetric(int[] left, int[] right) {
        if (left.length == 0 && right.length != 0) {
            return right;
        }
        if (left.length != 0 && right.length == 0) {
            return left;
        }
        Set<Integer> leftNumsSet = new HashSet<>();
        for (int n : left) {
            leftNumsSet.add(n);
        }
        Set<Integer> rightNumsSet = new HashSet<>();
        for (int n : right) {
            rightNumsSet.add(n);
        }
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int count = 0;
        while (i < left.length) {
            if (!rightNumsSet.contains(left[i])) {
                rsl[count++] = left[i];
            }
            i++;
        }
        i = 0;
        while (i < right.length) {
            if (!leftNumsSet.contains(right[i])) {
                rsl[count++] = right[i];
            }
            i++;
        }
        return Arrays.copyOf(rsl, count);
    }
}
