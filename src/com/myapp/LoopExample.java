package com.myapp;

public class LoopExample {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int count = 0;

        for(int i =0; i < 5; i++){
            System.out.println("Iteration :"+ i);
        }

        int [] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers){
            System.out.println("Number: " + num);
        }

        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }


    }
}
