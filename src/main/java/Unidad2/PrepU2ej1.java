package Unidad2;

import java.util.Scanner;

public class PrepU2ej1 {
    public enum Cargo {
        DIRECTOR, GERENTE, PROGRAMADOR
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner
        Cargo cargoAux = obtenerCargo(scanner);

        int opcion = 0;

        do {
            opcion = menu(scanner, cargoAux);
            opcion = mostrarResultado(opcion, cargoAux);
        } while (opcion != 0);

    }

    public static int mostrarResultado(int opcion, Cargo cargo) {
        if (cargo == cargo.DIRECTOR){
            switch (opcion){
                case 1:
                    System.out.println("    DIRECTOR: Cobrando nómina...mucho dinero...");
                    break;
                case 2:
                    System.out.println("    Viendo el estado de la empresa...");
                    break;
                case 0:
                    System.out.println("    Saliendo...");
                    break;
            }
            if (opcion<0||opcion>2){
                System.out.println("Opción no válida. Por favor, selecciona una opción válida");
            }
        } else if (cargo == cargo.PROGRAMADOR){
            switch (opcion){
                case 1:
                    System.out.println("    Saliendo...");
                    opcion = 0;
                    break;
                case 2:
                    System.out.println("    PROGRAMADOR/A: Cobrando nómina... más debería cobrar ...");
                    break;
                case 0:
                    System.out.println("    Viendo tu código...");
                    opcion = 2;
                    break;
            }
            if (opcion<0||opcion>2){
                System.out.println("Opción no válida. Por favor, selecciona una opción válida");
            }
        } else{
            if (opcion==0){
                opcion = 4;
            }
            switch (opcion){
                case 1:
                    System.out.println("    Viendo el estado de tu departamento...");
                    break;
                case 2:
                    System.out.println("    GERENTE: Cobrando nómina... bastante dinero");
                    break;
                case -1:
                    System.out.println("    Saliendo...");
                    opcion = 0;
                    break;
            }
            if (opcion>2||opcion<0){
                System.out.println("Opción no válida. Por favor, selecciona una opción válida");
            }
        }
        return opcion;
    }

    public static int menu(Scanner scanner, Cargo cargo) {
        int opcionSalida = 0;
        if (cargo == cargo.DIRECTOR){
            System.out.println("Hola DIRECTOR. ¿Qué desea hacer?");
            System.out.println("    1. Cobrar nómina");
            System.out.println("    2. Ver el estado de la empresa");
            System.out.println("    0. Salir");
        } else if (cargo == cargo.PROGRAMADOR){
            System.out.println("Hola PROGRAMADOR. ¿Qué desea hacer?");
            System.out.println("    1. Salir");
            System.out.println("    2. Cobrar nómina");
            System.out.println("    0. Ver tu código");
        } else{
            System.out.println("Hola GERENTE. ¿Qué desea hacer?");
            System.out.println("    1. Ver el estado de tu departamento");
            System.out.println("    2. Cobrar nómina");
            System.out.println("    -1. Salir");
        }
        System.out.print("Introduce una opción: ");
        opcionSalida = scanner.nextInt();
        return opcionSalida;
    }

    public static Cargo obtenerCargo(Scanner scanner) {
        Cargo salida = Cargo.PROGRAMADOR;
        boolean salir = false;
        do {
            System.out.print("Introduce el cargo del empleado (D: DIRECTOR, G: GERENTE, P:PROGRAMADOR): ");
            String answer = scanner.nextLine();
            if (answer.equals("D")){
                salida = Cargo.DIRECTOR;
                salir = true;
            } else if (answer.equals("P")) {
                salida = Cargo.PROGRAMADOR;
                salir = true;
            } else if (answer.equals("G")) {
                salida = Cargo.GERENTE;
                salir = true;
            }
        }while (!salir);
        return salida;
    }
}
