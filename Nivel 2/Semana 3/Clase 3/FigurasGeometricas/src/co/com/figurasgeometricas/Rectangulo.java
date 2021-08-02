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
    public void CalcularArea() {

        double area = this.largo * this.ancho;
        System.out.println("la figura: "+ getNombre() + " con id: " + getId() + " y color: " + getColor() + " tiene un area: " + area);

    }

    @Override
    public void CalcularPerimetro() {

        double perimetro = (2 * this.largo) + (2 * this.ancho);
        System.out.println("la figura: "+ getNombre() + " con id: " + getId() + " y color: " + getColor() + " tiene un perimetro: " + perimetro);

    }
}
