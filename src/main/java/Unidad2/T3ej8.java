package Unidad2;

import java.util.Scanner;

public class T3ej8 {
    /*
    Escribir un programa que pida números enteros al usuari@ hasta que introduzca un
    número negativo (en ese momento termina el programa).
        ○ El programa debe sumar solo los números pares mayores que 10.
        ○ Si el número no cumple esas condiciones, debe saltar esa iteración usando
        continue.
        ○ Mostrar también cuántos números válidos se han sumado.
     */
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        int number = 0; boolean salirWhile=false; int suma = 0; int counterValid = 0;
        do {
            System.out.print("Dime números positivos mayores que 10 y pares: ");
            number = skanner.nextInt();
            if (number<0){
                System.out.print("Número negativo ingresado, cerrando programa.");
                salirWhile = true;
                continue;
            }else if (number>10 && number%2==0){
                suma += number;
                counterValid ++;
            }else continue;
            System.out.println("La suma es: "+suma);
            System.out.println("La cantidad de números válidos es de "+counterValid);
        }while (!salirWhile);
        skanner.close();
    }
}
