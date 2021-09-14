package co.com.reto1;

/**
 * @author judmontoyaso
 */
public class Personaje {

    private String nombre;
    private char sexo;
    private double posicionX = 0;
    private double posicionY = 0;
    private double damage;
    private double vida = 100;

    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }

    public double calcularDistanciaRespectoPersonaje(Personaje p){
       return Math.pow((Math.pow((getPosicionX() - p.getPosicionX()),2) + Math.pow((getPosicionY() - p.getPosicionY()),2)),0.5);

    }

    public void golpear(Personaje p){
        if (p.getVida() > 0){
            p.setVida(p.getVida()-(this.getDamage()/calcularDistanciaRespectoPersonaje(p)));
        }else {
            p.setVida(0);
        }


    }

    public void recibirImpacto(double d){
        setVida(getVida()-d);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                ", damage=" + damage +
                ", vida=" + vida +
                '}';
    }
}
