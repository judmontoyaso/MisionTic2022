package co.com.clasesabstractas;

public abstract class Animal {
    private String nombre;

    public Animal(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer (){
        System.out.println(this.getNombre()+" esta comiendo. ");
    }
    public void caminar (){
        System.out.println(this.getNombre()+" esta caminando. ");
    }

    public abstract void sonido();

}
