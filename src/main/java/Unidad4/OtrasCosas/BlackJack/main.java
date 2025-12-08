package Unidad4.OtrasCosas.BlackJack;

public class main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();baraja.barajar();baraja.barajar();
        Carta primera = baraja.repartirCarta();
        System.out.println(primera.valor());;
        System.out.println(primera.toString());
    }
}
