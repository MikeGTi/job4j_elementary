package ru.job4j.map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        LinkedHashMap<String, Integer> dataMap = new LinkedHashMap<>();
        for (Info info : list) {
            dataMap.putIfAbsent(info.city, 0);
            dataMap.computeIfPresent(info.city, (k, v) -> dataMap.get(info.city) + info.rainfall);
        }
        return dataMap.entrySet().stream().map(e -> new Info(e.getKey(), e.getValue())).collect(Collectors.toList());
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}