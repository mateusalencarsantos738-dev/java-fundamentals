package com.mateus.javaexercises.examples.polymorphism;


class AnimalSound {
    public void emitirSom(){
        System.out.println("O animal emite um som");
    }
}
class Horse extends AnimalSound{
    @Override
    public void emitirSom(){
        System.out.println("O Horse rincha!");
    }
}

public class AnimalPolymorphismDemo{
    public static void main(String[] args){
        AnimalSound a = new AnimalSound();
        AnimalSound b = new Horse();
        AnimalSound animal = new  Horse(); // cria da class pai mais usa as estancia ou metodos.

        a.emitirSom();
        b.emitirSom();
        animal.emitirSom();
    }
}

