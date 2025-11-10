package Unidad1;

import java.util.Scanner;
public class u1t2ej9 {

    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime el salario bruto: ");
        int salary = skanner.nextInt();
        System.out.print("Dime las bonificaciones del salario: ");
        int bonus = skanner.nextInt();
        int brute = salary+bonus;
        double taxes = (brute>=3000)?0.3:0.2;
        System.out.println("El salario final es: "+(brute-(taxes*brute)));
    }
}