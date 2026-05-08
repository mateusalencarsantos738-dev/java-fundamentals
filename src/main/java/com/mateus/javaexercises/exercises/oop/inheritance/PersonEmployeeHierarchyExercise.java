/*
10. Crie uma classe Person que deve possuir os atributos encapsulados: nome, idade, sexo. Crie uma 
subclasse denominada Empregado que deve possuir os atributos salario e matrícula, além de um 
método chamado inss() que deve retornar 11% do valor do salário. Crie outra subclasse de Person 
denominada Customer que deve possuir os atributos debtValue e telefone. A partir da classe 
Empregado crie a subclasse DepartmentManager que deve possuir o atributo setorGerência e a subclasse 
Salesperson que deve possuir os atributos salesDepartment, salesValue. 
Crie uma classe que instancie 2 objetos Customer, 1 gerente e 2 vendedores e imprima os valores 
de seus respectivos atributos.
 */
package com.mateus.javaexercises.exercises.oop.inheritance;

/**
 * Customer c2 = new Customer(); DepartmentManager g1 = new DepartmentManager(); Salesperson v1 = new
 * Salesperson(); Salesperson v2 = new Salesperson();
 *
 * @author Mateus
 */
public class PersonEmployeeHierarchyExercise {

    public static void main(String[] args) {
        Customer c1 = new Customer("mateus", 18, "masculino", 4000, "dwfwefvcdw");
        System.out.println(c1.formatInfo());
        DepartmentManager g1 = new DepartmentManager("goku", 20, "masculino", 9000, "dfwfef", "adminitrativo");
        System.out.println(g1.formatInfo());
        Salesperson v1 = new Salesperson("regis", 18, "masculino", 209999, "csdevfsv", "carros de luxo ", 9999999);
        System.out.println(v1.formatInfo());
    }

}

abstract class Person {

    private String pessoa;
    private int idade;
    private String sexo;

    public Person(String pessoa, int idade, String sexo) {
        this.pessoa = pessoa;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String formatInfo() {
        return this.pessoa + this.idade + this.sexo;
    }
}

class Employee extends Person {

    private double salario;
    private String matricula;

    public Employee(String pessoa, int idade, String sexo, double salario, String matricula) {
        super(pessoa, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public double inss() {
        return getSalario() / 100 * 11;
    }

    public String formatInfo() {
        return super.formatInfo() + salario + matricula;
    }

}

class Customer extends Person {

    private double debtValue;
    private String telefone;

    public Customer(String pessoa, int idade, String sexo, double debtValue, String telefone) {
        super(pessoa, idade, sexo);
        this.debtValue = debtValue;
        this.telefone = telefone;

    }

    public String formatInfo() {
        return super.formatInfo() + debtValue + telefone;
    }

}

class DepartmentManager extends Employee {

    private String managementDepartment;

    public DepartmentManager(String pessoa, int idade, String sexo, double salario, String matricula, String managementDepartment) {
        super(pessoa, idade, sexo, salario, matricula);
        this.managementDepartment = managementDepartment;
    }

    public String formatInfo() {
        return super.formatInfo() + managementDepartment;
    }
}

class Salesperson extends Employee {

    private String salesDepartment;
    private double salesValue;

    public Salesperson(String pessoa, int idade, String sexo, double salario, String matricula, String salesDepartment, double salesValue) {
        super(pessoa, idade, sexo, salario, matricula);
        this.salesDepartment = salesDepartment;
        this.salesValue = salesValue;
    }

    public String formatInfo() {
        return super.formatInfo() + salesDepartment + salesValue;
    }
}


