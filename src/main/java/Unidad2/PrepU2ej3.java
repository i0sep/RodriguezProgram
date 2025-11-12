package Unidad2;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    ● Introducir un año e informar si es bisiesto o no (no debe ser negativo nimayor a
        10000).
    ● Pedir mes y día de ese año (controlando que sea correcto si son 28,29,30 o 31 los
        días y si son de 1 al 12 los meses).
    ● Pedir la fecha actual (comprobar igual que antes que los números son correctos)
    ● Informar del número de días entre una fecha y otra.
    ● Añadir un assert que controle que el año no sea negativo ni mayor a 10000.
 */
public class PrepU2ej3 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        int mes = 0; int dia = 0;

        System.out.print("Introduce un año: ");
        int ano = skanner.nextInt();
        boolean bisiesto = funcionBisiesto(ano);


        System.out.println("Introduce mes y dia ese año:");
        try {
            System.out.print("Mes: ");
            mes = skanner.nextInt();
            System.out.print("Dia: ");
            dia = skanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error al introducir el tipo de dato: "+e);
            skanner.nextLine();
        }
        do {
            if (mes>12||mes<=0){
                try{
                    System.out.print("Mes incorrecto introduzca otro: ");
                    mes = skanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Error el introducir el tipo de dato: "+e);
                    skanner.nextLine();
                }
            }
        }while (mes>12||mes<=0);

        do {
            if (dia <= 0 || dia > 31){
                try{
                    System.out.print("Dia incorrecto introduzca otro: ");
                    dia = skanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Error el introducir el tipo de dato: "+e);
                    skanner.nextLine();
                }
            }
        }while (dia <= 0 || dia > 31);

        funcionMesDia(mes,dia,bisiesto,skanner);

        int sumaMesDia = funcionSumaMesDia(ano,mes,dia);
        System.out.println("El resultado de dias total es "+sumaMesDia);
    }




    public static boolean funcionBisiesto(int ano){
        boolean check = false;
        if (ano%4==0 && (ano%100!=0||ano%400==0)){
            check = true;
        }
        String resultado = (check)?"es bisiesto":"no es bisiesto";
        System.out.println("El año proporcionado "+resultado);
        return check;
    }





    public static void funcionMesDia(int mes,int dia, boolean bisiesto,Scanner skanner){
        boolean correcto = false;
        String limite = "";
        do {
            switch (mes){
                case 1, 3, 5, 7, 8, 10, 12:             //31 días pueden tener
                    if (dia<=31){
                        correcto = true;
                    }else{
                        limite = "31";
                    }
                    break;
                case 4, 6, 9, 11:                       //30 días pueden tener
                    if (dia<=31){
                        correcto = true;
                    }else{
                        limite = "30";
                    }
                    break;
                case 2:                                 //Febrero
                    if (dia<=28 && !bisiesto){
                        correcto = true;
                    } else if (dia<=29 && bisiesto) {
                        correcto = true;
                    } else{
                        limite = (correcto)?"29":"28";
                    }
                    break;
                default:
                    if (!correcto){
                        try {
                            System.out.println("Dia no válido ingrese otro dentro de este rango [0,"+limite+"]");
                            mes = skanner.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println("Error al introducir el tipo de datos: "+e);
                            skanner.nextLine();
                        }
                    }
                    break;
            }
        }while (!correcto);
    }





    public static int funcionSumaMesDia(int ano, int mes, int dia){

        int diasano = (mes * dia)-365;

        int anoActual = 2025;
        int distancia = 2025 - ano;


        int resultado = distancia * 365;
        return resultado;
    }
}