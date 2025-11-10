package Unidad1;

import java.util.Scanner;

public class u1t1ej14 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime 3 números: ");
        int n1 = skanner.nextInt();
        int n2 = skanner.nextInt();
        int n3 = skanner.nextInt();
        String creciente = (n1<n2)?(n2<n3)?"Los números están en orden creciente":"No estan en orden creciente":"No estan en orden creciente";
        System.out.print(creciente);
    }
}