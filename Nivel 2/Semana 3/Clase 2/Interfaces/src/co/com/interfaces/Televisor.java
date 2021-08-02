package co.com.interfaces;

public class Televisor implements VolumenGraduable{

    @Override
    public void subirVolumen() {
        System.out.println("Subierndo volumen de televisor");

    }

    @Override
    public void bajarVolumen() {

        System.out.println("Bajando volumen de televisor");

    }
}
