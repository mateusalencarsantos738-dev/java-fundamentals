package com.mateus.javaexercises.examples.oop;

import java.util.Scanner;



// Classe principal
public class BasicPersonDemo {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Criando a primeira pessoa (String e int)

    String nome1 = "mateus";

    int idade1 = 19;

    BasicPerson p1 = new BasicPerson(idade1, nome1);



    // Mostrar os dados
    System.out.println("\nDados das pessoas:");
    p1.mostrarDados();

    scanner.close();
}
}

