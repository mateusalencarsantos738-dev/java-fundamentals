package com.mateus.javaexercises.exercises.fundamentals;

import  java.util.Arrays;
import java.util.Scanner;

public class DigitComparisonExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int vetor_a, vetor_b;
        System.out.print("Digite um número:");
        vetor_a = scanner.nextInt();
        System.out.print("Digite um número:");
        vetor_b = scanner.nextInt();
        String tamanho_a = ""+ vetor_a, tamanho_b = "" + vetor_b;
        int [] a = new int[tamanho_a.length()];
        int [] b = new int[tamanho_b.length()];
        for (int i = 0; i < a.length; i++ ){
            a [i] = vetor_a %10;
            b [i] = vetor_b %10;
            vetor_a /= 10;
            vetor_b /= 10;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a,b)){
            System.out.print("Iguais");
        }else {
            System.out.println("diferentes");
        }
    }
}

