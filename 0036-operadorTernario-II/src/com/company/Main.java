package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("operador ternario II");

        System.out.print(("=-".repeat(10) + "=\n"));


        System.out.println("qual seu dia da semana favorito");
        System.out.print("digite 1 para domingo 2 segunda... 7 para sabado: ");
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        System.out.println();

        String dia = (numero == 1) ? "domingo":
                (numero == 2) ? "segunda":
                        (numero == 3) ? "terca":
                                (numero == 4) ? "quarta":
                                        (numero == 5) ? "quinta":
                                                (numero == 6) ? "sexta":
                                                        (numero == 7) ? "sabado":
                                                                "dia invalido";

        System.out.println(("=-".repeat(20) + "="));
        System.out.println("o dia escolhido foi: " + dia + " (usando a Condicao(?:))");
        System.out.println(("=-".repeat(20) + "="));
        System.out.println(numero);
        int numero1 = numero;
        switch (numero1){
            case 1 : dia = "domingo";
            break;
            case 2 : dia = "segunda";
                break;
            case 3 : dia = "terca";
                break;
            case 4 : dia = "quarta";
                break;
            case 5 : dia = "quinta";
                break;
            case 6 : dia = "sexta";
                break;
            case 7 : dia = "sabado";
                break;
            default: dia = "dia invalido";
        }
        System.out.println("=-".repeat(20) + "=");
        System.out.println("o dia escolhido foi: " + dia + " (usando o SwitchCase)" );
        System.out.println(("=-".repeat(20) + "="));
    }

}
