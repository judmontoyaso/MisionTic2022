package co.com.figurasgeometricas;

public class Circulo extends Figura implements Ifigura{

    private double radio;

    public double getRadio() {

        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(String nombre, String color, int id, double radio) {
        super(nombre, color, id);
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {

        return Math.PI * this.radio * this.radio;
    }

    @Override
    public double CalcularPerimetro() {

        return 2 * this.radio * Math.PI;
    }
}
