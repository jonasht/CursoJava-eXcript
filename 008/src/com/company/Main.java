package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        1 entrada de dados
        2 processamento de dados
        3 saida dos dados
         */

        System.out.printf("qual a idade do cachorro: ");
        Scanner in = new Scanner(System.in);

        int idadeCachorro = in.nextInt();
        idadeCachorro = idadeCachorro * 12;

        System.out.println("o cachorro tem "+idadeCachorro+" anos");

    }
}
