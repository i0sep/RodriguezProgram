package Unidad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChatGPT1Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String tipoLector = "";
        do {
            System.out.print("Dime que tipo de lector eres (E-Estudiante, P-Profesor, G-General): ");
            tipoLector = scanner.nextLine().toLowerCase();
        }while (!tipoLector.equals("e") && !tipoLector.equals("p") && !tipoLector.equals("g"));

        do{
            opcion = mostrarMenu(scanner,opcion,tipoLector);

            opcion = seleccionOpcion(opcion,tipoLector);
        }while (opcion!=0);

    }

    public static int mostrarMenu(Scanner scanner, int opcion, String tipoLector){
        if (tipoLector.equals("e")){

            do {
                System.out.println("   1. Consultar libro");
                System.out.println("   2. Renovar préstamo");
                System.out.println("   3. Ver historial");
                System.out.println("   4. Salir");

                try{
                    opcion = scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Error al introducir el tipo de dato");
                }

            }while (opcion < 1 || opcion > 4);

        } else if (tipoLector.equals("p")) {

            do {
                System.out.println("   1. Consultar libro");
                System.out.println("   2. Renovar préstamo");
                System.out.println("   3. Reservar sala de estudio");
                System.out.println("   4. Solicitar material especial");
                System.out.println("   5. Salir");

                try{
                    opcion = scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Error al introducir el tipo de dato");
                }

            }while (opcion < 1 || opcion > 5);

        } else{

            do {
                System.out.println("   1. Consultar libro");
                System.out.println("   2. Ver horarios");
                System.out.println("   3. Salir");

                try{
                    opcion = scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Error al introducir el tipo de dato");
                }
            }while (opcion < 1 || opcion > 3);
        }
        return opcion;
    }



    public static int seleccionOpcion(int opcion, String tipoLector){
        if (tipoLector.equals("e")) {
            switch (opcion){
                case 1:
                    System.out.println("Consultando libro");
                    break;
                case 2:
                    System.out.println("Renovando préstamo");
                    break;
                case 3:
                    System.out.println("Mirando el historial");
                    break;
                case 4:
                    opcion = 0;
                    return opcion;
                default:
                    break;
            }
        } else if (tipoLector.equals("p")) {
            switch (opcion){
                case 1:
                    System.out.println("Consultando libro...");
                    break;
                case 2:
                    System.out.println("Renovando préstamo...");
                    break;
                case 3:
                    System.out.println("Reservando sala de estudio...");
                    break;
                case 4:
                    System.out.println("Solicitando material especial...");
                    break;
                case 5:
                    opcion = 0;
                    return opcion;
                default:
                    break;
            }
        }else {
            switch (opcion){
                case 1:
                    System.out.println("Consultando libro...");
                    break;
                case 2:
                    System.out.println("Mirando horarios...");
                    break;
                case 3:
                    opcion = 0;
                    return opcion;
                default:
                    break;
            }
        }
        return opcion;
    }
}

