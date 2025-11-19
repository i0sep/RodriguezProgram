package Unidad2;
import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class PrepU2ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        int opcion = 0;
        do {
            opcion = pedirOpcion6(scanner);
            procesarOpcion6(opcion, frase);
        }while(opcion != 4);



    }

    public static void procesarOpcion6(int opcion, String frase) {
        int numero = 0;
        switch (opcion){
            case 1:
                String numeros = frase.replaceAll("[^0-9]", "");
                opcion = numeros.length();
        }
    }

    public static int pedirOpcion6(Scanner scanner){
        int opcion = 0;
        System.out.println("Elige una opción:");
        System.out.println("    1. Contar nñumeros");
        System.out.println("    2. Contar caracteres especiales (todo lo que no sea letra ni número ni espacio)");
        System.out.println("    3. Invertir letras de cada palabra");
        System.out.println("    4. Salir");
        System.out.print("Opción: ");
        opcion = scanner.nextInt();
        return opcion;
    }

    public static int contarNumeros(String frase) {
        int contador = 0;

        return contador;
    }

    public static int contarEspeciales(String frase) {
        int contador = 0;

        return contador;
    }

    public static String invertirFrase(String frase) {
        String resultado = "";

        return resultado;
    }
}
