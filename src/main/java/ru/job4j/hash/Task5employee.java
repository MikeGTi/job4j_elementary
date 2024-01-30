package ru.job4j.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task5employee {
    public static List<Integer> multiAssign(List<Task> tasks) {
        List<Integer> rsl = new ArrayList<>();
        Set<Integer> employee = new HashSet<>();
        for (Task task : tasks) {
            if (employee.contains(task.assignId)) {
                rsl.add(task.assignId);
            } else {
                employee.add(task.assignId);
            }
        }
        return rsl;
    }

    public record Task(Integer taskId, Integer assignId) {
    }
}
