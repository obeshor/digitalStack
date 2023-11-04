package com.myapp;

public class ArraysExample {
    public static boolean containsDuplicate(int[] number) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        for(int i =0; i <= number.length; i++){

            for(int j=i+1 ; j< number.length; j++ ){
                if (number[i] == number[j]) {
                    return true;
                }

            }

        }
        return false;


    }
    public static int numIdenticalPairs(int[] number) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int count = 0;
        for(int i =0; i <= number.length; i++){

            for(int j=i+1 ; j< number.length; j++ ){
                if (number[i] == number[j]) {
                    count ++ ;
                }

            }

        }
        return count ;


    }





    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        //int[] array = {1,3, 6, 4, 5};
       // int[]  anotherArray = {1, 2, 3, 4, 1};
        //System.out.println(containsDuplicate(array));
       // System.out.println(containsDuplicate(anotherArray));

        int[] array = {1,2,3,1,1,3};
        int[]  anotherArray = {1, 1, 1, 1};
        //System.out.println((numIdenticalPairs(array));

        System.out.println(numIdenticalPairs(anotherArray));


    }

}

