package co.com.reto1;

/**
 * @author judmontoyaso
 */
public class Enemigo extends Personaje{

    private int evolucionesAplicadas = 0;
    private int resistencia = 1;

    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    public void evolucionar(){
        if (getVida() <= 30 && getEvolucionesAplicadas() == 0){
            setEvolucionesAplicadas(getEvolucionesAplicadas()+1);
            setDamage(getDamage()+20);
        }

        if (getVida() <= 10 && getEvolucionesAplicadas() == 1){
            setEvolucionesAplicadas(getEvolucionesAplicadas()+1);
            setResistencia(getResistencia()+1);
        }
    }


    @Override
    public void recibirImpacto(double d) {
        d = d/this.resistencia;
        super.recibirImpacto(d);
    }

    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Enemigo{ " +
                "nombre= '" + getNombre() + '\'' +
                ", sexo= " + getSexo() +
                ", posicionX= " + getPosicionX() +
                ", posicionY= " + getPosicionY()+
                ", damage= " + getDamage() +
                ", vida= " + getVida() +
                ", evolucionesAplicadas=" + getEvolucionesAplicadas()+
                ", resistencia=" + getResistencia() +
                '}';
    }


}
