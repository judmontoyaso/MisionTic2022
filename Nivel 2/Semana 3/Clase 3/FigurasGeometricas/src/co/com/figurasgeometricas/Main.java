package co.com.figurasgeometricas;

public class Main {
    public static void main(String[] args) {
        Circulo bolita = new Circulo("Circulo", "rojo", 123, 10);
        Circulo bolita2 = new Circulo("Circulo", "rojo", 123, 5);
        bolita.CalcularPerimetro();
        bolita.CalcularArea();
        bolita2.CalcularPerimetro();
        bolita2.CalcularArea();
        Triangulo triangulo = new Triangulo("Triangulo", "azul", 12, 4);
        triangulo.CalcularArea();
        triangulo.CalcularPerimetro();

    }
}
