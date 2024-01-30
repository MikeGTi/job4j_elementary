package ru.job4j.comparator;

import java.util.Comparator;
import java.util.Objects;

public class ThenComparingMethod {

    public static class User implements Comparable<User> {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public int compareTo(User o) {
            return name.compareTo(o.name);
        }
    }

    public static Comparator<User> thenComparing() {
        return ascByName().thenComparing(descByAge());
    }

    public static Comparator<User> ascByName() {
        return (o1, o2) -> o1.name.compareTo(o2.name);
    }

    public static Comparator<User> descByName() {
        return (o1, o2) -> o2.name.compareTo(o1.name);
    }

    public static Comparator<User> ascByAge() {
        return (o1, o2) -> Integer.compare(o1.age, o2.age);
    }

    public static Comparator<User> descByAge() {
        return (o1, o2) -> Integer.compare(o2.age, o1.age);
    }
}
