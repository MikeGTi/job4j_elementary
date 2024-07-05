package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SimplePipeline {

    private final List<Integer> data;

    private final List<Pipe<Integer>> pipes = new ArrayList<>();

    private SimplePipeline(List<Integer> source) {
        data = source;
    }

    public static SimplePipeline of(Integer... source) {
        return new SimplePipeline(List.of(source));
    }

    public SimplePipeline map(Function<Integer, Integer> fun) {
        pipes.add(new MapPipe<>(fun));
        return this;
    }

    public SimplePipeline filter(Predicate<Integer> fun) {
        pipes.add(new FilterPipe<>(fun));
        return this;
    }

    public List<Integer> collect() {
        if (pipes.isEmpty() || data.isEmpty()) {
            return data;
        }
        var accumulate = new ArrayList<Integer>();
        boolean add = true;
        for (var value: data) {
            for (var pipe : pipes) {
                State<Integer> state = pipe.state(value);
                if (!state.pass()) {
                    add = false;
                    break;
                } else {
                    value = state.get();
                }
            }
            if (add) {
                accumulate.add(value);
            }
            add = true;
        }
        return accumulate;
    }

    public interface Pipe<T> {
        <R> State<R> state(T value);
    }

    public static class MapPipe<T> implements Pipe<T> {
        private final Function<T, T> function;

        public MapPipe(Function<T, T> function) {
            this.function = function;
        }

        @Override
        public <R> State<R> state(T value) {
            return () -> (R) function.apply(value);
        }
    }

    public static class FilterPipe<T> implements Pipe<T> {
        private final Predicate<T> filter;

        public FilterPipe(Predicate<T> filter) {
            this.filter = filter;
        }

        @Override
        public <R> State<R> state(T value) {
            return new State<R>() {
                @Override
                public boolean pass() {
                    return filter.test(value);
                }

                @Override
                public R get() {
                    return (R) value;
                }
            };
        }
    }

    public interface State<T> {

        default boolean pass() {
            return true;
        }

        T get();
    }

    public static void main(String[] args) {
        SimplePipeline.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
                .filter(el -> el > 1)
                .map(el -> el * el)
                .filter(el -> el > 10)
                .collect()
                .forEach(System.out::println);
    }
}
