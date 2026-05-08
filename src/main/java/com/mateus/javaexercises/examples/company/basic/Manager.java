package com.mateus.javaexercises.examples.company.basic;

public class Manager extends Employee {
    public Manager(String nome,  double salario){
        super(nome, salario);
    }
    @Override
    public double calcularBonus(){
        return salario * 0.20; //20%
    }
}


