package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("looping for III");

        int j = 0;
        while (j <= 10){
            j++;
            System.out.println("j = " + j);
        }
        System.out.println();
        int x = 0;
        for (; x < 10;) {
            ++x;

            System.out.println("x = " + x);
        }
        
        int y = 10;
        for (; y <= 10 ; y++) {
            System.out.println("y = " + y);
            
        }

//        for (int u = 0; ; u++) {

        //}
        for(int a = 0, b = 10; a <= 10; ++a, --b) {
            System.out.print(a);
            System.out.print(" =-=-= ");
            System.out.print(b);
            System.out.println();

        }


    }
}
