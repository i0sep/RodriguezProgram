package Unidad4.Tanda1.Ejercicio8;

/*
        8. Crear un programa en JAVA que:
                ○ Solicite al usuario una frase completa.
                ○ Divida la frase en palabras individuales.
                        I.E.S Gregorio Prieto - Departamento de Informática
                ○ Almacene la cantidad de veces que aparece cada palabra en un
                        HashMap<String, Integer>.
                ○ Imprima el resultado mostrando cuántas veces aparece cada palabra.
                ○ Se espera una salida similar a:
                        Ingrese una frase: "hola mundo hola"
                        Frecuencia de palabras:
                        hola -> 2
                        mundo -> 1
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase completa:");
        String frase = scanner.nextLine();
        String[] palabras = frase.split(" ");

    }
}
