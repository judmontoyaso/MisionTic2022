package com.ejerciciospractica;

public class E5 {
    public static void main(String[] args) {
        int[] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};

        int[] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
        int[] s = new int[v1.length];

        for (int i = 0; i < v1.length; ++i) {
            s[i] = v1[i] + v2[i];


        }

        for (int j : s) {

            System.out.println(j);

        }
    }
}