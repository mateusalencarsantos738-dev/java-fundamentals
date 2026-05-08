package com.mateus.javaexercises.exercises.oop.addressbook;

import java.util.Scanner;

//---------------------------------Classe principal------------------------------------------
// Classe usada para testar a AddressBookEntry
// Contém o método main, que é o ponto de entrada do programa
public class AddressBookExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para entrada de dados (não usado neste exemplo)

        // Cria duas pessoas na agenda com dados iguais
        AddressBookEntry mateus = new AddressBookEntry("Mateus", "00000000", "25/03/2006", "Sao paulo");
        AddressBookEntry mateuss = new AddressBookEntry("Mateus", "00000000", "25/03/2006", "Sao paulo");

        // Obtém a quantidade de pessoas cadastradas (variável estática da classe)
        int quantidade = AddressBookEntry.getPersonCount();

        // Exibe a quantidade de pessoas cadastradas
        System.out.println("Quantidades de pessoas cadastradas: " + quantidade);
    }
}

//---------------------------------Classe pai------------------------------------------
// Classe AddressBookEntry: define os atributos e métodos de uma pessoa na agenda
class AddressBookEntry {

    // Variável estática que conta a quantidade total de pessoas cadastradas
    static int personCount = 0;

    // Atributos da pessoa
    private String nome;
    private String telefone;
    private String birthDate;
    private String endereco;

    //---------------------------------Construtor------------------------------------------
    // Inicializa os dados da pessoa e incrementa a quantidade de pessoas cadastradas
    public AddressBookEntry(String nome, String telefone, String birthDate, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.birthDate = birthDate;
        this.endereco = endereco;
        personCount++;
    }

    //---------------------------------Getters e Setters------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setData_aniver(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getData_aniver() {
        return this.birthDate;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    //---------------------------------Método estático------------------------------------------
    // Retorna a quantidade total de pessoas cadastradas
    public static int getPersonCount() {
        return personCount;
    }
}


