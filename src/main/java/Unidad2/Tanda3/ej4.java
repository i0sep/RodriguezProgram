package Unidad2.Tanda3;

import java.util.Scanner;

public class ej4 {
    /*
    Ofrecer al usuari@ un menú de opciones para realizar operaciones matemáticas
    básicas. El usuari@ introducirá dos números y, a continuación, elegirá qué operación
    desea realizar mediante un número del menú. El menú debe ser así:
        ○ 1. Sumar
        ○ 2. Restar
        ○ 3. Multiplicar
        ○ 4. Dividir
        ○ 5. Salir
        ○ Se debe controlar:
        ■ Que siga preguntando si se introduce una opción no válida
        ■ Si se divide entre 0.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número con decimales: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce otro número con decimales: ");
        double num2 = sc.nextDouble();
        int opcion = 0;

        do {
            System.out.println("Elige operación a realizar: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            if ((0>=opcion || opcion>5)){
                System.out.println("Error introduciendo los datos");
            }
        }while (0>=opcion || opcion>5);

        double resultado = 0;
        if (!(opcion==4 && num2==0)){
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
            System.out.print(op);
        }else {
            System.out.print("No se puede dividir entre 0.");
        }
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

