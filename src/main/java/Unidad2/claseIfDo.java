package Unidad2;

import java.util.Scanner;

public class claseIfDo {
    public static void main(String[] args) {
        pedirNumero();
        System.out.println("Fin del programa principal.");
    }
    public static void pedirNumero() {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número positivo (0 para salir): ");
            numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("Has introducido 0, se termina el método con RETURN.");
                return;
            }else if (numero < 0) {
                System.out.println("Número negativo introducido. Inténtalo de nuevo.");
            }
        }while(numero < 0);
        System.out.println("Has introducido el número: " + numero);
        System.out.println("Continuamos ejecutando el método normalmente...");
        sc.close();
    }

}
