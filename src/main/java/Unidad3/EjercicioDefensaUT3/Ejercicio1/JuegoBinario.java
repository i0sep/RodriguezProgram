package Unidad3.EjercicioDefensaUT3.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoBinario {
    private byte Objetivo;
    private static int pistasGastadas;
    private static int pistas1;
    private static int pistas2;

    private static final Scanner SCANNER = new Scanner(System.in);
    // Constructor
    private JuegoBinario(){
        setObjetivo((byte)(Math.random()*63));
    }
    // Métodos
    public static void empezarJuego(){
        String seguirJugando;
        byte num = 0;
        int pistas;
        pistas1 = 0;
        pistas2 = 0;
        JuegoBinario numeroObjetivo = new JuegoBinario();
        System.out.println(numeroObjetivo.getObjetivo());


        System.out.println("Empezando juego adivina el número.");
        String numBinario;

        do {

            do {
                System.out.print("Introduce un número entre 0-63: ");
                try {
                    num = SCANNER.nextByte();
                } catch (InputMismatchException e) {
                    System.out.println("Tipo de dato incorrecto. "+e);
                    SCANNER.nextLine();
                }
                if (num < 0 || num > 63){
                    System.out.println("Numero fuera del rango pedido.");
                }
            } while (num < 0 || num > 63);

            numBinario = Integer.toBinaryString(num);
            System.out.println("Tu número en binario "+numBinario);
            if (num == numeroObjetivo.getObjetivo()){
                System.out.println("Has acertado :D");
            }else{
                System.out.println("No has acertado D:");
                do {
                    System.out.println("Que tipo de pista quieres: ");
                    System.out.println("    Pista 1. ¿Misma cantidad de números 1?");
                    System.out.println("    Pista 2. Cantidad de posición acertadas de 1s.");
                    pistas = SCANNER.nextInt();
                    SCANNER.nextLine();
                } while (pistas != 1 && pistas != 2);

                switch (pistas){
                    case 1:
                        if (pistaUno(num, numeroObjetivo.getObjetivo())){
                            System.out.println(numBinario+" tiene la misma cantidad de 1s");
                        }else {
                            System.out.println(numBinario+" NO tiene la misma cantidad de 1s");
                        }
                        pistas1++;
                            break;
                    case 2:
                        System.out.println("Número de 1s acertados: "+pistaDos(num,numeroObjetivo.getObjetivo()));
                        pistas2++;
                        break;
                }

            }
        } while (num != numeroObjetivo.getObjetivo());

        System.out.println("¡Has acertado!");

        System.out.println("El número era "+numeroObjetivo.getObjetivo());
        System.out.println("    Estadísticas:");
        System.out.println("    -Pistas 1 necesitadas: "+pistas1);
        System.out.println("    -Pistas 2 necesitadas: "+pistas2);
        pistasGastadas = pistas1 + pistas2;
        System.out.println("    -Pistas totales gastadas: "+pistasGastadas);
        System.out.println();

        System.out.print("¿Quieres volver a jugar? (S/n): ");
        SCANNER.nextLine();
        seguirJugando = SCANNER.nextLine();

        if (!seguirJugando.equalsIgnoreCase("n")){
            empezarJuego();
        }
        SCANNER.close();
    }


    public static boolean pistaUno(byte byteDado, int objetivo){
        int numUnosOBJETIVO = 0;
        int numUnosNum = 0;
        for (int i = 0; i < 6; i++){
            if ((objetivo & (1 << i)) != 0){
                numUnosOBJETIVO++;
            }
        }

        for (int i = 0; i < 6; i++){
            if ((byteDado & (1 << i)) != 0){
                numUnosNum++;
            }
        }
        return numUnosOBJETIVO==numUnosNum;
    }

    public static int pistaDos(byte byteDado, int objetivo){
        int numerosAcertados = 0;
        for (int i = 0; i < 6; i++){
            if ((objetivo & (1 << i)) == (byteDado & (1 << i))){
                numerosAcertados++;
            }
        }
        return numerosAcertados;
    }


    // Getter y setters
    public void setObjetivo(byte objetivo) {
        Objetivo = objetivo;
    }
    public byte getObjetivo() {
        return Objetivo;
    }
}
