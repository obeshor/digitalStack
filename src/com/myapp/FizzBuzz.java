package com.myapp;

import java.util.LinkedList;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number  between (1-100) ");
        int number = scanner.nextInt();
        LinkedList<String> list = new LinkedList<>();
        for (int i =1; i < number; i++){
            if (i % 15 ==0) {
                list.add("FizzBuzz");
            }else if  (i % 3  ==0) {
                list.add("Fizz");
            } else if (i % 5 ==0) {
                list.add("Buzz");
            } else {
                list.add(i+"");

            }
        }
        System.out.println("Result ");
        list.forEach(element -> System.out.println(""+ element));








    }
}
