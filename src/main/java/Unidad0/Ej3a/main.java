package Unidad0.Ej3a;

import java.util.Scanner;
// suma
// resta
// division
// multiplicación
// Clase de cada clase y una interfaz.
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que operación quiere realizar: ");
        System.out.println("  1. Suma.");
        System.out.println("  2. Resta.");
        System.out.println("  3. Multiplicación.");
        System.out.println("  4. División.");
        int numero = scanner.nextInt();
        Operacion operacion = null;
        switch (numero){
            case 1:
                operacion = new Suma();
                break;
            case 2:
                operacion = new Resta();
                break;
            case 3:
                operacion = new Multiplicacion();
                break;
            case 4:
                operacion = new Division();
                break;
        }
        System.out.print("Dime un número: ");
        int salida1 = scanner.nextInt();
        System.out.print("Dime otro número: ");
        int salida2 = scanner.nextInt();
        Calculadora operador1 = new Calculadora(operacion);
        System.out.println("Salida: "+operador1.operacion(salida1,salida2));
        scanner.close();
    }
}
