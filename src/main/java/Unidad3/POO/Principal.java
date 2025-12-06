package Unidad3.POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false; int suma = 0; int tiradas = 0;
        System.out.print("Dime el número de lados del dado: ");
        Dado dado = new Dado(scanner.nextInt());

        do {
            tiradas++;
            suma += dado.lanzar();
            System.out.println("    Tirada número "+ tiradas + ": "+ dado.valor);
            System.out.println("----------------------------------");
            System.out.print("¿Quieres tirar otra vez los lados?: ");
            String peticion = scanner.next();
            System.out.println();
            if (peticion.equalsIgnoreCase("si")){
                salir = false;
            }else {
                salir = true;
            }
        }while (!salir);
        System.out.println("\nSuma total de todas las tiradas: "+suma);
    }
}