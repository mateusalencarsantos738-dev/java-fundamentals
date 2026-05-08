/*
11. Implemente uma classe veículo que deve possuir os seguintes atributos: marca, quantidade de 
rodas, numero de marchas, modelo, velocidade, possuiMotor. A classe veículo também deve 
possuir os seguintes métodos: acelerar() que deve somar o valor passado a velocidade atual do 
veículos, subtrair() que deve subtrair o valor passado da velocidade atual e 
printInformation() que deve imprimir os valores dos atributos. A velocidade não pode ser 
menor que zero. 
Implemente uma subclasse Bicicleta que deve possuir os atributo amanho e o método 
imprimiInformações(). 
Implemente outra subclasse de Veículo denominada Automóvel que deve possuir o atributo 
potência do motor, numero de passageiros e o método imprimiInformações(). 
A partir da classe Veículo implemente a subclasse Carro que possui os atributos quantidade de 
portas e classificação(SUV, Sedan, Hatch). Implemente também a subclasse Caminhão que deve 
possuir os atributos quantidade de eixos e cargaMaxima. Crie também os métodos 
imprimiInformações.
 */
package com.mateus.javaexercises.exercises.oop.vehicles;

/**
 *
 * @author Mateus
 */
public class VehicleHierarchyExercise {

    public static void main(String[] args) {

        // ===========================
        // TESTE VEICULO BASE
        // ===========================
        Vehicle v = new Vehicle("Honda", 2, 5, "CG", "Sim");

        System.out.println("=== TESTE VEICULOS ===");
        System.out.println("Velocidade inicial: " + v.getVelocidade());
        v.acelerar(20);
        System.out.println("Após acelerar 20: " + v.getVelocidade());
        v.diminuir(10); // agora funciona corretamente
        System.out.println("Após diminuir 10: " + v.getVelocidade());
        System.out.println("Info: " + v.printInformation());

        System.out.println("\n===========================\n");

        // ===========================
        // TESTE BICICLETA
        // ===========================
        Bicycle bike = new Bicycle(
                "Caloi", 2, 18, "Explorer", "Não", "Guindão esportivo"
        );

        System.out.println("=== TESTE BICICLETA ===");
        bike.acelerar(5);
        bike.acelerar(3);
        System.out.println("Velocidade: " + bike.getVelocidade());
        bike.diminuir(4); // diminuir agora usa valor positivo
        System.out.println("Velocidade depois de diminuir: " + bike.getVelocidade());
        System.out.println("Info: " + bike.printInformation());

        System.out.println("\n===========================\n");

        // ===========================
        // TESTE AUTOMÓVEL
        // ===========================
        Automobile auto = new Automobile(
                "Fiat", 4, 6, "Argo", "Sim", "1.3", 5
        );

        System.out.println("=== TESTE AUTOMOVEL ===");
        auto.acelerar(30);
        auto.diminuir(15);
        System.out.println("Velocidade: " + auto.getVelocidade());
        System.out.println("Info: " + auto.printInformation());

        System.out.println("\n===========================\n");

        // ===========================
        // TESTE CARRO
        // ===========================
        Car carro = new Car(
                "Toyota", 4, 6, "Corolla", "Sim", "4 portas", "Sedan"
        );

        System.out.println("=== TESTE CARRO ===");
        carro.acelerar(50);
        carro.diminuir(20);
        System.out.println("Velocidade: " + carro.getVelocidade());
        System.out.println("Info: " + carro.printInformation());

        System.out.println("\n===========================\n");

        // ===========================
        // TESTE CAMINHÃO
        // ===========================
        Truck cam = new Truck(
                "Volvo", 6, 12, "FH", "Sim", 3, 30000
        );

        System.out.println("=== TESTE CAMINHÃO ===");
        cam.acelerar(40);
        cam.diminuir(15);
        System.out.println("Velocidade: " + cam.getVelocidade());
        System.out.println("Info: " + cam.printInformation());
    }

}

class Vehicle {

    private String marca;
    private int rodas;
    private int gearCount;
    private String modelo;
    private double velocidade = 0;
    private String possuiMotor;

    public Vehicle(String marca, int rodas, int gearCount, String modelo, String possuiMotor) {
        this.marca = marca;
        this.rodas = rodas;
        this.gearCount = gearCount;
        this.modelo = modelo;
        this.possuiMotor = possuiMotor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade += velocidade;
    }

    public void acelerar(double x) {
        setVelocidade(x);

    }

    public void diminuir(int x) {
        double currentSpeed = getVelocidade();
        if (currentSpeed == 0) {
            System.out.println("A velocidade ja esta 0kmh");
        } else {
            x = x * -1;
            setVelocidade(x);

        }

    }

    public String printInformation() {
        return "Marca" + marca + rodas + gearCount + possuiMotor;
    }
}

/*acelerar() que deve somar o valor passado a velocidade atual do 
veículos, subtrair() que deve subtrair o valor passado da velocidade atual e 
printInformation() que deve imprimir os valores dos atributos. A velocidade não pode ser 
menor que zero. */
class Bicycle extends Vehicle {

    String handlebarType;

    public Bicycle(String marca, int rodas, int gearCount, String modelo, String possuiMotor, String handlebarType) {
        super(marca, rodas, gearCount, modelo, possuiMotor);
        this.handlebarType = handlebarType;

    }

    public String printInformation() {
        return super.printInformation() + handlebarType;
    }

}

class Automobile extends Vehicle {

    private String enginePower;
    private int passengerCount;

    public Automobile(String marca, int rodas, int gearCount, String modelo, String possuiMotor, String enginePower, int passengerCount) {
        super(marca, rodas, gearCount, modelo, possuiMotor);
        this.enginePower = possuiMotor;
        this.passengerCount = passengerCount;
    }

    public String printInformation() {
        return super.printInformation() + enginePower + passengerCount;
    }
}

class Car extends Vehicle {

    private String doorQuantity;
    private String classificacao;

    public Car(String marca, int rodas, int gearCount, String modelo, String possuiMotor, String doorQuantity, String classificacao) {
        super(marca, rodas, gearCount, modelo, possuiMotor);
        this.doorQuantity = doorQuantity;
        this.classificacao = classificacao;
    }

    public String printInformation() {
        return super.printInformation() + doorQuantity + classificacao;
    }
}

class Truck extends Vehicle {

    private int axleCount;
    private double cargaMaxima;

    public Truck(String marca, int rodas, int gearCount, String modelo, String possuiMotor, int axleCount, double cargaMaxima) {
        super(marca, rodas, gearCount, modelo, possuiMotor);
        this.axleCount = axleCount;
        this.cargaMaxima = cargaMaxima;
    }

    public String printInformation() {
        return super.printInformation() + axleCount + cargaMaxima;
    }
}



