package com.mateus.javaexercises.exercises.oop.inheritance;

/*
Exercício 7: Implementação de classes geométricas usando herança e métodos abstratos

Resumo:
- Classe abstrata Shape: define os métodos abstratos calculateArea() e calculatePerimeter().
- Classe Rectangle: herda de Shape, possui altura e lado, implementa os métodos de área e perímetro.
- Classe Square: herda de Rectangle, lado e altura iguais, sobrescreve os métodos para deixar explícito.
- Classe Circle: herda de Shape, possui diâmetro e raio, implementa os métodos de área e perímetro.
- Classe GeometryInheritanceExercise: main para criar objetos de cada classe e imprimir área e perímetro.
*/

// ------------------ CLASSE PAI ------------------
abstract class Shape {
    // Método abstrato para cálculo da área
    public abstract float calculateArea();

    // Método abstrato para cálculo do perímetro
    public abstract float calculatePerimeter();
}

// ------------------ CLASSES FILHAS ------------------

// Subclasse Rectangle herda de Shape
class Rectangle extends Shape {
    protected float altura; // altura do retângulo
    protected float lado;   // largura/lado do retângulo

    // Construtor do Retângulo
    public Rectangle(float altura, float lado) {
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public float calculateArea() {
        return altura * lado; // área = altura * lado
    }

    @Override
    public float calculatePerimeter() {
        return 2 * (altura + lado); // perímetro = 2 * (altura + lado)
    }
}

// Subclasse Square herda de Rectangle
class Square extends Rectangle {

    // Construtor do Square: lado e altura iguais
    public Square(float lado) {
        super(lado, lado);
    }

    @Override
    public float calculateArea() {
        return lado * lado; // área = lado²
    }

    @Override
    public float calculatePerimeter() {
        return 4 * lado; // perímetro = 4 * lado
    }
}

// Subclasse Circle herda de Shape
class Circle extends Shape {
    protected float diametro; // diâmetro do círculo
    protected float raio;     // raio do círculo

    // Construtor do Círculo
    public Circle(float diametro) {
        this.diametro = diametro;
        this.raio = diametro / 2; // cálculo do raio a partir do diâmetro
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * Math.pow(raio, 2)); // área = π * r²
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * Math.PI * raio); // perímetro = 2 * π * r
    }
}

// ------------------ CLASSE MAIN ------------------
public class GeometryInheritanceExercise {
    public static void main(String[] args) {

        // Criando objetos das classes filhas com valores de exemplo
        Rectangle ret = new Rectangle(5, 10);
        Square quad = new Square(7);
        Circle circ = new Circle(4);

        // ------------------ Saída do Retângulo ------------------
        System.out.println("Retângulo:");
        System.out.println("Área: " + ret.calculateArea());
        System.out.println("Perímetro: " + ret.calculatePerimeter());
        System.out.println();

        // ------------------ Saída do Square ------------------
        System.out.println("Quadrado:");
        System.out.println("Área: " + quad.calculateArea());
        System.out.println("Perímetro: " + quad.calculatePerimeter());
        System.out.println();

        // ------------------ Saída do Círculo ------------------
        System.out.println("Círculo:");
        System.out.println("Área: " + circ.calculateArea());
        System.out.println("Perímetro: " + circ.calculatePerimeter());
    }
}


