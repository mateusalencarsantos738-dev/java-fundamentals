package com.mateus.javaexercises.exercises.fundamentals;


import  java.util.Scanner;
public class PerfectNumberExercise {
    public  static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int variavel, teste = 0, soma = 1;
        System.out.print("digite um valor:");
        variavel = scanner.nextInt();
        boolean verdade = true;
        for (int i = 2; i <= variavel / 2; i++ ){
            if (variavel % i == 0){
            System.out.println(i);
             teste = variavel/ i;
             soma += teste;
             }
        }
        if (soma != variavel){
            verdade = false;
        }
    if (verdade){
        System.out.println("é perfeito.");
    }else{
        System.out.println("não é perfeito");
    }
    }
}

