package Unidad4.OtrasCosas.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baraja baraja = new Baraja();
        baraja.barajar();baraja.barajar();baraja.barajar();
        int puntDealer = 0; int puntJugador = 0; int balance = 100; int apuesta;
        ArrayList<Carta> dealer = new ArrayList<>();
        ArrayList<Carta> jugador = new ArrayList<>();

        //Fase 1
        do{
            System.out.println("Balance: "+ balance);
            System.out.print("Cuanto quieres apostar: ");
            apuesta = scanner.nextInt();
            if (apuesta > balance){
                apuesta = balance;
            }
            balance -= apuesta;

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
            System.out.println("3. Split");
            System.out.println("4. Double");
            int respuesta = scanner.nextInt();

            //Fase 2
            switch(respuesta) {
                case 1:
                    boolean seguirPidiendo = false;
                    String seguirPidiendoS = "";
                    do {
                        jugador.add(baraja.repartirCarta());
                        puntJugador = comprobarPuntosJugador(jugador);
                        System.out.println("Tus cartas: "+jugador);
                        System.out.println("Tus puntos: " + puntJugador);
                        if (puntJugador > 21){
                            seguirPidiendo = false;
                            System.out.println("Te has pasado de 21.");
                            continue;
                        }
                        System.out.println("¿Pedir otra carta? (s/n): ");
                        seguirPidiendoS = scanner.next();
                        if (seguirPidiendoS.equalsIgnoreCase("s")){
                            seguirPidiendo = true;
                        }else {
                            seguirPidiendo = false;
                        }
                    }while (seguirPidiendo);
                    if (puntJugador <= 21){
                        funcionDealerCarta(dealer, baraja);
                        puntDealer = comprobarPuntosDealer(dealer);

                        balance += comprobarGanador(puntDealer,puntJugador,apuesta);

                    }else {
                        System.out.println("Has perdido te has pasado.");
                    }
                    break;
                case 2:

                    puntJugador = comprobarPuntosJugador(jugador);

                    funcionDealerCarta(dealer,baraja);
                    puntDealer = comprobarPuntosDealer(dealer);

                    if (puntJugador == 21){
                        balance += (int) (apuesta*2.5);
                    }else {
                        balance += comprobarGanador(puntDealer,puntJugador,apuesta);
                    }

                    break;
                case 3:
                    ArrayList<Carta> jugador2 = new ArrayList<>();
                    jugador2.add(jugador.remove(1));
                    System.out.println(jugador);
                    System.out.println(jugador2);



                    break;
                case 4:
                    break;
            }
            dealer.clear(); jugador.clear();
            if (baraja.getCartasBaraja() < 15){
                baraja = new Baraja();
            }
        }while (balance>0);

    }
    public static ArrayList<Carta> funcionDealerCarta(ArrayList<Carta> dealer,Baraja baraja){
        int cartasDealer = 0;

        int puntDealer = comprobarPuntosDealer(dealer);

        while (puntDealer <= 16){
            puntDealer = 0;
            dealer.add(baraja.repartirCarta());

            puntDealer = comprobarPuntosDealer(dealer);
            System.out.println("Repartiendo carta al dealer...");

            esperar(1500);
        }
        System.out.println("Cartas del dealer: "+ dealer.toString());
        System.out.println("Puntos del dealer: "+ puntDealer);
        return dealer;
    }
    public static void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static int comprobarPuntosDealer(ArrayList<Carta> dealer){
        int puntosDealer = 0;
        for (int i = 0;i < dealer.size() ; i++){
            puntosDealer += dealer.get(i).getValor();
        }
        if (puntosDealer>21){
            puntosDealer = 0;
            for (int i = 0;i < dealer.size() ; i++){
                if (dealer.get(i).getValor()==11){
                    dealer.get(i).setValor(1);
                }
                puntosDealer += dealer.get(i).getValor();
            }
        }
        return puntosDealer;
    }
    public static int comprobarGanador(int puntDealer, int puntJugador, int apuesta){
        if (puntDealer>21 && puntJugador<=21){
            System.out.println("Has ganado");
            apuesta *= 2;
        } else if (puntJugador<=21) {
            if (puntDealer>puntJugador){
                System.out.println("Has Perdido");
                apuesta = 0;
            } else if (puntDealer<puntJugador) {
                System.out.println("Has Ganado");
                apuesta *= 2;
            }else {
                System.out.println("Nadie gana.");
            }
        }
        return apuesta;
    }
    public static int comprobarPuntosJugador(ArrayList<Carta> jugador){
        int puntosJugador = 0;
        for (int i = 0;i < jugador.size() ; i++){
            puntosJugador += jugador.get(i).getValor();
        }
        if (puntosJugador>21){
            puntosJugador = 0;
            for (int i = 0;i < jugador.size() ; i++){
                if (jugador.get(i).getValor()==11){
                    jugador.get(i).setValor(1);
                }
                puntosJugador += jugador.get(i).getValor();
            }
        }
        return puntosJugador;
    }
}
