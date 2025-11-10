package Unidad2;

import java.util.Scanner;

public class T3ej9 {
    /*
                Pedir al usuari@ dos números:
            ○ múltiplo (comprobaremos qué números son múltiplos de este número)
            ○ límite (comprobaremos hasta este número, que deberá ser mayor de
            1000000, si no, continuaremos pidiendo).
            ○ utilizar un bucle para mostrar por pantalla los números múltiplos.
     */
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        int suma = 0;
        System.out.print("Dime un número del cuál quieras saber sus múltiplos: ");
        int numero = skanner.nextInt();
        System.out.print("Dime el límite de hasta cual número quieres saber sus múltiplos: ");
        int limite = skanner.nextInt();
        if (limite<1000000){
            do {
                System.out.println("El límite deve se mayor o igual de 1000000, introduzca otro.");
                limite = skanner.nextInt();
            }while (limite<1000000);
        }
        System.out.println("Múltiplos de "+numero+" hasta "+limite);
            for (int i = numero; i <= limite; i+=numero) {
                System.out.print(i+" ");
            }
    }
}
