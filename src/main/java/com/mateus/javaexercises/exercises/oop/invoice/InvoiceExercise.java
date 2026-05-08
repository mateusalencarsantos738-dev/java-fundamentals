/*
8. Crie uma classe chamada Invoice para uma determinada loja. A classe deve conter 4 variáveis: 
código, description, quantidade de itens comprados, preço por item. A classe deve possuir os 
métodos get e set para cada variável. Também deve existir um método chamado getTotalFatura, 
que retorne o valor total da invoiceTotal como um double. Se o valor de um item não for positivo, ele 
deve ser configurado como 0. Se o valor da invoiceTotal não for positivo, também deve ser configurado 
como 0. 
 */
package com.mateus.javaexercises.exercises.oop.invoice;

// ----------------------------------------------------------------------
// Classe principal: usada apenas para testar a classe Invoice
// ----------------------------------------------------------------------
public class InvoiceExercise {

    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // Cria o primeiro item e adiciona seu preço ao total da invoiceTotal
        // ------------------------------------------------------------------
        Invoice firstItem = new Invoice(78978998, 3000, "par de tenis", 1);
        System.out.println("fatura:" + Invoice.getInvoiceTotal());

        // ------------------------------------------------------------------
        // Cria o segundo item e soma seu valor à invoiceTotal acumulada
        // ------------------------------------------------------------------
        Invoice secondItem = new Invoice(78978923, 324, "mouse", 2);
        System.out.println("fatura:" + Invoice.getInvoiceTotal());

        // ------------------------------------------------------------------
        // Paga parte da invoiceTotal (subtrai do total)
        // ------------------------------------------------------------------
        Invoice.payInvoice(888);
        System.out.println("fatura:" + Invoice.getInvoiceTotal());

        // ------------------------------------------------------------------
        // Paga mais uma parte da invoiceTotal
        // ------------------------------------------------------------------
        Invoice.payInvoice(88);
        System.out.println("fatura:" + Invoice.getInvoiceTotal());
    }
}

// ----------------------------------------------------------------------
// Classe Invoice: armazena dados de um item e controla um total geral
// ----------------------------------------------------------------------
class Invoice {

    // ------------------------------------------------------------------
    // Variável estática que acumula o valor total da invoiceTotal (todas as compras)
    // ------------------------------------------------------------------
    private static double invoiceTotal;

    // ------------------------------------------------------------------
    // Atributos individuais do produto
    // ------------------------------------------------------------------
    private double codigo;
    private double preco;
    private String description;
    private int quantidade;

    // ------------------------------------------------------------------
    // Construtor: cria o item e já adiciona seu preço ao total da invoiceTotal
    // ------------------------------------------------------------------
    public Invoice(double codigo, double preco, String description, int quantidade) {
        this.codigo = codigo;
        this.preco = preco;
        this.description = description;
        this.quantidade = quantidade;

        // Soma o preço do item ao total acumulado
        addInvoiceValue(this.preco);
    }

    // ------------------------------------------------------------------
    // Getters e Setters
    // ------------------------------------------------------------------
    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    // ------------------------------------------------------------------
    // Se o preço for negativo, define como 0 (regra do exercício)
    // ------------------------------------------------------------------
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // ------------------------------------------------------------------
    // Retorna o total acumulado das compras
    // ------------------------------------------------------------------
    public static double getInvoiceTotal() {
        return invoiceTotal;
    }

    // ------------------------------------------------------------------
    // Soma valores ao total da invoiceTotal (valor acumulado)
    // ------------------------------------------------------------------
    public static void addInvoiceValue(double invoiceTotal) {
        Invoice.invoiceTotal += invoiceTotal;
    }

    // ------------------------------------------------------------------
    // Subtrai um valor do total da invoiceTotal (pagamento)
    // ------------------------------------------------------------------
    public static void payInvoice(double invoiceTotal) {
        Invoice.invoiceTotal -= invoiceTotal;
    }

}


