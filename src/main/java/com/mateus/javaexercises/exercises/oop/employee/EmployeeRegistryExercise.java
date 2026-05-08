/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateus.javaexercises.exercises.oop.employee;

/**
 *
 * @author Mateus
 */
public class EmployeeRegistryExercise {

    public static void main(String[] args) {
        Empregado p1 = new Empregado("mateus", "alencar santos", 3400.40);
        Empregado p2 = new Empregado("Rick", "santos", 3500.40);
        System.out.println("quantidade de funcionarios: " + Empregado.getQuant_empregados());
        p1.ficha();

        p2.ficha();

    }

}

class Empregado {

    private static int quant_empregados;
    private String nome;
    private String sobrenome;
    private double salario;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        Empregado.setQuant_empregados(1);
    }

    public static int getQuant_empregados() {
        return quant_empregados;
    }

    public static void setQuant_empregados(int quant_empregados) {
        Empregado.quant_empregados += quant_empregados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void ficha() {

        System.out.printf("Nome Completo: %s %s e salario: %.2f %n", nome, sobrenome, salario);

    }

}

