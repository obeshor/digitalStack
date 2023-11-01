package com.myapp;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a step number (1-5) for preparing for coding interview at Google");
        int step = scanner.nextInt();

        switch (step){
            case 1 :
                System.out.println("Step 1 : Understand the Google interview process and the types of questions asked");
                break ;
            case 2 :
                System.out.println("Step 2: Study data structures and algorithms extensively ");
                break;
            case 3 :
                System.out.println("Step 3 : Practice solving coding problems, including Google interview style questions");
                break;

            case 4 :
                System.out.println("Step 4 : Review system design concepts and practice designing scalable solutions");
                break;

            case 5 :
                System.out.println("Step 5 : Prepare for behavioral interview by researching Google's core values and practicing STAR method responses");

                break;
            default:
                System.out.println("Invalid step number. Please enter a number between 1 and 5");
                break;
        }



    }
}
