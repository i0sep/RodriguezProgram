package Unidad1;

import java.util.Scanner;

public class clasefunciones {
    public static void main(String[] args) {
        print(); // OTRA FUNCION

        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime un int: ");
        int m1 = skanner.nextInt();
        System.out.print("Dime un double: ");
        double m2 = skanner.nextDouble();
        System.out.print("Dime un float: ");
        float m3 = skanner.nextFloat();
        sumar(m1,m2,m3);
        double resta1 = resta(m1,m2,m3);
    }
    public static void sumar(int n1, double n2, float n3) {
        double suma = n1 + n2 + n3;
        System.out.println("La suma es: "+suma);
    }
    public static double resta(int n1, double n2, float n3) {
        double resta = n1 + n2 + n3;
        return resta;
    }
    public static void print() {
        System.out.println("Función print");
    }
}