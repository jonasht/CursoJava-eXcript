package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num;

        System.out.println("digite o numero 1:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        if(num==1){
            System.out.println("voce digitou 1");

        }else{
            System.out.println("nemero digitado nao eh 1");
        }
    }
}
