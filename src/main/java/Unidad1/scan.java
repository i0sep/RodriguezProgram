package Unidad1;

import java.util.Scanner;

public class scan {

    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);

        System.out.print("Dime una palabra: ");
        String p1 = skanner.nextLine();
        String p2 = p1.concat(" + amarillo");
        System.out.println("La palabra "+p1+" tiene "+p1.length()+" sílabas.");
        //System.out.printf("La palabra %s tiene %d sílabas.", p1,p1.length());
        System.out.println(p2);


        System.out.print("Dame dos números: ");
        double n1 = skanner.nextDouble();
        System.out.println("Output: " + n1);

        double n2 = skanner.nextDouble();     // si das dos números el segundo se almacena aquí
        System.out.println("Output buffer: " + n2);

        System.out.print("Introduce un texto: ");
        skanner.nextLine();
        String texto = skanner.nextLine();
        System.out.print("Texto en cuestión: " + texto);

    }
}
