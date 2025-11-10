package Unidad1;

import java.util.Scanner;
public class u1t1ej17 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        // Dado el número de pasos dados por una persona en un día, mostrar si ha cumplido
        // su meta de 10,000 pasos, y si ha hecho más del doble de su meta.
        System.out.print("Cuantos pasos ha hecho hoy: ");
        int pasos = skanner.nextInt();
        String sol = "";
        sol = (pasos<10000)?"No ha conseguido el reto de los 10.000 pasos"
                :(pasos>=20000)?
                "Ha conseguido el doble de los 10.000 pasos":"Ha conseguido el reto de los 10.000 pasos";
        System.out.print(sol);
    }
}