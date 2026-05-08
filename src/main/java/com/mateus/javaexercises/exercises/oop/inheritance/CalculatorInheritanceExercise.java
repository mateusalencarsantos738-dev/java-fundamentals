/*
5. Crie uma classe Calculator que deve implementar as funções básicas (somar, subtrair, 
multiplicar e dividir). Utilizando o conceito de herança, crie uma classe ScientificCalculator que 
implementa os seguintes cálculos: raiz quadrada e potencia. Utilize a classe Math do pacote 
Java.Lang. 
 */
package com.mateus.javaexercises.exercises.oop.inheritance;

//---------------------------------Classe principal------------------------------------------
// Classe usada para testar a Calculator e a ScientificCalculator
// Contém o método main, que é o ponto de entrada do programa
public class CalculatorInheritanceExercise {

    public static void main(String[] args) {

        ScientificCalculator calculator = new ScientificCalculator();
        System.out.println("soma: " + calculator.somar(2, 2));
        System.out.println("subtrair: " + calculator.subtrair(2, 2));
        System.out.println("multiplicacao: " + calculator.multiplicar(2, 10));
        System.out.println("divisao: " + calculator.dividir(10, 2));
        System.out.println("raiz: " + calculator.raiz(64));
        System.out.println("potência: " + calculator.potencia(10, 2));
    }
}

//---------------------------------Class pai------------------------------------------
// Classe Calculator: define as operações básicas
class Calculator {

    // Soma dois números
    public double somar(double a, double b) {
        return a + b;
    }

    // Subtrai b de a
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Multiplica dois números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Divide a por b
    public double dividir(double a, double b) {
        return a / b;
    }
}

//------------------------------- Class filhas----------------------------------------- 
// Classe ScientificCalculator: herda Calculator e adiciona funções avançadas
class ScientificCalculator extends Calculator {

    // Calcula a raiz quadrada de um número
    public double raiz(double a) {
        return Math.sqrt(a);
    }

    // Calcula a potencia: a elevado a b
    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }
}


