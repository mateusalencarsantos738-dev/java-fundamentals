package com.mateus.javaexercises.exercises.fundamentals;

import java.util.Scanner;
public class PalindromeExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String teste = scanner.next();
        char [] palimetro = teste.toCharArray();
        boolean verdade = true;

        int inicio = 0, fim = palimetro.length - 1;

        while (inicio < fim){
            if(palimetro[inicio] != palimetro[fim]){
                verdade = false;
            }
            inicio++;
            fim--;
        }
        if (verdade){
            System.out.println("È palimetro.");
        }else {
            System.out.println("Não e palimetro.");
        }





    scanner.close();
    }
}


