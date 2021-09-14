package co.com.reto1;

/**
 * @author judmontoyaso
 */
public class Jugador extends Personaje{

    private int numeroBotiquines = 0;

    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    public void usarBotiquin(){
        if (getNumeroBotiquines() >= 1){
            setNumeroBotiquines(getNumeroBotiquines()-1);
            if(getVida() < 100){
                setVida(getVida()+5);
            }
        }
    }

    public void recogerBotiquin(){
        setNumeroBotiquines(getNumeroBotiquines()+1);
    }

    public void moverArriba(double d){
        setPosicionY(getPosicionY()+d);
    }

    public void moverAbajo(double d){
        setPosicionY(getPosicionY()-d);
    }

    public void moverDerecha(double d){
        setPosicionX(getPosicionX()+d);
    }

    public void moverIzquierda(double d){
        setPosicionX(getPosicionX()-d);
    }

    public void golpear(Enemigo p) {
        super.golpear(p);
        p.evolucionar();
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    @Override
    public String toString() {

        return "Personaje{ " +
                "nombre= '" + getNombre() + '\'' +
                ", sexo= " + getSexo() +
                ", posicionX= " + getPosicionX() +
                ", posicionY= " + getPosicionY()+
                ", damage= " + getDamage() +
                ", vida= " + getVida() +
                ", numeroBotiquines= " + getNumeroBotiquines() +
                '}';
    }
}


