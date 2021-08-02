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
    public void CalcularArea() {
        double area = Math.PI * this.radio * this.radio;
        System.out.println("la figura: "+ getNombre() + " con id: " + getId() + " y color: " + getColor() + " tiene un area: " + area);

    }

    @Override
    public void CalcularPerimetro() {
        double perimetro = 2 * this.radio * Math.PI;
        System.out.println("la figura: "+ getNombre() + " con id: " + getId() + " y color: " + getColor() + " tiene un perimetro: " + perimetro);

    }
}
