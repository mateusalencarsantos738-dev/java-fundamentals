package com.mateus.javaexercises.examples.oop;

class BasicPerson {
    String nome;
    int idade;

    // Construtor 1: String e int
    public BasicPerson(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor 2: int e String (invertido)
    public BasicPerson(int idade, String nome) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para mostrar os dados
    public void mostrarDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
//----------------------------------------------------------------------------------------------------------------------


class SimpleBankAccount{
    String nome;
    float saldo;

    public SimpleBankAccount(String nome){
        this.nome = nome;
    }

    public SimpleBankAccount(String nome, float saldo ){
    this.nome = nome;
    this.saldo = saldo;
    }

    public void depositar(float dinheiro){
        saldo += dinheiro;
    }
    public void sacar(float saque){
        if (saque > saldo){
            System.out.println("Saldo insuficiente");
        }else {saldo -= saque;
        }
    }
}

