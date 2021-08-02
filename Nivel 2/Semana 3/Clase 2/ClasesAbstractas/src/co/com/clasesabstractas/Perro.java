package co.com.clasesabstractas;

public class Perro extends Animal{


    @Override
    public void sonido() {
        System.out.println(this.getNombre() + " dice: GUAU ");

    }
}
