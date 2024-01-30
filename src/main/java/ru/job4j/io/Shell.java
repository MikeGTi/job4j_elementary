package ru.job4j.io;

import java.util.ArrayDeque;

public class Shell {
    private ArrayDeque<String> queue = new ArrayDeque<>();

    public void cd(String path) {
        if ("..".equals(path)) {
            path = "/";
        }
        if (!path.contains("/")) {
            String add = queue.isEmpty() ? "" : queue.pollLast();
            queue.addLast(String.format("%s/%s", add, path));
        } else {
            queue.addLast(path.replaceAll("\\.\\.", ""));
        }
    }

    public String pwd() {
        return queue.peekLast();
    }
}
