package com.mateus.javaexercises.exercises.fundamentals;

import java.util.Scanner;
public class SimpleCalculatorExercise { public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    float a,b, resultado = 0;
    String tipo;
    System.out.print("Digite um valor:");
    a = scanner.nextFloat();
    System.out.print("Digite o segundo valor:");
    b = scanner.nextFloat();
    System.out.print("Digite o tipo da opereção +, -, / , x ou **:");
    tipo = scanner.next();

    switch (tipo) {
        case "+":
            resultado = a + b;
            break;
        case "-":
            resultado = a - b;
            break;
        case "x":
            resultado = a * b;
            break;
        case "/":
            resultado = a / b;
            break;
        case "**":
            resultado = (float) Math.pow(a, b);
            break;

        default:
            break;
    }
    System.out.println(resultado);

    scanner.close();
}
}

