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
    public void CalcularArea() {
        double area = (Math.pow(3, 0.5)/4)*this.lado*this.lado;
        System.out.println("la figura: "+ getNombre() + " con id: " + getId() + " y color: " + getColor() + " tiene un area: " + area);

    }

    @Override
    public void CalcularPerimetro() {
        double area = this.lado * 3;
        System.out.println("la figura: "+ getNombre() + " con id: " + getId() + " y color: " + getColor() + " tiene un area: " + area);

    }
}
