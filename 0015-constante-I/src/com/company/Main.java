package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("constante I\n");
        /*
        * 1 os dados nunca serão alterados
        * 2 um constante tem seu endereço protegido
        * 3 uma constatne nunca será desolacda
        * 4 declaramos uma vez, utilizamos qntas vezes precisarmos
        * */

              int var = 10; // declarar uma veriavel
        final int constante = 10;

        var = 1001;
        //constante = 10; // não pode atribuir um novo valor numa constante
        
        System.out.println("var = " + var);
        System.out.println("constante = " + constante);

    }
}
