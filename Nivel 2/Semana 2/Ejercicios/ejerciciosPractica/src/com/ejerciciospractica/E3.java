package com.ejerciciospractica;

public class E3 {
    public static void main(String[] args) {
        int [] a  = {7,2,4,8,3,9,1,5,10,6};
        double promedio;
        promedio = 0;
        for (int j : a) {
            promedio = j + promedio;
        }

        System.out.println(promedio/a.length);

    }
}
