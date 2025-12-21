package Unidad4.Tanda1.Ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Dime un número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        } while (numeros.size() < 10);

        scanner.close();
    }
}
