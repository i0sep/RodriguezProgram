package Unidad2.Tanda4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
        Pedir por la entrada estándar varias calificaciones (con decimales) entre 0 y 10 hasta
        que el usuario escriba -1.
        ○ El programa debe:
            ■ Calcular: media, mínima, máxima y cuántas son ≥ 5.
            ■ Si el primer valor es -1, informar «Sin datos» (evita división por cero).
            ■ Ignora valores fuera de rango con un aviso y continue.
            ■ Al final, pregunta si se desea imprimir las notas en forma de gráfico
                (utilizando bucles for):
                ● una fila de asteriscos por cada calificación utilizada. Por
                    ejemplo, calificaciones: 4.1, 7.5 , 3.2 y 5 generarían la
                    siguiente gráfica:
                        ****
                        *******
                        ***
                        *****
            ■ Se debe controlar en todo momento las posibles excepciones.
*/
public class ej7 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        double num1 = 0;double num2 = 0;double num3 = 0;double num4 = 0; final int mayorQue = 5; double maxima = 0;
        do {
            try{
                System.out.print("Dime cuatro números los cuales comprendan [0-10] (-1 para salir): ");
                num1 = skanner.nextDouble();
                if (num1 == (-1)){
                    System.out.print("«Sin datos»");
                    continue;
                }
                num2 = skanner.nextDouble();
                num3 = skanner.nextDouble();
                num4 = skanner.nextDouble();
                if (funcionMaxima(num1,num2,num3,num4)>10 || funcionMinima(num1,num2,num3,num4)<0){
                    System.out.println("Has introducido un número fuera del límite");
                    continue;
                }
            }catch (InputMismatchException e){
                System.out.println("Ha surgido un error con los tipos de datos introducidos: "+e);
                continue;
            }
            System.out.println("Haciendo la media...");
            double media = funcionMedia(num1,num2,num3,num4);
            System.out.println("Haciendo la mínima...");
            double minima = funcionMinima(num1,num2,num3,num4);
            System.out.println("Haciendo la máxima...");
            maxima = funcionMaxima(num1,num2,num3,num4);
            System.out.println("Calculando cuantos son ≥ 5");
            int mayores = funcionMayoresQue(mayorQue,num1,num2,num3,num4);
            System.out.printf("La media es %.2f, la mínima %.2f, la máxima %.2f y hay %d igual o mayores que %d.\n",media,minima,maxima,mayores,mayorQue);
            try{
                System.out.print("¿Quieres una gráfica impresa con asteriscos por cada calificación introducida? ");
                String grafica = skanner.next();
                if (grafica.equalsIgnoreCase("si")){
                    funcionGrafica(num1,num2,num3,num4,maxima);
                }
            }catch (InputMismatchException e){
                System.out.println("Ha surgido un error con los tipos de datos introducidos: "+e);
            }
        }while (!(num1==-1 || num2==-1 || num3==-1 || num4==-4));
    }
    public static double funcionMedia(double num1,double num2,double num3,double num4){
        double media = 0;
        media = (num1 + num2 + num3 + num4)/4;
        return media;
    }
    public static double funcionMinima(double num1, double num2, double num3, double num4){
        double minima = Math.min(num4,Math.min(num3,Math.min(num1,num2)));
        return minima;
    }
    public static double funcionMaxima(double num1, double num2, double num3, double num4){
        double maxima = Math.max(num4,Math.max(num3,Math.max(num1,num2)));
        return maxima;
    }
    public static int funcionMayoresQue(final int mayorQue,double num1, double num2, double num3, double num4){
        int contador = 0;
        if (num1 >= mayorQue){
            contador++;
        } else if (num2 >= mayorQue) {
            contador++;
        } else if (num3 >= mayorQue) {
            contador++;
        } else if (num4 >= mayorQue) {
            contador++;
        }
        return contador;
    }
    public static void funcionGrafica(double num1,double num2,double num3,double num4, double maxima){
        for (int j = 1;j<=num1;j++){
            System.out.print("*");
        }
        System.out.printf("\n");
        for (int j = 1;j<=num2;j++){
            System.out.print("*");
        }
        System.out.printf("\n");
        for (int j = 1;j<=num3;j++){
            System.out.print("*");
        }
        System.out.printf("\n");
        for (int j = 1;j<=num4;j++){
            System.out.print("*");
        }
    }
}
