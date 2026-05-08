package com.mateus.javaexercises.examples.oop;

import java.util.Scanner;

// Classe Pessoa sem "public"
class ConstructorPerson {
    String nome;
    int idade;

    // Construtor 1: String e int
    public ConstructorPerson(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor 2: int e String (invertido)
    public ConstructorPerson(int idade, String nome) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para mostrar os dados
    public void mostrarDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

// Classe principal
public class PersonConstructorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando a primeira pessoa (String e int)

        String nome1 = "mateus";

        int idade1 = 19;

        ConstructorPerson p1 = new ConstructorPerson(idade1, nome1);



        // Mostrar os dados
        System.out.println("\nDados das pessoas:");
        p1.mostrarDados();

        scanner.close();
    }
}

