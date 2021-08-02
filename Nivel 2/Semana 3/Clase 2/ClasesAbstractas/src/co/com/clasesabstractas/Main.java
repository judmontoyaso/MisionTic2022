package co.com.clasesabstractas;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        perro.setNombre("Tobi");
        perro.caminar();
        perro.comer();
        perro.sonido();

        Labrador perro2 = new Labrador();
        perro2.setNombre("Luna");
        perro2.color();

        Gato gato = new Gato();
        gato.setNombre("Lucky");
        gato.caminar();
        gato.comer();
        gato.sonido();


    }
}
