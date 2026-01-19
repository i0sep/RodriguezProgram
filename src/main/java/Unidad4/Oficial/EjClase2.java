package Unidad4.Oficial;

import java.util.Arrays;
import java.util.Scanner;

public class EjClase2 {
    public final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        // fNumeros();
        // fPedirNumeros();
        // fNumeroMayor();
        fCambio();
    }

    public static void fNumeros(){
        int filas = 4, columnas = 3;
        int[][] numeros = new int[filas][columnas];

        for (int i = 0;i<numeros.length;i++){
            for (int j = 0; j<numeros[i].length;j++){
                numeros[i][j] = i*columnas+j+1;
            }
        }
        System.out.println(Arrays.deepToString(numeros));
    }


    public static void fPedirNumeros(){
        int filas,columnas;
        System.out.print("Dime las filas y columnas: ");
        filas = SCANNER.nextInt();
        columnas = SCANNER.nextInt();
        int[][] arrayNumeros = new int[filas][columnas];

        for (int i = 0;i<arrayNumeros.length;i++){
            for (int j = 0; j<arrayNumeros[i].length;j++){
                System.out.println("Dime un número para meter en el array. Array ["+i+"]["+j+"]");
                arrayNumeros[i][j] = SCANNER.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arrayNumeros));
    }



    public static void fNumeroMayor(){
        int[][] arrayRNG = {{((int) (Math.random() * 10)),((int) (Math.random() * 10)),((int) (Math.random() * 10))},{((int) (Math.random() * 10)),((int) (Math.random() * 10)),((int) (Math.random() * 10))},{((int) (Math.random() * 10)),((int) (Math.random() * 10)),((int) (Math.random() * 10))}};
        int numero = Integer.MIN_VALUE;
        int fMax = 0; int cMax = 0;

        for (int i = 0;i<arrayRNG.length;i++){
            for (int j = 0; j<arrayRNG[i].length;j++){
                if (arrayRNG[i][j]>numero){
                    numero = arrayRNG[i][j];
                    fMax = i; cMax = j;
                }
            }
        }
        System.out.println(Arrays.deepToString(arrayRNG));
        System.out.println("Numero mayor numero["+fMax+"]["+cMax+"]: "+numero);
    }



    public static void fCambio(){   //Desplazar todos los numeros uno a la derecha
        int filas = 5, columnas = 5;
        int[][] numeros = new int[filas][columnas];

        for (int i = 0;i<numeros.length;i++){
            for (int j = 0; j<numeros[i].length;j++){
                numeros[i][j] = i*columnas+j+1;
            }
        }
        System.out.println(Arrays.toString(numeros[0]));
        System.out.println(Arrays.toString(numeros[1]));
        System.out.println(Arrays.toString(numeros[2]));

        System.out.println("---------");
        int desplazamiento = 1;

        int ultimo = numeros[filas-1][columnas-1];

        for (int i = filas - desplazamiento; i >= 0; i--){
            for (int j = columnas - desplazamiento; j >= 0; j--){

                if (i == 0 && j == 0) {
                    // Primera posición: poner el último guardado
                    numeros[i][j] = ultimo;
                } else if (j > 0) {
                    // Tomar el elemento de la izquierda en la misma fila
                    numeros[i][j] = numeros[i][j-1];
                } else {
                    // Primera columna: tomar el último de la fila anterior
                    numeros[i][j] = numeros[i-1][columnas-1];
                }
            }
        }
        System.out.println(Arrays.toString(numeros[0]));
        System.out.println(Arrays.toString(numeros[1]));
        System.out.println(Arrays.toString(numeros[2]));

    }
}
