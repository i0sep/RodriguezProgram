package Unidad1;

import java.util.Scanner;

public class u1t2ej1 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime 3 números cualquiera: ");
        int n1 = skanner.nextInt();
        int n2 = skanner.nextInt();
        int n3 = skanner.nextInt();
        int mayor = 0;
        mayor = (n1 > n2 && n1 > n3)?n1:mayor;
        mayor = (n2 > n1 && n2 > n3)?n2:mayor;
        mayor = (n3 > n2 && n3 > n1)?n3:mayor;

        int medio = fmedio(n1,n2,n3);

        int suma = mayor+medio;

        System.out.printf("Los dos mayores números son: "+medio+" y "+mayor);
        System.out.print("\nLa suma de los dos números mas grandes es: "+suma);
    }
    public static int fmedio(int n1, int n2, int n3){
        int medio= (n1<n2) ? (n1>n3)? n1 : (n2<n3) ? n2:n3 : (n2>n3)?n2 : (n1>n3)? n3:n1;
        return medio;

    }
}