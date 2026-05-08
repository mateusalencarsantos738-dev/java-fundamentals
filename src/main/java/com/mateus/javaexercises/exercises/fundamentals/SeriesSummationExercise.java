package com.mateus.javaexercises.exercises.fundamentals;



public class SeriesSummationExercise {
    public static void main(String[] args){
        double s1 = 0, s2 = 0, s3 = 1;
        for (int i = 1, j = 1; i < 100; i+= 2, j+=1){
            s1 += (double) i / j;


    }
        System.out.println("soma:" + s1);

        for (int i = 1, j = 50; i <= 50; i++,  j-=1){
            s2 += (double) Math.pow(2, i)/j;
    }
        System.out.println("soma:" + s2);

        for (int i = 2; i <= 10; i++){
            if(i % 2 == 1){
            s3 += (double) i / Math.pow(i, 2);
            }else{s3 -=(double) i / Math.pow(i, 2); }
        }
        System.out.println("soma:" + s3);
    }
}

