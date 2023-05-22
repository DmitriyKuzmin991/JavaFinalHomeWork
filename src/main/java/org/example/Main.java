package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> set = new HashSet<>(Set.of(
                new Laptop("lenovo", "linux", 16, 512, "white"),
                new Laptop("dell", "windows", 32, 256, "silver"),
                new Laptop("apple", "appleOS", 64, 1024, "black"),
                new Laptop("samsung", "windows", 32, 512, "silver"),
                new Laptop("lenovo", "linux", 32, 128, "white"),
                new Laptop("dell", "linux", 32, 512, "black")
        ));
        Util.getFilter(set);

    }
}
