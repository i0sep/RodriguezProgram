package Unidad2;

import java.util.Scanner;

public class ChatGPT3Examen {
    public static void main(String[] args) {
        int barra1=0;int barra2=0; int contador = 2;
        int diaDevolucion;int mesDevolucion;int anoDevolucion;

        Scanner scanner = new Scanner(System.in);
        System.out.print("    -Introdúceme la fecha del préstamo (ej: 10/7/2020): ");
        String fechaPrestamo = scanner.nextLine();

        System.out.print("    -Introdúceme la fecha de devolución (ej: 19/8/2022): ");
        String fechaDevolucion = scanner.nextLine();

        for (int i = 0; i <= fechaPrestamo.length(); i++){
            if (fechaPrestamo.substring(i,i+1).equals("/")){
                switch (contador){
                    case 2:
                        barra1 = i;
                    case 1:
                        barra2 = i;
                    default:
                        contador--;
                        break;
                }
            }
        }
        scanner.nextLine();
        //assert (anoPrestamo>=2020 && anoPrestamo<=2030) : "Error año equivocado";

    }
}
