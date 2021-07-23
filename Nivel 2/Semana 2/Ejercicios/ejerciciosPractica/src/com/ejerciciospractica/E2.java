package com.ejerciciospractica;

public class E2 {
    public static void main(String[] args) {

        int [] a  = {7,2,4,8,3,9,1,5,10,6};
        int s;
        s = 0;
        for (int j : a) {
            if (j % 2 == 0 & j > 0) {
                s = s + j;
            }
        }

        System.out.println(s);
    }
}
