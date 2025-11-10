package Unidad1;

import java.util.Scanner;
public class u1t1ej18 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime el sueldo y la productivad: ");
        double sueldo = skanner.nextDouble();
        double productividad = skanner.nextDouble();
        // Asumamos que un empleado recibe un bono del 15% de su sueldo base si
        // Productividad Mínima: Su valor de productividad es 50 o más.
        // Sueldo Inferior: Su sueldo base es inferior a 3000.
        int check = 0;
        check = (productividad>=50)?check+=1:check;
        check = (sueldo<3000)?check+=1:check;
        sueldo = (check==2)?sueldo=(sueldo*0.15)+sueldo:sueldo;
        String bonus = (check==2)?"Si ":"No ";
        System.out.println(bonus+"recibe el bono del 15% en el sueldo.");
        System.out.print("El sueldo es de: "+sueldo);
    }
}