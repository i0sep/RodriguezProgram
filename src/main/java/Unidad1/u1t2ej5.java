package Unidad1;

import java.util.Scanner;
public class u1t2ej5 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime un número de 6 cifras: ");
        int num = skanner.nextInt();
        String Snum = String.valueOf(num);

        int suma = (num<500000)?izqDerech(String.valueOf(num)):derechIzq(String.valueOf(num));
        System.out.print(suma);

    }
    /*Escribir estas funciones función que reciban un
String de 6 cifras y retorne un número con la suma de estas cifras utilizándolas de 2
en 2. Por ejemplo, izquierdaDerecha 123456 sería 12 + 34 + 56 = 102 y
derechaIzquierda 814252 sería 25 + 24 + 18 = 67

     */

    public static int izqDerech(String textnum){
        int n1 = Integer.valueOf(textnum);

        int part1 = n1/10000;
        int aux1 = part1*10000;
        int aux2 = n1-aux1;
        int part2 = aux2/100;
        int part3 = aux2-(part2*100);
        int suma = part1+part2+part3;

        System.out.println("Se ha usado la función izqDerecha.");
        return suma;
    }
    public static int derechIzq(String textnum){
    /*
        String part1 = n1.substring(4,6);
        String part2 = n1.substring(2,4);
        String part3 = n1.substring(0,2);
    */
        String word6 = textnum.substring(5,6);
        String word5 = textnum.substring(4,5);
        String word4 = textnum.substring(3,4);
        String word3 = textnum.substring(2,3);
        String word2 = textnum.substring(1,2);
        String word1 = textnum.substring(0,1);

        String part1 = word6+word5;
        String part2 = word4+word3;
        String part3 = word2+word1;

        int suma = Integer.valueOf(part1)+Integer.valueOf(part2)+Integer.valueOf(part3);
        System.out.println("Se ha usado la función derechaIzq.");

        return suma;
    }
}