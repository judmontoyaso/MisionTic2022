package co.com.figurasgeometricas;

public class Rectangulo extends Figura implements Ifigura {

    private double largo;
    private double ancho;

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public Rectangulo(String nombre, String color, int id, double largo, double ancho) {
        super(nombre, color, id);
        this.largo = largo;
        this.ancho=ancho;
    }

    @Override
    public double CalcularArea() {

        return this.largo * this.ancho;
    }

    @Override
    public double CalcularPerimetro() {

        return (2 * this.largo) + (2 * this.ancho);
    }
}
