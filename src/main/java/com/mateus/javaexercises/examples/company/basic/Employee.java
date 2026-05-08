package com.mateus.javaexercises.examples.company.basic;

public class Employee {
    protected String nome;
    protected double salario;

    public Employee(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.05;}


}

