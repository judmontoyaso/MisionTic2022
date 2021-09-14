package co.com.reto4;

import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;

/**
 * @author judmontoyaso
 */
public class Condominio {

    private ArrayList <Inmueble> inmuebles;

    public Condominio() {
        inmuebles  = new ArrayList<Inmueble>();
    }

    public void agregarInmueble(Inmueble i){
        boolean existe = false;
        for (Inmueble inmueble: inmuebles){

           if(inmueble.getnCasa().equals(i.getnCasa())){
               existe = true;

           }
       }

       if (!existe){
           inmuebles.add(i);
       }

    }

    public void eliminarInmueble(String ID){
        Inmueble inmuebleSelect = null;
        boolean existe = false;
        for (Inmueble i : inmuebles){
            if(i.getnCasa().equals(ID)){
                existe = true;
                inmuebleSelect = i;
            }

        }
        if (existe){
            inmuebles.remove(inmuebleSelect);
        }
    }
    public double calcularArriendoMensualCondominio(){

        double arriendoTotal = 0;

        for (Inmueble i : inmuebles){
            arriendoTotal = arriendoTotal + i.getCostoMensual();

            }
        return arriendoTotal;
        }

    public double promedioCostoInmueble() {
        double promedioArriendos;
        promedioArriendos = calcularArriendoMensualCondominio() / inmuebles.size();

        return promedioArriendos;
    }

    public double desviacionEstandarCostoInmueble() {
        double total = 0.0;

        for(Inmueble i : this .inmuebles) {
            total += Math .pow(i.getCostoMensual() - this.promedioCostoInmueble(),2);
        }

        return Math.sqrt((1/(double)this.inmuebles.size())*total);
    }




    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
}