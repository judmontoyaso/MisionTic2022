/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.holamundo;
import java.util.Scanner;

/**
 *
 * @author judmo
 */
public class HolaMundo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola Mundo");
        int num1 = 0, num2 = 0, num3 = 0;
        System.out.println("Por favor Ingrese un numero: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        int total = num1 + num2 + num3;
        if (num1>num2) {
            System.out.println("Es mayor");
        }
        else {
            System.out.println("Es menor");
        }
        System.out.println("El resultado de " + num1 + " + " + num2 + " es " + total);

    }
}
