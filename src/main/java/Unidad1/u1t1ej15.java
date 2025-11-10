package Unidad1;

import java.util.Scanner;

public class u1t1ej15 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime la base del triángulo: ");
        double base = skanner.nextDouble();
        System.out.print("Dime la altura del triángulo: ");
        double altura = skanner.nextDouble();
        double area = (base*altura)/2;
        System.out.println("El área es "+area);
        String area100 = (area>=100)?"El área es mayor o igual que 100":"El área es menor que 100";
        System.out.print(area100);
    }
}