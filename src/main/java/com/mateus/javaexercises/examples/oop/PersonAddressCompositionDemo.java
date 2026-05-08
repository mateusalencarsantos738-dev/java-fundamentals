package com.mateus.javaexercises.examples.oop;

public class PersonAddressCompositionDemo {
    public static void main(String[] args) {

        Address end = new Address("Rua das Flores", 120);
        AddressedPerson p = new AddressedPerson("Mateus", end);

        p.mostrarInfo();
    }
}

class AddressedPerson {
    String nome;
    private Address endereco; // A Pessoa TEM um Address

    public AddressedPerson(String nome, Address endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco.rua + ", " + endereco.numero);
    }
}

class Address {
    String rua;
    int numero;

    public Address(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }
}

