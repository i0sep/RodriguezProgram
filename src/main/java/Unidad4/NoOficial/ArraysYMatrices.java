package Unidad4.NoOficial;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysYMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce filas para el array: ");
        int filas = scanner.nextInt();
        System.out.print("Introduce columnas para el array: ");
        int columnas = scanner.nextInt();

        int[][] numeros = new int[filas][columnas];
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print("\nFila: "+i+", Columna: "+j+", Introduce un número: ");
                numeros[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(numeros));
        scanner.close();
    }
}
