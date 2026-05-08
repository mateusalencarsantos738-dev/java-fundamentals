package com.mateus.javaexercises.exercises.fundamentals;
import  java.util.Scanner;
public class TriangleTypeExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int a,b,c;
    System.out.print("digite um número: ");
    a = scanner.nextInt();
    System.out.print("digite um número: ");
    b = scanner.nextInt();
    System.out.print("digite um número: ");
    c = scanner.nextInt();

    if (a + b > c && a + c > b && b + c > a){
        if (a == b && b ==c){ System.out.println("Equilatero");
        }else if(a == b || a == c || b == c) { System.out.println("isósceles");
        }else{ System.out.println("Escaleno");}
        scanner.close();

    };

}
}

