package Unidad1;

import java.util.Scanner;

public class clasefuncionare {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime 3 lados de un triangulo: ");
        int l1 = skanner.nextInt();
        int l2 = skanner.nextInt();
        int l3 = skanner.nextInt();
        System.out.printf("Lado 1: %d \nLado 2: %d \nLado 3: %d",l1,l2,l3);
        int medio = fmedio(l1,l2,l3);
        int menor = fmenor(l1,l2,l3);
        double area = farea(menor,medio);
        System.out.println("\nEl área es: "+area);
    }
    public static int fmedio(int n1, int n2, int n3){
        int medio= (n1<n2) ? (n1>n3)? n1 : (n2<n3) ? n2:n3 : (n2>n3)?n2 : (n1>n3)? n3:n1;
        return medio;
    }
    public static int fmenor(int n1, int n2, int n3){
        // int menor = Math.min(n2,n3);
        // menor = Math.min(n1,menor);
        int menor = ((n1<n2)&&(n1<n3))?n1:(n2<n3)?n2:n3;
        return menor;
    }
    public static double farea(int n1, int n2){
        double area = ( n1 * n2 )/2.0;
        return area;
    }
}