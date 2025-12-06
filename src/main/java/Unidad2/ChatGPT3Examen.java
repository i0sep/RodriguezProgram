package Unidad2;

import java.util.Scanner;

public class ChatGPT3Examen {
    public static void main(String[] args) {
        int barra1=0;int barra2=0; int contador = 2;
        int diaP;int mesP;int anoP;
        int diaD;int mesD;int anoD;

        Scanner scanner = new Scanner(System.in);
        System.out.print("    -Introdúceme la fecha del préstamo (ej: 10/7/2020): ");
        String fechaPrestamo = scanner.nextLine();

        System.out.print("    -Introdúceme la fecha de devolución (ej: 19/8/2022): ");
        String fechaDevolucion = scanner.nextLine();




        for (int i = 0; i <= fechaPrestamo.length(); i++){
            if (fechaPrestamo.charAt(i) == '/'){
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
        diaP = Integer.valueOf(fechaPrestamo.substring(0,barra1));
        mesP = Integer.valueOf(fechaPrestamo.substring(barra1,barra2));
        anoP = Integer.valueOf(fechaPrestamo.substring(barra2));

        assert (anoP>=2020 && anoP<=2030) : "Error año equivocado";

        contador = 2;
        for (int i = 0; i <= fechaDevolucion.length(); i++){
            if (fechaDevolucion.charAt(i) == '/'){
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
        diaD = Integer.valueOf(fechaPrestamo.substring(0,barra1));
        mesD = Integer.valueOf(fechaPrestamo.substring(barra1,barra2));
        anoD = Integer.valueOf(fechaPrestamo.substring(barra2));

        int diferenciaAno = anoD - anoP;
        int diferenciaMes = mesD - mesP;
        int diferenciaDia = mesD - mesP;

        int diferenciaTotal = (diferenciaAno*365)+(diferenciaMes*30)+diferenciaDia;

    }
}
