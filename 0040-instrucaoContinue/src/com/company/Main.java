package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i < 100; i++) {
            if(i%2==0)
                System.out.println(i);
            else
                continue;

            System.out.println("-----");

            int soma = 0;
            int a = 0;

            while (a<=i){
                a++;
                soma+=i;

            }
            System.out.println("total da soma " + soma);
        }
    }
}
