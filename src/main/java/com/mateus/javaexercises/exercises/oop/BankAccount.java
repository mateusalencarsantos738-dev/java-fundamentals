package com.mateus.javaexercises.exercises.oop;

import java.util.Scanner;
/**1. Crie uma classe chamada BankAccount, que represente uma conta simples de banco.
 A classe deve possuir:
 • Um atributo privado para o titular da conta (String).
 • Um atributo privado para o saldo (double).
 • Um método público para definir o titular (set).
 • Um método público para obter o titular (get).
 • Um método público para obter o saldo (get).
 • Um método público depositar(double valor) que aumenta o saldo.
 • Um método público sacar(double valor) que diminui o saldo somente se houver
 saldo suficiente.*/

class BankAccount{
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private double saldo = 0;

    public void definirTitular(String nome){
        this.nome =  nome;
    }
    public  String getNomeTitular (){
        return nome;
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositarComEntrada(){
        System.out.print("Valor do deposito: ");
        saldo += scanner.nextDouble();
    }
    public void sacarComEntrada(){
        while (true){
            System.out.print("Valor de saque: ");
            double valorSaque = scanner.nextDouble();
            if (saldo < valorSaque ){
                System.out.println("Saldo insuficiente.");
            }else {
                saldo -= valorSaque;
                break;
            }
        }
    }
}

