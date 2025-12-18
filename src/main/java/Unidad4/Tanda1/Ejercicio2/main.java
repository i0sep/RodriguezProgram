package Unidad4.Tanda1.Ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

/*
2. Declarar una array de 5 String; rellenar el array con valores pedidos por la entrada
estándar; comprobar si el array contiene palabras repetidas.
 */
public class main {
    public static void main(String[] args) {
        String[] string = new String[5];
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        do{
            System.out.print("Dime una palabra porfa: ");
            String output = scanner.nextLine();
            if (output.equalsIgnoreCase("")){
                System.out.println("No has introducido ningún dato.");
                continue;
            }
            string[contador] = output;
            contador++;
        }while (contador<5);
        System.out.println(Arrays.toString(string));
    }
}
