package com.judmontoyaso.clase2;

public class Autos {
    public int pasajeros;
    String color;
    int capacidadTanque;
    String marca;
    int kpg;
    String tipo;
    int recorrido;


    public Autos(int pasajeros, String color, int capacidadTanque, String marca, int kpg, String tipo) {

        this.capacidadTanque = capacidadTanque;
        this.marca = marca;
        this.kpg = kpg;
        this.tipo = tipo;
        this.color = color;
        this.pasajeros = pasajeros;
        this.recorrido = capacidadTanque * kpg;

    }

    public String acelerar() {
        return "esta acelerando";
    }
    public String frenar() {
        return "esta frenando";
    }
    public String derecha() {
        return "esta girando a la derecha";
    }

    @Override
    public String toString() {
        return "Autos{" +
                "pasajeros=" + pasajeros +
                ", color='" + color + '\'' +
                ", capacidadTanque=" + capacidadTanque +
                ", marca='" + marca + '\'' +
                ", kpg=" + kpg +
                ", tipo='" + tipo + '\'' +
                ", recorrido=" + recorrido + acelerar() +
                '}';
    }

}
