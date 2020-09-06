package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("estrutura while");

        int i = 0;

        while (i <= 10){
            i = i + 1;
            System.out.println("i = " + i);
        }

        i = 10 + 1;

        System.out.println();
        while (i >= 1){

            System.out.println("i = " + i);
            i = i - 1;
        }

    }
}
