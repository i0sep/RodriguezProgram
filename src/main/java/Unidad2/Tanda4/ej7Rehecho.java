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
public class ej7Rehecho {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        String numbersString = "";
        int number = 0;
        double media = 0;
        do {
            System.out.print("Dime un número: ");
            try{
                number = skanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir el tipo de dato: "+e);
                skanner.nextLine();
            }
            if (numbersString.isEmpty()&&number==-1){
                System.out.println("«Sin datos»");
            }
            if (number>=0&&number<=10){
                numbersString = numbersString+String.valueOf(number);
            }
        }while (number!=-1);
        media = funcionMedia(numbersString);
        System.out.println("La media es: "+media);
        funcionMinima(numbersString);
    }

    public static double funcionMedia(String numberString){
        double media = 0;
        int contador = 0;
        int numero = 0;
        for (int i = 0;i==numberString.length();i++){
            numero = Integer.valueOf(numberString.substring(i));
            media+=numero;
            contador++;
        }
        media = media/contador;
        return media;
    }

    public static double funcionMinima(String numberString){
        double minima = 0;
        int contador = 0;
        int numero = 0;
        for (int i = 0;i==numberString.length();i++){
            numero = Integer.valueOf(numberString.substring(i));
            minima+=numero;
            contador++;
        }
        minima = minima/contador;
        return minima;
    }
}
