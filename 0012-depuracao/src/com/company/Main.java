package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        double nota1, nota2, nota3, nota4;
        Scanner in = new Scanner(System.in);


        System.out.println("digite a nota 1:");
        nota1 = in.nextDouble();

        System.out.println("digite a nota 2:");
        nota2 = in.nextDouble();

        System.out.println("digite a nota 3:");
        nota3 = in.nextDouble();

        System.out.println("digite a nota 4:");
        nota4 = in.nextDouble();

        double soma = nota1+nota2+nota3+nota4;
        soma = soma / 4;

        if(soma>=7){
            System.out.println("voce foi aprovado com a nota media de " + soma);
        }else{
            System.out.println("reprovado sua nota meida de "+soma);

        }
    }
}
