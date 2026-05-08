package com.mateus.javaexercises.exercises.fundamentals;

import java.util.Scanner;
public class BinaryToDecimalExercise {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int binario, resultado = 0, teste = 0;
        while (true) {
            System.out.print("Digite apenas valor binario de  1 oou 0 e descubra seu valor decimal:");
            binario = scanner.nextInt();

            for (int i = 0 ; i < 11; i++ ) {
                teste += binario % 10;
                binario /=  10;
                if (teste == 1) {
                    teste = 2;
                    resultado += Math.pow(teste , i);
                }else if (teste ==0){
                    continue;
                }else if(binario < 0){ break;
                }

                teste = 0;
            }
            System.out.println(resultado);
            resultado = 0;

        }

    }

}

