package ru.job4j.map;

import java.util.*;

public class AnalyzeHttpLog {
    public record Line(String level, String thread, String text) {

    }

    public static Map<String, Long> groupByLevel(List<Line> logs) {
        Map<String, Long> levelCounterMap = new LinkedHashMap<>();
        logs.forEach(log -> {
                                levelCounterMap.putIfAbsent(log.level, 0L);
                                levelCounterMap.computeIfPresent(log.level, (k, v) -> v + 1L);
                            });
        return levelCounterMap;
    }

    public static String maxByThread(List<Line> logs) {
        Map<String, Long> threadCounterMap = new LinkedHashMap<>();
        logs.forEach(log -> {
            threadCounterMap.computeIfPresent(log.thread, (k, v) -> v + 1L);
            threadCounterMap.putIfAbsent(log.thread, 1L);
        });
        Long max = 1L;
        String rsl = "";
        for (Line log : logs) {
            if (threadCounterMap.containsKey(log.thread) && threadCounterMap.get(log.thread) >= max) {
                max = threadCounterMap.get(log.thread);
                rsl = log.thread;
            }
        }
        return rsl;
    }

    public static Map<String, Long> detailByThread(List<Line> logs, String thread,
                                                   List<String> orders) {
        Map<String, Long> levelCounterMap = new LinkedHashMap<>();
        logs.forEach(log -> {
            if (thread.equals(log.thread)) {
                if (orders.contains(log.level)) {
                    levelCounterMap.putIfAbsent(log.level, 0L);
                    levelCounterMap.computeIfPresent(log.level, (k, v) -> v + 1L);
                }
            }
        });
        return levelCounterMap;
    }
}