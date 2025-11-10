package Unidad2.Tanda4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Crear un programa que pida por teclado un número entero. Ha de dividir 5 entre ese
número, mostrando por pantalla el resultado.
○ Controla con excepciones la división entre 0.
○ Controla con excepciones la entrada por teclado.
 */


public class ej2 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        int num=0;boolean salir=false; int division = 0;
        do {
            System.out.print("Dime un número entero: ");
            try {
                num = skanner.nextInt();
                division = 5/num;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato erróneo, introduzca otro " + e);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0. " + e);
                skanner.nextLine();
                salir = true;
            }
            System.out.print("La división es: " + division);
            skanner.nextLine();
        }while (salir);

    }
}
