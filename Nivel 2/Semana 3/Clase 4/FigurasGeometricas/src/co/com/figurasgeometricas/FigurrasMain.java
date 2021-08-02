package co.com.figurasgeometricas;

import java.util.ArrayList;
import java.util.List;

public class FigurrasMain {
    public static void main(String[] args) {
        Circulo bolita = new Circulo("Circulo", "rojo", 123, 10);
        Circulo bolita2 = new Circulo("Circulo", "verde", 123, 5);
        bolita.CalcularPerimetro();
        bolita.CalcularArea();
        bolita2.CalcularPerimetro();
        bolita2.CalcularArea();
        Triangulo triangulo = new Triangulo("Triangulo", "azul", 12, 4);
        triangulo.CalcularArea();
        triangulo.CalcularPerimetro();

        List<Figura> figuras = new ArrayList<Figura>();
        figuras.add(bolita);
        figuras.add(bolita2);
        figuras.add(triangulo);

        for (Figura figura:figuras) {
            System.out.println(figuras.indexOf(figura));
            System.out.println(" La figura " + figura.getNombre() + " de color " + figura.getColor() + " y con id " + figura.getId() + " Tiene un area de " + figura.CalcularArea() + " Tiene un perimetro de " + figura.CalcularPerimetro());

        }

    }
}
