package co.com.interfaces;

public class Radio implements VolumenGraduable{

    @Override
    public void subirVolumen() {
        System.out.println("Subiendo el volumen del radio");

    }

    @Override
    public void bajarVolumen() {
        System.out.println("bajando el volumen del radio");
    }
}
