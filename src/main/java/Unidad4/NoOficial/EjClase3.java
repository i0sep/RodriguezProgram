package Unidad4.NoOficial;

import java.util.Scanner;
public class EjClase3 {

    int[] array = new int[1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Longitud del vector: ");
        int vector = scanner.nextInt();
        int[] array = new int[vector];
        int tamano = fTamano(vector, array);

        System.out.println("El tamaño es: "+tamano);
        scanner.close();
    }
    public static int fTamano(int vector, int[] array){
        int tamano = 0;

        try{
            for (int i = 0 ; i <= tamano ; i++){
                array[i] = 1;
                //int aux = array[i];
                tamano++;
            }
        }catch (ArrayIndexOutOfBoundsException _){}
        return tamano;
    }

}
