package Unidad2.Tanda4;

import java.util.InputMismatchException;
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
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        int num=0; int division = 0; int contador = 0; int contador2 = 0;
        do {
            System.out.print("Dime un número entero: ");
            try {
                num = skanner.nextInt();
                division = 5/num;
                contador2 = contador;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato erróneo, introduzca otro " + e);
                skanner.nextLine();
                contador++;
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0. " + e);
                contador++;
            }finally {
                System.out.println("El número de errores ha sido de: "+contador);
            }
            if (contador2==contador){
                System.out.println("La división es: " + division);
            }
        }while (num!=10);
    }
}
