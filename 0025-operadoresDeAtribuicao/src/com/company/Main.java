package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.printf("\noperadores de atribuição\n");

        int i = 0;
        i = i + 1;
        int i2 = i;
        System.out.println("i = " + i);

        i += 1;
        System.out.println("i = " + i);

        i2 = i * 12;
        i += i2;

        System.out.println("i2 = " + i2);
        System.out.println("i = " + i);

        System.out.println( " i += i " + (i += i));
        System.out.println( "i -= i " + (i -= i));

        System.out.println("i = " + i);
        i += i2;
        System.out.println("i = " + i);
        System.out.println("i *= i " + (i *= i));

        System.out.println("i /= i2 " + (i /= i2));
        System.out.println("i %= i2 " + (i %= i2));


    }
}
