package co.com.herencia;

public class PruebaHerencia {
    public static void main(String[] args) {
        BicicletaMontania bicicletaM = new BicicletaMontania();
        System.out.println("mi biciletaM es de marca" + bicicletaM.getMarca());
        System.out.println("de color: " + bicicletaM.getColor());
        System.out.println("tiene una velocidad : " + bicicletaM.getVelocidad());
        System.out.println("esta en el cambio : " + bicicletaM.getCambio());

        bicicletaM.setMarca("Specialized");
        bicicletaM.setColor("Roja");

        bicicletaM.subirCambios();
        bicicletaM.subirCambios();
        bicicletaM.subirCambios();

        bicicletaM.pedalear(5);
        bicicletaM.pedalear(5);

        System.out.println("mi biciletaM es de marca" + bicicletaM.getMarca());
        System.out.println("de color: " + bicicletaM.getColor());
        System.out.println("tiene una velocidad : " + bicicletaM.getVelocidad());
        System.out.println("esta en el cambio : " + bicicletaM.getCambio());
    }
}
