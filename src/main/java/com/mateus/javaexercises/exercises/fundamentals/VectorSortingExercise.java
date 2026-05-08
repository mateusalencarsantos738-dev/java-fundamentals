package com.mateus.javaexercises.exercises.fundamentals;
import java.util.Arrays;
import java.util.Scanner;



public class VectorSortingExercise {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] teste = new int[10], vetor = new int[10];
        for (int i = 0; i < teste.length; i++){
            System.out.print("Digite um item para sua lista:");
            teste[i] = scanner.nextInt();

        }
        Arrays.sort(teste);
        for (int i = 0; i < teste.length; i++){
            System.out.printf("%d", teste[i]);
            if (i < teste.length - 1){
                System.out.print(", ");
            }else {
                System.out.println(".");
            }
        }

        int ajuda;
        for (int i = 0; i < vetor.length - 1; i++) {
            System.out.print("Digite um item para sua lista:");
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor.length - 1 ; i++){
            for (int j = 0; j < vetor.length - 1 - i ; j++){
                if (vetor[j] > vetor[j + 1] ){
                    ajuda = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j+ 1] = ajuda;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%d", vetor[i]);
            if (i < vetor.length - 1){
                System.out.print(", ");
            }else {
                System.out.println(".");
            }
        }

    scanner.close();
    }
}


