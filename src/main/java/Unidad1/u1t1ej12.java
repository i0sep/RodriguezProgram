package Unidad1;

import java.util.Scanner;

public class u1t1ej12 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime el precio del producto: ");
        int base = skanner.nextInt();
        System.out.print("Dime el descuento aplicado: ");
        double descuento = skanner.nextInt();
        double precio = base-((descuento/100)*base);
        String des20 = (descuento>=20)?"Descuento es mayor que 20%":"";
        System.out.println("El precio final del producto es: "+precio);
        System.out.println(des20);
    }
}