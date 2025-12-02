package Unidad2;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        String dni = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu DNI");
        dni = scanner.nextLine();

        dni = dni.replaceAll("[0-9]","");

        System.out.println("Los números del DNI: " + dni);
    }
}
