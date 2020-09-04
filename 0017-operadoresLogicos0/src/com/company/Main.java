package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int idadeJovem, idadeIdosa; // eh uma constante
        idadeJovem = 17;
        idadeIdosa = 60;
        Scanner in = new Scanner(System.in);
        // mais 17 e menos 60
        System.out.printf("idade:");
        int idade = in.nextInt();

        if(idade <= idadeJovem){
            System.out.println("a idade da pessoa eh jovem");
        }else {
            if(idade >= idadeIdosa){
                System.out.println("a idade da pessoa eh idosa");
            }else {
                if(idade > idadeJovem){
                    if(idade < idadeIdosa){
                        System.out.println("eh uma pessoa de meia idade");
                    }
                }
            }
        }
    }
}
