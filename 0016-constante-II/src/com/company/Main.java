package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("constante II\n");

        final double vsom = 340.28;

        System.out.println("digite o espalo de tempo:");
        Scanner in = new Scanner(System.in);

        int tempo = in.nextInt();

        System.out.println("a distancia eh de:" +
                                    tempo * vsom
                                    + " metros percorridos");

        System.out.println("a distancia km " +
                (tempo * vsom) / 1000
                + " km percorridos");


    }
}
