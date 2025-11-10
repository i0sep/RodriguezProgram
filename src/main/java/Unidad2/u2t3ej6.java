package Unidad2;

import java.util.Scanner;

public class u2t3ej6 {
    /*
        Pedir al usuari@ un número del -1 al -10:
○ Mientras que el número no esté en ese rango, seguir pidiendo.
○ Utilizar dos bucles anidados para imprimir las tablas de multiplicar de ese
número (pasado a positivo), del anterior y del posterior. Es decir, si me dan
un -5, calcularemos las tablas de multiplicar del 4, 5 y 6.
     */
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        int n1 = -11;
        do {
            System.out.print("Introduce un número que comprenda en rango de -1 al -10 ambos incluidos: ");
            n1 = skanner.nextInt();
        }while (n1 < -10 || n1 > -1);
        n1 = Math.abs(n1)-1;
        for (int temp = n1;temp < n1+3; temp++){
            System.out.println("Tabla de multiplicar del "+temp);
            for (int temp2 = 1; temp2<=10;temp2++){
                int resultado = temp * temp2;
                System.out.println(temp+" x "+temp2+" = "+resultado);
            }
        }
    }
}
