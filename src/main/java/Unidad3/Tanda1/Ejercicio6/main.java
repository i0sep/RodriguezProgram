package Unidad3.Tanda1.Ejercicio6;

public class main {
    public static void main(String[] args) {
        CartaEnemigo enemigo = new CartaEnemigo("Sota", 20, 10);

        CartaPueblo carta1 = new CartaPueblo(6,"corazones");
        CartaPueblo carta2 = new CartaPueblo(8,"tréboles");

        Jugador jugador1 = new Jugador("Jugador 1",carta1);
        Jugador jugador2 = new Jugador("Jugador 2",carta2);

        System.out.println(jugador1.toString());
        System.out.println(jugador2.toString());

        jugador1.recibirDanio(enemigo.atacar());
        jugador2.recibirDanio(enemigo.atacar());

        enemigo.recibirDanio(jugador1.jugarCarta());
        enemigo.recibirDanio(jugador2.jugarCarta());
        System.out.println(enemigo.estaDerrotado());
        System.out.println(enemigo.toString());
    }
}
