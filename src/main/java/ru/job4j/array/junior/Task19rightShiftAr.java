package ru.job4j.array.junior;

public class Task19rightShiftAr {
    public static void shift(int[] nums, int count) {
        int count2 = count % nums.length;
        while (count2 > 0) {
            shiftOneStep(nums);
            count2--;
        }
    }

    private static void shiftOneStep(int[] nums) {
        int last = nums[nums.length - 1];
        System.arraycopy(nums, 0, nums, 1, nums.length - 1);
        nums[0] = last;
    }
}
