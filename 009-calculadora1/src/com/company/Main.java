package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // agora o numeros estarao em double
        double numero1, numero2, soma, subtracao, multiplicacao, divisao;

        System.out.println("insira um numero: ");
        numero1 = in.nextDouble();

        System.out.println("insira outro numero: ");
        numero2 = in.nextDouble();

        soma = numero1 + numero2;

        System.out.println("o resultado da soma eh: " + soma);

        subtracao = numero1 - numero2;
        System.out.println("o resultado da subtracao eh: "+subtracao);

        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;

        System.out.println("o resultado da multiplicacao eh: " + multiplicacao);

        System.out.println("o resultado da divisao eh: "+divisao);

    }
}
