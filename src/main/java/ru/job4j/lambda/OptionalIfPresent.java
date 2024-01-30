package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(integer -> System.out.printf("Max: %s%n", integer));
    }

    private static Optional<Integer> max(int[] data) {
        int max = -1;
        for (int dt : data) {
            max = Math.max(max, dt);
        }
        return max == -1 ? Optional.empty() : Optional.of(max);
    }
}
