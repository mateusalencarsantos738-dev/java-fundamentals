package com.mateus.javaexercises.exercises.oop;
/**2. Crie uma classe chamada Livro, que represente os dados de um livro básico.
A classe deve conter:
        • Um atributo privado titulo (String).
        • Um atributo privado autor (String).
        • Um atributo privado anoPublicacao (int).
        • Métodos get para todos os atributos.
        • Métodos set para titulo e autor.
        • O anoPublicacao não pode ser alterado após a criação do objeto (usar construtor).
O programa deverá:
        1. Criar três objetos Livro.
        2. Definir título e autor usando setters.*/

 public class Book{
    private String titulo;
    private String autor;
    private int anoPublicado;

    public Book(int anoPublicado){
        this.anoPublicado = anoPublicado;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor= autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoPublicado(){
        return anoPublicado;
    }
}

