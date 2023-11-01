package com.myapp;

public class ConditionExample {

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

       int codingScore = 90 ;
       int problemSolvingScore = 80;

        if (codingScore >= 90 && problemSolvingScore >=90) {
            System.out.println("Your coding and problem solving skills are exceptional");
        } else if (codingScore >=80 && problemSolvingScore >= 80) {
            System.out.println("Your coding and problem solving are strong ");
        }else {
            System.out.println("Your need to improve your coding and problem-solving ");
        }




    }
}
