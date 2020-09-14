package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("precedencia de operadores");


        /*
        * resto de uma divisão
        *
        *
        * */

        int a, b, c;
        a = 15;
        b = 10;
        c = 5;

        int y = 0;

        y = a + b;
        System.out.println("y = " + y);

        y = a - b;
        System.out.println("y = " + y);

        y = a * b;
        System.out.println("y = " + y);

        y = a / b;
        System.out.println("y = " + y);

        y = a % b;
        System.out.println("y = " + y);

        System.out.println(a * (b -c));
        System.out.println(a * b + (b - c));

        System.out.println(a + (b / a) - b);
        System.out.println((a + b) / a - b);
        System.out.println(a + b / a - b);


    }
}
