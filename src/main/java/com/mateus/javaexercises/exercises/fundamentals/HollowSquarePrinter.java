package com.mateus.javaexercises.exercises.fundamentals;

import  java.util.Scanner;
public class HollowSquarePrinter { public static void main (String[] args ) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.print("Digite o numero do quadrado:");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++){
                if ( i == 0 || i == a - 1 || j == 0 || j == a - 1){
                    System.out.print("*");
                } else {System.out.print(" ");}
            }
            System.out.println();

        }
    }
}
}

