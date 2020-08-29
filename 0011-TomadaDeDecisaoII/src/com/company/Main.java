package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("1==1 = " + (1==1));

        boolean b = 1 == 1;
        System.out.println("1 == 1 b = " + b);

        boolean b1 = 1 != 1;
        System.out.println("1 != 1 b1 = " + b1);

        boolean b2 = 2 > 1;
        System.out.println("2 > 1 b2 = " + b2);

        int numero1 = 3;
        int numero2 = 1;

        System.out.println("\nnumero1 > numero2 - " + numero1 + " > " + numero2);
        System.out.println(numero1 > numero2);

        numero2 = 3;
        System.out.println("\nnumero1 > numero2 - " + numero1 + " > " + numero2);
        System.out.println(numero1 > numero2);

        System.out.println("\nnumero1 >= numero2 - " + numero1 + " >= " + numero2);
        System.out.println(numero1 >= numero2);

    }
}
