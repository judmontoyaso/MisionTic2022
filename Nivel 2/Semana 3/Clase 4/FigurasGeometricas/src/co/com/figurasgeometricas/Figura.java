package co.com.figurasgeometricas;

public abstract class Figura implements Ifigura{

    private String nombre;
    private String color;
    private int id;

    public Figura(String nombre, String color, int id) {
        this.nombre = nombre;
        this.color = color;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
