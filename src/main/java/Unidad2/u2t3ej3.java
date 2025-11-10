package Unidad2;

import java.util.Scanner;

        /*
        Pedir al usuari@ tres números enteros que representen las longitudes de los lados
        de un triángulo (RECORDATORIO; Tres lados forman un triángulo si se cumple la
        desigualdad triangular: cada lado debe ser menor que la suma de los otros dos). El
        programa debe determinar:
            ○ Si los tres lados pueden formar un triángulo.
            ○ Si lo forman, indicar de qué tipo es:
            ■ Equilátero: los tres lados iguales.
            ■ Isósceles: dos lados iguales.
            ■ Escaleno: los tres lados distintos.
         */

public class u2t3ej3 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        boolean check = false;
        int lado1;int lado2;int lado3;
        System.out.print("Dime la longitud de los 3 lados del triangulo: ");
        do {
            lado1 = skanner.nextInt();
            lado2 = skanner.nextInt();
            lado3 = skanner.nextInt();
            check = lado1<(lado2+lado3) && lado2<(lado1+lado3) && lado3<(lado2+lado1);
            if (!check){
                System.out.print("Lados incorrectos, vuelva a introducir los datos: ");
            }
        }while (!check);

        if (lado1==lado2 && lado2==lado3){
            System.out.print("Equilátero: los tres lados iguales");
        } else if (lado1==lado2 || lado2==lado3 || lado1==lado3) {
            System.out.print("Isósceles: dos lados iguales.");
        }else {
            System.out.print("Escaleno: los tres lados distintos.");
        }

        skanner.close();
    }
}
