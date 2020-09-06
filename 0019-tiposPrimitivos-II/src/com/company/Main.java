package com.company;

public class Main {

    public static void main(String[] args) {

        //padra boolean sempre serah false
        //ocupa 1 byte ou 8 bits
        boolean b = true;

        //por padrao, char eh igual a ''
        //ocupa 2 byte, 16 bits
        char c = 'a';
        char c2 = '2';

        //por padrao eh 0
        // byte ocupa 1 byte de memoria
        byte Byte = 100;
        byte Byte1 = -128;

        // por padrao eh 0;
        // - 32768 + 32768
        short pequeno = 2000;

        int i = 1;

        long longo;

        // o float quando colocar a 4.4 por exemplo
        // deve ser folocar a letra "f" -> 4.4f
        float flutuante = 4.4f;

        double duplo = 2.2;



        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("c2 = " + c2);
        System.out.println("Byte = " + Byte);
        System.out.println("Byte1 = " + Byte1);
        System.out.println("pequeno = " + pequeno);
        System.out.println("i = " + i);
    }
}
