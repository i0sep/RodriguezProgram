package Unidad1;

import java.util.Scanner;

public class u1t2ej15 {
    public static void main(String[] args) {
        /*
        Crea double media3(double a, double b, double c) que retorne la media de tres
        números. Además, imprime en la misma línea la media y el texto "APTO" si la media
        ≥ 5 o "NO APTO" si es < 5.
         */
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime 3 números: ");
        double a = skanner.nextDouble();
        double b = skanner.nextDouble();
        double c = skanner.nextDouble();
        double media = media3(a,b,c);
        String apto = (media >= 5)?"Es apto.":"No es apto.";
        System.out.printf("La media de %.2f, %.2f y %.2f es %.2f.\n%s%n", a, b, c, media, apto);
    }
    public static double media3(double a,double b, double c){
        double media = (a+b+c)/3;
        return media;
    }
}
