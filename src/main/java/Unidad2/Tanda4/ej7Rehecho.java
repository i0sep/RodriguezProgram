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
        int number;
        double media;
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
                numbersString = numbersString+number;
                numbersString+="-";
            }else {
                System.out.println("El número ingresado esta fuera del rango.");
            }
        }while (number!=-1);

        media = funcionMedia(numbersString);
        System.out.println("La media es: "+media);

        double minimo = funcionMinima(numbersString);

        double maximo = funcionMaxima(numbersString);

        int mayores5 = funcionMayor5(numbersString);

        System.out.printf("El minimo es: %f, el maximo es %f y %d numeros son mayores que 5",minimo,maximo,mayores5);
        System.out.print("¿Quieres una gráfica con las notas introducidas?: ");
        String respuestaGrafica = skanner.nextLine();
        if (respuestaGrafica.equalsIgnoreCase("si")){
            funcionGrafica(numbersString);
        }


    }

    public static double funcionMedia(String numberString){
        double media = 0;
        int inicio = 0;
        int contador = 0;
        double numero;
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) == '-') {
                String numeroStr = numberString.substring(inicio, i);
                numero = Integer.parseInt(numeroStr);
                media += numero;

                inicio = i + 1;
                contador++;
            }
        }
        media = media/contador;
        return media;
    }

    public static double funcionMinima(String numberString){
        double minima = 0;
        int inicio = 0;
        double numero;
        double numero2 = 10;
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) == '-') {
                String numeroStr = numberString.substring(inicio, i);
                numero = Integer.parseInt(numeroStr);
                minima = (Math.min(numero,numero2));
                numero2 = minima;
                inicio = i + 1;
            }
        }
        return minima;
    }
    public static double funcionMaxima(String numberString){
        double maxima = 0;
        int inicio = 0;
        double numero;
        double numero2 = 0;
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) == '-') {
                String numeroStr = numberString.substring(inicio, i);
                numero = Integer.parseInt(numeroStr);
                maxima = (Math.max(numero, numero2));
                numero2 = maxima;
                inicio = i + 1;
            }
        }
        return maxima;
    }
    public static int funcionMayor5(String numberString) {
        int inicio = 0;
        int contador = 0;
        double numero;
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) == '-') {
                String numeroStr = numberString.substring(inicio, i);
                numero = Integer.parseInt(numeroStr);
                if (numero >= 5) {
                    contador++;
                }
                inicio = i + 1;
            }
        }
        return contador;
    }

        public static void funcionGrafica(String numberString){
            int inicio = 0;
            double numero;
            for (int i = 0; i < numberString.length(); i++) {
                if (numberString.charAt(i) == '-') {
                    String numeroStr = numberString.substring(inicio, i);
                    numero = Integer.parseInt(numeroStr);
                    for (int j = 0;j<=numero;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                    inicio = i + 1;
                }
            }

        }

}