package Unidad4.OtrasCosas.BlackJack;

import java.util.Arrays;

public class Baraja {                                // 4 filas, 13 columnas
    private Carta[] todasCartas;
    private int cartasBaraja;


    //Constructor
    public Baraja(){
        todasCartas = new Carta[52];

        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] valores = {"A", "2", "3", "4", "5", "6", "7","8","9","10","J","Q","K"};
        int indice = 0;
        for (int i = 0; i < palos.length; i++){

            for (int j = 0; j < valores.length; j++){
                todasCartas[indice] = new Carta(palos[i],valores[j]);
                indice++;
            }
        }
        cartasBaraja = 52;
    }


    //Metodos
    public void barajar(){
        for (int i = (cartasBaraja-1); i >= 0; i--){
            int j = (int)(Math.random()*(i+1));
            Carta temp = todasCartas[i];
            todasCartas[i] = todasCartas[j];
            todasCartas[j] = temp;
        }
    }
    public Carta repartirCarta(){
        if (cartasBaraja>0){
            cartasBaraja--;
            return todasCartas[cartasBaraja];
        }else {
            return null;
        }
    }
    @Override
    public String toString() {
        return "Baraja{" +
                "todasCartas=" + Arrays.toString(todasCartas) +
                ", cartasBaraja=" + cartasBaraja +
                '}';
    }
}
