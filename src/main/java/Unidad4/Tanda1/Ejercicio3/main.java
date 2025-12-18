package Unidad4.Tanda1.Ejercicio3;

import java.util.Arrays;

/*
    3. Declarar una matriz de dobles de 5x5; calcular su matriz transpuesta; imprimir matriz
    original y matriz transpuesta de un modo legible.
 */
public class main {
    public static void main(String[] args) {
        int longitud = 5;
        double[][] dobles = new double[longitud][longitud];
        for (int j = 0; j < longitud; j++) {
            for (int i = 0; i < longitud; i++) {
                dobles[i][j] = ((int) (Math.random() * 1000)) / 100.0;
            }
        }
        for (int j = 0; j < longitud; j++) {
            for (int i = 0, t = (longitud-1); i < longitud; i++) {
                System.out.printf("%.2f ",dobles[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------");
        double[][] traspuesta = new double[longitud][longitud];
        for (int j = 0; j < longitud; j++) {
            for (int i = 0, t = (longitud-1); i < longitud; i++) {
                traspuesta[j][i] = dobles[i][j];
            }
        }
        for (int j = 0; j < longitud; j++) {
            for (int i = 0, t = (longitud-1); i < longitud; i++) {
                System.out.printf("%.2f ",traspuesta[i][j]);
            }
            System.out.println();
        }
    }
}
