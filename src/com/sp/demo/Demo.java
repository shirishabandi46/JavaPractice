package com.sp.demo;

import java.util.*;
import java.util.stream.*;

public class Demo {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        System.out.println(products);

        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list

        // TODO: Print the filtered list
        List<String> prod = products.stream()
                .filter(s -> s.length()>5)
                .map(String::toUpperCase)
                .sorted()
                .toList();
        prod.forEach(System.out::println);

        List<String> input = Arrays.asList("shireesha", "pashi");

        List<String> output = input.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase())
                .collect(Collectors.toList());

        System.out.println(output);
    }
}
