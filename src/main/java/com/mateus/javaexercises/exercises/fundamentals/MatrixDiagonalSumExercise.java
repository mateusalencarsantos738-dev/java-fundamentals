package com.mateus.javaexercises.exercises.fundamentals;

import java.util.Scanner;
public class MatrixDiagonalSumExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int teste;

        int [][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length ; i++){
            for (int j = 0; j < matriz.length ; j++){
                System.out.print("Coloque um numero:");
                teste = scanner.nextInt();
                matriz[i][j] = teste;
            }
        }
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ", matriz[i][j]);

            }
            System.out.println();
        }
        int soma = 0, soma_2 = 0, ajuda = matriz.length - 1;
        for (int i = 0; i < matriz.length ; i++){
            soma += matriz[i][i];
            soma_2 += matriz[i][ajuda - i  ];
        }
        System.out.println("soma da diagonal primaria: " + soma + ", soma da diagonal secundaria: " + soma_2);









    }
}


