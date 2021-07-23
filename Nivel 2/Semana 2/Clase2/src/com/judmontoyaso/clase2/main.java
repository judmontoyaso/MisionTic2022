package com.judmontoyaso.clase2;

public class main {
    public static void main(String[] args) {
        Autos auto1 = new Autos(10, "azul,",10,"mercedez", 30,"autobus");
        Autos auto2 = new Autos(5,"rojo",7,"mazda",50,"automovil");
        System.out.println(auto1 + auto1.acelerar());
        System.out.println(auto2.acelerar());

        Autos [] vehiculos= {auto1,auto2};
        for (Autos vehiculo : vehiculos) {
            System.out.println(vehiculo);

        }
    }


}
