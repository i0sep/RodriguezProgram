package Unidad4.Tanda1.Ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Dime un número: ");
            numero = scanner.nextInt();
            numeros.add(numero);
        } while (numeros.size() < 10);
        System.out.println(numeros);

        numeros.sort(Collections.reverseOrder());
        System.out.println(numeros);

        Collections.sort(numeros);
        System.out.println(numeros);


        System.out.println("Que número de los que ha introducido quieres buscar para saber su posición.");
        numero = scanner.nextInt();


        numero = Collections.binarySearch(numeros , numero);
        System.out.println("Dicho número se encuentra en la posición: "+numero);
        scanner.close();
    }
}
