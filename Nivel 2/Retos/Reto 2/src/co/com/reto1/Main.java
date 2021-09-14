package co.com.reto1;

/**
 * @author judmontoyaso
 */
public class Main {
    public static void main(String[] args) {
        Jugador j = new Jugador("Explorador", 'm', 0, 5, 100);
        Enemigo e = new Enemigo("Bitter", 'f', 0,0,80);
        j.usarBotiquin();
        j.recogerBotiquin();
        j.recogerBotiquin();
        j.usarBotiquin();
        System.out.println(j);
        System.out.println(e);


    }
}
