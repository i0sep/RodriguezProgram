package Unidad3.EjercicioDefensaUT3.Ejercicio1Bien;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        JuegoBinario numeroJuego = new JuegoBinario();
        System.out.println(numeroJuego.getObjetivo());
        byte num;

        do {
        num = pedirNumero();
        comprobar(num,numeroJuego);
        } while (num != numeroJuego.getObjetivo());

    }


    public static byte pedirNumero(){
        byte num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Empezando juego adivina el número.");
        do {
            System.out.print("Introduce un número entre 0-63: ");
            try {
                num = scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato incorrecto. "+e);
                scanner .nextLine();
            }
            if (num < 0 || num > 63){
                System.out.println("Numero fuera del rango pedido.");
            }
        } while (num < 0 || num > 63);

        System.out.println("Tu número en binario "+ Integer.toBinaryString(num));

        return num;
    }



    public static void comprobar(byte num, JuegoBinario numeroJuego){
        int respuesta = 0;
        Scanner scanner = new Scanner(System.in);

        if (num == numeroJuego.getObjetivo()){
            System.out.println("Has acertado :D");

            System.out.println("El número era "+numeroJuego.getObjetivo());
            System.out.println("    Estadísticas:");
            System.out.println("    -Pistas 1 necesitadas: "+numeroJuego.getPistas1());
            System.out.println("    -Pistas 2 necesitadas: "+numeroJuego.getPistas2());
            System.out.println("    -Pistas totales gastadas: "+numeroJuego.getPistasGastadas());
            System.out.println();
        }else{
            System.out.println("No has acertado D:");
            do {
                System.out.println("Que tipo de pista quieres: ");
                System.out.println("    Pista 1. ¿Misma cantidad de números 1?");
                System.out.println("    Pista 2. Cantidad de posición acertadas de 1s.");
                try{
                    respuesta = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Tipo de dato introducido incorrecto. "+e);;
                }

                scanner.nextLine();
            } while (respuesta != 1 && respuesta != 2);

            switch (respuesta){
                case 1:
                    if (numeroJuego.pistaUno(num, numeroJuego.getObjetivo())){
                        System.out.println(num+" tiene la misma cantidad de 1s");
                    }else {
                        System.out.println(num+" NO tiene la misma cantidad de 1s");
                    }
                    break;
                case 2:
                    System.out.println("Número de 1s acertados: "+numeroJuego.pistaDos(num,numeroJuego.getObjetivo()));
                    break;
            }
        }
    }
}