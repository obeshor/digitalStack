package com.myapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Tom");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name :" + name);
        }

        // Iteration with Stream API
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        numberList.stream().forEach(num -> System.out.println("Number: "+ num));

        // Iteration with forEach method in a collection
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.forEach(color -> System.out.println("Color : "+color));





    }
}
