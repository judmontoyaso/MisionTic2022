package com.clase3;

import java.util.ArrayList;
import java.util.Iterator;


public class arrays {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Juan");
        people.add("juan");
        people.add("Juan");
        people.add("hola");

        //Obtener tamaño de arreglo
        System.out.println(people.size());

        //Realizar iteracion entre los elementos del arreglo
        Iterator<String> iterator = people.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        //otra forma de iterar
        for (String nombre : people) {
            System.out.println(nombre);
        }

        //conocer si un valos esta en el arreglo, por true o false
        System.out.println(people.contains("Juan"));



        //agregar un elemento al arreglo
        people.add("juan");
        System.out.println("");

        //Eliminar todos los arreglos con el mismo valor.

        people.removeIf(item -> item == "juan");
        for (String nombre : people) {
            System.out.println(nombre);
        }


    }
}
