package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("calculadora v2.0");
        Scanner in = new Scanner(System.in);

        System.out.println("1 para somar");
        System.out.println("2 para subtrair");
        System.out.println("3 para multiplicar");
        System.out.println("4 para dividir");
        System.out.printf("op:");
        int op = in.nextInt();

        System.out.println("digite o primeiro numero:");
        double num1 = in.nextDouble();

        System.out.println("digite o segundo numero:");
        double num2 = in.nextDouble();

        if (op == 1){
            System.out.println(num1+num2);
        }else {
            if (op == 2){
                System.out.println(num1 - num2);
            }else {
                if (op == 3){
                    System.out.println(num1 * num2);

                }else{
                    if(op ==4){
                        System.out.println(num1 / num2);
                    }else {
                        System.out.println("erro");
                    }
                }
            }
        }

    }
}
