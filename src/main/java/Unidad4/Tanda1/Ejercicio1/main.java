package Unidad4.Tanda1.Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

/*
    1. Pedir por la entrada estándar un número; declarar un array de enteros de longitud
        igual al número indicado; rellenar dicho array con números aleatorios de valor entre
        50 y 100; codificar otra función (otro metodo que no sea el main) que utilice como
        parámetro un array de enteros y retorne otro array con los elementos con la posición
        intercambiada (primero por último, segundo por antepenúltimo, etc). Mostrar el
        contenido del array antes y después de invertirlo
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime la longitud de array: ");
        int longitud = scanner.nextInt();
        int[] numeros = new int[longitud];
        for (int i = 0; i< numeros.length;i++){
            numeros[i] = (int) (Math.random()*50)+50;
        }
        System.out.println(Arrays.toString(numeros));
        numeros = funcionArray(numeros);
        System.out.println(Arrays.toString(numeros));
    }
    public static int[] funcionArray(int[] enteros){
        for (int i = 0, j = (enteros.length-1); i < enteros.length / 2; i++, j--){
            int aux = enteros[i];
            enteros[i] = enteros[(j)];
            enteros[j] = aux;
        }
        return enteros;
    }
}
