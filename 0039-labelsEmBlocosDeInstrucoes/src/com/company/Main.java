package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        label1:{
            System.out.println("label 1 ini");
            label2:{
                System.out.println("label 2 ini");
                label3:{
                    System.out.println("label 3 ini");
                    if (true)
                        break label2;
                }
                System.out.println("label 2 fim ");
            }
            System.out.println("label 1 fim ");
        }
    }
}
