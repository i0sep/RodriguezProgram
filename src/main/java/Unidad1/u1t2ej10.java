package Unidad1;

import java.util.Scanner;
public class u1t2ej10 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        /*
    Escribe una función que reciba las coordenadas de dos puntos en el plano
    cartesiano (x1, y1) y (x2, y2), y calcule la distancia entre ellos usando la fórmula de
    la distancia: d = √((x2 - x1)^2 + (y2 - y1)^2).
    Utiliza Math.sqrt para la raíz cuadrada.
         */
        System.out.print("Dime las primeras coordenadas: ");
        int x1 = skanner.nextInt();
        int y1 = skanner.nextInt();
        System.out.print("Dime las segundas coordenadas: ");
        int x2 = skanner.nextInt();
        int y2 = skanner.nextInt();

        double answ = Math.sqrt(((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1)));


        System.out.print(answ);
    }
}