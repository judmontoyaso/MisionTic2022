package co.com.figurasgeometricas;

public class Triangulo extends Figura implements Ifigura{

    private double lado;

    public Triangulo(String nombre, String color, int id, double lado) {
        super(nombre, color, id);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {

        return (Math.pow(3, 0.5)/4)*this.lado*this.lado;
    }

    @Override
    public double CalcularPerimetro() {

        return this.lado * 3;
    }
}
