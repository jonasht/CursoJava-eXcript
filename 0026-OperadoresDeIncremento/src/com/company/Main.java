package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        int y = 0;

        i += 1;
        System.out.println("(i++) = " + (i++));
        System.out.println(i);
        i = 0;

        System.out.println(++i);

        System.out.println(y++);
        System.out.println(y);

        int a = 0;
        int b = 0;

        System.out.println("a = " + --a);
        
        b--;
        System.out.println("b = " + b);
        
        int c = 0;

        System.out.println("c = " + c);
        c = c + 1;
        c += 10;
        ++c;
        System.out.println("c = " + c);
    
    
    }
}
