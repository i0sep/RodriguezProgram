package Unidad1;

import java.util.Scanner;

public class claseopciones {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número con decimales: ");
    double num1 = sc.nextDouble();
    System.out.print("Introduce otro número con decimales: ");
    double num2 = sc.nextDouble();

    System.out.println("Elige operación a realizar: ");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");
    System.out.println("5. Salir");
    int opcion = sc.nextInt();
    
    while (0>=opcion || opcion>5){
        System.out.println("Introduce un número del 1 al 5.");
        opcion = sc.nextInt();
    }

    double resultado = 0;

    String salir = (opcion == 5) ? "El programa ha finalizado" : "";
    System.out.print(salir);
    resultado = (opcion == 1) ? suma(num1, num2) : resultado;
    resultado = (opcion == 2) ? resta(num1, num2) : resultado;
    resultado = (opcion == 3) ? multiplicacion(num1, num2) : resultado;
    resultado = (opcion == 4) ? division(num1, num2) : resultado;
    String op = "";
    op = (opcion == 1) ? "La suma es "+resultado:op;
    op = (opcion == 2) ? "La resta es "+resultado:op;
    op = (opcion == 3) ? "La suma es "+resultado:op;
    op = (opcion == 4) ? "La multiplicacion es "+resultado:op;
    op = (opcion > 5)||(opcion < 1)? "Opcion no válida":op;
    System.out.print(op);
}
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}