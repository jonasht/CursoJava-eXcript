package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("problema dos loopings");

        int x = 0;

        while (x <= 10){
            x = x - 1;
            System.out.println(x);
            if(x == -1000){
                break;
            }
        }
    }
}
