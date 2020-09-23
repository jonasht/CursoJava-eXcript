package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = (true) ? 1 : 0;
        System.out.println(num);

        int a, b;
        String valor;

        a = 5;
        b = 5;

        if (a==b){
            valor = "verdadeiro";

        }else {
            valor = "falso";
        }
        System.out.println(valor);

        valor = a>b ? "verdadeiro" : "falso";
        System.out.println("valor = " + valor);

        valor = a<b ? "verdadeiro" : "falso";
        System.out.println("valor = " + valor);

        valor = a==b ? "verdadeiro" : "falso";
        System.out.println("valor = " + valor);

        valor = a!=b ? "verdadeiro" : "falso";
        System.out.println("valor = " + valor);

    }
}
