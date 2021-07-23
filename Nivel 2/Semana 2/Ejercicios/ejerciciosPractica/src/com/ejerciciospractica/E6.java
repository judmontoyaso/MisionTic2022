package com.ejerciciospractica;

public class E6 {

    public static void main(String[] args) {
        char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};
        StringBuilder vectorConcatenado = new StringBuilder();
        for (char c : vector) {
            vectorConcatenado.append(c);

        }

        System.out.println(vectorConcatenado);

    }
}
