package co.com.reto1;

public class Personaje {

    private String nombre;
    private char sexo;
    private double posicionX = 0;
    private double posicionY = 0;
    private double distanciaTotal = 0;
    private int numeroBotiquines = 0;
    private double vida = 100;

    public Personaje(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public void usarBotiquin(){
        if (numeroBotiquines > 0){
            vida = vida + 5;
            numeroBotiquines = numeroBotiquines - 1;
        }
    }

    public void recogerBotiquin(){
        numeroBotiquines = numeroBotiquines + 1;
    }

    public void moverDerecha(double d){
        posicionX = posicionX + d;
        distanciaTotal = distanciaTotal + d;

    }

    public void moverIzquierda(double d){
        posicionX = posicionX - d;
        distanciaTotal = distanciaTotal + d;

    }

    public void moverArriba(double d){
        posicionY = posicionY + d;
        distanciaTotal = distanciaTotal + d;

    }

    public void moverAbajo(double d){
        posicionY = posicionY - d;
        distanciaTotal = distanciaTotal + d;
    }

    public double calcularDistanciaRespectoOrigen(){
        double distancia;
        distancia = Math.pow(((posicionX * posicionX) + (posicionY * posicionY)),0.5);
        return distancia;
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

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumberoBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }


}
