package Unidad0.Ej3c;

import java.util.List;
import java.util.Scanner;

public class Game {
    private static int puntuacion;

    public static void empezar(){
        Bloque bloqueMinar;
        Scanner scanner = new Scanner(System.in);
        Herramienta herramienta;
        System.out.println("Comenzar a jugar.");
        do {
            bloqueMinar = Bloques.bloqueRandom();
            System.out.println("Tienes "+bloqueMinar.getName()+" delante.");
            System.out.println("Elige tu Herramienta: ");
            System.out.println("    Pico ("+Herramientas.PICO.getDurabilidad()+" de durabilidad)");
            System.out.println("    Hacha ("+Herramientas.HACHA.getDurabilidad()+" de durabilidad)");
            System.out.println("    Pala ("+Herramientas.PALA.getDurabilidad()+" de durabilidad)");
            System.out.println("    Espada ("+Herramientas.ESPADA.getDurabilidad()+" de durabilidad)");

            herramienta = getHerramienta(scanner.next().toLowerCase());
            if (bloqueMinar.isCorrect(herramienta)){
                herramienta.usarHerramienta();
                System.out.println("Has conseguido "+bloqueMinar.getDrop().getName());
                puntuacion++;
            } else {
                herramienta.usarHerramienta(10);
            }
        } while (herramienta.getDurabilidad() > 0);
        System.out.println("Juego terminado");
    }
    private static Herramienta getHerramienta(String usuario){
        return switch (usuario){
            case "pico" -> Herramientas.PICO;
            case "hacha" -> Herramientas.HACHA;
            case "pala" -> Herramientas.PALA;
            case "espada" -> Herramientas.ESPADA;
            default -> throw new IllegalStateException("Valor no esperado: "+usuario);
        };
    }
}
