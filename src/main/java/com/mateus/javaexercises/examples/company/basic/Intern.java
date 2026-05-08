package com.mateus.javaexercises.examples.company.basic;

public class Intern extends Employee {
    public Intern(String nome, double salario){
        super(nome, salario);

    }
    @Override
    public  double calcularBonus(){
        return 200;

    }
}


