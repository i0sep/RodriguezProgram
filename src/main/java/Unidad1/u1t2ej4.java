package Unidad1;

import java.util.Scanner;
public class u1t2ej4 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime un número entero: ");
        int entero = skanner.nextInt();
        System.out.print("Dime un número con decimales: ");
        double doble = skanner.nextDouble();
        double lost = doble - (int)doble;
        double mult = entero*doble;

        System.out.println("La multiplicación da como resulado: "+(int)mult);
        System.out.print("La pérdida de información fué de: "+lost);

    }
}