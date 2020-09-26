package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("break");

        labelForI: for (int i = 0; i < 10; i++) {

            if (i == 5){
                break;
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i);
                System.out.println("j = " + j);

                if (j == 5 && i == 3){
                    break labelForI;
                }

                int contar = 0;

                while (contar < 10) {
                    contar++;

                    labelWhile: if(contar == 5){
                        break labelForI;
                    }
                }
            }

        }

    }
}
