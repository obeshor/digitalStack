package com.myapp;

public class TriangleRect {


    public static void trianglePattern(int n) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int count = 0;

        for(int i =0; i < n; i++){

            for(int j=0 ; j<i; j++ ){
                count ++;
                System.out.print(count+" ");
            }
            System.out.println();

        }


    }

    public static void trianglePascal(int n) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        for(int line =1; line <= n; line++){

            for(int column=0 ; column<n-line; column++ ){

                System.out.print(" ");
            }
            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {

                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }

            System.out.println();

        }


    }



    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        //trianglePattern(5);
        trianglePascal(5);


    }

}
