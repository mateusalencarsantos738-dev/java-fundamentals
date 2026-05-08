package com.mateus.javaexercises.exercises.oop;


public class BankAccountDemo {
    public static void main(String[] args){
    BankAccount mateus = new BankAccount();
    mateus.definirTitular("Mateus");
    System.out.printf("Titular: %s \n " , mateus.getNomeTitular());
    mateus.depositarComEntrada();
    System.out.printf("Saldo %.2f \n", mateus.getSaldo());
    mateus.sacarComEntrada();
    System.out.printf("Saldo %.2f \n", mateus.getSaldo());



    }
}


