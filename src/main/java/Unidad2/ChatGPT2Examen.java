package Unidad2;

import java.util.Scanner;

public class ChatGPT2Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrada: ");
        String isbn = scanner.nextLine();

        funValidar(isbn);
        funLimpio(isbn);
        funSumar(isbn);
        funInvertido(isbn);
    }
    public static void funValidar(String isbn){

        isbn = isbn.replaceAll("[0-9]","X");
        if (isbn.equals("XXX-X-XXXXX-XXX-X")){
            System.out.println("- ISBN válido ✅");
        }else {
            System.out.println("- ISBN válido ❌");
        }
    }

    public static void funLimpio(String isbn){

        isbn = isbn.replaceAll("[-]","");
        System.out.println("- ISBN limpio: " + isbn);

    }

    public static void funSumar(String isbn){
        int suma = 0;
        String impar;
        isbn = isbn.replaceAll("[-]","");
        for (int i = 0;i<isbn.length();i++){
            int suma2 = Integer.valueOf(isbn.substring(i,i+1));
            suma += suma2;
        }
        if (suma%2==0){
            impar = "par";
        }else {
            impar = "impar";
        }
        System.out.println("- Suma dígitos: " + suma + " (" + impar + ")");
    }

    public static void funInvertido(String isbn){
        String invertido = "";
        isbn = isbn.replaceAll("[-]","");

        for (int i = isbn.length()-1; i>=0;i--){
            invertido += isbn.charAt(i);
        }
        System.out.println("- ISBN invertido: " + invertido);
    }
}
