package Unidad1;

import java.util.Random;

public class u1t1ej11 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int dd1 = aleatorio.nextInt(6) + 1;
        int dd2 = aleatorio.nextInt(6) + 1;
        System.out.println("Dado 1: "+dd1+"\nDado 2: "+dd2);
        String par = (((dd1+dd2) % 2 == 0)&&(dd1+dd2)>7)?"Es par y mayor que 7":"No es par y mayor que 7";
        System.out.println(par);
    }
}