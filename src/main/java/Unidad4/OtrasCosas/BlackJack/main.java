package Unidad4.OtrasCosas.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baraja baraja = new Baraja();
        baraja.barajar();baraja.barajar();baraja.barajar();
        int puntDealer = 0; int puntJugador = 0;
        ArrayList<Carta> dealer = new ArrayList<>();
        ArrayList<Carta> jugador = new ArrayList<>();

        //Fase 1
        dealer.add(baraja.repartirCarta()); dealer.add(baraja.repartirCarta());
        puntDealer = dealer.get(0).getValor();
        System.out.println("Carta 1 dealer: "+dealer.get(0));
        System.out.println("Carta 2 dealer: -------------");
        System.out.println("Puntos = "+puntDealer);
        jugador.add(baraja.repartirCarta()); jugador.add(baraja.repartirCarta());
        puntJugador = jugador.get(0).getValor() + jugador.get(1).getValor();
        System.out.println("Primera carta: "+ jugador.get(0));
        System.out.println("Segunda carta: "+ jugador.get(1));
        System.out.println("Puntos = "+puntJugador);
        System.out.println("Que quieres hacer: ");
        System.out.println("1. Hit");
        System.out.println("2. Stand");
        int respuesta = scanner.nextInt();

        //Fase 2
        switch(respuesta) {
            case 1:
                boolean seguirPidiendo = false;
                String seguirPidiendoS = "";
                do {
                    jugador.add(baraja.repartirCarta());
                    System.out.println("Tus cartas: "+jugador);
                    System.out.println("Tus puntos: " + puntJugador);
                    System.out.println("¿Pedir otra carta? (s/n): ");




                }while (seguirPidiendo);
                break;
            case 2:
                if (jugador.get(0).getValor() == 11 && jugador.get(1).getValor() == 11) {
                    jugador.get(1).setValor(1);
                }else if (dealer.get(0).getValor() == 11 && dealer.get(1).getValor() == 11) {
                    dealer.get(1).setValor(1);
                }

                puntDealer = puntDealer + dealer.get(1).getValor();
                System.out.println("Carta dealer: "+dealer.get(0)+" y "+dealer.get(1));
                System.out.println("Puntos = "+puntDealer);
                System.out.println("Carta jugador: "+jugador.get(0)+" y "+jugador.get(1));
                System.out.println("Puntos = "+puntJugador);

                dealer = funcionDealerCarta(dealer, baraja);
                for (int i = 0;i < dealer.size() ; i++){
                    puntDealer += dealer.get(i).getValor();
                }
                if (puntDealer>21){
                    puntDealer = 0;
                }
                if (puntJugador > puntDealer) {
                    System.out.println("Has Ganado");
                }else if (puntJugador == puntDealer){
                    System.out.println("Nadie gana.");
                }else {
                    System.out.println("Has Perdido");
                }
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
    public static ArrayList<Carta> funcionDealerCarta(ArrayList<Carta> dealer,Baraja baraja){
        int puntDealer = 0; int cartasDealer = 0;
        for (int i = 0;i < dealer.size() ; i++){
            puntDealer += dealer.get(i).getValor();
            cartasDealer++;
        }
        while (puntDealer <= 16){
            dealer.get(cartasDealer-1);
            dealer.add(baraja.repartirCarta());
            puntDealer += dealer.get(cartasDealer-1).getValor();
            cartasDealer++;
            System.out.println("Repartiendo carta al dealer...");
            esperar(1500);
            System.out.println("Cartas del dealer: "+ dealer.toString());
            System.out.println("Puntos del dealer: "+ puntDealer);
        }
        return dealer;
        }
    public static void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
