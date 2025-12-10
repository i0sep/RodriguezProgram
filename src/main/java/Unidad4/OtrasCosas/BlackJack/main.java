package Unidad4.OtrasCosas.BlackJack;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baraja baraja = new Baraja();
        baraja.barajar();baraja.barajar();baraja.barajar();

        Carta[] dealer =  new Carta[5];
        Carta[] jugador = new Carta[10];

        dealer[0] = baraja.repartirCarta();
        dealer[1] = baraja.repartirCarta();
        System.out.println("Carta 1 dealer: "+dealer[0]);
        System.out.println("Carta 2 dealer: -------------");
        jugador[0] = baraja.repartirCarta();
        jugador[1] = baraja.repartirCarta();

        System.out.println("Primera carta: "+ jugador[0]);
        System.out.println("Segunda carta: "+ jugador[1]);

        System.out.println("Que quieres hacer: ");
        System.out.println("1. Hit");
        System.out.println("2. Stand");
        int respuesta = scanner.nextInt();
        if (respuesta == 1) {
            funcionJugar(dealer, jugador);
        }
        System.out.println("Carta 1 dealer: "+dealer[0]);
        System.out.println("Carta 2 dealer: "+dealer[1]);

    }

    public static void funcionJugar(Carta[] jugador, Carta[] dealer) {

    }
}
