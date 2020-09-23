package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("numero aleatorio");

        Random numero = new Random();
        System.out.println(numero.nextInt(10));
        System.out.println("=-=-=");
        for (int i = 0; i <= 20; i++) {
            System.out.println(numero.nextInt(10)+1);
            System.out.println(numero.nextDouble());
            System.out.println(numero.nextDouble()*20);
        }

        System.out.println("=-=-=");
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+numero.nextBoolean());

        }
        System.out.println();
    }
}
