package com.mateus.javaexercises.exercises.fundamentals;


import java.util.ArrayList;

class StatisticsCalculator {
    int [] vetor;

    void media(){
        float media = 0;
        for (int i = 0; i < vetor.length;i++ ){
            media += vetor[i];
        }
        media = media / vetor.length;
        System.out.printf("A media é %.2f \n", media);
    }

    void moda(int[] lista){
        int  repetidos = 0, contagem = 0;
        ArrayList<Integer> lista_repetidos = new ArrayList<>();

        for (int i = 0; i < lista.length; i++){
            repetidos = 0;
            for (int n : lista){
                if (n == lista[i]){
                    repetidos +=1;
                }
            }
            if (repetidos > contagem){
                contagem = repetidos;
                lista_repetidos.clear();
                lista_repetidos.add(lista[i]) ;
            }else if (repetidos == contagem && !lista_repetidos.contains(lista[i])){
                lista_repetidos.add(lista[i]) ;
            }
        }
        System.out.println("A moda: " + lista_repetidos);
    }

    void mediana(int [] lista){
        float mediana ;
        if ( lista.length % 2 == 1){
            mediana = lista[lista.length / 2];
            System.out.println("mediana: " + mediana);
        }else {
            mediana = (float) (lista[lista.length / 2] + lista[(lista.length / 2)  - 1]) / 2 ;
            System.out.printf("mediana: %.2f" , mediana);
        }
    }
}
 // --------------------------------------------------------------------------------------------------------------------------------------------------------
public class BasicStatisticsExercise {
    public static void main (String[] args){
        int [] lista = {1, 2, 2 , 3, 3, 3};
        StatisticsCalculator estatistica = new StatisticsCalculator();
        estatistica.vetor = lista;
        estatistica.media();
        estatistica.moda(lista);
        estatistica.mediana(lista);
    }
}

