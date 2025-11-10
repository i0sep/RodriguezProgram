package Unidad2;

import java.util.Scanner;

public class claseRectangulo {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime dos números, fila, columna: ");
        int fila = skanner.nextInt();
        int columna = skanner.nextInt();

        for (int i=0;i<columna;i++){
            for (int j=0;j<fila;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        skanner.close();
    }
}
