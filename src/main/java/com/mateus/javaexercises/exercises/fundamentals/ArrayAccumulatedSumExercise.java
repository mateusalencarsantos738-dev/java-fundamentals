package com.mateus.javaexercises.exercises.fundamentals;

public class ArrayAccumulatedSumExercise {
    public static void main(String[] args) {
        int [] teste = {10, 20 , 30 ,50};
        int total = 0;
        for (int n : teste) {
        total += n;
        System.out.println("total=" +total);
        }


    }
}


