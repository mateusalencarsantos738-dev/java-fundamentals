package com.mateus.javaexercises.examples.inheritance;

// Classe base
class Animal {
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("O animal está fazendo um som...");
    }
}


// Classe filha Cachorro
class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome); // chama o construtor da classe Animal
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo: Au Au!");
    }
}


// Classe filha Gato
class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato está miando: Miau!");
    }
}


// Classe para testar
public class AnimalInheritanceDemo {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro("Rex");

        System.out.println("Nome: " + dog.nome);

        dog.emitirSom();   // Método herdado e sobrescrito
        dog.abanarRabo();  // Método da classe Cachorro

        System.out.println();

        Gato cat = new Gato("Mimi");
        System.out.println("Nome: " + cat.nome);
        cat.emitirSom();   // Método sobrescrito
    }
}


class CatInheritanceDemo{
        public static void main(String[ ] args){
            Gato g = new Gato ("Mingau");
            System.out.println(g.nome);


    }

}
