package Unidad2;

import java.util.Date;
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
        int mes = 0; int dia = 0;int ano=0;
        Date fecha = new Date();

        System.out.println("Introduce un año: ");
        do {
            try{
                ano = skanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir el tipo de dato: "+e);
                skanner.nextLine();
            }
            if (ano <= 1 || ano >= fecha.getYear()+1900){
                System.out.println("Dia incorrecto introduzca otro: ");
            }
        }while (ano <= 1 || ano >= fecha.getYear()+1900);

        boolean bisiesto = funcionBisiesto(ano);

        System.out.println("Introduce mes y dia ese año.");
        do {
            try{
                System.out.println("Mes: ");
                mes = skanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir el tipo de dato: "+e);
                skanner.nextLine();
            }
            if (mes>12||mes<=0){
                System.out.println("Mes incorrecto introduzca otro: ");
            }
        }while (mes>12||mes<=0);

        do {
            try{

                System.out.println("Dia: ");
                dia = skanner.nextInt();

            }catch (InputMismatchException e){
                System.out.println("Error al introducir el tipo de dato: "+e);
                skanner.nextLine();
            }
            if (dia <= 0 || dia > 31){
                System.out.println("Dia incorrecto introduzca otro: ");
            }
        }while (dia <= 0 || dia > 31);

        dia = funcionMesDia(mes,dia,bisiesto,skanner);

        int sumaMesDia = funcionSumaMesDia(ano,mes,dia);
        System.out.println("El resultado de dias total es "+sumaMesDia);

        int anosDiferencia = Integer.valueOf(sumaMesDia)/365;
        System.out.println("Años desde esa fecha: "+anosDiferencia);
    }




    public static boolean funcionBisiesto(int ano){
        boolean checkBisiesto = false;
        if (ano%4==0 && (ano%100!=0||ano%400==0)){
            checkBisiesto = true;
        }
        String resultado = (checkBisiesto)?"es bisiesto":"no es bisiesto";
        System.out.println("El año proporcionado "+resultado);
        System.out.println("--------------------------------------------------");
        return checkBisiesto;
    }





    public static int funcionMesDia(int mes,int dia, boolean bisiesto,Scanner skanner){
        boolean mesDiaCorrecto = false;
        String limite = "";
        do {
            switch (mes){
                case 1, 3, 5, 7, 8, 10, 12:             //31 días pueden tener
                    if (dia<=31){
                        mesDiaCorrecto = true;
                    }else{
                        limite = "31";
                    }
                    break;
                case 4, 6, 9, 11:                       //30 días pueden tener
                    if (dia<=30){
                        mesDiaCorrecto = true;
                    }else{
                        limite = "30";
                    }
                    break;
                case 2:                                 //Febrero
                    if (dia<=28 && !bisiesto){
                        mesDiaCorrecto = true;
                    } else if (dia==29 && bisiesto) {

                    } else{
                        limite = (bisiesto)?"29":"28";
                    }
                    break;
                default:
                    break;
            }
            if (!mesDiaCorrecto){
                try {
                    System.out.println("Dia no válido ingrese otro dentro de este rango [0,"+limite+"]");
                    dia = skanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Error al introducir el tipo de datos: "+e);
                    skanner.nextLine();
                }
            }
        }while (!mesDiaCorrecto);
        return dia;
    }





    public static int funcionSumaMesDia(int ano, int mes, int dia){
        Date fecha = new Date();
        int diaHoy = fecha.getDate();
        int mesHoy = fecha.getMonth() + 1;
        int anoActual = fecha.getYear()+1900;

        int diasAnoBisiesto = funcionAnosBisiestosDiferencia(ano,anoActual,mes,dia,mesHoy,diaHoy);

        int diasAnoHoy = funcionContarDias(diaHoy,mesHoy);
        int diasAno = -funcionContarDias(dia,mes) + 365;

        int distancia = anoActual - ano-1;
        int distanciaDias = (distancia * 365)+diasAno+diasAnoHoy+diasAnoBisiesto;

        return distanciaDias;
    }



    public static int funcionAnosBisiestosDiferencia(int ano, int anoActual,int mes, int dia, int mesHoy, int diaHoy){
        int cuantosAnoBisiestos = 0;

        if ((ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0))) {
            if (mes < 2 || (mes == 2 && dia < 29)){
                cuantosAnoBisiestos++;
            }
        }
        if ((anoActual % 4 == 0 && (anoActual % 100 != 0 || anoActual % 400 == 0))) {
            if (mesHoy > 2 || (mesHoy == 2 && diaHoy == 29)){
                cuantosAnoBisiestos++;
            }
        }


        for (int i = ano+1;i<=anoActual-1;){
            if (i%4==0 && (i%100!=0||i%400==0)){
                cuantosAnoBisiestos++;
            }
            ++i;
        }


        return cuantosAnoBisiestos;
    }


    public static int funcionContarDias(int diaHoy, int mesHoy){
        int diasTotales = 0;
        for (int i = mesHoy;i>0;){
            for (int j = diaHoy;j>0;j--){
                diasTotales++;
                diaHoy--;
            }
            mesHoy--;
            i--;
            switch (mesHoy){
                case 1, 3, 5, 7, 8, 10, 12:             //31 días pueden tener
                    diaHoy=31;
                    break;
                case 4, 6, 9, 11:                       //30 días pueden tener
                    diaHoy=30;
                    break;
                case 2:                                 //Febrero
                    diaHoy=28;
                    break;
            }
        }
        return diasTotales;
    }
}