package com.mateus.javaexercises.exercises.fundamentals;

import java.util.Scanner;
public class FolderNameExtractorExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String teste = "", pasta = "C:\\Users\\Mateus\\Documentos";
        char c;
        for (int i = pasta.length() - 1; i>= 0; i-- ){
            c = pasta.charAt(i);
            if (c == '\\'){
                break;
            }
            teste = c + teste;
        }

        System.out.println(teste);
        scanner.close();
    }
}
