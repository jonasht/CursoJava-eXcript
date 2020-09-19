package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println("DoWhile II");
        System.out.println();
        int x = 0;

        do {


            double numero1, numero2, resultado;
            numero1 = numero2 = resultado = 0;

            System.out.println("digite a opcao");
            System.out.println("1 somar");
            System.out.println("2 subtrair");
            System.out.println("3 multiplicar");
            System.out.println("4 dividir");
            System.out.println("0 para sair do programa");
            System.out.printf("op:");
            x = in.nextInt();

            if (x != 0) {
                System.out.println("digite o numero1");
                numero1 = in.nextDouble();

                System.out.println("digite o numero2");
                numero2 = in.nextDouble();

                if (x == 1) {//somar
                    resultado = numero1 + numero2;

                } else {
                    if (x == 2) {// subtrair
                        resultado = numero1 - numero2;
                    } else {
                        if (x == 3) {// multiplicar
                            resultado = numero1 * numero2;
                        } else {
                            if (x == 4) {
                                resultado = numero1 / numero2;
                            }

                        }
                    }
                }
            }
            System.out.println("o resultado eh:" + resultado);
        }while(x != 0);
        System.out.println("\nfim de programa");
    }
}
