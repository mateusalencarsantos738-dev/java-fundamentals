package com.mateus.javaexercises.examples.company.basic;

public class CompanyBonusDemo {
    public static void main(String[] args) {
        Employee f = new Employee("João", 3000);
        Manager g = new Manager("Maria", 8000);
        Intern e = new Intern("Pedro", 1200);

        System.out.println(f.nome + " bônus: " +
                f.calcularBonus());
        System.out.println(g.nome + " bônus: " +
                g.calcularBonus());
        System.out.println(e.nome + " bônus: " +
                e.calcularBonus());
}

}

