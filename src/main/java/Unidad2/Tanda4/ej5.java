package Unidad2.Tanda4;

import java.util.Scanner;

/*
5. Crear un programa que pida por teclado un número entero. Ha de dividir 5 entre ese
número, mostrando por pantalla el resultado.
○ Controla que mientras exista una excepción el programa no terminará.
○ Controla con excepciones la división entre 0 de la función.
○ Controla con excepciones la entrada por teclado.
○ Controla cualquier tipo de excepción.
○ Llevar un contador de las veces que se han capturado una excepción y
mostrar este contador siempre (utilizar finally).
 */
public class ej5 {
    static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.println("Dime un número entero: ");
        int number = skanner.nextInt();

    }
}
