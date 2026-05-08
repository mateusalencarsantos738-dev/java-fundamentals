package com.mateus.javaexercises.exercises.oop.inheritance;


/*
Exercício 6: Implementação de herança com animais

Resumo:
- Classe abstrata Animal: possui atributos nome e peso, e método getInfo() para retornar informações do animal.
- Classe Fish: herda de Animal, possui tipo de habitat (marinho, água doce, ornamental) e sobrescreve getInfo().
- Classe Dog: herda de Animal, possui sexo e raça, sobrescreve getInfo().
- Classe AnimalHierarchyExercise: main para criar objetos de Fish e Dog e imprimir suas informações.
*/

// ------------------ CLASSE MAIN ------------------
public class AnimalHierarchyExercise {

    public static void main(String[] args) {
        // Criando objetos das subclasses
        Fish p1 = new Fish("Tilapia", 2, "agua doce");       // peixe com nome, peso e tipo de água
        Dog c1 = new Dog("Rei", 12, "masculino", "pit-bull"); // cachorro com nome, peso, sexo e raça

        // Imprimindo informações dos objetos
        System.out.println(p1.getInfo()); // chama o método getInfo() do Fish
        System.out.println(c1.getInfo()); // chama o método getInfo() do Dog
    }
}

// ------------------ CLASSE PAI ------------------
abstract class Animal {

    private String nome;  // nome do animal
    private float peso;   // peso do animal em Kg

    // Construtor completo
    public Animal(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    // Construtor alternativo (peso padrão 0)
    public Animal(String nome) {
        this(nome, 0);
    }

    // Método para retornar informações básicas do animal
    public String getInfo() {
        return nome + ", peso: " + peso + "Kg";
    }
}

// ------------------ CLASSES FILHAS ------------------

// Subclasse Fish herda de Animal
class Fish extends Animal {

    private String tipoAgua; // tipo de habitat: marinho, água doce ou ornamental

    // Construtor simples
    public Fish(String nome) {
        super(nome, 0);
    }

    // Construtor completo
    public Fish(String nome, float peso, String tipoAgua) {
        super(nome, peso);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public String getInfo() {
        // Sobrescreve getInfo() adicionando o tipo de água
        return super.getInfo() + ", tipoAgua: " + tipoAgua;
    }
}

// Subclasse Dog herda de Animal
class Dog extends Animal {

    private String sexo; // sexo do cachorro
    private String raca; // raça do cachorro

    // Construtor simples
    public Dog(String nome) {
        super(nome, 0);
    }

    // Construtor completo
    public Dog(String nome, float peso, String sexo, String raca) {
        super(nome, peso);
        this.sexo = sexo;
        this.raca = raca;
    }

    @Override
    public String getInfo() {
        // Sobrescreve getInfo() adicionando sexo e raça
        return super.getInfo() + ", sexo: " + this.sexo + ", raca: " + raca;
    }
}


