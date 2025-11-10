package Unidad1;

import java.util.Scanner;
public class u1t1ej20 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime la edad: ");
        int edad = skanner.nextInt();
        System.out.print("¿Estas de Baja?: ");
        boolean baja = skanner.nextBoolean();
        System.out.print("¿Eres estudiante?: ");
        boolean esEstudiante = skanner.nextBoolean();
        //(edad>=18&&!baja)
        boolean resultado=(esEstudiante==true)?true:(edad>=18&&!baja)?true:false;
        String sol = (resultado==true)?"Puedes acceder al bono joven":"No puedes acceder al bono joven";
        System.out.println(sol);
    }
}