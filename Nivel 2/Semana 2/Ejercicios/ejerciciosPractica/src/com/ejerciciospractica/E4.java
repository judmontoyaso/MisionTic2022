package com.ejerciciospractica;

public class E4 {
    public static void main(String[] args) {
        int [] a  = {7,2,4,8,3,9,1,5,10,6};
        int temporal;

        for (int i = 0; i < (a.length/2); i++) {
            for (int j = 1; j < ((a.length/2) - i); j++) {
                if (a[j - 1] > a[j]) {
                    temporal = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temporal;
                }

            }

        }
        for (int i = a.length/2; i < (a.length); i++) {
            for (int j = a.length/2 + 1; j < (a.length/2 + (a.length - i)); j++) {
                if (a[j - 1] < a[j]) {
                    temporal = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temporal;
                }

            }

        }


        for (int j : a) {
            System.out.println(j);

        }
    }
}
