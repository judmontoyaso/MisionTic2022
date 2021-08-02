package co.com.reto1;

public class Main {
    public static void main(String[] args) {
        Personaje explorer = new Personaje("explorador", 'm');
        explorer.moverDerecha(2);
        explorer.moverAbajo(5);
        explorer.moverIzquierda(1);
        System.out.println(explorer.calcularDistanciaRespectoOrigen());

    }}

//        System.out.println(explorer.getVida());
//        explorer.usarBotiquin();
//        System.out.println(explorer.getVida());
//        System.out.println(explorer.getNumberoBotiquines());
//        explorer.recogerBotiquin();
//        explorer.recogerBotiquin();
//        System.out.println(explorer.getNumberoBotiquines());
//        explorer.usarBotiquin();
//        System.out.println(explorer.getVida());
//    }

