package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int numero1, numero2, soma, subtracao;

        System.out.println("insira um numero: ");
        numero1 = in.nextInt();

        System.out.println("insira outro numero: ");
        numero2 = in.nextInt();

        soma = numero1 + numero2;

        System.out.println("o resultado da soma eh: " + soma);

        subtracao = numero1 - numero2;
        System.out.println("o resultado da subtracao eh: "+subtracao);

    }
}
